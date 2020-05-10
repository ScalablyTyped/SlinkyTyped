package typingsSlinky.pulumiKubernetes.inputMod.flowcontrol.v1alpha1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * FlowDistinguisherMethod specifies the method of a flow distinguisher.
  */
@js.native
trait FlowDistinguisherMethod extends js.Object {
  /**
    * `type` is the type of flow distinguisher method The supported types are "ByUser" and
    * "ByNamespace". Required.
    */
  var `type`: Input[String] = js.native
}

object FlowDistinguisherMethod {
  @scala.inline
  def apply(`type`: Input[String]): FlowDistinguisherMethod = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowDistinguisherMethod]
  }
  @scala.inline
  implicit class FlowDistinguisherMethodOps[Self <: FlowDistinguisherMethod] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

