package typingsSlinky.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteFacesRequest extends js.Object {
  /**
    * Collection from which to remove the specific faces.
    */
  var CollectionId: typingsSlinky.awsSdk.rekognitionMod.CollectionId = js.native
  /**
    * An array of face IDs to delete.
    */
  var FaceIds: FaceIdList = js.native
}

object DeleteFacesRequest {
  @scala.inline
  def apply(CollectionId: CollectionId, FaceIds: FaceIdList): DeleteFacesRequest = {
    val __obj = js.Dynamic.literal(CollectionId = CollectionId.asInstanceOf[js.Any], FaceIds = FaceIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFacesRequest]
  }
  @scala.inline
  implicit class DeleteFacesRequestOps[Self <: DeleteFacesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollectionId(value: CollectionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CollectionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFaceIds(value: FaceIdList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FaceIds")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

