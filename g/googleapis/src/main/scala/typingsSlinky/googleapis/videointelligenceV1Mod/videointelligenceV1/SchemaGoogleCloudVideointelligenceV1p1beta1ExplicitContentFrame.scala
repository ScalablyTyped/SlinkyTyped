package typingsSlinky.googleapis.videointelligenceV1Mod.videointelligenceV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Video frame level annotation results for explicit content.
  */
@js.native
trait SchemaGoogleCloudVideointelligenceV1p1beta1ExplicitContentFrame extends js.Object {
  /**
    * Likelihood of the pornography content..
    */
  var pornographyLikelihood: js.UndefOr[String] = js.native
  /**
    * Time-offset, relative to the beginning of the video, corresponding to the
    * video frame for this location.
    */
  var timeOffset: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudVideointelligenceV1p1beta1ExplicitContentFrame {
  @scala.inline
  def apply(): SchemaGoogleCloudVideointelligenceV1p1beta1ExplicitContentFrame = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1p1beta1ExplicitContentFrame]
  }
  @scala.inline
  implicit class SchemaGoogleCloudVideointelligenceV1p1beta1ExplicitContentFrameOps[Self <: SchemaGoogleCloudVideointelligenceV1p1beta1ExplicitContentFrame] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPornographyLikelihood(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pornographyLikelihood")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPornographyLikelihood: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pornographyLikelihood")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeOffset(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeOffset")(js.undefined)
        ret
    }
  }
  
}

