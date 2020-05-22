package typingsSlinky.oidcTokenManager

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.oidcTokenManager.Oidc.OidcClientSettings
import typingsSlinky.oidcTokenManager.Oidc.OidcClientStatic
import typingsSlinky.oidcTokenManager.Oidc.OidcTokenManagerSettings
import typingsSlinky.oidcTokenManager.Oidc.OidcTokenManagerStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  class OidcClient protected ()
    extends typingsSlinky.oidcTokenManager.Oidc.OidcTokenManager {
    def this(settings: OidcClientSettings) = this()
  }
  
  @js.native
  class OidcTokenManager ()
    extends typingsSlinky.oidcTokenManager.Oidc.OidcTokenManager {
    def this(settings: OidcTokenManagerSettings) = this()
  }
  
  @js.native
  object Oidc extends js.Object {
    @js.native
    class DefaultHttpRequest ()
      extends typingsSlinky.oidcTokenManager.Oidc.DefaultHttpRequest {
      /* CompleteClass */
      override def getJSON(url: String, config: js.Any): typingsSlinky.oidcTokenManager.Oidc.DefaultPromise = js.native
    }
    
    @js.native
    class DefaultPromise protected ()
      extends typingsSlinky.oidcTokenManager.Oidc.DefaultPromise {
      def this(promise: js.Any) = this()
      /* CompleteClass */
      override def `catch`(errorCallback: js.Function0[Unit]): typingsSlinky.oidcTokenManager.Oidc.DefaultPromise = js.native
      /* CompleteClass */
      override def `then`(
        successCallback: js.Function1[/* value */ js.UndefOr[js.Any], Unit],
        errorCallback: js.Function1[/* reason */ js.UndefOr[js.Any], Unit]
      ): typingsSlinky.oidcTokenManager.Oidc.DefaultPromise = js.native
    }
    
    @js.native
    class DefaultPromiseFactory ()
      extends typingsSlinky.oidcTokenManager.Oidc.DefaultPromiseFactory {
      /* CompleteClass */
      override def create(callback: js.Any): typingsSlinky.oidcTokenManager.Oidc.DefaultPromise = js.native
      /* CompleteClass */
      override def reject(reason: js.Any): typingsSlinky.oidcTokenManager.Oidc.DefaultPromise = js.native
      /* CompleteClass */
      override def resolve(value: js.Any): typingsSlinky.oidcTokenManager.Oidc.DefaultPromise = js.native
    }
    
  }
  
  @js.native
  object OidcClient extends TopLevel[OidcClientStatic]
  
  @js.native
  object OidcTokenManager extends TopLevel[OidcTokenManagerStatic]
  
}

