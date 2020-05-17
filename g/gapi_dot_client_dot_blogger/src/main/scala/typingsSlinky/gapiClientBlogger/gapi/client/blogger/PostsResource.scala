package typingsSlinky.gapiClientBlogger.gapi.client.blogger

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientBlogger.anon.FetchBody
import typingsSlinky.gapiClientBlogger.anon.FetchImages
import typingsSlinky.gapiClientBlogger.anon.OrderBy
import typingsSlinky.gapiClientBlogger.anon.Path
import typingsSlinky.gapiClientBlogger.anon.PostId
import typingsSlinky.gapiClientBlogger.anon.PublishDate
import typingsSlinky.gapiClientBlogger.anon.Q
import typingsSlinky.gapiClientBlogger.anon.QuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostsResource extends js.Object {
  /** Delete a post by ID. */
  def delete(request: PostId): Request[Unit] = js.native
  /** Get a post by ID. */
  def get(request: FetchBody): Request[Post] = js.native
  /** Retrieve a Post by Path. */
  def getByPath(request: Path): Request[Post] = js.native
  /** Add a post. */
  def insert(request: FetchImages): Request[Post] = js.native
  /** Retrieves a list of posts, possibly filtered. */
  def list(request: OrderBy): Request[PostList] = js.native
  /** Update a post. This method supports patch semantics. */
  def patch(request: QuotaUser): Request[Post] = js.native
  /** Publishes a draft post, optionally at the specific time of the given publishDate parameter. */
  def publish(request: PublishDate): Request[Post] = js.native
  /** Revert a published or scheduled post to draft state. */
  def revert(request: PostId): Request[Post] = js.native
  /** Search for a post. */
  def search(request: Q): Request[PostList] = js.native
  /** Update a post. */
  def update(request: QuotaUser): Request[Post] = js.native
}

object PostsResource {
  @scala.inline
  def apply(
    delete: PostId => Request[Unit],
    get: FetchBody => Request[Post],
    getByPath: Path => Request[Post],
    insert: FetchImages => Request[Post],
    list: OrderBy => Request[PostList],
    patch: QuotaUser => Request[Post],
    publish: PublishDate => Request[Post],
    revert: PostId => Request[Post],
    search: Q => Request[PostList],
    update: QuotaUser => Request[Post]
  ): PostsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getByPath = js.Any.fromFunction1(getByPath), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), publish = js.Any.fromFunction1(publish), revert = js.Any.fromFunction1(revert), search = js.Any.fromFunction1(search), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[PostsResource]
  }
  @scala.inline
  implicit class PostsResourceOps[Self <: PostsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: PostId => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: FetchBody => Request[Post]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetByPath(value: Path => Request[Post]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getByPath")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: FetchImages => Request[Post]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: OrderBy => Request[PostList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: QuotaUser => Request[Post]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPublish(value: PublishDate => Request[Post]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publish")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRevert(value: PostId => Request[Post]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSearch(value: Q => Request[PostList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: QuotaUser => Request[Post]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

