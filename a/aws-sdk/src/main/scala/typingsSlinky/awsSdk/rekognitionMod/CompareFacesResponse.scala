package typingsSlinky.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompareFacesResponse extends js.Object {
  /**
    * An array of faces in the target image that match the source image face. Each CompareFacesMatch object provides the bounding box, the confidence level that the bounding box contains a face, and the similarity score for the face in the bounding box and the face in the source image.
    */
  var FaceMatches: js.UndefOr[CompareFacesMatchList] = js.native
  /**
    * The face in the source image that was used for comparison.
    */
  var SourceImageFace: js.UndefOr[ComparedSourceImageFace] = js.native
  /**
    * The value of SourceImageOrientationCorrection is always null. If the input image is in .jpeg format, it might contain exchangeable image file format (Exif) metadata that includes the image's orientation. Amazon Rekognition uses this orientation information to perform image correction. The bounding box coordinates are translated to represent object locations after the orientation information in the Exif metadata is used to correct the image orientation. Images in .png format don't contain Exif metadata. Amazon Rekognition doesn’t perform image correction for images in .png format and .jpeg images without orientation information in the image Exif metadata. The bounding box coordinates aren't translated and represent the object locations before the image is rotated. 
    */
  var SourceImageOrientationCorrection: js.UndefOr[OrientationCorrection] = js.native
  /**
    * The value of TargetImageOrientationCorrection is always null. If the input image is in .jpeg format, it might contain exchangeable image file format (Exif) metadata that includes the image's orientation. Amazon Rekognition uses this orientation information to perform image correction. The bounding box coordinates are translated to represent object locations after the orientation information in the Exif metadata is used to correct the image orientation. Images in .png format don't contain Exif metadata. Amazon Rekognition doesn’t perform image correction for images in .png format and .jpeg images without orientation information in the image Exif metadata. The bounding box coordinates aren't translated and represent the object locations before the image is rotated. 
    */
  var TargetImageOrientationCorrection: js.UndefOr[OrientationCorrection] = js.native
  /**
    * An array of faces in the target image that did not match the source image face.
    */
  var UnmatchedFaces: js.UndefOr[CompareFacesUnmatchList] = js.native
}

object CompareFacesResponse {
  @scala.inline
  def apply(): CompareFacesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompareFacesResponse]
  }
  @scala.inline
  implicit class CompareFacesResponseOps[Self <: CompareFacesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFaceMatches(value: CompareFacesMatchList): Self = {
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
    def withSourceImageFace(value: ComparedSourceImageFace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceImageFace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceImageFace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceImageFace")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceImageOrientationCorrection(value: OrientationCorrection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceImageOrientationCorrection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceImageOrientationCorrection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceImageOrientationCorrection")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetImageOrientationCorrection(value: OrientationCorrection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetImageOrientationCorrection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetImageOrientationCorrection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetImageOrientationCorrection")(js.undefined)
        ret
    }
    @scala.inline
    def withUnmatchedFaces(value: CompareFacesUnmatchList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnmatchedFaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnmatchedFaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnmatchedFaces")(js.undefined)
        ret
    }
  }
  
}

