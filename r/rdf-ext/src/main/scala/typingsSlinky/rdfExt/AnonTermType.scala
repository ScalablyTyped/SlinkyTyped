package typingsSlinky.rdfExt

import typingsSlinky.rdfExt.propTypeMod.PropType
import typingsSlinky.rdfExt.rdfExtStrings.termType
import typingsSlinky.rdfExt.rdfExtStrings.value
import typingsSlinky.rdfJs.mod.BlankNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTermType extends js.Object {
  var termType: PropType[BlankNode, typingsSlinky.rdfExt.rdfExtStrings.termType]
  var value: PropType[BlankNode, typingsSlinky.rdfExt.rdfExtStrings.value]
}

object AnonTermType {
  @scala.inline
  def apply(termType: PropType[BlankNode, termType], value: PropType[BlankNode, value]): AnonTermType = {
    val __obj = js.Dynamic.literal(termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTermType]
  }
}

