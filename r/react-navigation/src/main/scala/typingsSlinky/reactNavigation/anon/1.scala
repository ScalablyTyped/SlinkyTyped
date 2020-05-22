package typingsSlinky.reactNavigation.anon

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Ref
import typingsSlinky.reactNavigation.mod.NavigationFocusInjectedProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1`[T, P] extends js.Object {
  var onRef: js.UndefOr[Ref[ReactComponentClass[T with NavigationFocusInjectedProps[P]]]] = js.undefined
}

object `1` {
  @scala.inline
  def apply[T, P](
    onRef: js.UndefOr[Null | (Ref[ReactComponentClass[T with NavigationFocusInjectedProps[P]]])] = js.undefined
  ): `1`[T, P] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(onRef)) __obj.updateDynamic("onRef")(onRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`[T, P]]
  }
}

