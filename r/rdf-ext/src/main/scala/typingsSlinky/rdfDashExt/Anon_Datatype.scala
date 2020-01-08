package typingsSlinky.rdfDashExt

import typingsSlinky.rdfDashExt.libUnderscorePropTypeMod.PropType
import typingsSlinky.rdfDashExt.rdfDashExtStrings.language
import typingsSlinky.rdfDashExt.rdfDashExtStrings.termType
import typingsSlinky.rdfDashExt.rdfDashExtStrings.value
import typingsSlinky.rdfDashJs.rdfDashJsMod.Literal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Datatype extends js.Object {
  var datatype: Anon_TermTypeValueNamedNode
  var language: PropType[Literal, typingsSlinky.rdfDashExt.rdfDashExtStrings.language]
  var termType: PropType[Literal, typingsSlinky.rdfDashExt.rdfDashExtStrings.termType]
  var value: PropType[Literal, typingsSlinky.rdfDashExt.rdfDashExtStrings.value]
}

object Anon_Datatype {
  @scala.inline
  def apply(
    datatype: Anon_TermTypeValueNamedNode,
    language: PropType[Literal, language],
    termType: PropType[Literal, termType],
    value: PropType[Literal, value]
  ): Anon_Datatype = {
    val __obj = js.Dynamic.literal(datatype = datatype.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Datatype]
  }
}

