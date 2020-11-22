package typingsSlinky.antDesignReactNative.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.auto
import typingsSlinky.antDesignReactNative.popoverMod.PopoverProps
import typingsSlinky.antDesignReactNative.popoverStyleMod.PopoverStyle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeModalPopover.popoverGeometryMod.Placement
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Popover {
  
  @JSImport("@ant-design/react-native", "Popover")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antDesignReactNative.mod.Popover] {
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def duration(value: Double): this.type = set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def easing(value: /* show */ Boolean => js.Function1[/* value */ Double, Double]): this.type = set("easing", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDismiss(value: () => Unit): this.type = set("onDismiss", js.Any.fromFunction0(value))
    
    @scala.inline
    def onSelect(value: (/* node */ js.Any, /* index */ js.UndefOr[Double]) => Unit): this.type = set("onSelect", js.Any.fromFunction2(value))
    
    @scala.inline
    def overlay(value: ReactElement): this.type = set("overlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def placement(value: Placement | auto): this.type = set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renderOverlayComponent(value: (/* node */ ReactElement, /* closePopover */ js.Function0[Unit]) => ReactElement): this.type = set("renderOverlayComponent", js.Any.fromFunction2(value))
    
    @scala.inline
    def styles(value: Partial[PopoverStyle]): this.type = set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def triggerStyle(value: StyleProp[ViewStyle]): this.type = set("triggerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def triggerStyleNull: this.type = set("triggerStyle", null)
    
    @scala.inline
    def useNativeDriver(value: Boolean): this.type = set("useNativeDriver", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PopoverProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Popover.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
