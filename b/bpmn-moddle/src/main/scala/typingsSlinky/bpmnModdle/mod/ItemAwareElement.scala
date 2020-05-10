package typingsSlinky.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemAwareElement extends BaseElement {
  var dataState: DataState = js.native
  var itemSubjectRef: ItemDefinition = js.native
}

object ItemAwareElement {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    dataState: DataState,
    id: String,
    itemSubjectRef: ItemDefinition
  ): ItemAwareElement = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], dataState = dataState.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], itemSubjectRef = itemSubjectRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemAwareElement]
  }
  @scala.inline
  implicit class ItemAwareElementOps[Self <: ItemAwareElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataState(value: DataState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemSubjectRef(value: ItemDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemSubjectRef")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

