package typingsSlinky.neverbounce.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentType extends js.Object {
  var `Content-Type`: js.UndefOr[String] = js.native
  var `User-Agent`: js.UndefOr[String] = js.native
}

object ContentType {
  @scala.inline
  def apply(): ContentType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentType]
  }
  @scala.inline
  implicit class ContentTypeOps[Self <: ContentType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withContent-Type`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Content-Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutContent-Type`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Content-Type")(js.undefined)
        ret
    }
    @scala.inline
    def `withUser-Agent`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("User-Agent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutUser-Agent`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("User-Agent")(js.undefined)
        ret
    }
  }
  
}

