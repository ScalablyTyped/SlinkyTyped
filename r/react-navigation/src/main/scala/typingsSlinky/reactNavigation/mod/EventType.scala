package typingsSlinky.reactNavigation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactNavigation.reactNavigationStrings.willFocus
  - typingsSlinky.reactNavigation.reactNavigationStrings.didFocus
  - typingsSlinky.reactNavigation.reactNavigationStrings.willBlur
  - typingsSlinky.reactNavigation.reactNavigationStrings.didBlur
  - typingsSlinky.reactNavigation.reactNavigationStrings.action
*/
trait EventType extends js.Object

object EventType {
  @scala.inline
  def action: typingsSlinky.reactNavigation.reactNavigationStrings.action = this.cast("action")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def didBlur: typingsSlinky.reactNavigation.reactNavigationStrings.didBlur = this.cast("didBlur")
  @scala.inline
  def didFocus: typingsSlinky.reactNavigation.reactNavigationStrings.didFocus = this.cast("didFocus")
  @scala.inline
  def willBlur: typingsSlinky.reactNavigation.reactNavigationStrings.willBlur = this.cast("willBlur")
  @scala.inline
  def willFocus: typingsSlinky.reactNavigation.reactNavigationStrings.willFocus = this.cast("willFocus")
}

