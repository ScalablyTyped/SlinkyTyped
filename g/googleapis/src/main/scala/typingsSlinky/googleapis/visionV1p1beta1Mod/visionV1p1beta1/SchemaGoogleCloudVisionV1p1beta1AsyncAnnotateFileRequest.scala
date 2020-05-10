package typingsSlinky.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An offline file annotation request.
  */
@js.native
trait SchemaGoogleCloudVisionV1p1beta1AsyncAnnotateFileRequest extends js.Object {
  /**
    * Required. Requested features.
    */
  var features: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p1beta1Feature]] = js.native
  /**
    * Additional context that may accompany the image(s) in the file.
    */
  var imageContext: js.UndefOr[SchemaGoogleCloudVisionV1p1beta1ImageContext] = js.native
  /**
    * Required. Information about the input file.
    */
  var inputConfig: js.UndefOr[SchemaGoogleCloudVisionV1p1beta1InputConfig] = js.native
  /**
    * Required. The desired output location and metadata (e.g. format).
    */
  var outputConfig: js.UndefOr[SchemaGoogleCloudVisionV1p1beta1OutputConfig] = js.native
}

object SchemaGoogleCloudVisionV1p1beta1AsyncAnnotateFileRequest {
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p1beta1AsyncAnnotateFileRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p1beta1AsyncAnnotateFileRequest]
  }
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p1beta1AsyncAnnotateFileRequestOps[Self <: SchemaGoogleCloudVisionV1p1beta1AsyncAnnotateFileRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFeatures(value: js.Array[SchemaGoogleCloudVisionV1p1beta1Feature]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("features")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("features")(js.undefined)
        ret
    }
    @scala.inline
    def withImageContext(value: SchemaGoogleCloudVisionV1p1beta1ImageContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageContext")(js.undefined)
        ret
    }
    @scala.inline
    def withInputConfig(value: SchemaGoogleCloudVisionV1p1beta1InputConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputConfig(value: SchemaGoogleCloudVisionV1p1beta1OutputConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputConfig")(js.undefined)
        ret
    }
  }
  
}

