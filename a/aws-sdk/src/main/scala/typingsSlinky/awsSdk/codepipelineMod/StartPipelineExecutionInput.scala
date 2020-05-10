package typingsSlinky.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartPipelineExecutionInput extends js.Object {
  /**
    * The system-generated unique ID used to identify a unique execution request.
    */
  var clientRequestToken: js.UndefOr[ClientRequestToken] = js.native
  /**
    * The name of the pipeline to start.
    */
  var name: PipelineName = js.native
}

object StartPipelineExecutionInput {
  @scala.inline
  def apply(name: PipelineName): StartPipelineExecutionInput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartPipelineExecutionInput]
  }
  @scala.inline
  implicit class StartPipelineExecutionInputOps[Self <: StartPipelineExecutionInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: PipelineName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientRequestToken(value: ClientRequestToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientRequestToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientRequestToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientRequestToken")(js.undefined)
        ret
    }
  }
  
}

