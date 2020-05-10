package typingsSlinky.flowjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFlowOptions extends js.Object {
  var allowDuplicateUploads: js.UndefOr[Boolean] = js.native
  var chunkRetryInterval: js.UndefOr[Double] = js.native
  var chunkSize: js.UndefOr[Double] = js.native
  var fileParameterName: js.UndefOr[String] = js.native
  var forceChunkSize: js.UndefOr[Boolean] = js.native
  var generateUniqueIdentifier: js.UndefOr[js.Function] = js.native
  var headers: js.UndefOr[js.Object] = js.native
  var initFileFn: js.UndefOr[js.Function] = js.native
  var maxChunkRetries: js.UndefOr[Double] = js.native
  var method: js.UndefOr[String] = js.native
  var permanentErrors: js.UndefOr[js.Array[String]] = js.native
  var preprocess: js.UndefOr[js.Function] = js.native
  var prioritizeFirstAndLastChunk: js.UndefOr[Boolean] = js.native
  var progressCallbacksInterval: js.UndefOr[Double] = js.native
  var query: js.UndefOr[js.Object] = js.native
  var simultaneousUploads: js.UndefOr[Double] = js.native
  var singleFile: js.UndefOr[Boolean] = js.native
  var speedSmoothingFactor: js.UndefOr[Double] = js.native
  var successStatuses: js.UndefOr[js.Array[String]] = js.native
  var target: js.UndefOr[String] = js.native
  var testChunks: js.UndefOr[Boolean] = js.native
  var testMethod: js.UndefOr[String] = js.native
  var uploadMethod: js.UndefOr[String] = js.native
  var withCredentials: js.UndefOr[Boolean] = js.native
}

object IFlowOptions {
  @scala.inline
  def apply(): IFlowOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFlowOptions]
  }
  @scala.inline
  implicit class IFlowOptionsOps[Self <: IFlowOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowDuplicateUploads(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDuplicateUploads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowDuplicateUploads: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDuplicateUploads")(js.undefined)
        ret
    }
    @scala.inline
    def withChunkRetryInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkRetryInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChunkRetryInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkRetryInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withChunkSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChunkSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkSize")(js.undefined)
        ret
    }
    @scala.inline
    def withFileParameterName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileParameterName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileParameterName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileParameterName")(js.undefined)
        ret
    }
    @scala.inline
    def withForceChunkSize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceChunkSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceChunkSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceChunkSize")(js.undefined)
        ret
    }
    @scala.inline
    def withGenerateUniqueIdentifier(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateUniqueIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGenerateUniqueIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateUniqueIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withInitFileFn(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initFileFn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitFileFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initFileFn")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxChunkRetries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxChunkRetries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxChunkRetries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxChunkRetries")(js.undefined)
        ret
    }
    @scala.inline
    def withMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.undefined)
        ret
    }
    @scala.inline
    def withPermanentErrors(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permanentErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermanentErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permanentErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withPreprocess(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preprocess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreprocess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preprocess")(js.undefined)
        ret
    }
    @scala.inline
    def withPrioritizeFirstAndLastChunk(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prioritizeFirstAndLastChunk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrioritizeFirstAndLastChunk: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prioritizeFirstAndLastChunk")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressCallbacksInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressCallbacksInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressCallbacksInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressCallbacksInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withQuery(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.undefined)
        ret
    }
    @scala.inline
    def withSimultaneousUploads(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simultaneousUploads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSimultaneousUploads: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simultaneousUploads")(js.undefined)
        ret
    }
    @scala.inline
    def withSingleFile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSingleFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleFile")(js.undefined)
        ret
    }
    @scala.inline
    def withSpeedSmoothingFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speedSmoothingFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpeedSmoothingFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speedSmoothingFactor")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccessStatuses(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successStatuses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuccessStatuses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successStatuses")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
    @scala.inline
    def withTestChunks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testChunks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestChunks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testChunks")(js.undefined)
        ret
    }
    @scala.inline
    def withTestMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withUploadMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploadMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withWithCredentials(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withCredentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withCredentials")(js.undefined)
        ret
    }
  }
  
}

