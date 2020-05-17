package typingsSlinky.reactNavigation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactNavigation.mod.NavigationInitAction
  - typingsSlinky.reactNavigation.mod.NavigationNavigateAction
  - typingsSlinky.reactNavigation.mod.NavigationBackAction
  - typingsSlinky.reactNavigation.mod.NavigationSetParamsAction
  - typingsSlinky.reactNavigation.mod.NavigationResetAction
  - typingsSlinky.reactNavigation.mod.NavigationReplaceAction
  - typingsSlinky.reactNavigation.mod.NavigationPopAction
  - typingsSlinky.reactNavigation.mod.NavigationPushAction
  - typingsSlinky.reactNavigation.mod.NavigationPopToTopAction
  - typingsSlinky.reactNavigation.mod.NavigationCompleteTransitionAction
*/
trait NavigationStackAction extends NavigationAction

object NavigationStackAction {
  @scala.inline
  implicit def apply(value: NavigationBackAction): NavigationStackAction = value.asInstanceOf[NavigationStackAction]
  @scala.inline
  implicit def apply(value: NavigationCompleteTransitionAction): NavigationStackAction = value.asInstanceOf[NavigationStackAction]
  @scala.inline
  implicit def apply(value: NavigationInitAction): NavigationStackAction = value.asInstanceOf[NavigationStackAction]
  @scala.inline
  implicit def apply(value: NavigationNavigateAction): NavigationStackAction = value.asInstanceOf[NavigationStackAction]
  @scala.inline
  implicit def apply(value: NavigationPopAction): NavigationStackAction = value.asInstanceOf[NavigationStackAction]
  @scala.inline
  implicit def apply(value: NavigationPopToTopAction): NavigationStackAction = value.asInstanceOf[NavigationStackAction]
  @scala.inline
  implicit def apply(value: NavigationPushAction): NavigationStackAction = value.asInstanceOf[NavigationStackAction]
  @scala.inline
  implicit def apply(value: NavigationReplaceAction): NavigationStackAction = value.asInstanceOf[NavigationStackAction]
  @scala.inline
  implicit def apply(value: NavigationResetAction): NavigationStackAction = value.asInstanceOf[NavigationStackAction]
  @scala.inline
  implicit def apply(value: NavigationSetParamsAction): NavigationStackAction = value.asInstanceOf[NavigationStackAction]
}

