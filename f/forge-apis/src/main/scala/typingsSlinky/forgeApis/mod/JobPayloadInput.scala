package typingsSlinky.forgeApis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobPayloadInput extends js.Object {
  var compressedUrn: js.UndefOr[Boolean] = js.native
  var rootFilename: js.UndefOr[String] = js.native
  var urn: String = js.native
}

object JobPayloadInput {
  @scala.inline
  def apply(urn: String): JobPayloadInput = {
    val __obj = js.Dynamic.literal(urn = urn.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobPayloadInput]
  }
  @scala.inline
  implicit class JobPayloadInputOps[Self <: JobPayloadInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUrn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompressedUrn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compressedUrn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompressedUrn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compressedUrn")(js.undefined)
        ret
    }
    @scala.inline
    def withRootFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootFilename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootFilename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootFilename")(js.undefined)
        ret
    }
  }
  
}

