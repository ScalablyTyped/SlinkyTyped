package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAddOrUpdateMembership extends js.Object {
  var addOrUpdateMembership: AnonParamsAnonRole = js.native
  var blockUser: AnonParamsAnonOrgUsername = js.native
  var checkBlockedUser: AnonParamsAnonOrgUsername = js.native
  var checkMembership: AnonParamsAnonOrgUsername = js.native
  var checkPublicMembership: AnonParamsAnonOrgUsername = js.native
  var concealMembership: AnonParamsAnonOrgUsername = js.native
  var convertMemberToOutsideCollaborator: AnonParamsAnonOrgUsername = js.native
  var createHook: AnonParamsAnonActive = js.native
  var createInvitation: AnonParamsAnonEmail = js.native
  var deleteHook: AnonParamsAnonHookid = js.native
  var get: AnonMethodStringParamsAnonOrgAnonRequired = js.native
  var getHook: AnonParamsAnonHookid = js.native
  var getMembership: AnonParamsAnonOrgUsername = js.native
  var getMembershipForAuthenticatedUser: AnonMethodStringParamsAnonOrgAnonRequired = js.native
  var list: AnonParamsAnonSince = js.native
  var listBlockedUsers: AnonMethodStringParamsAnonOrgAnonRequired = js.native
  var listForAuthenticatedUser: AnonParamsAnonPagePerpage = js.native
  var listForUser: AnonParamsAnonUsername = js.native
  var listHooks: AnonParamsAnonOrgPage = js.native
  var listInstallations: AnonMethodStringParamsAnonOrgPage = js.native
  var listInvitationTeams: AnonParamsAnonInvitationid = js.native
  var listMembers: AnonParamsAnonFilterOrg = js.native
  var listMemberships: AnonParamsAnonPerpageState = js.native
  var listOutsideCollaborators: AnonParamsAnonFilterOrgPage = js.native
  var listPendingInvitations: AnonParamsAnonOrgPage = js.native
  var listPublicMembers: AnonParamsAnonOrgPage = js.native
  var pingHook: AnonParamsAnonHookid = js.native
  var publicizeMembership: AnonParamsAnonOrgUsername = js.native
  var removeMember: AnonParamsAnonOrgUsername = js.native
  var removeMembership: AnonParamsAnonOrgUsername = js.native
  var removeOutsideCollaborator: AnonParamsAnonOrgUsername = js.native
  var unblockUser: AnonParamsAnonOrgUsername = js.native
  var update: AnonParamsAnonBillingemail = js.native
  var updateHook: AnonParamsAnonConfig = js.native
  var updateMembership: AnonParamsAnonOrgState = js.native
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
  @scala.inline
  implicit class AnonAddOrUpdateMembershipOps[Self <: AnonAddOrUpdateMembership] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddOrUpdateMembership(value: AnonParamsAnonRole): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOrUpdateMembership")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlockUser(value: AnonParamsAnonOrgUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckBlockedUser(value: AnonParamsAnonOrgUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkBlockedUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckMembership(value: AnonParamsAnonOrgUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkMembership")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckPublicMembership(value: AnonParamsAnonOrgUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkPublicMembership")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConcealMembership(value: AnonParamsAnonOrgUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concealMembership")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConvertMemberToOutsideCollaborator(value: AnonParamsAnonOrgUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convertMemberToOutsideCollaborator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateHook(value: AnonParamsAnonActive): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createHook")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateInvitation(value: AnonParamsAnonEmail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createInvitation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteHook(value: AnonParamsAnonHookid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteHook")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGet(value: AnonMethodStringParamsAnonOrgAnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetHook(value: AnonParamsAnonHookid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHook")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetMembership(value: AnonParamsAnonOrgUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMembership")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetMembershipForAuthenticatedUser(value: AnonMethodStringParamsAnonOrgAnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMembershipForAuthenticatedUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withList(value: AnonParamsAnonSince): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListBlockedUsers(value: AnonMethodStringParamsAnonOrgAnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listBlockedUsers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListForAuthenticatedUser(value: AnonParamsAnonPagePerpage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listForAuthenticatedUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListForUser(value: AnonParamsAnonUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listForUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListHooks(value: AnonParamsAnonOrgPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listHooks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListInstallations(value: AnonMethodStringParamsAnonOrgPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listInstallations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListInvitationTeams(value: AnonParamsAnonInvitationid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listInvitationTeams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListMembers(value: AnonParamsAnonFilterOrg): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listMembers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListMemberships(value: AnonParamsAnonPerpageState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listMemberships")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListOutsideCollaborators(value: AnonParamsAnonFilterOrgPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listOutsideCollaborators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListPendingInvitations(value: AnonParamsAnonOrgPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listPendingInvitations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListPublicMembers(value: AnonParamsAnonOrgPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listPublicMembers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPingHook(value: AnonParamsAnonHookid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pingHook")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublicizeMembership(value: AnonParamsAnonOrgUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicizeMembership")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveMember(value: AnonParamsAnonOrgUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeMember")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveMembership(value: AnonParamsAnonOrgUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeMembership")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveOutsideCollaborator(value: AnonParamsAnonOrgUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeOutsideCollaborator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnblockUser(value: AnonParamsAnonOrgUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unblockUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdate(value: AnonParamsAnonBillingemail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateHook(value: AnonParamsAnonConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateHook")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateMembership(value: AnonParamsAnonOrgState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateMembership")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

