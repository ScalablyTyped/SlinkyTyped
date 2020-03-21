package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddOrUpdateMembership extends js.Object {
  var addOrUpdateMembership: AnonParamsAnonRole
  var blockUser: AnonParamsAnonOrgUsername
  var checkBlockedUser: AnonParamsAnonOrgUsername
  var checkMembership: AnonParamsAnonOrgUsername
  var checkPublicMembership: AnonParamsAnonOrgUsername
  var concealMembership: AnonParamsAnonOrgUsername
  var convertMemberToOutsideCollaborator: AnonParamsAnonOrgUsername
  var createHook: AnonParamsAnonActive
  var createInvitation: AnonParamsAnonEmail
  var deleteHook: AnonParamsAnonHookid
  var get: AnonMethodStringParamsAnonOrgAnonRequired
  var getHook: AnonParamsAnonHookid
  var getMembership: AnonParamsAnonOrgUsername
  var getMembershipForAuthenticatedUser: AnonMethodStringParamsAnonOrgAnonRequired
  var list: AnonParamsAnonSince
  var listBlockedUsers: AnonMethodStringParamsAnonOrgAnonRequired
  var listForAuthenticatedUser: AnonParamsAnonPagePerpage
  var listForUser: AnonParamsAnonUsername
  var listHooks: AnonParamsAnonOrgPage
  var listInstallations: AnonMethodStringParamsAnonOrgPage
  var listInvitationTeams: AnonParamsAnonInvitationid
  var listMembers: AnonParamsAnonFilterOrg
  var listMemberships: AnonParamsAnonPerpageState
  var listOutsideCollaborators: AnonParamsAnonFilterOrgPage
  var listPendingInvitations: AnonParamsAnonOrgPage
  var listPublicMembers: AnonParamsAnonOrgPage
  var pingHook: AnonParamsAnonHookid
  var publicizeMembership: AnonParamsAnonOrgUsername
  var removeMember: AnonParamsAnonOrgUsername
  var removeMembership: AnonParamsAnonOrgUsername
  var removeOutsideCollaborator: AnonParamsAnonOrgUsername
  var unblockUser: AnonParamsAnonOrgUsername
  var update: AnonParamsAnonBillingemail
  var updateHook: AnonParamsAnonConfig
  var updateMembership: AnonParamsAnonOrgState
}

object AnonAddOrUpdateMembership {
  @scala.inline
  def apply(
    addOrUpdateMembership: AnonParamsAnonRole,
    blockUser: AnonParamsAnonOrgUsername,
    checkBlockedUser: AnonParamsAnonOrgUsername,
    checkMembership: AnonParamsAnonOrgUsername,
    checkPublicMembership: AnonParamsAnonOrgUsername,
    concealMembership: AnonParamsAnonOrgUsername,
    convertMemberToOutsideCollaborator: AnonParamsAnonOrgUsername,
    createHook: AnonParamsAnonActive,
    createInvitation: AnonParamsAnonEmail,
    deleteHook: AnonParamsAnonHookid,
    get: AnonMethodStringParamsAnonOrgAnonRequired,
    getHook: AnonParamsAnonHookid,
    getMembership: AnonParamsAnonOrgUsername,
    getMembershipForAuthenticatedUser: AnonMethodStringParamsAnonOrgAnonRequired,
    list: AnonParamsAnonSince,
    listBlockedUsers: AnonMethodStringParamsAnonOrgAnonRequired,
    listForAuthenticatedUser: AnonParamsAnonPagePerpage,
    listForUser: AnonParamsAnonUsername,
    listHooks: AnonParamsAnonOrgPage,
    listInstallations: AnonMethodStringParamsAnonOrgPage,
    listInvitationTeams: AnonParamsAnonInvitationid,
    listMembers: AnonParamsAnonFilterOrg,
    listMemberships: AnonParamsAnonPerpageState,
    listOutsideCollaborators: AnonParamsAnonFilterOrgPage,
    listPendingInvitations: AnonParamsAnonOrgPage,
    listPublicMembers: AnonParamsAnonOrgPage,
    pingHook: AnonParamsAnonHookid,
    publicizeMembership: AnonParamsAnonOrgUsername,
    removeMember: AnonParamsAnonOrgUsername,
    removeMembership: AnonParamsAnonOrgUsername,
    removeOutsideCollaborator: AnonParamsAnonOrgUsername,
    unblockUser: AnonParamsAnonOrgUsername,
    update: AnonParamsAnonBillingemail,
    updateHook: AnonParamsAnonConfig,
    updateMembership: AnonParamsAnonOrgState
  ): AnonAddOrUpdateMembership = {
    val __obj = js.Dynamic.literal(addOrUpdateMembership = addOrUpdateMembership.asInstanceOf[js.Any], blockUser = blockUser.asInstanceOf[js.Any], checkBlockedUser = checkBlockedUser.asInstanceOf[js.Any], checkMembership = checkMembership.asInstanceOf[js.Any], checkPublicMembership = checkPublicMembership.asInstanceOf[js.Any], concealMembership = concealMembership.asInstanceOf[js.Any], convertMemberToOutsideCollaborator = convertMemberToOutsideCollaborator.asInstanceOf[js.Any], createHook = createHook.asInstanceOf[js.Any], createInvitation = createInvitation.asInstanceOf[js.Any], deleteHook = deleteHook.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], getHook = getHook.asInstanceOf[js.Any], getMembership = getMembership.asInstanceOf[js.Any], getMembershipForAuthenticatedUser = getMembershipForAuthenticatedUser.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], listBlockedUsers = listBlockedUsers.asInstanceOf[js.Any], listForAuthenticatedUser = listForAuthenticatedUser.asInstanceOf[js.Any], listForUser = listForUser.asInstanceOf[js.Any], listHooks = listHooks.asInstanceOf[js.Any], listInstallations = listInstallations.asInstanceOf[js.Any], listInvitationTeams = listInvitationTeams.asInstanceOf[js.Any], listMembers = listMembers.asInstanceOf[js.Any], listMemberships = listMemberships.asInstanceOf[js.Any], listOutsideCollaborators = listOutsideCollaborators.asInstanceOf[js.Any], listPendingInvitations = listPendingInvitations.asInstanceOf[js.Any], listPublicMembers = listPublicMembers.asInstanceOf[js.Any], pingHook = pingHook.asInstanceOf[js.Any], publicizeMembership = publicizeMembership.asInstanceOf[js.Any], removeMember = removeMember.asInstanceOf[js.Any], removeMembership = removeMembership.asInstanceOf[js.Any], removeOutsideCollaborator = removeOutsideCollaborator.asInstanceOf[js.Any], unblockUser = unblockUser.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any], updateHook = updateHook.asInstanceOf[js.Any], updateMembership = updateMembership.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAddOrUpdateMembership]
  }
}

