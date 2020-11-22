package typingsSlinky.reactSignatureCanvas.components

import org.scalajs.dom.raw.HTMLCanvasElement
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
    def canvasProps(value: CanvasHTMLAttributes[HTMLCanvasElement]): this.type = set("canvasProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def clearOnResize(value: Boolean): this.type = set("clearOnResize", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ReactSignatureCanvasProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ReactSignatureCanvas.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
