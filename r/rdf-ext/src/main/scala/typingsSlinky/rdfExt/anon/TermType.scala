package typingsSlinky.rdfExt.anon

import typingsSlinky.rdfExt.propTypeMod.PropType
import typingsSlinky.rdfExt.rdfExtStrings.termType
import typingsSlinky.rdfExt.rdfExtStrings.value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TermType extends js.Object {
  var termType: PropType[typingsSlinky.rdfJs.mod.BlankNode, typingsSlinky.rdfExt.rdfExtStrings.termType]
  var value: PropType[typingsSlinky.rdfJs.mod.BlankNode, typingsSlinky.rdfExt.rdfExtStrings.value]
}

object TermType {
  @scala.inline
  def apply(
    termType: PropType[typingsSlinky.rdfJs.mod.BlankNode, termType],
    value: PropType[typingsSlinky.rdfJs.mod.BlankNode, value]
  ): TermType = {
    val __obj = js.Dynamic.literal(termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TermType]
  }
}

