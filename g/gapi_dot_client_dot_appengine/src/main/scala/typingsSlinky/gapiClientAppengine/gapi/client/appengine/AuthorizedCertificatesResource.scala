package typingsSlinky.gapiClientAppengine.gapi.client.appengine

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAppengine.AnonAccesstoken
import typingsSlinky.gapiClientAppengine.AnonAlt
import typingsSlinky.gapiClientAppengine.AnonAppsId
import typingsSlinky.gapiClientAppengine.AnonAuthorizedCertificatesId
import typingsSlinky.gapiClientAppengine.AnonBearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthorizedCertificatesResource extends js.Object {
  /** Uploads the specified SSL certificate. */
  def create(request: AnonAccesstoken): Request_[AuthorizedCertificate] = js.native
  /** Deletes the specified SSL certificate. */
  def delete(request: AnonAlt): Request_[js.Object] = js.native
  /** Gets the specified SSL certificate. */
  def get(request: AnonAppsId): Request_[AuthorizedCertificate] = js.native
  /** Lists all SSL certificates the user is authorized to administer. */
  def list(request: AnonBearertoken): Request_[ListAuthorizedCertificatesResponse] = js.native
  /**
    * Updates the specified SSL certificate. To renew a certificate and maintain its existing domain mappings, update certificate_data with a new
    * certificate. The new certificate must be applicable to the same domains as the original certificate. The certificate display_name may also be updated.
    */
  def patch(request: AnonAuthorizedCertificatesId): Request_[AuthorizedCertificate] = js.native
}

object AuthorizedCertificatesResource {
  @scala.inline
  def apply(
    create: AnonAccesstoken => Request_[AuthorizedCertificate],
    delete: AnonAlt => Request_[js.Object],
    get: AnonAppsId => Request_[AuthorizedCertificate],
    list: AnonBearertoken => Request_[ListAuthorizedCertificatesResponse],
    patch: AnonAuthorizedCertificatesId => Request_[AuthorizedCertificate]
  ): AuthorizedCertificatesResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch))
    __obj.asInstanceOf[AuthorizedCertificatesResource]
  }
  @scala.inline
  implicit class AuthorizedCertificatesResourceOps[Self <: AuthorizedCertificatesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: AnonAccesstoken => Request_[AuthorizedCertificate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: AnonAlt => Request_[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonAppsId => Request_[AuthorizedCertificate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonBearertoken => Request_[ListAuthorizedCertificatesResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonAuthorizedCertificatesId => Request_[AuthorizedCertificate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

