package typingsSlinky.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataInput extends ItemAwareElement {
  var inputSetRef: InputSet = js.native
  var inputSetWithOptional: InputSet = js.native
  var inputSetWithWhileExecuting: InputSet = js.native
  /** @default false */
  var isCollection: Boolean = js.native
  var name: String = js.native
}

object DataInput {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    dataState: DataState,
    id: String,
    inputSetRef: InputSet,
    inputSetWithOptional: InputSet,
    inputSetWithWhileExecuting: InputSet,
    isCollection: Boolean,
    itemSubjectRef: ItemDefinition,
    name: String
  ): DataInput = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], dataState = dataState.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inputSetRef = inputSetRef.asInstanceOf[js.Any], inputSetWithOptional = inputSetWithOptional.asInstanceOf[js.Any], inputSetWithWhileExecuting = inputSetWithWhileExecuting.asInstanceOf[js.Any], isCollection = isCollection.asInstanceOf[js.Any], itemSubjectRef = itemSubjectRef.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataInput]
  }
  @scala.inline
  implicit class DataInputOps[Self <: DataInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInputSetRef(value: InputSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputSetRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputSetWithOptional(value: InputSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputSetWithOptional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputSetWithWhileExecuting(value: InputSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputSetWithWhileExecuting")(value.asInstanceOf[js.Any])
        ret
    }
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
  }
  
}

