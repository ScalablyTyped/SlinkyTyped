package typingsSlinky.jointjs.mod.shapes.standard

import typingsSlinky.jointjs.mod.attributes.SVGAttributes
import typingsSlinky.jointjs.mod.attributes.SVGImageAttributes
import typingsSlinky.jointjs.mod.attributes.SVGRectAttributes
import typingsSlinky.jointjs.mod.attributes.SVGTextAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmbeddedImageSelectors extends StObject {
  
  var body: js.UndefOr[SVGRectAttributes] = js.native
  
  var image: js.UndefOr[SVGImageAttributes] = js.native
  
  var label: js.UndefOr[SVGTextAttributes] = js.native
  
  var root: js.UndefOr[SVGAttributes] = js.native
}
object EmbeddedImageSelectors {
  
  @scala.inline
  def apply(): EmbeddedImageSelectors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmbeddedImageSelectors]
  }
  
  @scala.inline
  implicit class EmbeddedImageSelectorsMutableBuilder[Self <: EmbeddedImageSelectors] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: SVGRectAttributes): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
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
