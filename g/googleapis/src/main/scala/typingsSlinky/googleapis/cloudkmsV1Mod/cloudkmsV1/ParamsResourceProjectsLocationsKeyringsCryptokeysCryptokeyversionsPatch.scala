package typingsSlinky.googleapis.cloudkmsV1Mod.cloudkmsV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsLocationsKeyringsCryptokeysCryptokeyversionsPatch extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Output only. The resource name for this CryptoKeyVersion in the format
    * `projects/x/locations/x/keyRings/x/cryptoKeys/x/cryptoKeyVersions/x`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaCryptoKeyVersion] = js.native
  /**
    * Required list of fields to be updated in this request.
    */
  var updateMask: js.UndefOr[String] = js.native
}

