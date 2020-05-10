package typingsSlinky.googleapis.videointelligenceV1beta2Mod.videointelligenceV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Video annotation request.
  */
@js.native
trait SchemaGoogleCloudVideointelligenceV1beta2AnnotateVideoRequest extends js.Object {
  /**
    * Requested video annotation features.
    */
  var features: js.UndefOr[js.Array[String]] = js.native
  /**
    * The video data bytes. If unset, the input video(s) should be specified
    * via `input_uri`. If set, `input_uri` should be unset.
    */
  var inputContent: js.UndefOr[String] = js.native
  /**
    * Input video location. Currently, only [Google Cloud
    * Storage](https://cloud.google.com/storage/) URIs are supported, which
    * must be specified in the following format: `gs://bucket-id/object-id`
    * (other URI formats return google.rpc.Code.INVALID_ARGUMENT). For more
    * information, see [Request URIs](/storage/docs/reference-uris). A video
    * URI may include wildcards in `object-id`, and thus identify multiple
    * videos. Supported wildcards: &#39;*&#39; to match 0 or more characters;
    * &#39;?&#39; to match 1 character. If unset, the input video should be
    * embedded in the request as `input_content`. If set, `input_content`
    * should be unset.
    */
  var inputUri: js.UndefOr[String] = js.native
  /**
    * Optional cloud region where annotation should take place. Supported cloud
    * regions: `us-east1`, `us-west1`, `europe-west1`, `asia-east1`. If no
    * region is specified, a region will be determined based on video file
    * location.
    */
  var locationId: js.UndefOr[String] = js.native
  /**
    * Optional location where the output (in JSON format) should be stored.
    * Currently, only [Google Cloud Storage](https://cloud.google.com/storage/)
    * URIs are supported, which must be specified in the following format:
    * `gs://bucket-id/object-id` (other URI formats return
    * google.rpc.Code.INVALID_ARGUMENT). For more information, see [Request
    * URIs](/storage/docs/reference-uris).
    */
  var outputUri: js.UndefOr[String] = js.native
  /**
    * Additional video context and/or feature-specific parameters.
    */
  var videoContext: js.UndefOr[SchemaGoogleCloudVideointelligenceV1beta2VideoContext] = js.native
}

object SchemaGoogleCloudVideointelligenceV1beta2AnnotateVideoRequest {
  @scala.inline
  def apply(): SchemaGoogleCloudVideointelligenceV1beta2AnnotateVideoRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1beta2AnnotateVideoRequest]
  }
  @scala.inline
  implicit class SchemaGoogleCloudVideointelligenceV1beta2AnnotateVideoRequestOps[Self <: SchemaGoogleCloudVideointelligenceV1beta2AnnotateVideoRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFeatures(value: js.Array[String]): Self = {
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
    def withInputContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputContent")(js.undefined)
        ret
    }
    @scala.inline
    def withInputUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputUri")(js.undefined)
        ret
    }
    @scala.inline
    def withLocationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationId")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputUri")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoContext(value: SchemaGoogleCloudVideointelligenceV1beta2VideoContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoContext")(js.undefined)
        ret
    }
  }
  
}

