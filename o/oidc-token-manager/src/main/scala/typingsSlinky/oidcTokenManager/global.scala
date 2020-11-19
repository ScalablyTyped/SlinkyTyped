package typingsSlinky.oidcTokenManager

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.oidcTokenManager.Oidc.OidcClientSettings
import typingsSlinky.oidcTokenManager.Oidc.OidcClientStatic
import typingsSlinky.oidcTokenManager.Oidc.OidcTokenManagerSettings
import typingsSlinky.oidcTokenManager.Oidc.OidcTokenManagerStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object Oidc extends js.Object {
    
    @js.native
    class DefaultHttpRequest ()
      extends typingsSlinky.oidcTokenManager.Oidc.DefaultHttpRequest
    
    @js.native
    class DefaultPromise protected ()
      extends typingsSlinky.oidcTokenManager.Oidc.DefaultPromise {
      def this(promise: js.Any) = this()
    }
    
    @js.native
    class DefaultPromiseFactory ()
      extends typingsSlinky.oidcTokenManager.Oidc.DefaultPromiseFactory
  }
  
  @js.native
  class OidcClient protected ()
    extends typingsSlinky.oidcTokenManager.Oidc.OidcTokenManager {
    def this(settings: OidcClientSettings) = this()
  }
  @js.native
  object OidcClient extends TopLevel[OidcClientStatic]
  
  @js.native
  class OidcTokenManager ()
    extends typingsSlinky.oidcTokenManager.Oidc.OidcTokenManager {
    def this(settings: OidcTokenManagerSettings) = this()
  }
  @js.native
  object OidcTokenManager extends TopLevel[OidcTokenManagerStatic]
}
