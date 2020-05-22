package typingsSlinky.reactNavigation.anon

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Ref
import typingsSlinky.reactNavigation.mod.NavigationInjectedProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnRefRef[T, P] extends js.Object {
  var onRef: js.UndefOr[Ref[ReactComponentClass[T with NavigationInjectedProps[P]]]] = js.undefined
}

object OnRefRef {
  @scala.inline
  def apply[T, P](
    onRef: js.UndefOr[Null | (Ref[ReactComponentClass[T with NavigationInjectedProps[P]]])] = js.undefined
  ): OnRefRef[T, P] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(onRef)) __obj.updateDynamic("onRef")(onRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnRefRef[T, P]]
  }
}

