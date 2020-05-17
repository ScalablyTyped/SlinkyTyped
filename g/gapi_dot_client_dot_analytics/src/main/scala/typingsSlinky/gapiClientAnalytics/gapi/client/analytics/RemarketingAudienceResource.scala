package typingsSlinky.gapiClientAnalytics.gapi.client.analytics

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientAnalytics.anon.QuotaUser
import typingsSlinky.gapiClientAnalytics.anon.RemarketingAudienceId
import typingsSlinky.gapiClientAnalytics.anon.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemarketingAudienceResource extends js.Object {
  /** Delete a remarketing audience. */
  def delete(request: RemarketingAudienceId): Request[Unit] = js.native
  /** Gets a remarketing audience to which the user has access. */
  def get(request: RemarketingAudienceId): Request[RemarketingAudience] = js.native
  /** Creates a new remarketing audience. */
  def insert(request: QuotaUser): Request[RemarketingAudience] = js.native
  /** Lists remarketing audiences to which the user has access. */
  def list(request: Type): Request[RemarketingAudiences] = js.native
  /** Updates an existing remarketing audience. This method supports patch semantics. */
  def patch(request: RemarketingAudienceId): Request[RemarketingAudience] = js.native
  /** Updates an existing remarketing audience. */
  def update(request: RemarketingAudienceId): Request[RemarketingAudience] = js.native
}

object RemarketingAudienceResource {
  @scala.inline
  def apply(
    delete: RemarketingAudienceId => Request[Unit],
    get: RemarketingAudienceId => Request[RemarketingAudience],
    insert: QuotaUser => Request[RemarketingAudience],
    list: Type => Request[RemarketingAudiences],
    patch: RemarketingAudienceId => Request[RemarketingAudience],
    update: RemarketingAudienceId => Request[RemarketingAudience]
  ): RemarketingAudienceResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[RemarketingAudienceResource]
  }
  @scala.inline
  implicit class RemarketingAudienceResourceOps[Self <: RemarketingAudienceResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: RemarketingAudienceId => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: RemarketingAudienceId => Request[RemarketingAudience]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: QuotaUser => Request[RemarketingAudience]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Type => Request[RemarketingAudiences]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: RemarketingAudienceId => Request[RemarketingAudience]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: RemarketingAudienceId => Request[RemarketingAudience]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

