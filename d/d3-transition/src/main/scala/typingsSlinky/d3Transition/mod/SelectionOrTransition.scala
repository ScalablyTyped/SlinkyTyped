package typingsSlinky.d3Transition.mod

import typingsSlinky.d3Selection.mod.BaseType
import typingsSlinky.d3Selection.mod.Selection_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.d3Selection.mod.Selection_[GElement, Datum, PElement, PDatum]
  - typingsSlinky.d3Transition.mod.Transition_[GElement, Datum, PElement, PDatum]
*/
trait SelectionOrTransition[GElement /* <: BaseType */, Datum, PElement /* <: BaseType */, PDatum] extends js.Object

object SelectionOrTransition {
  @scala.inline
  implicit def apply[GElement, Datum, PElement, PDatum](value: Selection_[GElement, Datum, PElement, PDatum]): SelectionOrTransition[GElement, Datum, PElement, PDatum] = value.asInstanceOf[SelectionOrTransition[GElement, Datum, PElement, PDatum]]
  @scala.inline
  implicit def apply[GElement, Datum, PElement, PDatum](value: Transition_[GElement, Datum, PElement, PDatum]): SelectionOrTransition[GElement, Datum, PElement, PDatum] = value.asInstanceOf[SelectionOrTransition[GElement, Datum, PElement, PDatum]]
}

