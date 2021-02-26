package typingsSlinky.materialUiCore.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.materialUiCore.createBreakpointsMod.Breakpoint
import typingsSlinky.materialUiCore.hiddenJsMod.HiddenJsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object HiddenJs {
  
  @JSImport("@material-ui/core/Hidden/HiddenJs", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def initialWidth(value: Breakpoint): this.type = set("initialWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def lgDown(value: Boolean): this.type = set("lgDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def lgUp(value: Boolean): this.type = set("lgUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mdDown(value: Boolean): this.type = set("mdDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mdUp(value: Boolean): this.type = set("mdUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def only(value: Breakpoint | js.Array[Breakpoint]): this.type = set("only", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onlyVarargs(value: Breakpoint*): this.type = set("only", js.Array(value :_*))
    
    @scala.inline
    def smDown(value: Boolean): this.type = set("smDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def smUp(value: Boolean): this.type = set("smUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def xlDown(value: Boolean): this.type = set("xlDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def xlUp(value: Boolean): this.type = set("xlUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def xsDown(value: Boolean): this.type = set("xsDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def xsUp(value: Boolean): this.type = set("xsUp", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: HiddenJs.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: HiddenJsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
