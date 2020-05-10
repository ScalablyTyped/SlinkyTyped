package typingsSlinky.pulumiKubernetes.inputMod.node.v1beta1

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiKubernetes.inputMod.core.v1.Toleration
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Scheduling specifies the scheduling constraints for nodes supporting a RuntimeClass.
  */
@js.native
trait Scheduling extends js.Object {
  /**
    * nodeSelector lists labels that must be present on nodes that support this RuntimeClass.
    * Pods using this RuntimeClass can only be scheduled to a node matched by this selector. The
    * RuntimeClass nodeSelector is merged with a pod's existing nodeSelector. Any conflicts will
    * cause the pod to be rejected in admission.
    */
  var nodeSelector: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * tolerations are appended (excluding duplicates) to pods running with this RuntimeClass
    * during admission, effectively unioning the set of nodes tolerated by the pod and the
    * RuntimeClass.
    */
  var tolerations: js.UndefOr[Input[js.Array[Input[Toleration]]]] = js.native
}

object Scheduling {
  @scala.inline
  def apply(): Scheduling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Scheduling]
  }
  @scala.inline
  implicit class SchedulingOps[Self <: Scheduling] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNodeSelector(value: Input[StringDictionary[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withTolerations(value: Input[js.Array[Input[Toleration]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tolerations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTolerations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tolerations")(js.undefined)
        ret
    }
  }
  
}

