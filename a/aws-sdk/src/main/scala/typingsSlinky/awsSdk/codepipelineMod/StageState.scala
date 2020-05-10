package typingsSlinky.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StageState extends js.Object {
  /**
    * The state of the stage.
    */
  var actionStates: js.UndefOr[ActionStateList] = js.native
  /**
    * The state of the inbound transition, which is either enabled or disabled.
    */
  var inboundTransitionState: js.UndefOr[TransitionState] = js.native
  /**
    * Information about the latest execution in the stage, including its ID and status.
    */
  var latestExecution: js.UndefOr[StageExecution] = js.native
  /**
    * The name of the stage.
    */
  var stageName: js.UndefOr[StageName] = js.native
}

object StageState {
  @scala.inline
  def apply(): StageState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StageState]
  }
  @scala.inline
  implicit class StageStateOps[Self <: StageState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionStates(value: ActionStateList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionStates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionStates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionStates")(js.undefined)
        ret
    }
    @scala.inline
    def withInboundTransitionState(value: TransitionState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inboundTransitionState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInboundTransitionState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inboundTransitionState")(js.undefined)
        ret
    }
    @scala.inline
    def withLatestExecution(value: StageExecution): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latestExecution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatestExecution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latestExecution")(js.undefined)
        ret
    }
    @scala.inline
    def withStageName(value: StageName): Self = {
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
  }
  
}

