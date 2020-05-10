package typingsSlinky.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeDerived extends js.Object {
  @JSName("$parent")
  var $parent: TypeDerived = js.native
  @JSName("$type")
  var $type: ElementType = js.native
}

object TypeDerived {
  @scala.inline
  def apply($parent: TypeDerived, $type: ElementType): TypeDerived = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeDerived]
  }
  @scala.inline
  implicit class TypeDerivedOps[Self <: TypeDerived] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$parent(value: TypeDerived): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$type(value: ElementType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

