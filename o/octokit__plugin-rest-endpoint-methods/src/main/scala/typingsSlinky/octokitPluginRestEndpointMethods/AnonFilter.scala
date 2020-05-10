package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFilter extends js.Object {
  var check_name: AnonType = js.native
  var check_suite_id: AnonRequired = js.native
  var filter: AnonEnum = js.native
  var owner: AnonRequired = js.native
  var page: AnonType = js.native
  var per_page: AnonType = js.native
  var repo: AnonRequired = js.native
  var status: AnonEnum = js.native
}

object AnonFilter {
  @scala.inline
  def apply(
    check_name: AnonType,
    check_suite_id: AnonRequired,
    filter: AnonEnum,
    owner: AnonRequired,
    page: AnonType,
    per_page: AnonType,
    repo: AnonRequired,
    status: AnonEnum
  ): AnonFilter = {
    val __obj = js.Dynamic.literal(check_name = check_name.asInstanceOf[js.Any], check_suite_id = check_suite_id.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFilter]
  }
  @scala.inline
  implicit class AnonFilterOps[Self <: AnonFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheck_name(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("check_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheck_suite_id(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("check_suite_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilter(value: AnonEnum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwner(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPage(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPer_page(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("per_page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepo(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: AnonEnum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

