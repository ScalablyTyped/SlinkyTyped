package typingsSlinky.reactNavigation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactNavigation.mod.NavigationInitAction
  - typingsSlinky.reactNavigation.mod.NavigationNavigateAction
  - typingsSlinky.reactNavigation.mod.NavigationBackAction
*/
trait NavigationTabAction extends NavigationAction

object NavigationTabAction {
  @scala.inline
  implicit def apply(value: NavigationBackAction): NavigationTabAction = value.asInstanceOf[NavigationTabAction]
  @scala.inline
  implicit def apply(value: NavigationInitAction): NavigationTabAction = value.asInstanceOf[NavigationTabAction]
  @scala.inline
  implicit def apply(value: NavigationNavigateAction): NavigationTabAction = value.asInstanceOf[NavigationTabAction]
}

