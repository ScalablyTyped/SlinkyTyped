package typingsSlinky.rdfExt

import typingsSlinky.rdfExt.propTypeMod.PropType
import typingsSlinky.rdfExt.rdfExtStrings.termType
import typingsSlinky.rdfExt.rdfExtStrings.value
import typingsSlinky.rdfJs.mod.Variable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTermTypePropType extends js.Object {
  var termType: PropType[Variable, typingsSlinky.rdfExt.rdfExtStrings.termType]
  var value: PropType[Variable, typingsSlinky.rdfExt.rdfExtStrings.value]
}

object AnonTermTypePropType {
  @scala.inline
  def apply(termType: PropType[Variable, termType], value: PropType[Variable, value]): AnonTermTypePropType = {
    val __obj = js.Dynamic.literal(termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTermTypePropType]
  }
}

