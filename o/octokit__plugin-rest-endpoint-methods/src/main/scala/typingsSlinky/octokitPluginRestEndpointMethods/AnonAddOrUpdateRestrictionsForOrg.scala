package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAddOrUpdateRestrictionsForOrg extends js.Object {
  var addOrUpdateRestrictionsForOrg: AnonParamsAnonLimit = js.native
  var addOrUpdateRestrictionsForRepo: AnonParamsAnonLimitOwner = js.native
  var getRestrictionsForOrg: AnonParamsAnonOrgAnonRequired = js.native
  var getRestrictionsForRepo: AnonParamsAnonRepo = js.native
  var removeRestrictionsForOrg: AnonParamsAnonOrgAnonRequired = js.native
  var removeRestrictionsForRepo: AnonParamsAnonRepo = js.native
}

object AnonAddOrUpdateRestrictionsForOrg {
  @scala.inline
  def apply(
    addOrUpdateRestrictionsForOrg: AnonParamsAnonLimit,
    addOrUpdateRestrictionsForRepo: AnonParamsAnonLimitOwner,
    getRestrictionsForOrg: AnonParamsAnonOrgAnonRequired,
    getRestrictionsForRepo: AnonParamsAnonRepo,
    removeRestrictionsForOrg: AnonParamsAnonOrgAnonRequired,
    removeRestrictionsForRepo: AnonParamsAnonRepo
  ): AnonAddOrUpdateRestrictionsForOrg = {
    val __obj = js.Dynamic.literal(addOrUpdateRestrictionsForOrg = addOrUpdateRestrictionsForOrg.asInstanceOf[js.Any], addOrUpdateRestrictionsForRepo = addOrUpdateRestrictionsForRepo.asInstanceOf[js.Any], getRestrictionsForOrg = getRestrictionsForOrg.asInstanceOf[js.Any], getRestrictionsForRepo = getRestrictionsForRepo.asInstanceOf[js.Any], removeRestrictionsForOrg = removeRestrictionsForOrg.asInstanceOf[js.Any], removeRestrictionsForRepo = removeRestrictionsForRepo.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAddOrUpdateRestrictionsForOrg]
  }
  @scala.inline
  implicit class AnonAddOrUpdateRestrictionsForOrgOps[Self <: AnonAddOrUpdateRestrictionsForOrg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddOrUpdateRestrictionsForOrg(value: AnonParamsAnonLimit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOrUpdateRestrictionsForOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddOrUpdateRestrictionsForRepo(value: AnonParamsAnonLimitOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOrUpdateRestrictionsForRepo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetRestrictionsForOrg(value: AnonParamsAnonOrgAnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRestrictionsForOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetRestrictionsForRepo(value: AnonParamsAnonRepo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRestrictionsForRepo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveRestrictionsForOrg(value: AnonParamsAnonOrgAnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeRestrictionsForOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveRestrictionsForRepo(value: AnonParamsAnonRepo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeRestrictionsForRepo")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

