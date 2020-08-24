package typingsSlinky.googleAuthLibrary

import typingsSlinky.gaxios.commonMod.GaxiosOptions
import typingsSlinky.gaxios.commonMod.GaxiosPromise
import typingsSlinky.googleAuthLibrary.credentialsMod.Credentials
import typingsSlinky.googleAuthLibrary.googleAuthLibraryStrings.tokens
import typingsSlinky.googleAuthLibrary.oauth2clientMod.Headers
import typingsSlinky.googleAuthLibrary.transportersMod.DefaultTransporter
import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-auth-library/build/src/auth/authclient", JSImport.Namespace)
@js.native
object authclientMod extends js.Object {
  @js.native
  abstract class AuthClient () extends EventEmitter {
    var credentials: Credentials = js.native
    var quotaProjectId: js.UndefOr[String] = js.native
    var transporter: DefaultTransporter = js.native
    /**
      * Append additional headers, e.g., x-goog-user-project, shared across the
      * classes inheriting AuthClient. This method should be used by any method
      * that overrides getRequestMetadataAsync(), which is a shared helper for
      * setting request information in both gRPC and HTTP API calls.
      *
      * @param headers objedcdt to append additional headers to.
      */
    /* protected */ def addSharedMetadataHeaders(headers: Headers): Headers = js.native
    @JSName("on")
    def on_tokens(event: tokens, listener: js.Function1[/* tokens */ Credentials, Unit]): this.type = js.native
    /**
      * Provides an alternative Gaxios request implementation with auth credentials
      */
    def request[T](opts: GaxiosOptions): GaxiosPromise[T] = js.native
    /**
      * Sets the auth credentials.
      */
    def setCredentials(credentials: Credentials): Unit = js.native
  }
  
}

