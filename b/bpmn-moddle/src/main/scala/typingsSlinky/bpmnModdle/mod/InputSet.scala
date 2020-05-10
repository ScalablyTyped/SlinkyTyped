package typingsSlinky.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputSet extends BaseElement {
  var dataInputRefs: js.Array[DataInput] = js.native
  var name: String = js.native
  var optionalInputRefs: js.Array[DataInput] = js.native
  var outputSetRefs: js.Array[OutputSet] = js.native
  var whileExecutingInputsRefs: js.Array[DataInput] = js.native
}

object InputSet {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    dataInputRefs: js.Array[DataInput],
    id: String,
    name: String,
    optionalInputRefs: js.Array[DataInput],
    outputSetRefs: js.Array[OutputSet],
    whileExecutingInputsRefs: js.Array[DataInput]
  ): InputSet = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], dataInputRefs = dataInputRefs.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], optionalInputRefs = optionalInputRefs.asInstanceOf[js.Any], outputSetRefs = outputSetRefs.asInstanceOf[js.Any], whileExecutingInputsRefs = whileExecutingInputsRefs.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputSet]
  }
  @scala.inline
  implicit class InputSetOps[Self <: InputSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataInputRefs(value: js.Array[DataInput]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataInputRefs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptionalInputRefs(value: js.Array[DataInput]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionalInputRefs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputSetRefs(value: js.Array[OutputSet]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputSetRefs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWhileExecutingInputsRefs(value: js.Array[DataInput]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whileExecutingInputsRefs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

