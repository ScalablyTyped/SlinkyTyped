package typingsSlinky.reactNavigation

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Ref
import typingsSlinky.reactNavigation.mod.NavigationInjectedProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnRefRef[T, P] extends js.Object {
  var onRef: js.UndefOr[Ref[ReactComponentClass[T with NavigationInjectedProps[P]]]] = js.undefined
}

object AnonOnRefRef {
  @scala.inline
  def apply[T, P](onRef: Ref[ReactComponentClass[T with NavigationInjectedProps[P]]] = null): AnonOnRefRef[T, P] = {
    val __obj = js.Dynamic.literal()
    if (onRef != null) __obj.updateDynamic("onRef")(onRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOnRefRef[T, P]]
  }
}

