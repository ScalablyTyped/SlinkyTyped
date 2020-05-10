package typingsSlinky.gapiClientFusiontables.gapi.client.fusiontables

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientFusiontables.AnonFields
import typingsSlinky.gapiClientFusiontables.AnonKey
import typingsSlinky.gapiClientFusiontables.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StyleResource extends js.Object {
  /** Deletes a style. */
  def delete(request: AnonOauthtoken): Request_[Unit] = js.native
  /** Gets a specific style. */
  def get(request: AnonOauthtoken): Request_[StyleSetting] = js.native
  /** Adds a new style for the table. */
  def insert(request: AnonFields): Request_[StyleSetting] = js.native
  /** Retrieves a list of styles. */
  def list(request: AnonKey): Request_[StyleSettingList] = js.native
  /** Updates an existing style. This method supports patch semantics. */
  def patch(request: AnonOauthtoken): Request_[StyleSetting] = js.native
  /** Updates an existing style. */
  def update(request: AnonOauthtoken): Request_[StyleSetting] = js.native
}

object StyleResource {
  @scala.inline
  def apply(
    delete: AnonOauthtoken => Request_[Unit],
    get: AnonOauthtoken => Request_[StyleSetting],
    insert: AnonFields => Request_[StyleSetting],
    list: AnonKey => Request_[StyleSettingList],
    patch: AnonOauthtoken => Request_[StyleSetting],
    update: AnonOauthtoken => Request_[StyleSetting]
  ): StyleResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[StyleResource]
  }
  @scala.inline
  implicit class StyleResourceOps[Self <: StyleResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: AnonOauthtoken => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonOauthtoken => Request_[StyleSetting]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonFields => Request_[StyleSetting]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonKey => Request_[StyleSettingList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonOauthtoken => Request_[StyleSetting]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonOauthtoken => Request_[StyleSetting]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

