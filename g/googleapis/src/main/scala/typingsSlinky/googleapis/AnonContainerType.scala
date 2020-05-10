package typingsSlinky.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonContainerType extends js.Object {
  var containerType: js.UndefOr[String] = js.native
  var sha1Checksum: js.UndefOr[String] = js.native
  var source: js.UndefOr[String] = js.native
}

object AnonContainerType {
  @scala.inline
  def apply(): AnonContainerType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonContainerType]
  }
  @scala.inline
  implicit class AnonContainerTypeOps[Self <: AnonContainerType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainerType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerType")(js.undefined)
        ret
    }
    @scala.inline
    def withSha1Checksum(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sha1Checksum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSha1Checksum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sha1Checksum")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
  }
  
}

