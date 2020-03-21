package typingsSlinky.reactNativeGestureHandler.drawerLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactNativeGestureHandler.reactNativeGestureHandlerStrings.Idle
  - typingsSlinky.reactNativeGestureHandler.reactNativeGestureHandlerStrings.Dragging
  - typingsSlinky.reactNativeGestureHandler.reactNativeGestureHandlerStrings.Settling
*/
trait DrawerState extends js.Object

object DrawerState {
  @scala.inline
  def Dragging: typingsSlinky.reactNativeGestureHandler.reactNativeGestureHandlerStrings.Dragging = this.cast("Dragging")
  @scala.inline
  def Idle: typingsSlinky.reactNativeGestureHandler.reactNativeGestureHandlerStrings.Idle = this.cast("Idle")
  @scala.inline
  def Settling: typingsSlinky.reactNativeGestureHandler.reactNativeGestureHandlerStrings.Settling = this.cast("Settling")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

