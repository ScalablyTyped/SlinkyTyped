package typingsSlinky.reactNavigation.anon

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Ref
import typingsSlinky.reactNavigation.mod.NavigationFocusInjectedProps
import typingsSlinky.reactNavigation.mod.NavigationParams
import typingsSlinky.std.InstanceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `0`[T /* <: ReactComponentClass[P] */, P /* <: NavigationFocusInjectedProps[NavigationParams] */] extends js.Object {
  var onRef: js.UndefOr[Ref[InstanceType[T]]] = js.undefined
}

object `0` {
  @scala.inline
  def apply[T, P](onRef: js.UndefOr[Null | Ref[InstanceType[T]]] = js.undefined): `0`[T, P] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(onRef)) __obj.updateDynamic("onRef")(onRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`[T, P]]
  }
}

