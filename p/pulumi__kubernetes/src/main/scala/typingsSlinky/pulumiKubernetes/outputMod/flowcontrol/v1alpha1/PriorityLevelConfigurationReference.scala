package typingsSlinky.pulumiKubernetes.outputMod.flowcontrol.v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PriorityLevelConfigurationReference contains information that points to the
  * "request-priority" being used.
  */
@js.native
trait PriorityLevelConfigurationReference extends js.Object {
  /**
    * `name` is the name of the priority level configuration being referenced Required.
    */
  val name: String = js.native
}

object PriorityLevelConfigurationReference {
  @scala.inline
  def apply(name: String): PriorityLevelConfigurationReference = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PriorityLevelConfigurationReference]
  }
  @scala.inline
  implicit class PriorityLevelConfigurationReferenceOps[Self <: PriorityLevelConfigurationReference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

