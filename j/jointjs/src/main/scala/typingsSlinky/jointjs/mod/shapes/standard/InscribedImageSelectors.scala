package typingsSlinky.jointjs.mod.shapes.standard

import typingsSlinky.jointjs.mod.attributes.SVGAttributes
import typingsSlinky.jointjs.mod.attributes.SVGEllipseAttributes
import typingsSlinky.jointjs.mod.attributes.SVGImageAttributes
import typingsSlinky.jointjs.mod.attributes.SVGTextAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InscribedImageSelectors extends StObject {
  
  var background: js.UndefOr[SVGEllipseAttributes] = js.native
  
  var border: js.UndefOr[SVGEllipseAttributes] = js.native
  
  var image: js.UndefOr[SVGImageAttributes] = js.native
  
  var label: js.UndefOr[SVGTextAttributes] = js.native
  
  var root: js.UndefOr[SVGAttributes] = js.native
}
object InscribedImageSelectors {
  
  @scala.inline
  def apply(): InscribedImageSelectors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InscribedImageSelectors]
  }
  
  @scala.inline
  implicit class InscribedImageSelectorsMutableBuilder[Self <: InscribedImageSelectors] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackground(value: SVGEllipseAttributes): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setBorder(value: SVGEllipseAttributes): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    @scala.inline
    def setImage(value: SVGImageAttributes): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setLabel(value: SVGTextAttributes): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setRoot(value: SVGAttributes): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
