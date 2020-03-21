package typingsSlinky.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourcePartnersDevicesMetadata extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Required. The ID of the device.
    */
  var deviceId: js.UndefOr[String] = js.native
  /**
    * Required. The owner of the newly set metadata. Set this to the partner
    * ID.
    */
  var metadataOwnerId: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaUpdateDeviceMetadataRequest] = js.native
}

