package typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplaceImageRequest extends js.Object {
  var imageObjectId: js.UndefOr[String] = js.native
  var imageReplaceMethod: js.UndefOr[String] = js.native
  var url: js.UndefOr[String] = js.native
}

object ReplaceImageRequest {
  @scala.inline
  def apply(): ReplaceImageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplaceImageRequest]
  }
  @scala.inline
  implicit class ReplaceImageRequestOps[Self <: ReplaceImageRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImageObjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageObjectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageObjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageObjectId")(js.undefined)
        ret
    }
    @scala.inline
    def withImageReplaceMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageReplaceMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageReplaceMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageReplaceMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

