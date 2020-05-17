package typingsSlinky.gapiClientAppengine.gapi.client.appengine

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientAppengine.anon.Accesstoken
import typingsSlinky.gapiClientAppengine.anon.UpdateMask
import typingsSlinky.gapiClientAppengine.anon.UploadType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppsResource extends js.Object {
  var authorizedCertificates: AuthorizedCertificatesResource = js.native
  var authorizedDomains: AuthorizedDomainsResource = js.native
  var domainMappings: DomainMappingsResource = js.native
  var firewall: FirewallResource = js.native
  var locations: LocationsResource = js.native
  var operations: OperationsResource = js.native
  var services: ServicesResource = js.native
  /**
    * Creates an App Engine application for a Google Cloud Platform project. Required fields:
    * id - The ID of the target Cloud Platform project.
    * location - The region (https://cloud.google.com/appengine/docs/locations) where you want the App Engine application located.For more information about
    * App Engine applications, see Managing Projects, Applications, and Billing (https://cloud.google.com/appengine/docs/python/console/).
    */
  def create(request: UploadType): Request[Operation] = js.native
  /** Gets information about an application. */
  def get(request: Accesstoken): Request[Application] = js.native
  /**
    * Updates the specified Application resource. You can update the following fields:
    * auth_domain - Google authentication domain for controlling user access to the application.
    * default_cookie_expiration - Cookie expiration policy for the application.
    */
  def patch(request: UpdateMask): Request[Operation] = js.native
  /**
    * Recreates the required App Engine features for the specified App Engine application, for example a Cloud Storage bucket or App Engine service account.
    * Use this method if you receive an error message about a missing feature, for example, Error retrieving the App Engine service account.
    */
  def repair(request: Accesstoken): Request[Operation] = js.native
}

object AppsResource {
  @scala.inline
  def apply(
    authorizedCertificates: AuthorizedCertificatesResource,
    authorizedDomains: AuthorizedDomainsResource,
    create: UploadType => Request[Operation],
    domainMappings: DomainMappingsResource,
    firewall: FirewallResource,
    get: Accesstoken => Request[Application],
    locations: LocationsResource,
    operations: OperationsResource,
    patch: UpdateMask => Request[Operation],
    repair: Accesstoken => Request[Operation],
    services: ServicesResource
  ): AppsResource = {
    val __obj = js.Dynamic.literal(authorizedCertificates = authorizedCertificates.asInstanceOf[js.Any], authorizedDomains = authorizedDomains.asInstanceOf[js.Any], create = js.Any.fromFunction1(create), domainMappings = domainMappings.asInstanceOf[js.Any], firewall = firewall.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), locations = locations.asInstanceOf[js.Any], operations = operations.asInstanceOf[js.Any], patch = js.Any.fromFunction1(patch), repair = js.Any.fromFunction1(repair), services = services.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsResource]
  }
  @scala.inline
  implicit class AppsResourceOps[Self <: AppsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorizedCertificates(value: AuthorizedCertificatesResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizedCertificates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthorizedDomains(value: AuthorizedDomainsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizedDomains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreate(value: UploadType => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDomainMappings(value: DomainMappingsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainMappings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirewall(value: FirewallResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firewall")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGet(value: Accesstoken => Request[Application]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLocations(value: LocationsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperations(value: OperationsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPatch(value: UpdateMask => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRepair(value: Accesstoken => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repair")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withServices(value: ServicesResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("services")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

