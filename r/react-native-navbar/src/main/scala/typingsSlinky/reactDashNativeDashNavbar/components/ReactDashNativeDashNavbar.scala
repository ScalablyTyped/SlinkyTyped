package typingsSlinky.reactDashNativeDashNavbar.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNative.reactDashNativeMod.ViewStyle
import typingsSlinky.reactDashNativeDashNavbar.reactDashNativeDashNavbarMod.NavigationBarButton
import typingsSlinky.reactDashNativeDashNavbar.reactDashNativeDashNavbarMod.NavigationBarProps
import typingsSlinky.reactDashNativeDashNavbar.reactDashNativeDashNavbarMod.NavigationBarTitle
import typingsSlinky.reactDashNativeDashNavbar.reactDashNativeDashNavbarMod.StatusBar
import typingsSlinky.reactDashNativeDashNavbar.reactDashNativeDashNavbarMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashNativeDashNavbar
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-native-navbar", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    leftButton: NavigationBarButton | ReactElement = null,
    rightButton: NavigationBarButton | ReactElement = null,
    statusBar: StatusBar = null,
    style: ViewStyle = null,
    tintColor: String = null,
    title: NavigationBarTitle | ReactElement = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (leftButton != null) __obj.updateDynamic("leftButton")(leftButton.asInstanceOf[js.Any])
    if (rightButton != null) __obj.updateDynamic("rightButton")(rightButton.asInstanceOf[js.Any])
    if (statusBar != null) __obj.updateDynamic("statusBar")(statusBar.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = NavigationBarProps
}

