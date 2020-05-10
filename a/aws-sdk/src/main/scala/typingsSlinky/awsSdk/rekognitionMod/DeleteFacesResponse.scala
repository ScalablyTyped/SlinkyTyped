package typingsSlinky.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteFacesResponse extends js.Object {
  /**
    * An array of strings (face IDs) of the faces that were deleted.
    */
  var DeletedFaces: js.UndefOr[FaceIdList] = js.native
}

object DeleteFacesResponse {
  @scala.inline
  def apply(): DeleteFacesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteFacesResponse]
  }
  @scala.inline
  implicit class DeleteFacesResponseOps[Self <: DeleteFacesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeletedFaces(value: FaceIdList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeletedFaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeletedFaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeletedFaces")(js.undefined)
        ret
    }
  }
  
}

