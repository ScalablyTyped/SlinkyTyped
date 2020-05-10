package typingsSlinky.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Operation extends BaseElement {
  var errorRef: ErrorElement = js.native
  var implementationRef: String = js.native
  var inMessageRef: Message = js.native
  var name: String = js.native
  var outMessageRef: Message = js.native
}

object Operation {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    errorRef: ErrorElement,
    id: String,
    implementationRef: String,
    inMessageRef: Message,
    name: String,
    outMessageRef: Message
  ): Operation = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], errorRef = errorRef.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], implementationRef = implementationRef.asInstanceOf[js.Any], inMessageRef = inMessageRef.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], outMessageRef = outMessageRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operation]
  }
  @scala.inline
  implicit class OperationOps[Self <: Operation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorRef(value: ErrorElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImplementationRef(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("implementationRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInMessageRef(value: Message): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inMessageRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutMessageRef(value: Message): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outMessageRef")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

