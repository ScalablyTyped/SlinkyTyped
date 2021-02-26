package typingsSlinky.materialUi.components

import org.scalajs.dom.raw.Element
import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.materialUi.MaterialUI.Popover.PopoverAnimationProps
import typingsSlinky.materialUi.MaterialUI.Popover.PopoverProps
import typingsSlinky.materialUi.MaterialUI.propTypes.origin
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ReactInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Popover {
  
  @JSImport("material-ui", "Popover")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.materialUi.mod.Popover] {
    
    @scala.inline
    def anchorEl(value: ReactInstance): this.type = set("anchorEl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def anchorElComponent(value: ReactComponentClass[js.Any]): this.type = set("anchorEl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def anchorElElement(value: Element): this.type = set("anchorEl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def anchorOrigin(value: origin): this.type = set("anchorOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def animated(value: Boolean): this.type = set("animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def animation(value: ReactComponentClass[PopoverAnimationProps]): this.type = set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoCloseWhenOffScreen(value: Boolean): this.type = set("autoCloseWhenOffScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def canAutoPosition(value: Boolean): this.type = set("canAutoPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onRequestClose(value: /* reason */ String => Unit): this.type = set("onRequestClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def targetOrigin(value: origin): this.type = set("targetOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def useLayerForClickAway(value: Boolean): this.type = set("useLayerForClickAway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def zDepth(value: Double): this.type = set("zDepth", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Popover.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PopoverProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
