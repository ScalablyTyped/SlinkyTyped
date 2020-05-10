package typingsSlinky.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputOutputSpecification extends BaseElement {
  var dataInputs: js.Array[DataInput] = js.native
  var dataOutputs: js.Array[DataOutput] = js.native
  var inputSets: js.Array[InputSet] = js.native
  var outputSets: js.Array[OutputSet] = js.native
}

object InputOutputSpecification {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    dataInputs: js.Array[DataInput],
    dataOutputs: js.Array[DataOutput],
    id: String,
    inputSets: js.Array[InputSet],
    outputSets: js.Array[OutputSet]
  ): InputOutputSpecification = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], dataInputs = dataInputs.asInstanceOf[js.Any], dataOutputs = dataOutputs.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inputSets = inputSets.asInstanceOf[js.Any], outputSets = outputSets.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputOutputSpecification]
  }
  @scala.inline
  implicit class InputOutputSpecificationOps[Self <: InputOutputSpecification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataInputs(value: js.Array[DataInput]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataInputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataOutputs(value: js.Array[DataOutput]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataOutputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputSets(value: js.Array[InputSet]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputSets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputSets(value: js.Array[OutputSet]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputSets")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

