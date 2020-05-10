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
trait TagsResource extends js.Object {
  /** Creates a GTM Tag. */
  def create(request: AnonAlt): Request_[Tag] = js.native
  /** Deletes a GTM Tag. */
  def delete(request: AnonFields): Request_[Unit] = js.native
  /** Gets a GTM Tag. */
  def get(request: AnonFields): Request_[Tag] = js.native
  /** Lists all GTM Tags of a Container. */
  def list(request: AnonKey): Request_[ListTagsResponse] = js.native
  /** Reverts changes to a GTM Tag in a GTM Workspace. */
  def revert(request: AnonFingerprint): Request_[RevertTagResponse] = js.native
  /** Updates a GTM Tag. */
  def update(request: AnonFingerprint): Request_[Tag] = js.native
}

object TagsResource {
  @scala.inline
  def apply(
    create: AnonAlt => Request_[Tag],
    delete: AnonFields => Request_[Unit],
    get: AnonFields => Request_[Tag],
    list: AnonKey => Request_[ListTagsResponse],
    revert: AnonFingerprint => Request_[RevertTagResponse],
    update: AnonFingerprint => Request_[Tag]
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
    def withCreate(value: AnonAlt => Request_[Tag]): Self = {
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
    def withGet(value: AnonFields => Request_[Tag]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonKey => Request_[ListTagsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRevert(value: AnonFingerprint => Request_[RevertTagResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonFingerprint => Request_[Tag]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

