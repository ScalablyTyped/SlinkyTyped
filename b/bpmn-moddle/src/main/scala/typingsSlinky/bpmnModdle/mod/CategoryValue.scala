package typingsSlinky.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CategoryValue extends BaseElement {
  var categorizedFlowElements: js.Array[FlowElement] = js.native
  var value: String = js.native
}

object CategoryValue {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    categorizedFlowElements: js.Array[FlowElement],
    id: String,
    value: String
  ): CategoryValue = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], categorizedFlowElements = categorizedFlowElements.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CategoryValue]
  }
  @scala.inline
  implicit class CategoryValueOps[Self <: CategoryValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategorizedFlowElements(value: js.Array[FlowElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categorizedFlowElements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

