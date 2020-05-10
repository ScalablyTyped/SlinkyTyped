package typingsSlinky.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchFacesResponse extends js.Object {
  /**
    * An array of faces that matched the input face, along with the confidence in the match.
    */
  var FaceMatches: js.UndefOr[FaceMatchList] = js.native
  /**
    * Version number of the face detection model associated with the input collection (CollectionId).
    */
  var FaceModelVersion: js.UndefOr[String] = js.native
  /**
    * ID of the face that was searched for matches in a collection.
    */
  var SearchedFaceId: js.UndefOr[FaceId] = js.native
}

object SearchFacesResponse {
  @scala.inline
  def apply(): SearchFacesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchFacesResponse]
  }
  @scala.inline
  implicit class SearchFacesResponseOps[Self <: SearchFacesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFaceMatches(value: FaceMatchList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FaceMatches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFaceMatches: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FaceMatches")(js.undefined)
        ret
    }
    @scala.inline
    def withFaceModelVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FaceModelVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFaceModelVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FaceModelVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchedFaceId(value: FaceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SearchedFaceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchedFaceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SearchedFaceId")(js.undefined)
        ret
    }
  }
  
}

