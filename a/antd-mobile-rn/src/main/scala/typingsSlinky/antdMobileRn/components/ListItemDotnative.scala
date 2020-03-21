package typingsSlinky.antdMobileRn.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.antdMobileRn.AnonArrow
import typingsSlinky.antdMobileRn.antdMobileRnStrings._empty
import typingsSlinky.antdMobileRn.antdMobileRnStrings.android
import typingsSlinky.antdMobileRn.antdMobileRnStrings.bottom
import typingsSlinky.antdMobileRn.antdMobileRnStrings.down
import typingsSlinky.antdMobileRn.antdMobileRnStrings.empty
import typingsSlinky.antdMobileRn.antdMobileRnStrings.horizontal
import typingsSlinky.antdMobileRn.antdMobileRnStrings.ios
import typingsSlinky.antdMobileRn.antdMobileRnStrings.middle
import typingsSlinky.antdMobileRn.antdMobileRnStrings.top
import typingsSlinky.antdMobileRn.antdMobileRnStrings.up
import typingsSlinky.antdMobileRn.listItemNativeMod.ListItemProps
import typingsSlinky.antdMobileRn.listItemNativeMod.default
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ListItemDotnative
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("antd-mobile-rn/lib/list/ListItem.native", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: disabled */
  def apply(
    activeStyle: StyleProp[ViewStyle] = null,
    align: top | middle | bottom = null,
    arrow: horizontal | down | up | empty | _empty = null,
    error: js.UndefOr[Boolean] = js.undefined,
    extra: TagMod[Any] = null,
    multipleLine: js.UndefOr[Boolean] = js.undefined,
    onClick: () => Unit = null,
    onPressIn: () => Unit = null,
    onPressOut: () => Unit = null,
    platform: android | ios = null,
    style: StyleProp[ViewStyle] = null,
    styles: AnonArrow = null,
    thumb: TagMod[Any] = null,
    wrap: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (activeStyle != null) __obj.updateDynamic("activeStyle")(activeStyle.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (arrow != null) __obj.updateDynamic("arrow")(arrow.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (!js.isUndefined(multipleLine)) __obj.updateDynamic("multipleLine")(multipleLine.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction0(onClick))
    if (onPressIn != null) __obj.updateDynamic("onPressIn")(js.Any.fromFunction0(onPressIn))
    if (onPressOut != null) __obj.updateDynamic("onPressOut")(js.Any.fromFunction0(onPressOut))
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (thumb != null) __obj.updateDynamic("thumb")(thumb.asInstanceOf[js.Any])
    if (!js.isUndefined(wrap)) __obj.updateDynamic("wrap")(wrap.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.antdMobileRn.listItemNativeMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ListItemProps
}

