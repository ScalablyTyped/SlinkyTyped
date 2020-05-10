package typingsSlinky.gapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteObjectRequest extends js.Object {
  /**
    * The object ID of the page or page element to delete.
    *
    * If after a delete operation a group contains
    * only 1 or no page elements, the group is also deleted.
    *
    * If a placeholder is deleted on a layout, any empty inheriting shapes are
    * also deleted.
    */
  var objectId: js.UndefOr[String] = js.native
}

object DeleteObjectRequest {
  @scala.inline
  def apply(): DeleteObjectRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteObjectRequest]
  }
  @scala.inline
  implicit class DeleteObjectRequestOps[Self <: DeleteObjectRequest] (val x: Self) extends AnyVal {
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
  }
  
}

