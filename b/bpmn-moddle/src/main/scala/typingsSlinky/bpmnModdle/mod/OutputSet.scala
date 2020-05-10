package typingsSlinky.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputSet extends BaseElement {
  var dataOutputRefs: js.Array[DataOutput] = js.native
  var inputSetRefs: js.Array[InputSet] = js.native
  var name: String = js.native
  var optionalOutputRefs: js.Array[DataOutput] = js.native
  var whileExecutingOutputREfs: js.Array[DataOutput] = js.native
}

object OutputSet {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    dataOutputRefs: js.Array[DataOutput],
    id: String,
    inputSetRefs: js.Array[InputSet],
    name: String,
    optionalOutputRefs: js.Array[DataOutput],
    whileExecutingOutputREfs: js.Array[DataOutput]
  ): OutputSet = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], dataOutputRefs = dataOutputRefs.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inputSetRefs = inputSetRefs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], optionalOutputRefs = optionalOutputRefs.asInstanceOf[js.Any], whileExecutingOutputREfs = whileExecutingOutputREfs.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputSet]
  }
  @scala.inline
  implicit class OutputSetOps[Self <: OutputSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataOutputRefs(value: js.Array[DataOutput]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataOutputRefs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputSetRefs(value: js.Array[InputSet]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputSetRefs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptionalOutputRefs(value: js.Array[DataOutput]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionalOutputRefs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWhileExecutingOutputREfs(value: js.Array[DataOutput]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whileExecutingOutputREfs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

