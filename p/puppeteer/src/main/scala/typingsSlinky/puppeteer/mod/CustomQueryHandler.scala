package typingsSlinky.puppeteer.mod

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Node
import org.scalajs.dom.raw.NodeListOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomQueryHandler extends StObject {
  
  var queryAll: js.UndefOr[
    js.Function2[
      /* element */ Element | Document, 
      /* selector */ String, 
      js.Array[Element] | (NodeListOf[Element with Node])
    ]
  ] = js.native
  
  var queryOne: js.UndefOr[
    js.Function2[/* element */ Element | Document, /* selector */ String, Element | Null]
  ] = js.native
}
object CustomQueryHandler {
  
  @scala.inline
  def apply(): CustomQueryHandler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomQueryHandler]
  }
  
  @scala.inline
  implicit class CustomQueryHandlerMutableBuilder[Self <: CustomQueryHandler] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQueryAll(
      value: (/* element */ Element | Document, /* selector */ String) => js.Array[Element] | (NodeListOf[Element with Node])
    ): Self = StObject.set(x, "queryAll", js.Any.fromFunction2(value))
    
    @scala.inline
    def setQueryAllUndefined: Self = StObject.set(x, "queryAll", js.undefined)
    
    @scala.inline
    def setQueryOne(value: (/* element */ Element | Document, /* selector */ String) => Element | Null): Self = StObject.set(x, "queryOne", js.Any.fromFunction2(value))
    
    @scala.inline
    def setQueryOneUndefined: Self = StObject.set(x, "queryOne", js.undefined)
  }
}
