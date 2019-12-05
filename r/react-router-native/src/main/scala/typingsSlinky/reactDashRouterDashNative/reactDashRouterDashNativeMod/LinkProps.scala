package typingsSlinky.reactDashRouterDashNative.reactDashRouterDashNativeMod

import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import typingsSlinky.history.historyMod.LocationDescriptor
import typingsSlinky.history.historyMod.LocationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkProps
  extends /* propName */ StringDictionary[js.Any] {
  var component: js.UndefOr[ReactComponentClass[_]] = js.undefined
  var replace: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[js.Any] = js.undefined
  var to: LocationDescriptor[LocationState]
}

object LinkProps {
  @scala.inline
  def apply(
    to: LocationDescriptor[LocationState],
    StringDictionary: /* propName */ StringDictionary[js.Any] = null,
    component: ReactComponentClass[_] = null,
    replace: js.UndefOr[Boolean] = js.undefined,
    style: js.Any = null
  ): LinkProps = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(replace)) __obj.updateDynamic("replace")(replace.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkProps]
  }
}

