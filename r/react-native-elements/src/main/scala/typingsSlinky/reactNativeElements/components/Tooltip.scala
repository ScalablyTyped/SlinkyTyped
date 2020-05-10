package typingsSlinky.reactNativeElements.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeElements.mod.TooltipProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Tooltip {
  @JSImport("react-native-elements", "Tooltip")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeElements.mod.Tooltip] {
    @scala.inline
    def backgroundColor(value: String): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def containerStyle(value: StyleProp[ViewStyle]): this.type = set("containerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def containerStyleNull: this.type = set("containerStyle", null)
    @scala.inline
    def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def highlightColor(value: String): this.type = set("highlightColor", value.asInstanceOf[js.Any])
    @scala.inline
    def onClose(value: () => Unit): this.type = set("onClose", js.Any.fromFunction0(value))
    @scala.inline
    def onOpen(value: () => Unit): this.type = set("onOpen", js.Any.fromFunction0(value))
    @scala.inline
    def overlayColor(value: String): this.type = set("overlayColor", value.asInstanceOf[js.Any])
    @scala.inline
    def pointerColor(value: String): this.type = set("pointerColor", value.asInstanceOf[js.Any])
    @scala.inline
    def popover(value: ReactElement): this.type = set("popover", value.asInstanceOf[js.Any])
    @scala.inline
    def toggleOnPress(value: Boolean): this.type = set("toggleOnPress", value.asInstanceOf[js.Any])
    @scala.inline
    def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def withOverlay(value: Boolean): this.type = set("withOverlay", value.asInstanceOf[js.Any])
    @scala.inline
    def withPointer(value: Boolean): this.type = set("withPointer", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TooltipProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Tooltip.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

