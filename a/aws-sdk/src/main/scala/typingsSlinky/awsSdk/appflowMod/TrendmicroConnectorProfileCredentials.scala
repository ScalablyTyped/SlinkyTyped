package typingsSlinky.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrendmicroConnectorProfileCredentials extends StObject {
  
  /**
    *  The Secret Access Key portion of the credentials. 
    */
  var apiSecretKey: ApiSecretKey = js.native
}
object TrendmicroConnectorProfileCredentials {
  
  @scala.inline
  def apply(apiSecretKey: ApiSecretKey): TrendmicroConnectorProfileCredentials = {
    val __obj = js.Dynamic.literal(apiSecretKey = apiSecretKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrendmicroConnectorProfileCredentials]
  }
  
  @scala.inline
  implicit class TrendmicroConnectorProfileCredentialsMutableBuilder[Self <: TrendmicroConnectorProfileCredentials] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiSecretKey(value: ApiSecretKey): Self = StObject.set(x, "apiSecretKey", value.asInstanceOf[js.Any])
  }
}
