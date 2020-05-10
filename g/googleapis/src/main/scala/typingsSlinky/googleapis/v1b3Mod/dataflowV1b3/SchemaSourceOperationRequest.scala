package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A work item that represents the different operations that can be performed
  * on a user-defined Source specification.
  */
@js.native
trait SchemaSourceOperationRequest extends js.Object {
  /**
    * Information about a request to get metadata about a source.
    */
  var getMetadata: js.UndefOr[SchemaSourceGetMetadataRequest] = js.native
  /**
    * User-provided name of the Read instruction for this source.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * System-defined name for the Read instruction for this source in the
    * original workflow graph.
    */
  var originalName: js.UndefOr[String] = js.native
  /**
    * Information about a request to split a source.
    */
  var split: js.UndefOr[SchemaSourceSplitRequest] = js.native
  /**
    * System-defined name of the stage containing the source operation. Unique
    * across the workflow.
    */
  var stageName: js.UndefOr[String] = js.native
  /**
    * System-defined name of the Read instruction for this source. Unique
    * across the workflow.
    */
  var systemName: js.UndefOr[String] = js.native
}

object SchemaSourceOperationRequest {
  @scala.inline
  def apply(): SchemaSourceOperationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSourceOperationRequest]
  }
  @scala.inline
  implicit class SchemaSourceOperationRequestOps[Self <: SchemaSourceOperationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetMetadata(value: SchemaSourceGetMetadataRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginalName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalName")(js.undefined)
        ret
    }
    @scala.inline
    def withSplit(value: SchemaSourceSplitRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("split")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSplit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("split")(js.undefined)
        ret
    }
    @scala.inline
    def withStageName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stageName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStageName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stageName")(js.undefined)
        ret
    }
    @scala.inline
    def withSystemName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSystemName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemName")(js.undefined)
        ret
    }
  }
  
}

