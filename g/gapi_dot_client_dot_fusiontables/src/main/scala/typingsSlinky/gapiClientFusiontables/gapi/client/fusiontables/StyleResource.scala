package typingsSlinky.gapiClientFusiontables.gapi.client.fusiontables

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientFusiontables.anon.Fields
import typingsSlinky.gapiClientFusiontables.anon.Key
import typingsSlinky.gapiClientFusiontables.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StyleResource extends js.Object {
  /** Deletes a style. */
  def delete(request: Oauthtoken): Request[Unit] = js.native
  /** Gets a specific style. */
  def get(request: Oauthtoken): Request[StyleSetting] = js.native
  /** Adds a new style for the table. */
  def insert(request: Fields): Request[StyleSetting] = js.native
  /** Retrieves a list of styles. */
  def list(request: Key): Request[StyleSettingList] = js.native
  /** Updates an existing style. This method supports patch semantics. */
  def patch(request: Oauthtoken): Request[StyleSetting] = js.native
  /** Updates an existing style. */
  def update(request: Oauthtoken): Request[StyleSetting] = js.native
}

object StyleResource {
  @scala.inline
  def apply(
    delete: Oauthtoken => Request[Unit],
    get: Oauthtoken => Request[StyleSetting],
    insert: Fields => Request[StyleSetting],
    list: Key => Request[StyleSettingList],
    patch: Oauthtoken => Request[StyleSetting],
    update: Oauthtoken => Request[StyleSetting]
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
    def withDelete(value: Oauthtoken => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: Oauthtoken => Request[StyleSetting]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: Fields => Request[StyleSetting]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Key => Request[StyleSettingList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: Oauthtoken => Request[StyleSetting]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: Oauthtoken => Request[StyleSetting]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

