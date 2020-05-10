package typingsSlinky.gapiClientAnalytics.gapi.client.analytics

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAnalytics.AnonQuotaUser
import typingsSlinky.gapiClientAnalytics.AnonRemarketingAudienceId
import typingsSlinky.gapiClientAnalytics.AnonType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemarketingAudienceResource extends js.Object {
  /** Delete a remarketing audience. */
  def delete(request: AnonRemarketingAudienceId): Request_[Unit] = js.native
  /** Gets a remarketing audience to which the user has access. */
  def get(request: AnonRemarketingAudienceId): Request_[RemarketingAudience] = js.native
  /** Creates a new remarketing audience. */
  def insert(request: AnonQuotaUser): Request_[RemarketingAudience] = js.native
  /** Lists remarketing audiences to which the user has access. */
  def list(request: AnonType): Request_[RemarketingAudiences] = js.native
  /** Updates an existing remarketing audience. This method supports patch semantics. */
  def patch(request: AnonRemarketingAudienceId): Request_[RemarketingAudience] = js.native
  /** Updates an existing remarketing audience. */
  def update(request: AnonRemarketingAudienceId): Request_[RemarketingAudience] = js.native
}

object RemarketingAudienceResource {
  @scala.inline
  def apply(
    delete: AnonRemarketingAudienceId => Request_[Unit],
    get: AnonRemarketingAudienceId => Request_[RemarketingAudience],
    insert: AnonQuotaUser => Request_[RemarketingAudience],
    list: AnonType => Request_[RemarketingAudiences],
    patch: AnonRemarketingAudienceId => Request_[RemarketingAudience],
    update: AnonRemarketingAudienceId => Request_[RemarketingAudience]
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
    def withDelete(value: AnonRemarketingAudienceId => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonRemarketingAudienceId => Request_[RemarketingAudience]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonQuotaUser => Request_[RemarketingAudience]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonType => Request_[RemarketingAudiences]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonRemarketingAudienceId => Request_[RemarketingAudience]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonRemarketingAudienceId => Request_[RemarketingAudience]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

