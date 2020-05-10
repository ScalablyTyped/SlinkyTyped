package typingsSlinky.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextDetection extends js.Object {
  /**
    * The confidence that Amazon Rekognition has in the accuracy of the detected text and the accuracy of the geometry points around the detected text.
    */
  var Confidence: js.UndefOr[Percent] = js.native
  /**
    * The word or line of text recognized by Amazon Rekognition. 
    */
  var DetectedText: js.UndefOr[String] = js.native
  /**
    * The location of the detected text on the image. Includes an axis aligned coarse bounding box surrounding the text and a finer grain polygon for more accurate spatial information.
    */
  var Geometry: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.Geometry] = js.native
  /**
    * The identifier for the detected text. The identifier is only unique for a single call to DetectText. 
    */
  var Id: js.UndefOr[UInteger] = js.native
  /**
    * The Parent identifier for the detected text identified by the value of ID. If the type of detected text is LINE, the value of ParentId is Null. 
    */
  var ParentId: js.UndefOr[UInteger] = js.native
  /**
    * The type of text that was detected.
    */
  var Type: js.UndefOr[TextTypes] = js.native
}

object TextDetection {
  @scala.inline
  def apply(): TextDetection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextDetection]
  }
  @scala.inline
  implicit class TextDetectionOps[Self <: TextDetection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfidence(value: Percent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Confidence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfidence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Confidence")(js.undefined)
        ret
    }
    @scala.inline
    def withDetectedText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DetectedText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetectedText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DetectedText")(js.undefined)
        ret
    }
    @scala.inline
    def withGeometry(value: Geometry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Geometry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeometry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Geometry")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: UInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(js.undefined)
        ret
    }
    @scala.inline
    def withParentId(value: UInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParentId")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: TextTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(js.undefined)
        ret
    }
  }
  
}

