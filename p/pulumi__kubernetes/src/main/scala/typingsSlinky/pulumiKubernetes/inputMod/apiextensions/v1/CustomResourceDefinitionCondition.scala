package typingsSlinky.pulumiKubernetes.inputMod.apiextensions.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CustomResourceDefinitionCondition contains details for the current condition of this pod.
  */
@js.native
trait CustomResourceDefinitionCondition extends js.Object {
  /**
    * lastTransitionTime last time the condition transitioned from one status to another.
    */
  var lastTransitionTime: js.UndefOr[Input[String]] = js.native
  /**
    * message is a human-readable message indicating details about last transition.
    */
  var message: js.UndefOr[Input[String]] = js.native
  /**
    * reason is a unique, one-word, CamelCase reason for the condition's last transition.
    */
  var reason: js.UndefOr[Input[String]] = js.native
  /**
    * status is the status of the condition. Can be True, False, Unknown.
    */
  var status: Input[String] = js.native
  /**
    * type is the type of the condition. Types include Established, NamesAccepted and
    * Terminating.
    */
  var `type`: Input[String] = js.native
}

object CustomResourceDefinitionCondition {
  @scala.inline
  def apply(status: Input[String], `type`: Input[String]): CustomResourceDefinitionCondition = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomResourceDefinitionCondition]
  }
  @scala.inline
  implicit class CustomResourceDefinitionConditionOps[Self <: CustomResourceDefinitionCondition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatus(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastTransitionTime(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastTransitionTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastTransitionTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastTransitionTime")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def withReason(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(js.undefined)
        ret
    }
  }
  
}

