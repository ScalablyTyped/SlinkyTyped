package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddOrUpdateMembership extends js.Object {
  var addOrUpdateMembership: ParamsRole
  var blockUser: ParamsOrgUsername
  var checkBlockedUser: ParamsOrgUsername
  var checkMembership: ParamsOrgUsername
  var checkPublicMembership: ParamsOrgUsername
  var concealMembership: ParamsOrgUsername
  var convertMemberToOutsideCollaborator: ParamsOrgUsername
  var createHook: ParamsActive
  var createInvitation: ParamsEmail
  var deleteHook: ParamsHookid
  var get: MethodStringParamsOrgRequired
  var getHook: ParamsHookid
  var getMembership: ParamsOrgUsername
  var getMembershipForAuthenticatedUser: MethodStringParamsOrgRequired
  var list: ParamsSince
  var listBlockedUsers: MethodStringParamsOrgRequired
  var listForAuthenticatedUser: ParamsPagePerpage
  var listForUser: ParamsUsername
  var listHooks: ParamsOrgPage
  var listInstallations: MethodStringParamsOrgPage
  var listInvitationTeams: ParamsInvitationid
  var listMembers: ParamsFilterOrg
  var listMemberships: ParamsPerpageState
  var listOutsideCollaborators: ParamsFilterOrgPage
  var listPendingInvitations: ParamsOrgPage
  var listPublicMembers: ParamsOrgPage
  var pingHook: ParamsHookid
  var publicizeMembership: ParamsOrgUsername
  var removeMember: ParamsOrgUsername
  var removeMembership: ParamsOrgUsername
  var removeOutsideCollaborator: ParamsOrgUsername
  var unblockUser: ParamsOrgUsername
  var update: ParamsBillingemail
  var updateHook: ParamsConfig
  var updateMembership: ParamsOrgState
}

object AddOrUpdateMembership {
  @scala.inline
  def apply(
    addOrUpdateMembership: ParamsRole,
    blockUser: ParamsOrgUsername,
    checkBlockedUser: ParamsOrgUsername,
    checkMembership: ParamsOrgUsername,
    checkPublicMembership: ParamsOrgUsername,
    concealMembership: ParamsOrgUsername,
    convertMemberToOutsideCollaborator: ParamsOrgUsername,
    createHook: ParamsActive,
    createInvitation: ParamsEmail,
    deleteHook: ParamsHookid,
    get: MethodStringParamsOrgRequired,
    getHook: ParamsHookid,
    getMembership: ParamsOrgUsername,
    getMembershipForAuthenticatedUser: MethodStringParamsOrgRequired,
    list: ParamsSince,
    listBlockedUsers: MethodStringParamsOrgRequired,
    listForAuthenticatedUser: ParamsPagePerpage,
    listForUser: ParamsUsername,
    listHooks: ParamsOrgPage,
    listInstallations: MethodStringParamsOrgPage,
    listInvitationTeams: ParamsInvitationid,
    listMembers: ParamsFilterOrg,
    listMemberships: ParamsPerpageState,
    listOutsideCollaborators: ParamsFilterOrgPage,
    listPendingInvitations: ParamsOrgPage,
    listPublicMembers: ParamsOrgPage,
    pingHook: ParamsHookid,
    publicizeMembership: ParamsOrgUsername,
    removeMember: ParamsOrgUsername,
    removeMembership: ParamsOrgUsername,
    removeOutsideCollaborator: ParamsOrgUsername,
    unblockUser: ParamsOrgUsername,
    update: ParamsBillingemail,
    updateHook: ParamsConfig,
    updateMembership: ParamsOrgState
  ): AddOrUpdateMembership = {
    val __obj = js.Dynamic.literal(addOrUpdateMembership = addOrUpdateMembership.asInstanceOf[js.Any], blockUser = blockUser.asInstanceOf[js.Any], checkBlockedUser = checkBlockedUser.asInstanceOf[js.Any], checkMembership = checkMembership.asInstanceOf[js.Any], checkPublicMembership = checkPublicMembership.asInstanceOf[js.Any], concealMembership = concealMembership.asInstanceOf[js.Any], convertMemberToOutsideCollaborator = convertMemberToOutsideCollaborator.asInstanceOf[js.Any], createHook = createHook.asInstanceOf[js.Any], createInvitation = createInvitation.asInstanceOf[js.Any], deleteHook = deleteHook.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], getHook = getHook.asInstanceOf[js.Any], getMembership = getMembership.asInstanceOf[js.Any], getMembershipForAuthenticatedUser = getMembershipForAuthenticatedUser.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], listBlockedUsers = listBlockedUsers.asInstanceOf[js.Any], listForAuthenticatedUser = listForAuthenticatedUser.asInstanceOf[js.Any], listForUser = listForUser.asInstanceOf[js.Any], listHooks = listHooks.asInstanceOf[js.Any], listInstallations = listInstallations.asInstanceOf[js.Any], listInvitationTeams = listInvitationTeams.asInstanceOf[js.Any], listMembers = listMembers.asInstanceOf[js.Any], listMemberships = listMemberships.asInstanceOf[js.Any], listOutsideCollaborators = listOutsideCollaborators.asInstanceOf[js.Any], listPendingInvitations = listPendingInvitations.asInstanceOf[js.Any], listPublicMembers = listPublicMembers.asInstanceOf[js.Any], pingHook = pingHook.asInstanceOf[js.Any], publicizeMembership = publicizeMembership.asInstanceOf[js.Any], removeMember = removeMember.asInstanceOf[js.Any], removeMembership = removeMembership.asInstanceOf[js.Any], removeOutsideCollaborator = removeOutsideCollaborator.asInstanceOf[js.Any], unblockUser = unblockUser.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any], updateHook = updateHook.asInstanceOf[js.Any], updateMembership = updateMembership.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddOrUpdateMembership]
  }
}

