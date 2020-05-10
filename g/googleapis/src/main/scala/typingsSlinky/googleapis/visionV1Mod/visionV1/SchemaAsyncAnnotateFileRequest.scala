package typingsSlinky.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An offline file annotation request.
  */
@js.native
trait SchemaAsyncAnnotateFileRequest extends js.Object {
  /**
    * Required. Requested features.
    */
  var features: js.UndefOr[js.Array[SchemaFeature]] = js.native
  /**
    * Additional context that may accompany the image(s) in the file.
    */
  var imageContext: js.UndefOr[SchemaImageContext] = js.native
  /**
    * Required. Information about the input file.
    */
  var inputConfig: js.UndefOr[SchemaInputConfig] = js.native
  /**
    * Required. The desired output location and metadata (e.g. format).
    */
  var outputConfig: js.UndefOr[SchemaOutputConfig] = js.native
}

object SchemaAsyncAnnotateFileRequest {
  @scala.inline
  def apply(): SchemaAsyncAnnotateFileRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAsyncAnnotateFileRequest]
  }
  @scala.inline
  implicit class SchemaAsyncAnnotateFileRequestOps[Self <: SchemaAsyncAnnotateFileRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFeatures(value: js.Array[SchemaFeature]): Self = {
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
    def withImageContext(value: SchemaImageContext): Self = {
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
    def withInputConfig(value: SchemaInputConfig): Self = {
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
    def withOutputConfig(value: SchemaOutputConfig): Self = {
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

