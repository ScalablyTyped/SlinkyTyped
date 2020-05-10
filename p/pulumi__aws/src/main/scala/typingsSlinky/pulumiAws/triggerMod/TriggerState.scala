package typingsSlinky.pulumiAws.triggerMod

import typingsSlinky.pulumiAws.inputMod.codecommit.TriggerTrigger
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TriggerState extends js.Object {
  val configurationId: js.UndefOr[Input[String]] = js.native
  /**
    * The name for the repository. This needs to be less than 100 characters.
    */
  val repositoryName: js.UndefOr[Input[String]] = js.native
  val triggers: js.UndefOr[Input[js.Array[Input[TriggerTrigger]]]] = js.native
}

object TriggerState {
  @scala.inline
  def apply(): TriggerState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TriggerState]
  }
  @scala.inline
  implicit class TriggerStateOps[Self <: TriggerState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigurationId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigurationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurationId")(js.undefined)
        ret
    }
    @scala.inline
    def withRepositoryName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositoryName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepositoryName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositoryName")(js.undefined)
        ret
    }
    @scala.inline
    def withTriggers(value: Input[js.Array[Input[TriggerTrigger]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTriggers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggers")(js.undefined)
        ret
    }
  }
  
}

