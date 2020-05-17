package typingsSlinky.reactNavigationMaterialBottomTabs.materialBottomTabViewMod

import slinky.core.TagMod
import typingsSlinky.react.mod.Component
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNavigationMaterialBottomTabs.anon.Color
import typingsSlinky.reactNavigationMaterialBottomTabs.anon.RouteKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaterialBottomTabView
  extends Component[Props, js.Object, js.Any] {
  def _getBarStyle(): js.Array[StyleProp[ViewStyle]] = js.native
  def _getColor(hasRoute: RouteKey): js.UndefOr[String] = js.native
  def _getInactiveColor(): js.UndefOr[String] = js.native
  def _getactiveColor(): js.UndefOr[String] = js.native
  def _isVisible(): js.UndefOr[Boolean] = js.native
  def _renderIcon(hasRouteFocusedColor: Color): TagMod[Any] = js.native
}

