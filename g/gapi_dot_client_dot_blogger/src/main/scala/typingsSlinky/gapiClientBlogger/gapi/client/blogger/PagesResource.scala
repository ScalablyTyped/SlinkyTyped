package typingsSlinky.gapiClientBlogger.gapi.client.blogger

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientBlogger.AnonIsDraft
import typingsSlinky.gapiClientBlogger.AnonMaxResults
import typingsSlinky.gapiClientBlogger.AnonPageId
import typingsSlinky.gapiClientBlogger.AnonPrettyPrint
import typingsSlinky.gapiClientBlogger.AnonPublish
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PagesResource extends js.Object {
  /** Delete a page by ID. */
  def delete(request: AnonPageId): Request_[Unit] = js.native
  /** Gets one blog page by ID. */
  def get(request: AnonPrettyPrint): Request_[Page] = js.native
  /** Add a page. */
  def insert(request: AnonIsDraft): Request_[Page] = js.native
  /** Retrieves the pages for a blog, optionally including non-LIVE statuses. */
  def list(request: AnonMaxResults): Request_[PageList] = js.native
  /** Update a page. This method supports patch semantics. */
  def patch(request: AnonPublish): Request_[Page] = js.native
  /** Publishes a draft page. */
  def publish(request: AnonPageId): Request_[Page] = js.native
  /** Revert a published or scheduled page to draft state. */
  def revert(request: AnonPageId): Request_[Page] = js.native
  /** Update a page. */
  def update(request: AnonPublish): Request_[Page] = js.native
}

object PagesResource {
  @scala.inline
  def apply(
    delete: AnonPageId => Request_[Unit],
    get: AnonPrettyPrint => Request_[Page],
    insert: AnonIsDraft => Request_[Page],
    list: AnonMaxResults => Request_[PageList],
    patch: AnonPublish => Request_[Page],
    publish: AnonPageId => Request_[Page],
    revert: AnonPageId => Request_[Page],
    update: AnonPublish => Request_[Page]
  ): PagesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), publish = js.Any.fromFunction1(publish), revert = js.Any.fromFunction1(revert), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[PagesResource]
  }
  @scala.inline
  implicit class PagesResourceOps[Self <: PagesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: AnonPageId => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonPrettyPrint => Request_[Page]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonIsDraft => Request_[Page]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonMaxResults => Request_[PageList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonPublish => Request_[Page]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPublish(value: AnonPageId => Request_[Page]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publish")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRevert(value: AnonPageId => Request_[Page]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonPublish => Request_[Page]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

