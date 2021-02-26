package typingsSlinky.nodeHueApi.mod

import typingsSlinky.nodeHueApi.anon.Description
import typingsSlinky.nodeHueApi.anon.Major
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBridgeDescription extends StObject {
  
  var icons: js.UndefOr[js.Array[IBridgeIcon]] = js.native
  
  var manufacturer: String = js.native
  
  var model: Description = js.native
  
  var name: String = js.native
  
  var url: String = js.native
  
  var version: Major = js.native
}
object IBridgeDescription {
  
  @scala.inline
  def apply(manufacturer: String, model: Description, name: String, url: String, version: Major): IBridgeDescription = {
    val __obj = js.Dynamic.literal(manufacturer = manufacturer.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBridgeDescription]
  }
  
  @scala.inline
  implicit class IBridgeDescriptionMutableBuilder[Self <: IBridgeDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIcons(value: js.Array[IBridgeIcon]): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
    
    @scala.inline
    def setIconsVarargs(value: IBridgeIcon*): Self = StObject.set(x, "icons", js.Array(value :_*))
    
    @scala.inline
    def setManufacturer(value: String): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModel(value: Description): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: Major): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
