package typingsSlinky.reactNativeDrawer.components

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.ScaledSize
import typingsSlinky.reactNativeDrawer.mod.DrawerProperties
import typingsSlinky.reactNativeDrawer.mod.DrawerStyles
import typingsSlinky.reactNativeDrawer.mod.NestedViewStyles
import typingsSlinky.reactNativeDrawer.mod.TweenFunctions
import typingsSlinky.reactNativeDrawer.mod.default
import typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.bottom
import typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.closed
import typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.displace
import typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.left
import typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.open
import typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.overlay
import typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.right
import typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.static
import typingsSlinky.reactNativeDrawer.reactNativeDrawerStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNativeDrawer {
  @JSImport("react-native-drawer", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def acceptDoubleTap(value: Boolean): this.type = set("acceptDoubleTap", value.asInstanceOf[js.Any])
    @scala.inline
    def acceptPan(value: Boolean): this.type = set("acceptPan", value.asInstanceOf[js.Any])
    @scala.inline
    def acceptPanOnDrawer(value: Boolean): this.type = set("acceptPanOnDrawer", value.asInstanceOf[js.Any])
    @scala.inline
    def acceptTap(value: Boolean): this.type = set("acceptTap", value.asInstanceOf[js.Any])
    @scala.inline
    def captureGestures(value: Boolean | open | closed): this.type = set("captureGestures", value.asInstanceOf[js.Any])
    @scala.inline
    def closedDrawerOffsetFunction0(value: () => Double): this.type = set("closedDrawerOffset", js.Any.fromFunction0(value))
    @scala.inline
    def closedDrawerOffset(value: js.Function0[Double] | Double): this.type = set("closedDrawerOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def contentReactElement(value: ReactElement): this.type = set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def content(value: TagMod[Any]): this.type = set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def elevation(value: Double): this.type = set("elevation", value.asInstanceOf[js.Any])
    @scala.inline
    def initializeOpen(value: Double): this.type = set("initializeOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def negotiatePan(value: Boolean): this.type = set("negotiatePan", value.asInstanceOf[js.Any])
    @scala.inline
    def onClose(value: () => Unit): this.type = set("onClose", js.Any.fromFunction0(value))
    @scala.inline
    def onCloseStart(value: () => Unit): this.type = set("onCloseStart", js.Any.fromFunction0(value))
    @scala.inline
    def onDragStart(value: () => Unit): this.type = set("onDragStart", js.Any.fromFunction0(value))
    @scala.inline
    def onOpen(value: () => Unit): this.type = set("onOpen", js.Any.fromFunction0(value))
    @scala.inline
    def onOpenStart(value: () => Unit): this.type = set("onOpenStart", js.Any.fromFunction0(value))
    @scala.inline
    def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
    @scala.inline
    def openDrawerOffsetFunction1(value: /* viewport */ ScaledSize => Double): this.type = set("openDrawerOffset", js.Any.fromFunction1(value))
    @scala.inline
    def openDrawerOffset(value: (js.Function1[/* viewport */ ScaledSize, Double]) | Double): this.type = set("openDrawerOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def panCloseMask(value: Double): this.type = set("panCloseMask", value.asInstanceOf[js.Any])
    @scala.inline
    def panOpenMask(value: Double): this.type = set("panOpenMask", value.asInstanceOf[js.Any])
    @scala.inline
    def panThreshold(value: Double): this.type = set("panThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def side(value: left | right | top | bottom): this.type = set("side", value.asInstanceOf[js.Any])
    @scala.inline
    def styles(value: DrawerStyles): this.type = set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def tapToClose(value: Boolean): this.type = set("tapToClose", value.asInstanceOf[js.Any])
    @scala.inline
    def tweenDuration(value: Double): this.type = set("tweenDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def tweenEasing(value: TweenFunctions): this.type = set("tweenEasing", value.asInstanceOf[js.Any])
    @scala.inline
    def tweenHandler(value: /* ratio */ Double => NestedViewStyles): this.type = set("tweenHandler", js.Any.fromFunction1(value))
    @scala.inline
    def `type`(value: displace | overlay | static): this.type = set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def useInteractionManager(value: Boolean): this.type = set("useInteractionManager", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DrawerProperties): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ReactNativeDrawer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

