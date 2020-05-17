package typingsSlinky.forgeApis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentDisposition extends js.Object {
  var contentDisposition: js.UndefOr[String] = js.native
  var ifMatch: js.UndefOr[String] = js.native
}

object ContentDisposition {
  @scala.inline
  def apply(): ContentDisposition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentDisposition]
  }
  @scala.inline
  implicit class ContentDispositionOps[Self <: ContentDisposition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentDisposition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentDisposition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentDisposition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentDisposition")(js.undefined)
        ret
    }
    @scala.inline
    def withIfMatch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIfMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifMatch")(js.undefined)
        ret
    }
  }
  
}

