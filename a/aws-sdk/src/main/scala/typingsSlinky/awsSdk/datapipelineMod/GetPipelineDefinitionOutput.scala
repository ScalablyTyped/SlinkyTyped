package typingsSlinky.awsSdk.datapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPipelineDefinitionOutput extends js.Object {
  /**
    * The parameter objects used in the pipeline definition.
    */
  var parameterObjects: js.UndefOr[ParameterObjectList] = js.native
  /**
    * The parameter values used in the pipeline definition.
    */
  var parameterValues: js.UndefOr[ParameterValueList] = js.native
  /**
    * The objects defined in the pipeline.
    */
  var pipelineObjects: js.UndefOr[PipelineObjectList] = js.native
}

object GetPipelineDefinitionOutput {
  @scala.inline
  def apply(): GetPipelineDefinitionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPipelineDefinitionOutput]
  }
  @scala.inline
  implicit class GetPipelineDefinitionOutputOps[Self <: GetPipelineDefinitionOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withPipelineObjects(value: PipelineObjectList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipelineObjects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPipelineObjects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipelineObjects")(js.undefined)
        ret
    }
  }
  
}

