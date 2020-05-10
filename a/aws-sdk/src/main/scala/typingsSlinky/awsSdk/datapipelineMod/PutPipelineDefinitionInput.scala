package typingsSlinky.awsSdk.datapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutPipelineDefinitionInput extends js.Object {
  /**
    * The parameter objects used with the pipeline.
    */
  var parameterObjects: js.UndefOr[ParameterObjectList] = js.native
  /**
    * The parameter values used with the pipeline.
    */
  var parameterValues: js.UndefOr[ParameterValueList] = js.native
  /**
    * The ID of the pipeline.
    */
  var pipelineId: id = js.native
  /**
    * The objects that define the pipeline. These objects overwrite the existing pipeline definition.
    */
  var pipelineObjects: PipelineObjectList = js.native
}

object PutPipelineDefinitionInput {
  @scala.inline
  def apply(pipelineId: id, pipelineObjects: PipelineObjectList): PutPipelineDefinitionInput = {
    val __obj = js.Dynamic.literal(pipelineId = pipelineId.asInstanceOf[js.Any], pipelineObjects = pipelineObjects.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutPipelineDefinitionInput]
  }
  @scala.inline
  implicit class PutPipelineDefinitionInputOps[Self <: PutPipelineDefinitionInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPipelineId(value: id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipelineId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPipelineObjects(value: PipelineObjectList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipelineObjects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParameterObjects(value: ParameterObjectList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterObjects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameterObjects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterObjects")(js.undefined)
        ret
    }
    @scala.inline
    def withParameterValues(value: ParameterValueList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameterValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterValues")(js.undefined)
        ret
    }
  }
  
}

