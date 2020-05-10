package typingsSlinky.googleapis.videointelligenceV1Mod.videointelligenceV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Config for TEXT_DETECTION.
  */
@js.native
trait SchemaGoogleCloudVideointelligenceV1TextDetectionConfig extends js.Object {
  /**
    * Language hint can be specified if the language to be detected is known a
    * priori. It can increase the accuracy of the detection. Language hint must
    * be language code in BCP-47 format.  Automatic language detection is
    * performed if no hint is provided.
    */
  var languageHints: js.UndefOr[js.Array[String]] = js.native
}

object SchemaGoogleCloudVideointelligenceV1TextDetectionConfig {
  @scala.inline
  def apply(): SchemaGoogleCloudVideointelligenceV1TextDetectionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1TextDetectionConfig]
  }
  @scala.inline
  implicit class SchemaGoogleCloudVideointelligenceV1TextDetectionConfigOps[Self <: SchemaGoogleCloudVideointelligenceV1TextDetectionConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLanguageHints(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageHints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguageHints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageHints")(js.undefined)
        ret
    }
  }
  
}

