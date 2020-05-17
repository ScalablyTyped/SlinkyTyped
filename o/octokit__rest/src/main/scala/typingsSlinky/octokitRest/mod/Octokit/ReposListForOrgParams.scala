package typingsSlinky.octokitRest.mod.Octokit

import typingsSlinky.octokitRest.octokitRestStrings.`private`
import typingsSlinky.octokitRest.octokitRestStrings.all
import typingsSlinky.octokitRest.octokitRestStrings.asc
import typingsSlinky.octokitRest.octokitRestStrings.created
import typingsSlinky.octokitRest.octokitRestStrings.desc
import typingsSlinky.octokitRest.octokitRestStrings.forks
import typingsSlinky.octokitRest.octokitRestStrings.full_name
import typingsSlinky.octokitRest.octokitRestStrings.internal
import typingsSlinky.octokitRest.octokitRestStrings.member
import typingsSlinky.octokitRest.octokitRestStrings.public
import typingsSlinky.octokitRest.octokitRestStrings.pushed
import typingsSlinky.octokitRest.octokitRestStrings.sources
import typingsSlinky.octokitRest.octokitRestStrings.updated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposListForOrgParams extends js.Object {
  /**
    * Can be one of `asc` or `desc`. Default: when using `full_name`: `asc`, otherwise `desc`
    */
  var direction: js.UndefOr[asc | desc] = js.native
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
    * Can be one of `created`, `updated`, `pushed`, `full_name`.
    */
  var sort: js.UndefOr[created | updated | pushed | full_name] = js.native
  /**
    * Specifies the types of repositories you want returned. Can be one of `all`, `public`, `private`, `forks`, `sources`, `member`, `internal`. Default: `all`. If your organization is associated with an enterprise account using GitHub Enterprise Cloud, `type` can also be `internal`.
    */
  var `type`: js.UndefOr[all | public | `private` | forks | sources | member | internal] = js.native
}

object ReposListForOrgParams {
  @scala.inline
  def apply(org_ : String): ReposListForOrgParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposListForOrgParams]
  }
  @scala.inline
  implicit class ReposListForOrgParamsOps[Self <: ReposListForOrgParams] (val x: Self) extends AnyVal {
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
    def withDirection(value: asc | desc): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
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
    def withSort(value: created | updated | pushed | full_name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: all | public | `private` | forks | sources | member | internal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

