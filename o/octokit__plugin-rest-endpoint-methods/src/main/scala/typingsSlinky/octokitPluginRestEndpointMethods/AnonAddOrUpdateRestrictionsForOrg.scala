package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddOrUpdateRestrictionsForOrg extends js.Object {
  var addOrUpdateRestrictionsForOrg: AnonParamsAnonLimit
  var addOrUpdateRestrictionsForRepo: AnonParamsAnonLimitOwner
  var getRestrictionsForOrg: AnonParamsAnonOrgAnonRequired
  var getRestrictionsForRepo: AnonParamsAnonRepo
  var removeRestrictionsForOrg: AnonParamsAnonOrgAnonRequired
  var removeRestrictionsForRepo: AnonParamsAnonRepo
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
}

