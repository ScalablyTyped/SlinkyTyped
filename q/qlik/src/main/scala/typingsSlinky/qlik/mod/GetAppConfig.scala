package typingsSlinky.qlik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAppConfig extends StObject {
  
  var host: js.UndefOr[String] = js.native
  
  var identity: js.UndefOr[String] = js.native
  
  var isSecure: js.UndefOr[Boolean] = js.native
  
  var openWithoutData: js.UndefOr[Boolean] = js.native
  
  var port: String | Double = js.native
  
  var prefix: js.UndefOr[String] = js.native
}
object GetAppConfig {
  
  @scala.inline
  def apply(port: String | Double): GetAppConfig = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAppConfig]
  }
  
  @scala.inline
  implicit class GetAppConfigMutableBuilder[Self <: GetAppConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    @scala.inline
    def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
    
    @scala.inline
    def setIsSecure(value: Boolean): Self = StObject.set(x, "isSecure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSecureUndefined: Self = StObject.set(x, "isSecure", js.undefined)
    
    @scala.inline
    def setOpenWithoutData(value: Boolean): Self = StObject.set(x, "openWithoutData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenWithoutDataUndefined: Self = StObject.set(x, "openWithoutData", js.undefined)
    
    @scala.inline
    def setPort(value: String | Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
  }
}
