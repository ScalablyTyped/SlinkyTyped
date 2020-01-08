package typingsSlinky.rdfDashExt

import typingsSlinky.rdfDashExt.libUnderscorePropTypeMod.PropType
import typingsSlinky.rdfDashExt.rdfDashExtStrings.termType
import typingsSlinky.rdfDashExt.rdfDashExtStrings.value
import typingsSlinky.rdfDashJs.rdfDashJsMod.Variable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TermTypeValuePropType extends js.Object {
  var termType: PropType[Variable, typingsSlinky.rdfDashExt.rdfDashExtStrings.termType]
  var value: PropType[Variable, typingsSlinky.rdfDashExt.rdfDashExtStrings.value]
}

object Anon_TermTypeValuePropType {
  @scala.inline
  def apply(termType: PropType[Variable, termType], value: PropType[Variable, value]): Anon_TermTypeValuePropType = {
    val __obj = js.Dynamic.literal(termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_TermTypeValuePropType]
  }
}

