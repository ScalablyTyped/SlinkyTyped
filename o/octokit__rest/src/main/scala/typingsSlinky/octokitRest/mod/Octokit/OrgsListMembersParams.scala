package typingsSlinky.octokitRest.mod.Octokit

import typingsSlinky.octokitRest.octokitRestStrings.`2fa_disabled`
import typingsSlinky.octokitRest.octokitRestStrings.admin
import typingsSlinky.octokitRest.octokitRestStrings.all
import typingsSlinky.octokitRest.octokitRestStrings.member
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrgsListMembersParams extends js.Object {
  /**
    * Filter members returned in the list. Can be one of:
    * \* `2fa_disabled` - Members without [two-factor authentication](https://github.com/blog/1614-two-factor-authentication) enabled. Available for organization owners.
    * \* `all` - All members the authenticated user can see.
    */
  var filter: js.UndefOr[`2fa_disabled` | all] = js.native
  @JSName("org")
  var org_ : String = js.native
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[Double] = js.native
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[Double] = js.native
  /**
    * Filter members returned by their role. Can be one of:
    * \* `all` - All members of the organization, regardless of role.
    * \* `admin` - Organization owners.
    * \* `member` - Non-owner organization members.
    */
  var role: js.UndefOr[all | admin | member] = js.native
}

object OrgsListMembersParams {
  @scala.inline
  def apply(org_ : String): OrgsListMembersParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsListMembersParams]
  }
  @scala.inline
  implicit class OrgsListMembersParamsOps[Self <: OrgsListMembersParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOrg_(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("org")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilter(value: `2fa_disabled` | all): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(js.undefined)
        ret
    }
    @scala.inline
    def withPer_page(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("per_page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPer_page: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("per_page")(js.undefined)
        ret
    }
    @scala.inline
    def withRole(value: all | admin | member): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(js.undefined)
        ret
    }
  }
  
}

