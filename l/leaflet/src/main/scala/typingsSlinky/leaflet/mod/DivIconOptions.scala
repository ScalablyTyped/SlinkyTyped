package typingsSlinky.leaflet.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.leaflet.leafletBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DivIconOptions extends BaseIconOptions {
  
  var bgPos: js.UndefOr[PointExpression] = js.native
  
  var html: js.UndefOr[String | HTMLElement | `false`] = js.native
}
object DivIconOptions {
  
  @scala.inline
  def apply(): DivIconOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DivIconOptions]
  }
  
  @scala.inline
  implicit class DivIconOptionsMutableBuilder[Self <: DivIconOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBgPos(value: PointExpression): Self = StObject.set(x, "bgPos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgPosUndefined: Self = StObject.set(x, "bgPos", js.undefined)
    
    @scala.inline
    def setHtml(value: String | HTMLElement | `false`): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlHTMLElement(value: HTMLElement): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
  }
}
