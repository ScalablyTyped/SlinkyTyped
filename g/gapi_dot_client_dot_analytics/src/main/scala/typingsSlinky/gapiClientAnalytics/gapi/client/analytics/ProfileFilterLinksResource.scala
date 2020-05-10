package typingsSlinky.gapiClientAnalytics.gapi.client.analytics

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAnalytics.AnonProfileId
import typingsSlinky.gapiClientAnalytics.AnonStartindex
import typingsSlinky.gapiClientAnalytics.AnonWebPropertyId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProfileFilterLinksResource extends js.Object {
  /** Delete a profile filter link. */
  def delete(request: AnonWebPropertyId): Request_[Unit] = js.native
  /** Returns a single profile filter link. */
  def get(request: AnonWebPropertyId): Request_[ProfileFilterLink] = js.native
  /** Create a new profile filter link. */
  def insert(request: AnonProfileId): Request_[ProfileFilterLink] = js.native
  /** Lists all profile filter links for a profile. */
  def list(request: AnonStartindex): Request_[ProfileFilterLinks] = js.native
  /** Update an existing profile filter link. This method supports patch semantics. */
  def patch(request: AnonWebPropertyId): Request_[ProfileFilterLink] = js.native
  /** Update an existing profile filter link. */
  def update(request: AnonWebPropertyId): Request_[ProfileFilterLink] = js.native
}

object ProfileFilterLinksResource {
  @scala.inline
  def apply(
    delete: AnonWebPropertyId => Request_[Unit],
    get: AnonWebPropertyId => Request_[ProfileFilterLink],
    insert: AnonProfileId => Request_[ProfileFilterLink],
    list: AnonStartindex => Request_[ProfileFilterLinks],
    patch: AnonWebPropertyId => Request_[ProfileFilterLink],
    update: AnonWebPropertyId => Request_[ProfileFilterLink]
  ): ProfileFilterLinksResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[ProfileFilterLinksResource]
  }
  @scala.inline
  implicit class ProfileFilterLinksResourceOps[Self <: ProfileFilterLinksResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: AnonWebPropertyId => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonWebPropertyId => Request_[ProfileFilterLink]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonProfileId => Request_[ProfileFilterLink]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonStartindex => Request_[ProfileFilterLinks]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonWebPropertyId => Request_[ProfileFilterLink]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonWebPropertyId => Request_[ProfileFilterLink]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

