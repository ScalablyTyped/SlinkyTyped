package typingsSlinky.rdfExt.anon

import typingsSlinky.rdfExt.propTypeMod.PropType
import typingsSlinky.rdfExt.rdfExtStrings.termType
import typingsSlinky.rdfExt.rdfExtStrings.value
import typingsSlinky.rdfJs.mod.Variable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TermTypePropType extends js.Object {
  var termType: PropType[Variable, typingsSlinky.rdfExt.rdfExtStrings.termType] = js.native
  var value: PropType[Variable, typingsSlinky.rdfExt.rdfExtStrings.value] = js.native
}

object TermTypePropType {
  @scala.inline
  def apply(termType: PropType[Variable, termType], value: PropType[Variable, value]): TermTypePropType = {
    val __obj = js.Dynamic.literal(termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TermTypePropType]
  }
  @scala.inline
  implicit class TermTypePropTypeOps[Self <: TermTypePropType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTermType(value: PropType[Variable, termType]): Self = this.set("termType", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: PropType[Variable, value]): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

