package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddOrUpdateRestrictionsForOrg extends js.Object {
  var addOrUpdateRestrictionsForOrg: ParamsLimit
  var addOrUpdateRestrictionsForRepo: ParamsLimitOwner
  var getRestrictionsForOrg: ParamsOrgRequired
  var getRestrictionsForRepo: ParamsRepo
  var removeRestrictionsForOrg: ParamsOrgRequired
  var removeRestrictionsForRepo: ParamsRepo
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
}

