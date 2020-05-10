package typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateLineCategoryRequest extends js.Object {
  var lineCategory: js.UndefOr[String] = js.native
  var objectId: js.UndefOr[String] = js.native
}

object UpdateLineCategoryRequest {
  @scala.inline
  def apply(): UpdateLineCategoryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateLineCategoryRequest]
  }
  @scala.inline
  implicit class UpdateLineCategoryRequestOps[Self <: UpdateLineCategoryRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLineCategory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineCategory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineCategory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineCategory")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectId")(js.undefined)
        ret
    }
  }
  
}

