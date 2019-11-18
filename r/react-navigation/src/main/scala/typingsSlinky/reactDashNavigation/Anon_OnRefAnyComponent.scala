package typingsSlinky.reactDashNavigation

import slinky.core.ReactComponentClass
import typingsSlinky.react.reactMod.Ref
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationFocusInjectedProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OnRefAnyComponent[T, P] extends js.Object {
  var onRef: js.UndefOr[Ref[ReactComponentClass[T with NavigationFocusInjectedProps[P]]]] = js.undefined
}

object Anon_OnRefAnyComponent {
  @scala.inline
  def apply[T, P](onRef: Ref[ReactComponentClass[T with NavigationFocusInjectedProps[P]]] = null): Anon_OnRefAnyComponent[T, P] = {
    val __obj = js.Dynamic.literal()
    if (onRef != null) __obj.updateDynamic("onRef")(onRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_OnRefAnyComponent[T, P]]
  }
}

