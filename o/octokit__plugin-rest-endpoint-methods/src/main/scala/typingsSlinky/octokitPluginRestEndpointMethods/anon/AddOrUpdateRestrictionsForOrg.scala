package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddOrUpdateRestrictionsForOrg extends js.Object {
  var addOrUpdateRestrictionsForOrg: ParamsLimit = js.native
  var addOrUpdateRestrictionsForRepo: ParamsLimitOwner = js.native
  var getRestrictionsForOrg: ParamsOrgRequired = js.native
  var getRestrictionsForRepo: ParamsRepo = js.native
  var removeRestrictionsForOrg: ParamsOrgRequired = js.native
  var removeRestrictionsForRepo: ParamsRepo = js.native
}

object AddOrUpdateRestrictionsForOrg {
  @scala.inline
  def apply(
    addOrUpdateRestrictionsForOrg: ParamsLimit,
    addOrUpdateRestrictionsForRepo: ParamsLimitOwner,
    getRestrictionsForOrg: ParamsOrgRequired,
    getRestrictionsForRepo: ParamsRepo,
    removeRestrictionsForOrg: ParamsOrgRequired,
    removeRestrictionsForRepo: ParamsRepo
  ): AddOrUpdateRestrictionsForOrg = {
    val __obj = js.Dynamic.literal(addOrUpdateRestrictionsForOrg = addOrUpdateRestrictionsForOrg.asInstanceOf[js.Any], addOrUpdateRestrictionsForRepo = addOrUpdateRestrictionsForRepo.asInstanceOf[js.Any], getRestrictionsForOrg = getRestrictionsForOrg.asInstanceOf[js.Any], getRestrictionsForRepo = getRestrictionsForRepo.asInstanceOf[js.Any], removeRestrictionsForOrg = removeRestrictionsForOrg.asInstanceOf[js.Any], removeRestrictionsForRepo = removeRestrictionsForRepo.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddOrUpdateRestrictionsForOrg]
  }
  @scala.inline
  implicit class AddOrUpdateRestrictionsForOrgOps[Self <: AddOrUpdateRestrictionsForOrg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddOrUpdateRestrictionsForOrg(value: ParamsLimit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOrUpdateRestrictionsForOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddOrUpdateRestrictionsForRepo(value: ParamsLimitOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOrUpdateRestrictionsForRepo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetRestrictionsForOrg(value: ParamsOrgRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRestrictionsForOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetRestrictionsForRepo(value: ParamsRepo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRestrictionsForRepo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveRestrictionsForOrg(value: ParamsOrgRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeRestrictionsForOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveRestrictionsForRepo(value: ParamsRepo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeRestrictionsForRepo")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

