package typingsSlinky.polished.interactionStateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Unit
  - scala.Null
  - typingsSlinky.polished.polishedStrings.active
  - typingsSlinky.polished.polishedStrings.focus
  - typingsSlinky.polished.polishedStrings.hover
*/
trait InteractionState extends js.Object

object InteractionState {
  @scala.inline
  def active: typingsSlinky.polished.polishedStrings.active = "active".asInstanceOf[typingsSlinky.polished.polishedStrings.active]
  @scala.inline
  def focus: typingsSlinky.polished.polishedStrings.focus = "focus".asInstanceOf[typingsSlinky.polished.polishedStrings.focus]
  @scala.inline
  def hover: typingsSlinky.polished.polishedStrings.hover = "hover".asInstanceOf[typingsSlinky.polished.polishedStrings.hover]
  @scala.inline
  implicit def apply(value: Null): InteractionState = value.asInstanceOf[InteractionState]
  @scala.inline
  implicit def apply(value: Unit): InteractionState = value.asInstanceOf[InteractionState]
}

