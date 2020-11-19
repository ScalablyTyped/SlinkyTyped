package typingsSlinky.reactCanvasDraw.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactCanvasDraw.mod.CanvasDraw
import typingsSlinky.reactCanvasDraw.mod.CanvasDrawProps
import typingsSlinky.reactCanvasDraw.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactCanvasDraw {
  
  @JSImport("react-canvas-draw", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def backgroundColor(value: String): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def brushColor(value: String): this.type = set("brushColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def brushRadius(value: Double): this.type = set("brushRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def canvasHeight(value: Double | String): this.type = set("canvasHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def canvasWidth(value: Double | String): this.type = set("canvasWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def catenaryColor(value: String): this.type = set("catenaryColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def gridColor(value: String): this.type = set("gridColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hideGrid(value: Boolean): this.type = set("hideGrid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hideInterface(value: Boolean): this.type = set("hideInterface", value.asInstanceOf[js.Any])
    
    @scala.inline
    def imgSrc(value: String): this.type = set("imgSrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def immediateLoading(value: Boolean): this.type = set("immediateLoading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def lazyRadius(value: Double): this.type = set("lazyRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def loadTimeOffset(value: Double): this.type = set("loadTimeOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: /* canvas */ CanvasDraw => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onChangeNull: this.type = set("onChange", null)
    
    @scala.inline
    def saveData(value: String): this.type = set("saveData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CanvasDrawProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ReactCanvasDraw.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
