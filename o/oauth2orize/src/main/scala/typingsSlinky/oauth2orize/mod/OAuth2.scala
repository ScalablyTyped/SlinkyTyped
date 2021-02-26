package typingsSlinky.oauth2orize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OAuth2 extends StObject {
  
  var client: js.Any = js.native
  
  var info: OAuth2Info = js.native
  
  var redirectURI: String = js.native
  
  var req: OAuth2Req = js.native
  
  var transactionID: String = js.native
  
  var user: js.Any = js.native
}
object OAuth2 {
  
  @scala.inline
  def apply(
    client: js.Any,
    info: OAuth2Info,
    redirectURI: String,
    req: OAuth2Req,
    transactionID: String,
    user: js.Any
  ): OAuth2 = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], redirectURI = redirectURI.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any], transactionID = transactionID.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuth2]
  }
  
  @scala.inline
  implicit class OAuth2MutableBuilder[Self <: OAuth2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClient(value: js.Any): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfo(value: OAuth2Info): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectURI(value: String): Self = StObject.set(x, "redirectURI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReq(value: OAuth2Req): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionID(value: String): Self = StObject.set(x, "transactionID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: js.Any): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
