package typingsSlinky.gapiClientGmail.gapi.client.gmail

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientGmail.AnonAlt
import typingsSlinky.gapiClientGmail.AnonForwardingEmail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForwardingAddressesResource extends js.Object {
  /**
    * Creates a forwarding address. If ownership verification is required, a message will be sent to the recipient and the resource's verification status
    * will be set to pending; otherwise, the resource will be created with verification status set to accepted.
    *
    * This method is only available to service account clients that have been delegated domain-wide authority.
    */
  def create(request: AnonAlt): Request_[ForwardingAddress] = js.native
  /**
    * Deletes the specified forwarding address and revokes any verification that may have been required.
    *
    * This method is only available to service account clients that have been delegated domain-wide authority.
    */
  def delete(request: AnonForwardingEmail): Request_[Unit] = js.native
  /** Gets the specified forwarding address. */
  def get(request: AnonForwardingEmail): Request_[ForwardingAddress] = js.native
  /** Lists the forwarding addresses for the specified account. */
  def list(request: AnonAlt): Request_[ListForwardingAddressesResponse] = js.native
}

object ForwardingAddressesResource {
  @scala.inline
  def apply(
    create: AnonAlt => Request_[ForwardingAddress],
    delete: AnonForwardingEmail => Request_[Unit],
    get: AnonForwardingEmail => Request_[ForwardingAddress],
    list: AnonAlt => Request_[ListForwardingAddressesResponse]
  ): ForwardingAddressesResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[ForwardingAddressesResource]
  }
  @scala.inline
  implicit class ForwardingAddressesResourceOps[Self <: ForwardingAddressesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: AnonAlt => Request_[ForwardingAddress]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: AnonForwardingEmail => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonForwardingEmail => Request_[ForwardingAddress]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonAlt => Request_[ListForwardingAddressesResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

