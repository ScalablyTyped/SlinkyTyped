package typingsSlinky.reactDashNativeDashDrawer.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNative.reactDashNativeMod.ScaledSize
import typingsSlinky.reactDashNativeDashDrawer.reactDashNativeDashDrawerMod.DrawerProperties
import typingsSlinky.reactDashNativeDashDrawer.reactDashNativeDashDrawerMod.DrawerStyles
import typingsSlinky.reactDashNativeDashDrawer.reactDashNativeDashDrawerMod.NestedViewStyles
import typingsSlinky.reactDashNativeDashDrawer.reactDashNativeDashDrawerMod.TweenFunctions
import typingsSlinky.reactDashNativeDashDrawer.reactDashNativeDashDrawerMod.default
import typingsSlinky.reactDashNativeDashDrawer.reactDashNativeDashDrawerStrings.bottom
import typingsSlinky.reactDashNativeDashDrawer.reactDashNativeDashDrawerStrings.closed
import typingsSlinky.reactDashNativeDashDrawer.reactDashNativeDashDrawerStrings.displace
import typingsSlinky.reactDashNativeDashDrawer.reactDashNativeDashDrawerStrings.left
import typingsSlinky.reactDashNativeDashDrawer.reactDashNativeDashDrawerStrings.open
import typingsSlinky.reactDashNativeDashDrawer.reactDashNativeDashDrawerStrings.overlay
import typingsSlinky.reactDashNativeDashDrawer.reactDashNativeDashDrawerStrings.right
import typingsSlinky.reactDashNativeDashDrawer.reactDashNativeDashDrawerStrings.static
import typingsSlinky.reactDashNativeDashDrawer.reactDashNativeDashDrawerStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashNativeDashDrawer
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-native-drawer", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: disabled, open */
  def apply(
    acceptDoubleTap: js.UndefOr[Boolean] = js.undefined,
    acceptPan: js.UndefOr[Boolean] = js.undefined,
    acceptPanOnDrawer: js.UndefOr[Boolean] = js.undefined,
    acceptTap: js.UndefOr[Boolean] = js.undefined,
    captureGestures: Boolean | open | closed = null,
    closedDrawerOffset: js.Function0[Double] | Double = null,
    content: TagMod[Any] = null,
    elevation: Int | Double = null,
    initializeOpen: Int | Double = null,
    negotiatePan: js.UndefOr[Boolean] = js.undefined,
    onClose: () => Unit = null,
    onCloseStart: () => Unit = null,
    onDragStart: () => Unit = null,
    onOpen: () => Unit = null,
    onOpenStart: () => Unit = null,
    openDrawerOffset: (js.Function1[/* viewport */ ScaledSize, Double]) | Double = null,
    panCloseMask: Int | Double = null,
    panOpenMask: Int | Double = null,
    panThreshold: Int | Double = null,
    side: left | right | top | bottom = null,
    styles: DrawerStyles = null,
    tapToClose: js.UndefOr[Boolean] = js.undefined,
    tweenDuration: Int | Double = null,
    tweenEasing: TweenFunctions = null,
    tweenHandler: /* ratio */ Double => NestedViewStyles = null,
    `type`: displace | overlay | static = null,
    useInteractionManager: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(acceptDoubleTap)) __obj.updateDynamic("acceptDoubleTap")(acceptDoubleTap.asInstanceOf[js.Any])
    if (!js.isUndefined(acceptPan)) __obj.updateDynamic("acceptPan")(acceptPan.asInstanceOf[js.Any])
    if (!js.isUndefined(acceptPanOnDrawer)) __obj.updateDynamic("acceptPanOnDrawer")(acceptPanOnDrawer.asInstanceOf[js.Any])
    if (!js.isUndefined(acceptTap)) __obj.updateDynamic("acceptTap")(acceptTap.asInstanceOf[js.Any])
    if (captureGestures != null) __obj.updateDynamic("captureGestures")(captureGestures.asInstanceOf[js.Any])
    if (closedDrawerOffset != null) __obj.updateDynamic("closedDrawerOffset")(closedDrawerOffset.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (elevation != null) __obj.updateDynamic("elevation")(elevation.asInstanceOf[js.Any])
    if (initializeOpen != null) __obj.updateDynamic("initializeOpen")(initializeOpen.asInstanceOf[js.Any])
    if (!js.isUndefined(negotiatePan)) __obj.updateDynamic("negotiatePan")(negotiatePan.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (onCloseStart != null) __obj.updateDynamic("onCloseStart")(js.Any.fromFunction0(onCloseStart))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction0(onDragStart))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction0(onOpen))
    if (onOpenStart != null) __obj.updateDynamic("onOpenStart")(js.Any.fromFunction0(onOpenStart))
    if (openDrawerOffset != null) __obj.updateDynamic("openDrawerOffset")(openDrawerOffset.asInstanceOf[js.Any])
    if (panCloseMask != null) __obj.updateDynamic("panCloseMask")(panCloseMask.asInstanceOf[js.Any])
    if (panOpenMask != null) __obj.updateDynamic("panOpenMask")(panOpenMask.asInstanceOf[js.Any])
    if (panThreshold != null) __obj.updateDynamic("panThreshold")(panThreshold.asInstanceOf[js.Any])
    if (side != null) __obj.updateDynamic("side")(side.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (!js.isUndefined(tapToClose)) __obj.updateDynamic("tapToClose")(tapToClose.asInstanceOf[js.Any])
    if (tweenDuration != null) __obj.updateDynamic("tweenDuration")(tweenDuration.asInstanceOf[js.Any])
    if (tweenEasing != null) __obj.updateDynamic("tweenEasing")(tweenEasing.asInstanceOf[js.Any])
    if (tweenHandler != null) __obj.updateDynamic("tweenHandler")(js.Any.fromFunction1(tweenHandler))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(useInteractionManager)) __obj.updateDynamic("useInteractionManager")(useInteractionManager.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashNativeDashDrawer.reactDashNativeDashDrawerMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = DrawerProperties
}

