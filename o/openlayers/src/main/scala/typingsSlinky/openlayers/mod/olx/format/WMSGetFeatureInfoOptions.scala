package typingsSlinky.openlayers.mod.olx.format

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WMSGetFeatureInfoOptions extends StObject {
  
  var layers: js.UndefOr[js.Array[String]] = js.native
}
object WMSGetFeatureInfoOptions {
  
  @scala.inline
  def apply(): WMSGetFeatureInfoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WMSGetFeatureInfoOptions]
  }
  
  @scala.inline
  implicit class WMSGetFeatureInfoOptionsMutableBuilder[Self <: WMSGetFeatureInfoOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLayers(value: js.Array[String]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
    
    @scala.inline
    def setLayersVarargs(value: String*): Self = StObject.set(x, "layers", js.Array(value :_*))
  }
}
