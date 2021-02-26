package typingsSlinky.orientjs.mod

import typingsSlinky.orientjs.anon.Max
import typingsSlinky.orientjs.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrientDBClientConfig extends StObject {
  
  var host: js.UndefOr[String] = js.native
  
  var logger: js.UndefOr[js.Any] = js.native
  
  var pool: js.UndefOr[Max] = js.native
  
  var port: js.UndefOr[Double] = js.native
  
  var servers: js.UndefOr[js.Array[OServerConfig]] = js.native
  
  var subscribePool: js.UndefOr[`0`] = js.native
}
object OrientDBClientConfig {
  
  @scala.inline
  def apply(): OrientDBClientConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrientDBClientConfig]
  }
  
  @scala.inline
  implicit class OrientDBClientConfigMutableBuilder[Self <: OrientDBClientConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    @scala.inline
    def setLogger(value: js.Any): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    
    @scala.inline
    def setPool(value: Max): Self = StObject.set(x, "pool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoolUndefined: Self = StObject.set(x, "pool", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    @scala.inline
    def setServers(value: js.Array[OServerConfig]): Self = StObject.set(x, "servers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServersUndefined: Self = StObject.set(x, "servers", js.undefined)
    
    @scala.inline
    def setServersVarargs(value: OServerConfig*): Self = StObject.set(x, "servers", js.Array(value :_*))
    
    @scala.inline
    def setSubscribePool(value: `0`): Self = StObject.set(x, "subscribePool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscribePoolUndefined: Self = StObject.set(x, "subscribePool", js.undefined)
  }
}
