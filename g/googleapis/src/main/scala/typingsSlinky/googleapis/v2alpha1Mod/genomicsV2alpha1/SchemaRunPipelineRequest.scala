package typingsSlinky.googleapis.v2alpha1Mod.genomicsV2alpha1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The arguments to the `RunPipeline` method. The requesting user must have
  * the `iam.serviceAccounts.actAs` permission for the Cloud Genomics service
  * account or the request will fail.
  */
@js.native
trait SchemaRunPipelineRequest extends js.Object {
  /**
    * User-defined labels to associate with the returned operation. These
    * labels are not propagated to any Google Cloud Platform resources used by
    * the operation, and can be modified at any time.  To associate labels with
    * resources created while executing the operation, see the appropriate
    * resource message (for example, `VirtualMachine`).
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The description of the pipeline to run.
    */
  var pipeline: js.UndefOr[SchemaPipeline] = js.native
}

object SchemaRunPipelineRequest {
  @scala.inline
  def apply(): SchemaRunPipelineRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRunPipelineRequest]
  }
  @scala.inline
  implicit class SchemaRunPipelineRequestOps[Self <: SchemaRunPipelineRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabels(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
    @scala.inline
    def withPipeline(value: SchemaPipeline): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipeline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPipeline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipeline")(js.undefined)
        ret
    }
  }
  
}

