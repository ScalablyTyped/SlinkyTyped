package typingsSlinky.antdDashMobile.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.div.tag
import typingsSlinky.antdDashMobile.antdDashMobileStrings._empty
import typingsSlinky.antdDashMobile.antdDashMobileStrings.android
import typingsSlinky.antdDashMobile.antdDashMobileStrings.bottom
import typingsSlinky.antdDashMobile.antdDashMobileStrings.down
import typingsSlinky.antdDashMobile.antdDashMobileStrings.empty
import typingsSlinky.antdDashMobile.antdDashMobileStrings.horizontal
import typingsSlinky.antdDashMobile.antdDashMobileStrings.ios
import typingsSlinky.antdDashMobile.antdDashMobileStrings.middle
import typingsSlinky.antdDashMobile.antdDashMobileStrings.top
import typingsSlinky.antdDashMobile.antdDashMobileStrings.up
import typingsSlinky.antdDashMobile.libListListItemMod.ListItemProps
import typingsSlinky.antdDashMobile.libListListItemMod.default
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ListItem
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("antd-mobile/lib/list/ListItem", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, disabled, onClick */
  def apply(
    activeStyle: CSSProperties = null,
    align: top | middle | bottom = null,
    arrow: horizontal | down | up | empty | _empty = null,
    error: js.UndefOr[Boolean] = js.undefined,
    extra: TagMod[Any] = null,
    multipleLine: js.UndefOr[Boolean] = js.undefined,
    platform: android | ios = null,
    prefixCls: String = null,
    role: String = null,
    style: CSSProperties = null,
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
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (thumb != null) __obj.updateDynamic("thumb")(thumb.asInstanceOf[js.Any])
    if (!js.isUndefined(wrap)) __obj.updateDynamic("wrap")(wrap.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[
  slinky.web.html.div.tag.type, 
  typingsSlinky.antdDashMobile.libListListItemMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ListItemProps
}

