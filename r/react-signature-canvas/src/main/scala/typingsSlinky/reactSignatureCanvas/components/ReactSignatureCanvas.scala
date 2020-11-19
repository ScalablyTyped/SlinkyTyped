package typingsSlinky.reactSignatureCanvas.components

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.MouseEvent
import slinky.web.html.canvas.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CanvasHTMLAttributes
import typingsSlinky.reactSignatureCanvas.mod.ReactSignatureCanvasProps
import typingsSlinky.reactSignatureCanvas.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactSignatureCanvas {
  
  @JSImport("react-signature-canvas", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def backgroundColor(value: String): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def canvasProps(value: CanvasHTMLAttributes[HTMLCanvasElement]): this.type = set("canvasProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def clearOnResize(value: Boolean): this.type = set("clearOnResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dotSizeFunction0(value: () => Double): this.type = set("dotSize", js.Any.fromFunction0(value))
    
    @scala.inline
    def dotSize(value: Double | js.Function0[Double]): this.type = set("dotSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxWidth(value: Double): this.type = set("maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minDistance(value: Double): this.type = set("minDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minWidth(value: Double): this.type = set("minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onBegin(value: /* event */ MouseEvent => Unit): this.type = set("onBegin", js.Any.fromFunction1(value))
    
    @scala.inline
    def onEnd(value: /* event */ MouseEvent => Unit): this.type = set("onEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def penColor(value: String): this.type = set("penColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def throttle(value: Double): this.type = set("throttle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def velocityFilterWeight(value: Double): this.type = set("velocityFilterWeight", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ReactSignatureCanvasProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ReactSignatureCanvas.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
