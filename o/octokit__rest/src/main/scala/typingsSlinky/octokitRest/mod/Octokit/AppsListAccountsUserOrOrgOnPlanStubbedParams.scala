package typingsSlinky.octokitRest.mod.Octokit

import typingsSlinky.octokitRest.octokitRestStrings.asc
import typingsSlinky.octokitRest.octokitRestStrings.created
import typingsSlinky.octokitRest.octokitRestStrings.desc
import typingsSlinky.octokitRest.octokitRestStrings.updated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppsListAccountsUserOrOrgOnPlanStubbedParams extends js.Object {
  /**
    * To return the oldest accounts first, set to `asc`. Can be one of `asc` or `desc`. Ignored without the `sort` parameter.
    */
  var direction: js.UndefOr[asc | desc] = js.native
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[Double] = js.native
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[Double] = js.native
  var plan_id: Double = js.native
  /**
    * Sorts the GitHub accounts by the date they were created or last updated. Can be one of `created` or `updated`.
    */
  var sort: js.UndefOr[created | updated] = js.native
}

object AppsListAccountsUserOrOrgOnPlanStubbedParams {
  @scala.inline
  def apply(plan_id: Double): AppsListAccountsUserOrOrgOnPlanStubbedParams = {
    val __obj = js.Dynamic.literal(plan_id = plan_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsListAccountsUserOrOrgOnPlanStubbedParams]
  }
  @scala.inline
  implicit class AppsListAccountsUserOrOrgOnPlanStubbedParamsOps[Self <: AppsListAccountsUserOrOrgOnPlanStubbedParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPlan_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plan_id")(value.asInstanceOf[js.Any])
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
    def withSort(value: created | updated): Self = {
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
  }
  
}

