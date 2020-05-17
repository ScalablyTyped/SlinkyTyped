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
trait TagsResource extends js.Object {
  /** Creates a GTM Tag. */
  def create(request: Alt): Request[Tag] = js.native
  /** Deletes a GTM Tag. */
  def delete(request: Fields): Request[Unit] = js.native
  /** Gets a GTM Tag. */
  def get(request: Fields): Request[Tag] = js.native
  /** Lists all GTM Tags of a Container. */
  def list(request: Key): Request[ListTagsResponse] = js.native
  /** Reverts changes to a GTM Tag in a GTM Workspace. */
  def revert(request: Fingerprint): Request[RevertTagResponse] = js.native
  /** Updates a GTM Tag. */
  def update(request: Fingerprint): Request[Tag] = js.native
}

object TagsResource {
  @scala.inline
  def apply(
    create: Alt => Request[Tag],
    delete: Fields => Request[Unit],
    get: Fields => Request[Tag],
    list: Key => Request[ListTagsResponse],
    revert: Fingerprint => Request[RevertTagResponse],
    update: Fingerprint => Request[Tag]
  ): TagsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), revert = js.Any.fromFunction1(revert), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[TagsResource]
  }
  @scala.inline
  implicit class TagsResourceOps[Self <: TagsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: Alt => Request[Tag]): Self = {
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
    def withGet(value: Fields => Request[Tag]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Key => Request[ListTagsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRevert(value: Fingerprint => Request[RevertTagResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: Fingerprint => Request[Tag]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

