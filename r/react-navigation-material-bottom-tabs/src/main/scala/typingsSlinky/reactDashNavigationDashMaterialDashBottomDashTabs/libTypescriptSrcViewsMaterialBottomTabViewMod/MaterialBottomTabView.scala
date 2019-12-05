package typingsSlinky.reactDashNavigationDashMaterialDashBottomDashTabs.libTypescriptSrcViewsMaterialBottomTabViewMod

import slinky.core.TagMod
import typingsSlinky.react.reactMod.Component
import typingsSlinky.reactDashNative.reactDashNativeMod.StyleProp
import typingsSlinky.reactDashNative.reactDashNativeMod.ViewStyle
import typingsSlinky.reactDashNavigationDashMaterialDashBottomDashTabs.Anon_Color
import typingsSlinky.reactDashNavigationDashMaterialDashBottomDashTabs.Anon_RouteAnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaterialBottomTabView
  extends Component[Props, js.Object, js.Any] {
  def _getBarStyle(): js.Array[StyleProp[ViewStyle]] = js.native
  def _getColor(hasRoute: Anon_RouteAnonKey): js.UndefOr[String] = js.native
  def _getInactiveColor(): js.UndefOr[String] = js.native
  def _getactiveColor(): js.UndefOr[String] = js.native
  def _isVisible(): js.UndefOr[Boolean] = js.native
  def _renderIcon(hasRouteFocusedColor: Anon_Color): TagMod[Any] = js.native
}

