package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NamespaceStatus is information about the current status of a Namespace.
  */
@js.native
trait NamespaceStatus extends js.Object {
  /**
    * Represents the latest available observations of a namespace's current state.
    */
  var conditions: js.UndefOr[Input[js.Array[Input[NamespaceCondition]]]] = js.native
  /**
    * Phase is the current lifecycle phase of the namespace. More info:
    * https://kubernetes.io/docs/tasks/administer-cluster/namespaces/
    */
  var phase: js.UndefOr[Input[String]] = js.native
}

object NamespaceStatus {
  @scala.inline
  def apply(): NamespaceStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NamespaceStatus]
  }
  @scala.inline
  implicit class NamespaceStatusOps[Self <: NamespaceStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConditions(value: Input[js.Array[Input[NamespaceCondition]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConditions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditions")(js.undefined)
        ret
    }
    @scala.inline
    def withPhase(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phase")(js.undefined)
        ret
    }
  }
  
}

