package typingsSlinky.rdfExt

import typingsSlinky.rdfExt.propTypeMod.PropType
import typingsSlinky.rdfExt.rdfExtStrings.termType
import typingsSlinky.rdfExt.rdfExtStrings.value
import typingsSlinky.rdfJs.mod.NamedNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTermTypeValue extends js.Object {
  var termType: PropType[NamedNode, typingsSlinky.rdfExt.rdfExtStrings.termType]
  var value: PropType[NamedNode, typingsSlinky.rdfExt.rdfExtStrings.value]
}

object AnonTermTypeValue {
  @scala.inline
  def apply(termType: PropType[NamedNode, termType], value: PropType[NamedNode, value]): AnonTermTypeValue = {
    val __obj = js.Dynamic.literal(termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTermTypeValue]
  }
}

