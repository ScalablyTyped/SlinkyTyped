package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientDfareporting.anon.AdvertiserIdAlt
import typingsSlinky.gapiClientDfareporting.anon.Fields
import typingsSlinky.gapiClientDfareporting.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetingTemplatesResource extends js.Object {
  /** Gets one targeting template by ID. */
  def get(request: Fields): Request[TargetingTemplate] = js.native
  /** Inserts a new targeting template. */
  def insert(request: Key): Request[TargetingTemplate] = js.native
  /** Retrieves a list of targeting templates, optionally filtered. This method supports paging. */
  def list(request: AdvertiserIdAlt): Request[TargetingTemplatesListResponse] = js.native
  /** Updates an existing targeting template. This method supports patch semantics. */
  def patch(request: Fields): Request[TargetingTemplate] = js.native
  /** Updates an existing targeting template. */
  def update(request: Key): Request[TargetingTemplate] = js.native
}

object TargetingTemplatesResource {
  @scala.inline
  def apply(
    get: Fields => Request[TargetingTemplate],
    insert: Key => Request[TargetingTemplate],
    list: AdvertiserIdAlt => Request[TargetingTemplatesListResponse],
    patch: Fields => Request[TargetingTemplate],
    update: Key => Request[TargetingTemplate]
  ): TargetingTemplatesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[TargetingTemplatesResource]
  }
  @scala.inline
  implicit class TargetingTemplatesResourceOps[Self <: TargetingTemplatesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: Fields => Request[TargetingTemplate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: Key => Request[TargetingTemplate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AdvertiserIdAlt => Request[TargetingTemplatesListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: Fields => Request[TargetingTemplate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: Key => Request[TargetingTemplate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

