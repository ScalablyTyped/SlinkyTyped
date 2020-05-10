package typingsSlinky.gapiClientTagmanager.gapi.client.tagmanager

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientTagmanager.AnonAlt
import typingsSlinky.gapiClientTagmanager.AnonFields
import typingsSlinky.gapiClientTagmanager.AnonFingerprint
import typingsSlinky.gapiClientTagmanager.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnvironmentsResource extends js.Object {
  /** Creates a GTM Environment. */
  def create(request: AnonAlt): Request_[Environment] = js.native
  /** Deletes a GTM Environment. */
  def delete(request: AnonFields): Request_[Unit] = js.native
  /** Gets a GTM Environment. */
  def get(request: AnonFields): Request_[Environment] = js.native
  /** Lists all GTM Environments of a GTM Container. */
  def list(request: AnonKey): Request_[ListEnvironmentsResponse] = js.native
  /** Updates a GTM Environment. This method supports patch semantics. */
  def patch(request: AnonFingerprint): Request_[Environment] = js.native
  /** Re-generates the authorization code for a GTM Environment. */
  def reauthorize(request: AnonFields): Request_[Environment] = js.native
  /** Updates a GTM Environment. */
  def update(request: AnonFingerprint): Request_[Environment] = js.native
}

object EnvironmentsResource {
  @scala.inline
  def apply(
    create: AnonAlt => Request_[Environment],
    delete: AnonFields => Request_[Unit],
    get: AnonFields => Request_[Environment],
    list: AnonKey => Request_[ListEnvironmentsResponse],
    patch: AnonFingerprint => Request_[Environment],
    reauthorize: AnonFields => Request_[Environment],
    update: AnonFingerprint => Request_[Environment]
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
    def withCreate(value: AnonAlt => Request_[Environment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: AnonFields => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonFields => Request_[Environment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonKey => Request_[ListEnvironmentsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonFingerprint => Request_[Environment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReauthorize(value: AnonFields => Request_[Environment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reauthorize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonFingerprint => Request_[Environment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

