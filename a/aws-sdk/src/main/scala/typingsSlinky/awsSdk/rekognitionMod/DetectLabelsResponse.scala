package typingsSlinky.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectLabelsResponse extends js.Object {
  /**
    * Version number of the label detection model that was used to detect labels.
    */
  var LabelModelVersion: js.UndefOr[String] = js.native
  /**
    * An array of labels for the real-world objects detected. 
    */
  var Labels: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.Labels] = js.native
  /**
    * The value of OrientationCorrection is always null. If the input image is in .jpeg format, it might contain exchangeable image file format (Exif) metadata that includes the image's orientation. Amazon Rekognition uses this orientation information to perform image correction. The bounding box coordinates are translated to represent object locations after the orientation information in the Exif metadata is used to correct the image orientation. Images in .png format don't contain Exif metadata. Amazon Rekognition doesn’t perform image correction for images in .png format and .jpeg images without orientation information in the image Exif metadata. The bounding box coordinates aren't translated and represent the object locations before the image is rotated. 
    */
  var OrientationCorrection: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.OrientationCorrection] = js.native
}

object DetectLabelsResponse {
  @scala.inline
  def apply(): DetectLabelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectLabelsResponse]
  }
  @scala.inline
  implicit class DetectLabelsResponseOps[Self <: DetectLabelsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabelModelVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LabelModelVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelModelVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LabelModelVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: Labels): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Labels")(js.undefined)
        ret
    }
    @scala.inline
    def withOrientationCorrection(value: OrientationCorrection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrientationCorrection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrientationCorrection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrientationCorrection")(js.undefined)
        ret
    }
  }
  
}

