package typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DuplicateObjectRequest extends js.Object {
  var objectId: js.UndefOr[String] = js.native
  var objectIds: js.UndefOr[js.Object] = js.native
}

object DuplicateObjectRequest {
  @scala.inline
  def apply(): DuplicateObjectRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DuplicateObjectRequest]
  }
  @scala.inline
  implicit class DuplicateObjectRequestOps[Self <: DuplicateObjectRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withObjectIds(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectIds")(js.undefined)
        ret
    }
  }
  
}

