package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientDfareporting.anon.Fields
import typingsSlinky.gapiClientDfareporting.anon.Key
import typingsSlinky.gapiClientDfareporting.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentCategoriesResource extends js.Object {
  /** Deletes an existing content category. */
  def delete(request: Fields): Request[Unit] = js.native
  /** Gets one content category by ID. */
  def get(request: Fields): Request[ContentCategory] = js.native
  /** Inserts a new content category. */
  def insert(request: Key): Request[ContentCategory] = js.native
  /** Retrieves a list of content categories, possibly filtered. This method supports paging. */
  def list(request: Oauthtoken): Request[ContentCategoriesListResponse] = js.native
  /** Updates an existing content category. This method supports patch semantics. */
  def patch(request: Fields): Request[ContentCategory] = js.native
  /** Updates an existing content category. */
  def update(request: Key): Request[ContentCategory] = js.native
}

object ContentCategoriesResource {
  @scala.inline
  def apply(
    delete: Fields => Request[Unit],
    get: Fields => Request[ContentCategory],
    insert: Key => Request[ContentCategory],
    list: Oauthtoken => Request[ContentCategoriesListResponse],
    patch: Fields => Request[ContentCategory],
    update: Key => Request[ContentCategory]
  ): ContentCategoriesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[ContentCategoriesResource]
  }
  @scala.inline
  implicit class ContentCategoriesResourceOps[Self <: ContentCategoriesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: Fields => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: Fields => Request[ContentCategory]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: Key => Request[ContentCategory]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Oauthtoken => Request[ContentCategoriesListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: Fields => Request[ContentCategory]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: Key => Request[ContentCategory]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

