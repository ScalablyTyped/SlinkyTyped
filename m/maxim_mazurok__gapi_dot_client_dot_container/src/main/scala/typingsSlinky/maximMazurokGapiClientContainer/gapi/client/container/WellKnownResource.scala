package typingsSlinky.maximMazurokGapiClientContainer.gapi.client.container

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientContainer.anon.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WellKnownResource extends js.Object {
  
  /**
    * Gets the OIDC discovery document for the cluster. See the [OpenID Connect Discovery 1.0 specification](https://openid.net/specs/openid-connect-discovery-1_0.html) for details. This
    * API is not yet intended for general use, and is not available for all clusters.
    */
  def `getOpenid-configuration`(): Request[GetOpenIDConfigResponse] = js.native
  def `getOpenid-configuration`(request: Callback): Request[GetOpenIDConfigResponse] = js.native
}
