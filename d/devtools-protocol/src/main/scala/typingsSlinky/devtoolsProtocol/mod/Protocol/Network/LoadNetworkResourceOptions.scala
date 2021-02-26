package typingsSlinky.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadNetworkResourceOptions extends StObject {
  
  var disableCache: Boolean = js.native
  
  var includeCredentials: Boolean = js.native
}
object LoadNetworkResourceOptions {
  
  @scala.inline
  def apply(disableCache: Boolean, includeCredentials: Boolean): LoadNetworkResourceOptions = {
    val __obj = js.Dynamic.literal(disableCache = disableCache.asInstanceOf[js.Any], includeCredentials = includeCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadNetworkResourceOptions]
  }
  
  @scala.inline
  implicit class LoadNetworkResourceOptionsMutableBuilder[Self <: LoadNetworkResourceOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisableCache(value: Boolean): Self = StObject.set(x, "disableCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeCredentials(value: Boolean): Self = StObject.set(x, "includeCredentials", value.asInstanceOf[js.Any])
  }
}
