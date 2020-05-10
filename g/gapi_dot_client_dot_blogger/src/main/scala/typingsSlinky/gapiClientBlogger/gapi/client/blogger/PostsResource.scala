package typingsSlinky.gapiClientBlogger.gapi.client.blogger

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientBlogger.AnonFetchBody
import typingsSlinky.gapiClientBlogger.AnonFetchImages
import typingsSlinky.gapiClientBlogger.AnonOrderBy
import typingsSlinky.gapiClientBlogger.AnonPath
import typingsSlinky.gapiClientBlogger.AnonPostId
import typingsSlinky.gapiClientBlogger.AnonPublishDate
import typingsSlinky.gapiClientBlogger.AnonQ
import typingsSlinky.gapiClientBlogger.AnonQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostsResource extends js.Object {
  /** Delete a post by ID. */
  def delete(request: AnonPostId): Request_[Unit] = js.native
  /** Get a post by ID. */
  def get(request: AnonFetchBody): Request_[Post] = js.native
  /** Retrieve a Post by Path. */
  def getByPath(request: AnonPath): Request_[Post] = js.native
  /** Add a post. */
  def insert(request: AnonFetchImages): Request_[Post] = js.native
  /** Retrieves a list of posts, possibly filtered. */
  def list(request: AnonOrderBy): Request_[PostList] = js.native
  /** Update a post. This method supports patch semantics. */
  def patch(request: AnonQuotaUser): Request_[Post] = js.native
  /** Publishes a draft post, optionally at the specific time of the given publishDate parameter. */
  def publish(request: AnonPublishDate): Request_[Post] = js.native
  /** Revert a published or scheduled post to draft state. */
  def revert(request: AnonPostId): Request_[Post] = js.native
  /** Search for a post. */
  def search(request: AnonQ): Request_[PostList] = js.native
  /** Update a post. */
  def update(request: AnonQuotaUser): Request_[Post] = js.native
}

object PostsResource {
  @scala.inline
  def apply(
    delete: AnonPostId => Request_[Unit],
    get: AnonFetchBody => Request_[Post],
    getByPath: AnonPath => Request_[Post],
    insert: AnonFetchImages => Request_[Post],
    list: AnonOrderBy => Request_[PostList],
    patch: AnonQuotaUser => Request_[Post],
    publish: AnonPublishDate => Request_[Post],
    revert: AnonPostId => Request_[Post],
    search: AnonQ => Request_[PostList],
    update: AnonQuotaUser => Request_[Post]
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
    def withDelete(value: AnonPostId => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonFetchBody => Request_[Post]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetByPath(value: AnonPath => Request_[Post]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getByPath")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonFetchImages => Request_[Post]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonOrderBy => Request_[PostList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonQuotaUser => Request_[Post]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPublish(value: AnonPublishDate => Request_[Post]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publish")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRevert(value: AnonPostId => Request_[Post]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSearch(value: AnonQ => Request_[PostList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonQuotaUser => Request_[Post]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

