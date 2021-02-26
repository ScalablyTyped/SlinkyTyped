package typingsSlinky.jointjs.mod.shapes.standard

import typingsSlinky.jointjs.mod.attributes.SVGAttributes
import typingsSlinky.jointjs.mod.attributes.SVGRectAttributes
import typingsSlinky.jointjs.mod.attributes.SVGTextAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeaderedRectangleSelectors extends StObject {
  
  var body: js.UndefOr[SVGRectAttributes] = js.native
  
  var bodyText: js.UndefOr[SVGTextAttributes] = js.native
  
  var header: js.UndefOr[SVGRectAttributes] = js.native
  
  var headerText: js.UndefOr[SVGTextAttributes] = js.native
  
  var root: js.UndefOr[SVGAttributes] = js.native
}
object HeaderedRectangleSelectors {
  
  @scala.inline
  def apply(): HeaderedRectangleSelectors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeaderedRectangleSelectors]
  }
  
  @scala.inline
  implicit class HeaderedRectangleSelectorsMutableBuilder[Self <: HeaderedRectangleSelectors] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: SVGRectAttributes): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyText(value: SVGTextAttributes): Self = StObject.set(x, "bodyText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyTextUndefined: Self = StObject.set(x, "bodyText", js.undefined)
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setHeader(value: SVGRectAttributes): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderText(value: SVGTextAttributes): Self = StObject.set(x, "headerText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderTextUndefined: Self = StObject.set(x, "headerText", js.undefined)
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    @scala.inline
    def setRoot(value: SVGAttributes): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
