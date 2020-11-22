package typingsSlinky.maximMazurokGapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientAndroiddeviceprovisioning.anon.KeyOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VendorsResource extends js.Object {
  
  var customers: CustomersResource = js.native
  
  /** Lists the vendors of the partner. */
  def list(): Request[ListVendorsResponse] = js.native
  def list(request: KeyOauthtoken): Request[ListVendorsResponse] = js.native
}
