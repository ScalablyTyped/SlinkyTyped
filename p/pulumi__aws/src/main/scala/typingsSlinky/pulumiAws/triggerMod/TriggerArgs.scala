package typingsSlinky.pulumiAws.triggerMod

import typingsSlinky.pulumiAws.inputMod.codecommit.TriggerTrigger
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TriggerArgs extends js.Object {
  /**
    * The name for the repository. This needs to be less than 100 characters.
    */
  val repositoryName: Input[String] = js.native
  val triggers: Input[js.Array[Input[TriggerTrigger]]] = js.native
}

object TriggerArgs {
  @scala.inline
  def apply(repositoryName: Input[String], triggers: Input[js.Array[Input[TriggerTrigger]]]): TriggerArgs = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any], triggers = triggers.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerArgs]
  }
  @scala.inline
  implicit class TriggerArgsOps[Self <: TriggerArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRepositoryName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositoryName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTriggers(value: Input[js.Array[Input[TriggerTrigger]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggers")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

