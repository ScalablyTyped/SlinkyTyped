package typingsSlinky.gapiClientAndroidmanagement.gapi.client.androidmanagement

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAndroidmanagement.AnonAlt
import typingsSlinky.gapiClientAndroidmanagement.AnonEnterpriseToken
import typingsSlinky.gapiClientAndroidmanagement.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnterprisesResource extends js.Object {
  var applications: ApplicationsResource = js.native
  var devices: DevicesResource = js.native
  var enrollmentTokens: EnrollmentTokensResource = js.native
  var policies: PoliciesResource = js.native
  var webTokens: WebTokensResource = js.native
  /** Creates an enterprise by completing the enterprise signup flow. */
  def create(request: AnonEnterpriseToken): Request_[Enterprise] = js.native
  /** Gets an enterprise. */
  def get(request: AnonAlt): Request_[Enterprise] = js.native
  /** Updates an enterprise. */
  def patch(request: AnonFields): Request_[Enterprise] = js.native
}

object EnterprisesResource {
  @scala.inline
  def apply(
    applications: ApplicationsResource,
    create: AnonEnterpriseToken => Request_[Enterprise],
    devices: DevicesResource,
    enrollmentTokens: EnrollmentTokensResource,
    get: AnonAlt => Request_[Enterprise],
    patch: AnonFields => Request_[Enterprise],
    policies: PoliciesResource,
    webTokens: WebTokensResource
  ): EnterprisesResource = {
    val __obj = js.Dynamic.literal(applications = applications.asInstanceOf[js.Any], create = js.Any.fromFunction1(create), devices = devices.asInstanceOf[js.Any], enrollmentTokens = enrollmentTokens.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), patch = js.Any.fromFunction1(patch), policies = policies.asInstanceOf[js.Any], webTokens = webTokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnterprisesResource]
  }
  @scala.inline
  implicit class EnterprisesResourceOps[Self <: EnterprisesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplications(value: ApplicationsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreate(value: AnonEnterpriseToken => Request_[Enterprise]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDevices(value: DevicesResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnrollmentTokens(value: EnrollmentTokensResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enrollmentTokens")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGet(value: AnonAlt => Request_[Enterprise]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonFields => Request_[Enterprise]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPolicies(value: PoliciesResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebTokens(value: WebTokensResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webTokens")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

