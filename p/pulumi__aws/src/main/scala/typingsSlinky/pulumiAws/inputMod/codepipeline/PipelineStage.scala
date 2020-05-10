package typingsSlinky.pulumiAws.inputMod.codepipeline

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PipelineStage extends js.Object {
  var actions: Input[js.Array[Input[PipelineStageAction]]] = js.native
  /**
    * The name of the pipeline.
    */
  var name: Input[String] = js.native
}

object PipelineStage {
  @scala.inline
  def apply(actions: Input[js.Array[Input[PipelineStageAction]]], name: Input[String]): PipelineStage = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipelineStage]
  }
  @scala.inline
  implicit class PipelineStageOps[Self <: PipelineStage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActions(value: Input[js.Array[Input[PipelineStageAction]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

