package typingsSlinky.rdfDashExt

import typingsSlinky.rdfDashExt.libUnderscorePropTypeMod.PropType
import typingsSlinky.rdfDashExt.rdfDashExtStrings.termType
import typingsSlinky.rdfDashExt.rdfDashExtStrings.value
import typingsSlinky.rdfDashJs.rdfDashJsMod.NamedNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TermTypeValueNamedNode extends js.Object {
  var termType: PropType[NamedNode, typingsSlinky.rdfDashExt.rdfDashExtStrings.termType]
  var value: PropType[NamedNode, typingsSlinky.rdfDashExt.rdfDashExtStrings.value]
}

object Anon_TermTypeValueNamedNode {
  @scala.inline
  def apply(termType: PropType[NamedNode, termType], value: PropType[NamedNode, value]): Anon_TermTypeValueNamedNode = {
    val __obj = js.Dynamic.literal(termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_TermTypeValueNamedNode]
  }
}

