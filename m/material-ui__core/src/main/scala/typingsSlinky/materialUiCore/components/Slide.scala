package typingsSlinky.materialUiCore.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.materialUiCore.createMuiThemeMod.Theme
import typingsSlinky.materialUiCore.materialUiCoreStrings.down
import typingsSlinky.materialUiCore.materialUiCoreStrings.left
import typingsSlinky.materialUiCore.materialUiCoreStrings.right
import typingsSlinky.materialUiCore.materialUiCoreStrings.up
import typingsSlinky.materialUiCore.slideSlideMod.SlideProps
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Slide {
  
  @JSImport("@material-ui/core", "Slide")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def addEndListener(value: js.Any): this.type = set("addEndListener", value.asInstanceOf[js.Any])
    
    @scala.inline
    def appear(value: Boolean): this.type = set("appear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def enter(value: Boolean): this.type = set("enter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def exit(value: Boolean): this.type = set("exit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def in(value: js.Any): this.type = set("in", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mountOnEnter(value: js.Any): this.type = set("mountOnEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onEnter(value: js.Any): this.type = set("onEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onEntered(value: js.Any): this.type = set("onEntered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onEntering(value: js.Any): this.type = set("onEntering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onExit(value: js.Any): this.type = set("onExit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onExited(value: js.Any): this.type = set("onExited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onExiting(value: js.Any): this.type = set("onExiting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def theme(value: Theme): this.type = set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def timeout(value: js.Any): this.type = set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def unmountOnExit(value: js.Any): this.type = set("unmountOnExit", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SlideProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(direction: left | right | up | down): Builder = {
    val __props = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SlideProps]))
  }
}
