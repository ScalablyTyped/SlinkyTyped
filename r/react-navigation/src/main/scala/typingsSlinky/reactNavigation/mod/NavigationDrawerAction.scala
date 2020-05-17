package typingsSlinky.reactNavigation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactNavigation.mod.NavigationDrawerOpenedAction
  - typingsSlinky.reactNavigation.mod.NavigationDrawerClosedAction
  - typingsSlinky.reactNavigation.mod.NavigationOpenDrawerAction
  - typingsSlinky.reactNavigation.mod.NavigationCloseDrawerAction
  - typingsSlinky.reactNavigation.mod.NavigationToggleDrawerAction
*/
trait NavigationDrawerAction extends NavigationAction

object NavigationDrawerAction {
  @scala.inline
  implicit def apply(value: NavigationCloseDrawerAction): NavigationDrawerAction = value.asInstanceOf[NavigationDrawerAction]
  @scala.inline
  implicit def apply(value: NavigationDrawerClosedAction): NavigationDrawerAction = value.asInstanceOf[NavigationDrawerAction]
  @scala.inline
  implicit def apply(value: NavigationDrawerOpenedAction): NavigationDrawerAction = value.asInstanceOf[NavigationDrawerAction]
  @scala.inline
  implicit def apply(value: NavigationOpenDrawerAction): NavigationDrawerAction = value.asInstanceOf[NavigationDrawerAction]
  @scala.inline
  implicit def apply(value: NavigationToggleDrawerAction): NavigationDrawerAction = value.asInstanceOf[NavigationDrawerAction]
}

