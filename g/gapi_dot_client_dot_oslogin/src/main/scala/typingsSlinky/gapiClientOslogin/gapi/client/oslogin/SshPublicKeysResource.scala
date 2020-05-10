package typingsSlinky.gapiClientOslogin.gapi.client.oslogin

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientOslogin.AnonAccesstoken
import typingsSlinky.gapiClientOslogin.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SshPublicKeysResource extends js.Object {
  /** Deletes an SSH public key. */
  def delete(request: AnonAccesstoken): Request_[js.Object] = js.native
  /** Retrieves an SSH public key. */
  def get(request: AnonAccesstoken): Request_[SshPublicKey] = js.native
  /**
    * Updates an SSH public key and returns the profile information. This method
    * supports patch semantics.
    */
  def patch(request: AnonAlt): Request_[SshPublicKey] = js.native
}

object SshPublicKeysResource {
  @scala.inline
  def apply(
    delete: AnonAccesstoken => Request_[js.Object],
    get: AnonAccesstoken => Request_[SshPublicKey],
    patch: AnonAlt => Request_[SshPublicKey]
  ): SshPublicKeysResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), patch = js.Any.fromFunction1(patch))
    __obj.asInstanceOf[SshPublicKeysResource]
  }
  @scala.inline
  implicit class SshPublicKeysResourceOps[Self <: SshPublicKeysResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: AnonAccesstoken => Request_[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonAccesstoken => Request_[SshPublicKey]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonAlt => Request_[SshPublicKey]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

