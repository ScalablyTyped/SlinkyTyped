package typingsSlinky.gapiClientTagmanager.gapi.client.tagmanager

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientTagmanager.anon.Alt
import typingsSlinky.gapiClientTagmanager.anon.Fields
import typingsSlinky.gapiClientTagmanager.anon.Fingerprint
import typingsSlinky.gapiClientTagmanager.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnvironmentsResource extends js.Object {
  /** Creates a GTM Environment. */
  def create(request: Alt): Request[Environment] = js.native
  /** Deletes a GTM Environment. */
  def delete(request: Fields): Request[Unit] = js.native
  /** Gets a GTM Environment. */
  def get(request: Fields): Request[Environment] = js.native
  /** Lists all GTM Environments of a GTM Container. */
  def list(request: Key): Request[ListEnvironmentsResponse] = js.native
  /** Updates a GTM Environment. This method supports patch semantics. */
  def patch(request: Fingerprint): Request[Environment] = js.native
  /** Re-generates the authorization code for a GTM Environment. */
  def reauthorize(request: Fields): Request[Environment] = js.native
  /** Updates a GTM Environment. */
  def update(request: Fingerprint): Request[Environment] = js.native
}

object EnvironmentsResource {
  @scala.inline
  def apply(
    create: Alt => Request[Environment],
    delete: Fields => Request[Unit],
    get: Fields => Request[Environment],
    list: Key => Request[ListEnvironmentsResponse],
    patch: Fingerprint => Request[Environment],
    reauthorize: Fields => Request[Environment],
    update: Fingerprint => Request[Environment]
  ): EnvironmentsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), reauthorize = js.Any.fromFunction1(reauthorize), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[EnvironmentsResource]
  }
  @scala.inline
  implicit class EnvironmentsResourceOps[Self <: EnvironmentsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: Alt => Request[Environment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: Fields => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: Fields => Request[Environment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Key => Request[ListEnvironmentsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: Fingerprint => Request[Environment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReauthorize(value: Fields => Request[Environment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reauthorize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: Fingerprint => Request[Environment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

