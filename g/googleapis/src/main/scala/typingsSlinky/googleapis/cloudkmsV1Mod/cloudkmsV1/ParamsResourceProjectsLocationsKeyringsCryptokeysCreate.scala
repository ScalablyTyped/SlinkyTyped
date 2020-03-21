package typingsSlinky.googleapis.cloudkmsV1Mod.cloudkmsV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsLocationsKeyringsCryptokeysCreate extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Required. It must be unique within a KeyRing and match the regular
    * expression `[a-zA-Z0-9_-]{1,63}`
    */
  var cryptoKeyId: js.UndefOr[String] = js.native
  /**
    * Required. The name of the KeyRing associated with the CryptoKeys.
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaCryptoKey] = js.native
}

