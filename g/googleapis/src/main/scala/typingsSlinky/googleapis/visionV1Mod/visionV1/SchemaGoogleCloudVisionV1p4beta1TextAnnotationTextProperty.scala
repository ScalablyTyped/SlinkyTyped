package typingsSlinky.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Additional information detected on the structural component.
  */
@js.native
trait SchemaGoogleCloudVisionV1p4beta1TextAnnotationTextProperty extends js.Object {
  /**
    * Detected start or end of a text segment.
    */
  var detectedBreak: js.UndefOr[SchemaGoogleCloudVisionV1p4beta1TextAnnotationDetectedBreak] = js.native
  /**
    * A list of detected languages together with confidence.
    */
  var detectedLanguages: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p4beta1TextAnnotationDetectedLanguage]] = js.native
}

object SchemaGoogleCloudVisionV1p4beta1TextAnnotationTextProperty {
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p4beta1TextAnnotationTextProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p4beta1TextAnnotationTextProperty]
  }
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p4beta1TextAnnotationTextPropertyOps[Self <: SchemaGoogleCloudVisionV1p4beta1TextAnnotationTextProperty] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetectedBreak(value: SchemaGoogleCloudVisionV1p4beta1TextAnnotationDetectedBreak): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectedBreak")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetectedBreak: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectedBreak")(js.undefined)
        ret
    }
    @scala.inline
    def withDetectedLanguages(value: js.Array[SchemaGoogleCloudVisionV1p4beta1TextAnnotationDetectedLanguage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectedLanguages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetectedLanguages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectedLanguages")(js.undefined)
        ret
    }
  }
  
}

