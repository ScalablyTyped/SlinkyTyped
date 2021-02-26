package typingsSlinky.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The authentication settings for the backend service.
  */
@js.native
trait SchemaAuthenticationPolicy extends StObject {
  
  /**
    * List of authentication methods that can be used for origin
    * authentication. Similar to peers, these will be evaluated in order the
    * first valid one will be used to set origin identity. If none of these
    * methods pass, the request will be rejected with authentication failed
    * error (401). Leave the list empty if origin authentication is not
    * required.
    */
  var origins: js.UndefOr[js.Array[SchemaOriginAuthenticationMethod]] = js.native
  
  /**
    * List of authentication methods that can be used for peer authentication.
    * They will be evaluated in order the first valid one will be used to set
    * peer identity. If none of these methods pass, the request will be
    * rejected with authentication failed error (401). Leave the list empty if
    * peer authentication is not required.
    */
  var peers: js.UndefOr[js.Array[SchemaPeerAuthenticationMethod]] = js.native
  
  /**
    * Define whether peer or origin identity should be used for principal.
    * Default value is USE_PEER. If peer (or origin) identity is not available,
    * either because peer/origin authentication is not defined, or failed,
    * principal will be left unset. In other words, binding rule does not
    * affect the decision to accept or reject request. This field can be set to
    * one of the following: USE_PEER: Principal will be set to the identity
    * from peer authentication. USE_ORIGIN: Principal will be set to the
    * identity from origin authentication.
    */
  var principalBinding: js.UndefOr[String] = js.native
  
  /**
    * Configures the mechanism to obtain server-side security certificates and
    * identity information.
    */
  var serverTlsContext: js.UndefOr[SchemaTlsContext] = js.native
}
object SchemaAuthenticationPolicy {
  
  @scala.inline
  def apply(): SchemaAuthenticationPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAuthenticationPolicy]
  }
  
  @scala.inline
  implicit class SchemaAuthenticationPolicyMutableBuilder[Self <: SchemaAuthenticationPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrigins(value: js.Array[SchemaOriginAuthenticationMethod]): Self = StObject.set(x, "origins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginsUndefined: Self = StObject.set(x, "origins", js.undefined)
    
    @scala.inline
    def setOriginsVarargs(value: SchemaOriginAuthenticationMethod*): Self = StObject.set(x, "origins", js.Array(value :_*))
    
    @scala.inline
    def setPeers(value: js.Array[SchemaPeerAuthenticationMethod]): Self = StObject.set(x, "peers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeersUndefined: Self = StObject.set(x, "peers", js.undefined)
    
    @scala.inline
    def setPeersVarargs(value: SchemaPeerAuthenticationMethod*): Self = StObject.set(x, "peers", js.Array(value :_*))
    
    @scala.inline
    def setPrincipalBinding(value: String): Self = StObject.set(x, "principalBinding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrincipalBindingUndefined: Self = StObject.set(x, "principalBinding", js.undefined)
    
    @scala.inline
    def setServerTlsContext(value: SchemaTlsContext): Self = StObject.set(x, "serverTlsContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerTlsContextUndefined: Self = StObject.set(x, "serverTlsContext", js.undefined)
  }
}
