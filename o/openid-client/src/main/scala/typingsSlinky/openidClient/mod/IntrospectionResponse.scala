package typingsSlinky.openidClient.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.openidClient.anon.X5tS256
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntrospectionResponse
  extends /* key */ StringDictionary[js.Any] {
  
  var active: Boolean = js.native
  
  var aud: js.UndefOr[String | js.Array[String]] = js.native
  
  var client_id: js.UndefOr[String] = js.native
  
  var cnf: js.UndefOr[X5tS256] = js.native
  
  var exp: js.UndefOr[Double] = js.native
  
  var iat: js.UndefOr[Double] = js.native
  
  var iss: js.UndefOr[String] = js.native
  
  var jti: js.UndefOr[String] = js.native
  
  var scope: String = js.native
  
  var sid: js.UndefOr[String] = js.native
  
  var token_type: js.UndefOr[String] = js.native
  
  var username: js.UndefOr[String] = js.native
}
object IntrospectionResponse {
  
  @scala.inline
  def apply(active: Boolean, scope: String): IntrospectionResponse = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionResponse]
  }
  
  @scala.inline
  implicit class IntrospectionResponseMutableBuilder[Self <: IntrospectionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAud(value: String | js.Array[String]): Self = StObject.set(x, "aud", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudUndefined: Self = StObject.set(x, "aud", js.undefined)
    
    @scala.inline
    def setAudVarargs(value: String*): Self = StObject.set(x, "aud", js.Array(value :_*))
    
    @scala.inline
    def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClient_idUndefined: Self = StObject.set(x, "client_id", js.undefined)
    
    @scala.inline
    def setCnf(value: X5tS256): Self = StObject.set(x, "cnf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCnfUndefined: Self = StObject.set(x, "cnf", js.undefined)
    
    @scala.inline
    def setExp(value: Double): Self = StObject.set(x, "exp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpUndefined: Self = StObject.set(x, "exp", js.undefined)
    
    @scala.inline
    def setIat(value: Double): Self = StObject.set(x, "iat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIatUndefined: Self = StObject.set(x, "iat", js.undefined)
    
    @scala.inline
    def setIss(value: String): Self = StObject.set(x, "iss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssUndefined: Self = StObject.set(x, "iss", js.undefined)
    
    @scala.inline
    def setJti(value: String): Self = StObject.set(x, "jti", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJtiUndefined: Self = StObject.set(x, "jti", js.undefined)
    
    @scala.inline
    def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSidUndefined: Self = StObject.set(x, "sid", js.undefined)
    
    @scala.inline
    def setToken_type(value: String): Self = StObject.set(x, "token_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToken_typeUndefined: Self = StObject.set(x, "token_type", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
