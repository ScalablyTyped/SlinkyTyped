package typingsSlinky.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchFacesByImageResponse extends js.Object {
  /**
    * An array of faces that match the input face, along with the confidence in the match.
    */
  var FaceMatches: js.UndefOr[FaceMatchList] = js.native
  /**
    * Version number of the face detection model associated with the input collection (CollectionId).
    */
  var FaceModelVersion: js.UndefOr[String] = js.native
  /**
    * The bounding box around the face in the input image that Amazon Rekognition used for the search.
    */
  var SearchedFaceBoundingBox: js.UndefOr[BoundingBox] = js.native
  /**
    * The level of confidence that the searchedFaceBoundingBox, contains a face.
    */
  var SearchedFaceConfidence: js.UndefOr[Percent] = js.native
}

object SearchFacesByImageResponse {
  @scala.inline
  def apply(): SearchFacesByImageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchFacesByImageResponse]
  }
  @scala.inline
  implicit class SearchFacesByImageResponseOps[Self <: SearchFacesByImageResponse] (val x: Self) extends AnyVal {
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
    def withSearchedFaceBoundingBox(value: BoundingBox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SearchedFaceBoundingBox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchedFaceBoundingBox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SearchedFaceBoundingBox")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchedFaceConfidence(value: Percent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SearchedFaceConfidence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchedFaceConfidence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SearchedFaceConfidence")(js.undefined)
        ret
    }
  }
  
}

