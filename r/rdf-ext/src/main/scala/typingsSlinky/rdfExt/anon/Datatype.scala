package typingsSlinky.rdfExt.anon

import typingsSlinky.rdfExt.propTypeMod.PropType
import typingsSlinky.rdfExt.rdfExtStrings.language
import typingsSlinky.rdfExt.rdfExtStrings.termType
import typingsSlinky.rdfExt.rdfExtStrings.value
import typingsSlinky.rdfJs.mod.Literal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Datatype extends js.Object {
  var datatype: TermTypeValue
  var language: PropType[Literal, typingsSlinky.rdfExt.rdfExtStrings.language]
  var termType: PropType[Literal, typingsSlinky.rdfExt.rdfExtStrings.termType]
  var value: PropType[Literal, typingsSlinky.rdfExt.rdfExtStrings.value]
}

object Datatype {
  @scala.inline
  def apply(
    datatype: TermTypeValue,
    language: PropType[Literal, language],
    termType: PropType[Literal, termType],
    value: PropType[Literal, value]
  ): Datatype = {
    val __obj = js.Dynamic.literal(datatype = datatype.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Datatype]
  }
}

