package typingsSlinky.reactDashNavigation

import slinky.core.ReactComponentClass
import typingsSlinky.react.reactMod.Ref
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationInjectedProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OnRefAny[T, P] extends js.Object {
  var onRef: js.UndefOr[Ref[ReactComponentClass[T with NavigationInjectedProps[P]]]] = js.undefined
}

object Anon_OnRefAny {
  @scala.inline
  def apply[T, P](onRef: Ref[ReactComponentClass[T with NavigationInjectedProps[P]]] = null): Anon_OnRefAny[T, P] = {
    val __obj = js.Dynamic.literal()
    if (onRef != null) __obj.updateDynamic("onRef")(onRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_OnRefAny[T, P]]
  }
}

