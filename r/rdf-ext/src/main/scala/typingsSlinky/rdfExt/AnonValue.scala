package typingsSlinky.rdfExt

import typingsSlinky.rdfExt.propTypeMod.PropType
import typingsSlinky.rdfExt.rdfExtStrings.termType
import typingsSlinky.rdfExt.rdfExtStrings.value
import typingsSlinky.rdfJs.mod.DefaultGraph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValue extends js.Object {
  var termType: PropType[DefaultGraph, typingsSlinky.rdfExt.rdfExtStrings.termType]
  var value: PropType[DefaultGraph, typingsSlinky.rdfExt.rdfExtStrings.value]
}

object AnonValue {
  @scala.inline
  def apply(termType: PropType[DefaultGraph, termType], value: PropType[DefaultGraph, value]): AnonValue = {
    val __obj = js.Dynamic.literal(termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonValue]
  }
}

