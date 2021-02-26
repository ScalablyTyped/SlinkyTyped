package typingsSlinky.antdMobileRn.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antdMobileRn.popoverIndexNativeMod.PopoverProps
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Popover {
  
  @JSImport("antd-mobile-rn", "Popover")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antdMobileRn.mod.Popover] {
    
    @scala.inline
    def contextStyle(value: StyleProp[ViewStyle]): this.type = set("contextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def contextStyleNull: this.type = set("contextStyle", null)
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onSelect(value: (/* node */ js.Any, /* index */ js.UndefOr[Double]) => Unit): this.type = set("onSelect", js.Any.fromFunction2(value))
    
    @scala.inline
    def overlay(value: ReactElement): this.type = set("overlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overlayStyle(value: StyleProp[ViewStyle]): this.type = set("overlayStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overlayStyleNull: this.type = set("overlayStyle", null)
    
    @scala.inline
    def renderOverlayComponent(value: /* values */ js.Any => ReactElement): this.type = set("renderOverlayComponent", js.Any.fromFunction1(value))
    
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleNull: this.type = set("style", null)
    
    @scala.inline
    def triggerStyle(value: StyleProp[ViewStyle]): this.type = set("triggerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def triggerStyleNull: this.type = set("triggerStyle", null)
  }
  
  implicit def make(companion: Popover.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PopoverProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
