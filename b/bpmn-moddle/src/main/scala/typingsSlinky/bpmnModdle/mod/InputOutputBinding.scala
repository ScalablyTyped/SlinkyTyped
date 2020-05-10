package typingsSlinky.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputOutputBinding extends TypeDerived {
  var inputDataRef: InputSet = js.native
  var operationRef: Operation = js.native
  var outputDataRef: OutputSet = js.native
}

object InputOutputBinding {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    inputDataRef: InputSet,
    operationRef: Operation,
    outputDataRef: OutputSet
  ): InputOutputBinding = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], inputDataRef = inputDataRef.asInstanceOf[js.Any], operationRef = operationRef.asInstanceOf[js.Any], outputDataRef = outputDataRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputOutputBinding]
  }
  @scala.inline
  implicit class InputOutputBindingOps[Self <: InputOutputBinding] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInputDataRef(value: InputSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputDataRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperationRef(value: Operation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputDataRef(value: OutputSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputDataRef")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

