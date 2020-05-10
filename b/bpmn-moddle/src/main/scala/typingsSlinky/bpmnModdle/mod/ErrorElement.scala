package typingsSlinky.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorElement extends BaseElement {
  var errorCode: String = js.native
  var name: String = js.native
  var structureRef: ItemDefinition = js.native
}

object ErrorElement {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    errorCode: String,
    id: String,
    name: String,
    structureRef: ItemDefinition
  ): ErrorElement = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], errorCode = errorCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], structureRef = structureRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorElement]
  }
  @scala.inline
  implicit class ErrorElementOps[Self <: ErrorElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStructureRef(value: ItemDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structureRef")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

