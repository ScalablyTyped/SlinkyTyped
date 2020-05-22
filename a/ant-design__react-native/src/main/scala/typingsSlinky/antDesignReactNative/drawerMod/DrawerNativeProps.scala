package typingsSlinky.antDesignReactNative.drawerMod

import slinky.core.TagMod
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.bottom
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.left
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.right
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.top
import typingsSlinky.antDesignReactNative.drawerPropsTypeMod.DrawerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawerNativeProps extends DrawerProps {
  var drawerBackgroundColor: js.UndefOr[String] = js.undefined
  var drawerRef: js.UndefOr[
    js.Function1[/* el */ typingsSlinky.bang88ReactNativeDrawerLayout.mod.default | Null, Unit]
  ] = js.undefined
  var drawerWidth: js.UndefOr[Double] = js.undefined
}

object DrawerNativeProps {
  @scala.inline
  def apply(
    drawerBackgroundColor: String = null,
    drawerRef: /* el */ typingsSlinky.bang88ReactNativeDrawerLayout.mod.default | Null => Unit = null,
    drawerWidth: js.UndefOr[Double] = js.undefined,
    onOpenChange: /* isOpen */ Boolean => Unit = null,
    open: js.UndefOr[Boolean] = js.undefined,
    position: left | right | top | bottom = null,
    sidebar: TagMod[Any] = null
  ): DrawerNativeProps = {
    val __obj = js.Dynamic.literal()
    if (drawerBackgroundColor != null) __obj.updateDynamic("drawerBackgroundColor")(drawerBackgroundColor.asInstanceOf[js.Any])
    if (drawerRef != null) __obj.updateDynamic("drawerRef")(js.Any.fromFunction1(drawerRef))
    if (!js.isUndefined(drawerWidth)) __obj.updateDynamic("drawerWidth")(drawerWidth.get.asInstanceOf[js.Any])
    if (onOpenChange != null) __obj.updateDynamic("onOpenChange")(js.Any.fromFunction1(onOpenChange))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.get.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (sidebar != null) __obj.updateDynamic("sidebar")(sidebar.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerNativeProps]
  }
}

