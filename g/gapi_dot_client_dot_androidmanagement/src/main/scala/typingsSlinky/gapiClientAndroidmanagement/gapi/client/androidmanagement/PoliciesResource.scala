package typingsSlinky.gapiClientAndroidmanagement.gapi.client.androidmanagement

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientAndroidmanagement.anon.Alt
import typingsSlinky.gapiClientAndroidmanagement.anon.Callback
import typingsSlinky.gapiClientAndroidmanagement.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PoliciesResource extends js.Object {
  /** Deletes a policy. This operation is only permitted if no devices are currently referencing the policy. */
  def delete(request: Alt): Request[js.Object] = js.native
  /** Gets a policy. */
  def get(request: Alt): Request[Policy] = js.native
  /** Lists policies for a given enterprise. */
  def list(request: Callback): Request[ListPoliciesResponse] = js.native
  /** Updates or creates a policy. */
  def patch(request: Fields): Request[Policy] = js.native
}

object PoliciesResource {
  @scala.inline
  def apply(
    delete: Alt => Request[js.Object],
    get: Alt => Request[Policy],
    list: Callback => Request[ListPoliciesResponse],
    patch: Fields => Request[Policy]
  ): PoliciesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch))
    __obj.asInstanceOf[PoliciesResource]
  }
  @scala.inline
  implicit class PoliciesResourceOps[Self <: PoliciesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: Alt => Request[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: Alt => Request[Policy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Callback => Request[ListPoliciesResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: Fields => Request[Policy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

