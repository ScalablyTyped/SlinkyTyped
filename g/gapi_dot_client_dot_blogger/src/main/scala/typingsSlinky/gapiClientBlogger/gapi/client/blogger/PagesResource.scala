package typingsSlinky.gapiClientBlogger.gapi.client.blogger

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientBlogger.anon.IsDraft
import typingsSlinky.gapiClientBlogger.anon.MaxResults
import typingsSlinky.gapiClientBlogger.anon.PageId
import typingsSlinky.gapiClientBlogger.anon.PrettyPrint
import typingsSlinky.gapiClientBlogger.anon.Publish
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PagesResource extends js.Object {
  /** Delete a page by ID. */
  def delete(request: PageId): Request[Unit] = js.native
  /** Gets one blog page by ID. */
  def get(request: PrettyPrint): Request[Page] = js.native
  /** Add a page. */
  def insert(request: IsDraft): Request[Page] = js.native
  /** Retrieves the pages for a blog, optionally including non-LIVE statuses. */
  def list(request: MaxResults): Request[PageList] = js.native
  /** Update a page. This method supports patch semantics. */
  def patch(request: Publish): Request[Page] = js.native
  /** Publishes a draft page. */
  def publish(request: PageId): Request[Page] = js.native
  /** Revert a published or scheduled page to draft state. */
  def revert(request: PageId): Request[Page] = js.native
  /** Update a page. */
  def update(request: Publish): Request[Page] = js.native
}

object PagesResource {
  @scala.inline
  def apply(
    delete: PageId => Request[Unit],
    get: PrettyPrint => Request[Page],
    insert: IsDraft => Request[Page],
    list: MaxResults => Request[PageList],
    patch: Publish => Request[Page],
    publish: PageId => Request[Page],
    revert: PageId => Request[Page],
    update: Publish => Request[Page]
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
    def withDelete(value: PageId => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: PrettyPrint => Request[Page]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: IsDraft => Request[Page]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: MaxResults => Request[PageList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: Publish => Request[Page]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPublish(value: PageId => Request[Page]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publish")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRevert(value: PageId => Request[Page]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: Publish => Request[Page]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

