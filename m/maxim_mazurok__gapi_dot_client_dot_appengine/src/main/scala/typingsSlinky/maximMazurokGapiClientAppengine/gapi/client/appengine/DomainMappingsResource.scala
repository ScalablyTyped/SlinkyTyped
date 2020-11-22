package typingsSlinky.maximMazurokGapiClientAppengine.gapi.client.appengine

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientAppengine.anon.DomainMappingsId
import typingsSlinky.maximMazurokGapiClientAppengine.anon.Oauthtoken
import typingsSlinky.maximMazurokGapiClientAppengine.anon.OverrideStrategy
import typingsSlinky.maximMazurokGapiClientAppengine.anon.PrettyPrint
import typingsSlinky.maximMazurokGapiClientAppengine.anon.QuotaUser
import typingsSlinky.maximMazurokGapiClientAppengine.anon.UpdateMask
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomainMappingsResource extends js.Object {
  
  /**
    * Maps a domain to an application. A user must be authorized to administer a domain in order to map it to an application. For a list of available authorized domains, see
    * AuthorizedDomains.ListAuthorizedDomains.
    */
  def create(request: OverrideStrategy): Request[Operation] = js.native
  def create(request: PrettyPrint, body: DomainMapping): Request[Operation] = js.native
  
  /** Deletes the specified domain mapping. A user must be authorized to administer the associated domain in order to delete a DomainMapping resource. */
  def delete(): Request[Operation] = js.native
  def delete(request: DomainMappingsId): Request[Operation] = js.native
  
  /** Gets the specified domain mapping. */
  def get(): Request[DomainMapping] = js.native
  def get(request: DomainMappingsId): Request[DomainMapping] = js.native
  
  /** Lists the domain mappings on an application. */
  def list(): Request[ListDomainMappingsResponse] = js.native
  def list(request: Oauthtoken): Request[ListDomainMappingsResponse] = js.native
  
  /**
    * Updates the specified domain mapping. To map an SSL certificate to a domain mapping, update certificate_id to point to an AuthorizedCertificate resource. A user must be authorized
    * to administer the associated domain in order to update a DomainMapping resource.
    */
  def patch(request: QuotaUser): Request[Operation] = js.native
  def patch(request: UpdateMask, body: DomainMapping): Request[Operation] = js.native
}
