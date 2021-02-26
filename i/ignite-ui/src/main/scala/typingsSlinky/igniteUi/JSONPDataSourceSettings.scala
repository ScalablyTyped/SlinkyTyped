package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSONPDataSourceSettings
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Override the callback function name in a jsonp request. Sets option jsonp in $.ajax functionbool Setting the jsonp option to false prevents jQuery from adding the "?callback" string to the URL or attempting to use "=?" for transformation
    *
    */
  var jsonp: js.UndefOr[String | Boolean] = js.native
  
  /**
    * Specify the callback function name for a JSONP request. Sets option jsonpCallback in $.ajax function
    */
  var jsonpCallback: js.UndefOr[String | js.Function] = js.native
  
  /**
    * Type of the data source.
    */
  var `type`: js.UndefOr[String] = js.native
}
object JSONPDataSourceSettings {
  
  @scala.inline
  def apply(): JSONPDataSourceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JSONPDataSourceSettings]
  }
  
  @scala.inline
  implicit class JSONPDataSourceSettingsMutableBuilder[Self <: JSONPDataSourceSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJsonp(value: String | Boolean): Self = StObject.set(x, "jsonp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsonpCallback(value: String | js.Function): Self = StObject.set(x, "jsonpCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsonpCallbackUndefined: Self = StObject.set(x, "jsonpCallback", js.undefined)
    
    @scala.inline
    def setJsonpUndefined: Self = StObject.set(x, "jsonp", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
