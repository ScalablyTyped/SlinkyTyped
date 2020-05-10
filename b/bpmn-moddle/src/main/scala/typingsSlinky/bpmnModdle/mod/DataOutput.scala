package typingsSlinky.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataOutput extends ItemAwareElement {
  /**
    * @default false
    */
  var isCollection: Boolean = js.native
  var name: String = js.native
  var outputSetRef: js.Array[InputSet] = js.native
  var outputSetWithOptional: js.Array[InputSet] = js.native
  var outputSetWithWhileExecuting: js.Array[InputSet] = js.native
}

object DataOutput {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    dataState: DataState,
    id: String,
    isCollection: Boolean,
    itemSubjectRef: ItemDefinition,
    name: String,
    outputSetRef: js.Array[InputSet],
    outputSetWithOptional: js.Array[InputSet],
    outputSetWithWhileExecuting: js.Array[InputSet]
  ): DataOutput = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], dataState = dataState.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isCollection = isCollection.asInstanceOf[js.Any], itemSubjectRef = itemSubjectRef.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], outputSetRef = outputSetRef.asInstanceOf[js.Any], outputSetWithOptional = outputSetWithOptional.asInstanceOf[js.Any], outputSetWithWhileExecuting = outputSetWithWhileExecuting.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataOutput]
  }
  @scala.inline
  implicit class DataOutputOps[Self <: DataOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsCollection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCollection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputSetRef(value: js.Array[InputSet]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputSetRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputSetWithOptional(value: js.Array[InputSet]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputSetWithOptional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputSetWithWhileExecuting(value: js.Array[InputSet]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputSetWithWhileExecuting")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

