package typingsSlinky.rdfExt.anon

import typingsSlinky.rdfExt.propTypeMod.PropType
import typingsSlinky.rdfExt.rdfExtStrings.termType
import typingsSlinky.rdfExt.rdfExtStrings.value
import typingsSlinky.rdfJs.mod.NamedNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TermTypeValue extends js.Object {
  var termType: PropType[NamedNode, typingsSlinky.rdfExt.rdfExtStrings.termType] = js.native
  var value: PropType[NamedNode, typingsSlinky.rdfExt.rdfExtStrings.value] = js.native
}

object TermTypeValue {
  @scala.inline
  def apply(termType: PropType[NamedNode, termType], value: PropType[NamedNode, value]): TermTypeValue = {
    val __obj = js.Dynamic.literal(termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TermTypeValue]
  }
  @scala.inline
  implicit class TermTypeValueOps[Self <: TermTypeValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTermType(value: PropType[NamedNode, termType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("termType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: PropType[NamedNode, value]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

