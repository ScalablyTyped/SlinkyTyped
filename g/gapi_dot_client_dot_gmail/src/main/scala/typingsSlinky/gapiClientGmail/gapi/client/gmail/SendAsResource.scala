package typingsSlinky.gapiClientGmail.gapi.client.gmail

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientGmail.AnonAlt
import typingsSlinky.gapiClientGmail.AnonPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendAsResource extends js.Object {
  var smimeInfo: SmimeInfoResource = js.native
  /**
    * Creates a custom "from" send-as alias. If an SMTP MSA is specified, Gmail will attempt to connect to the SMTP service to validate the configuration
    * before creating the alias. If ownership verification is required for the alias, a message will be sent to the email address and the resource's
    * verification status will be set to pending; otherwise, the resource will be created with verification status set to accepted. If a signature is
    * provided, Gmail will sanitize the HTML before saving it with the alias.
    *
    * This method is only available to service account clients that have been delegated domain-wide authority.
    */
  def create(request: AnonAlt): Request_[SendAs] = js.native
  /**
    * Deletes the specified send-as alias. Revokes any verification that may have been required for using it.
    *
    * This method is only available to service account clients that have been delegated domain-wide authority.
    */
  def delete(request: AnonPrettyPrint): Request_[Unit] = js.native
  /** Gets the specified send-as alias. Fails with an HTTP 404 error if the specified address is not a member of the collection. */
  def get(request: AnonPrettyPrint): Request_[SendAs] = js.native
  /**
    * Lists the send-as aliases for the specified account. The result includes the primary send-as address associated with the account as well as any custom
    * "from" aliases.
    */
  def list(request: AnonAlt): Request_[ListSendAsResponse] = js.native
  /**
    * Updates a send-as alias. If a signature is provided, Gmail will sanitize the HTML before saving it with the alias.
    *
    * Addresses other than the primary address for the account can only be updated by service account clients that have been delegated domain-wide authority.
    * This method supports patch semantics.
    */
  def patch(request: AnonPrettyPrint): Request_[SendAs] = js.native
  /**
    * Updates a send-as alias. If a signature is provided, Gmail will sanitize the HTML before saving it with the alias.
    *
    * Addresses other than the primary address for the account can only be updated by service account clients that have been delegated domain-wide authority.
    */
  def update(request: AnonPrettyPrint): Request_[SendAs] = js.native
  /**
    * Sends a verification email to the specified send-as alias address. The verification status must be pending.
    *
    * This method is only available to service account clients that have been delegated domain-wide authority.
    */
  def verify(request: AnonPrettyPrint): Request_[Unit] = js.native
}

object SendAsResource {
  @scala.inline
  def apply(
    create: AnonAlt => Request_[SendAs],
    delete: AnonPrettyPrint => Request_[Unit],
    get: AnonPrettyPrint => Request_[SendAs],
    list: AnonAlt => Request_[ListSendAsResponse],
    patch: AnonPrettyPrint => Request_[SendAs],
    smimeInfo: SmimeInfoResource,
    update: AnonPrettyPrint => Request_[SendAs],
    verify: AnonPrettyPrint => Request_[Unit]
  ): SendAsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), smimeInfo = smimeInfo.asInstanceOf[js.Any], update = js.Any.fromFunction1(update), verify = js.Any.fromFunction1(verify))
    __obj.asInstanceOf[SendAsResource]
  }
  @scala.inline
  implicit class SendAsResourceOps[Self <: SendAsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: AnonAlt => Request_[SendAs]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: AnonPrettyPrint => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonPrettyPrint => Request_[SendAs]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonAlt => Request_[ListSendAsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonPrettyPrint => Request_[SendAs]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSmimeInfo(value: SmimeInfoResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smimeInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdate(value: AnonPrettyPrint => Request_[SendAs]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withVerify(value: AnonPrettyPrint => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verify")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

