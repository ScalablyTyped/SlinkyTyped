package typingsSlinky.antdDashMobileDashRn.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.antdDashMobileDashRn.libTabDashBarStyleIndexDotNativeMod.ITabBarStyle
import typingsSlinky.antdDashMobileDashRn.libTabDashBarTabbarDotAndroidMod.TabBarNativeProps
import typingsSlinky.antdDashMobileDashRn.libTabDashBarTabbarDotAndroidMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TabbarDotAndroid
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("antd-mobile-rn/lib/tab-bar/tabbar.android", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    animated: js.UndefOr[Boolean] = js.undefined,
    barTintColor: String = null,
    styles: ITabBarStyle = null,
    swipeable: js.UndefOr[Boolean] = js.undefined,
    tintColor: String = null,
    unselectedTintColor: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    if (barTintColor != null) __obj.updateDynamic("barTintColor")(barTintColor.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (!js.isUndefined(swipeable)) __obj.updateDynamic("swipeable")(swipeable.asInstanceOf[js.Any])
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor.asInstanceOf[js.Any])
    if (unselectedTintColor != null) __obj.updateDynamic("unselectedTintColor")(unselectedTintColor.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.antdDashMobileDashRn.libTabDashBarTabbarDotAndroidMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = TabBarNativeProps
}

