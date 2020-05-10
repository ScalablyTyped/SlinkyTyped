package typingsSlinky.antDesignReactNative.components

import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.auto
import typingsSlinky.antDesignReactNative.popoverMod.PopoverProps
import typingsSlinky.antDesignReactNative.popoverMod.default
import typingsSlinky.antDesignReactNative.popoverStyleMod.PopoverStyle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeModalPopover.popoverGeometryMod.Placement
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Popover {
  @JSImport("@ant-design/react-native/lib/popover", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def onSelect(value: (/* node */ js.Any, /* index */ js.UndefOr[Double]) => Unit): this.type = set("onSelect", js.Any.fromFunction2(value))
    @scala.inline
    def overlay(value: TagMod[Any]): this.type = set("overlay", value.asInstanceOf[js.Any])
    @scala.inline
    def placement(value: Placement | auto): this.type = set("placement", value.asInstanceOf[js.Any])
    @scala.inline
    def renderOverlayComponent(value: /* node */ TagMod[Any] => TagMod[Any]): this.type = set("renderOverlayComponent", js.Any.fromFunction1(value))
    @scala.inline
    def styles(value: Partial[PopoverStyle]): this.type = set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def triggerStyle(value: StyleProp[ViewStyle]): this.type = set("triggerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def triggerStyleNull: this.type = set("triggerStyle", null)
  }
  
  def withProps(p: PopoverProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Popover.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

