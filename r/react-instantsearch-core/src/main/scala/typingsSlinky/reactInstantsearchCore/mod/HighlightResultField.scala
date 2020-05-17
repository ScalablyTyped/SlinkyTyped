package typingsSlinky.reactInstantsearchCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactInstantsearchCore.mod.HighlightResult[TField]
  - typingsSlinky.reactInstantsearchCore.mod.HighlightResultPrimitive
  - typingsSlinky.reactInstantsearchCore.mod.HighlightResultArray[js.Any]
*/
trait HighlightResultField[TField] extends js.Object

object HighlightResultField {
  @scala.inline
  implicit def apply[TField](value: HighlightResult[TField]): HighlightResultField[TField] = value.asInstanceOf[HighlightResultField[TField]]
  @scala.inline
  implicit def apply[TField](value: HighlightResultArray[js.Any]): HighlightResultField[TField] = value.asInstanceOf[HighlightResultField[TField]]
  @scala.inline
  implicit def apply[TField](value: HighlightResultPrimitive): HighlightResultField[TField] = value.asInstanceOf[HighlightResultField[TField]]
}

