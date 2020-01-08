package typingsSlinky.rdfDashExt

import typingsSlinky.rdfDashExt.libUnderscorePropTypeMod.PropType
import typingsSlinky.rdfDashExt.rdfDashExtStrings.termType
import typingsSlinky.rdfDashExt.rdfDashExtStrings.value
import typingsSlinky.rdfDashJs.rdfDashJsMod.DefaultGraph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TermTypeValue extends js.Object {
  var termType: PropType[DefaultGraph, typingsSlinky.rdfDashExt.rdfDashExtStrings.termType]
  var value: PropType[DefaultGraph, typingsSlinky.rdfDashExt.rdfDashExtStrings.value]
}

object Anon_TermTypeValue {
  @scala.inline
  def apply(termType: PropType[DefaultGraph, termType], value: PropType[DefaultGraph, value]): Anon_TermTypeValue = {
    val __obj = js.Dynamic.literal(termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_TermTypeValue]
  }
}

