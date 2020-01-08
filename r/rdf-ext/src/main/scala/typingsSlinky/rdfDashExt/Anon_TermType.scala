package typingsSlinky.rdfDashExt

import typingsSlinky.rdfDashExt.libUnderscorePropTypeMod.PropType
import typingsSlinky.rdfDashExt.rdfDashExtStrings.termType
import typingsSlinky.rdfDashExt.rdfDashExtStrings.value
import typingsSlinky.rdfDashJs.rdfDashJsMod.BlankNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TermType extends js.Object {
  var termType: PropType[BlankNode, typingsSlinky.rdfDashExt.rdfDashExtStrings.termType]
  var value: PropType[BlankNode, typingsSlinky.rdfDashExt.rdfDashExtStrings.value]
}

object Anon_TermType {
  @scala.inline
  def apply(termType: PropType[BlankNode, termType], value: PropType[BlankNode, value]): Anon_TermType = {
    val __obj = js.Dynamic.literal(termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_TermType]
  }
}

