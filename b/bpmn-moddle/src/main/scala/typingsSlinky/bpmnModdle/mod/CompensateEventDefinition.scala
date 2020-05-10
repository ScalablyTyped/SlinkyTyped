package typingsSlinky.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompensateEventDefinition extends BaseElement {
  var activityRef: Activity = js.native
  var waitForCompletion: Boolean = js.native
}

object CompensateEventDefinition {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    activityRef: Activity,
    id: String,
    waitForCompletion: Boolean
  ): CompensateEventDefinition = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], activityRef = activityRef.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], waitForCompletion = waitForCompletion.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompensateEventDefinition]
  }
  @scala.inline
  implicit class CompensateEventDefinitionOps[Self <: CompensateEventDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivityRef(value: Activity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWaitForCompletion(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForCompletion")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

