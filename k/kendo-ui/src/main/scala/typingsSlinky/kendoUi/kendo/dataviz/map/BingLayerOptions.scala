package typingsSlinky.kendoUi.kendo.dataviz.map

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BingLayerOptions extends StObject {
  
  var baseUrl: js.UndefOr[String] = js.native
  
  var imagerySet: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
}
object BingLayerOptions {
  
  @scala.inline
  def apply(): BingLayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BingLayerOptions]
  }
  
  @scala.inline
  implicit class BingLayerOptionsMutableBuilder[Self <: BingLayerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
    
    @scala.inline
    def setImagerySet(value: String): Self = StObject.set(x, "imagerySet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagerySetUndefined: Self = StObject.set(x, "imagerySet", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
