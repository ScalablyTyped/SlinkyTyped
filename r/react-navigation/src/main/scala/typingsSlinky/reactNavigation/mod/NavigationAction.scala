package typingsSlinky.reactNavigation.mod

import typingsSlinky.reactNavigation.anon.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactNavigation.mod.NavigationInitAction
  - typingsSlinky.reactNavigation.mod.NavigationStackAction
  - typingsSlinky.reactNavigation.mod.NavigationTabAction
  - typingsSlinky.reactNavigation.mod.NavigationDrawerAction
  - typingsSlinky.reactNavigation.mod.NavigationSwitchAction
  - typingsSlinky.reactNavigation.anon.Type
*/
trait NavigationAction extends js.Object

object NavigationAction {
  @scala.inline
  implicit def apply(value: NavigationDrawerAction): NavigationAction = value.asInstanceOf[NavigationAction]
  @scala.inline
  implicit def apply(value: NavigationInitAction): NavigationAction = value.asInstanceOf[NavigationAction]
  @scala.inline
  implicit def apply(value: NavigationStackAction): NavigationAction = value.asInstanceOf[NavigationAction]
  @scala.inline
  implicit def apply(value: NavigationSwitchAction): NavigationAction = value.asInstanceOf[NavigationAction]
  @scala.inline
  implicit def apply(value: NavigationTabAction): NavigationAction = value.asInstanceOf[NavigationAction]
  @scala.inline
  implicit def apply(value: Type): NavigationAction = value.asInstanceOf[NavigationAction]
}

