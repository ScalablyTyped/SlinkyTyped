package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddOrUpdateMembership extends js.Object {
  var addOrUpdateMembership: ParamsRole = js.native
  var blockUser: ParamsOrgUsername = js.native
  var checkBlockedUser: ParamsOrgUsername = js.native
  var checkMembership: ParamsOrgUsername = js.native
  var checkPublicMembership: ParamsOrgUsername = js.native
  var concealMembership: ParamsOrgUsername = js.native
  var convertMemberToOutsideCollaborator: ParamsOrgUsername = js.native
  var createHook: ParamsActive = js.native
  var createInvitation: ParamsEmail = js.native
  var deleteHook: ParamsHookid = js.native
  var get: MethodStringParamsOrgRequired = js.native
  var getHook: ParamsHookid = js.native
  var getMembership: ParamsOrgUsername = js.native
  var getMembershipForAuthenticatedUser: MethodStringParamsOrgRequired = js.native
  var list: ParamsSince = js.native
  var listBlockedUsers: MethodStringParamsOrgRequired = js.native
  var listForAuthenticatedUser: ParamsPagePerpage = js.native
  var listForUser: ParamsUsername = js.native
  var listHooks: ParamsOrgPage = js.native
  var listInstallations: MethodStringParamsOrgPage = js.native
  var listInvitationTeams: ParamsInvitationid = js.native
  var listMembers: ParamsFilterOrg = js.native
  var listMemberships: ParamsPerpageState = js.native
  var listOutsideCollaborators: ParamsFilterOrgPage = js.native
  var listPendingInvitations: ParamsOrgPage = js.native
  var listPublicMembers: ParamsOrgPage = js.native
  var pingHook: ParamsHookid = js.native
  var publicizeMembership: ParamsOrgUsername = js.native
  var removeMember: ParamsOrgUsername = js.native
  var removeMembership: ParamsOrgUsername = js.native
  var removeOutsideCollaborator: ParamsOrgUsername = js.native
  var unblockUser: ParamsOrgUsername = js.native
  var update: ParamsBillingemail = js.native
  var updateHook: ParamsConfig = js.native
  var updateMembership: ParamsOrgState = js.native
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
  @scala.inline
  implicit class AddOrUpdateMembershipOps[Self <: AddOrUpdateMembership] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddOrUpdateMembership(value: ParamsRole): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOrUpdateMembership")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlockUser(value: ParamsOrgUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckBlockedUser(value: ParamsOrgUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkBlockedUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckMembership(value: ParamsOrgUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkMembership")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckPublicMembership(value: ParamsOrgUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkPublicMembership")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConcealMembership(value: ParamsOrgUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concealMembership")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConvertMemberToOutsideCollaborator(value: ParamsOrgUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convertMemberToOutsideCollaborator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateHook(value: ParamsActive): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createHook")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateInvitation(value: ParamsEmail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createInvitation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteHook(value: ParamsHookid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteHook")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGet(value: MethodStringParamsOrgRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetHook(value: ParamsHookid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHook")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetMembership(value: ParamsOrgUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMembership")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetMembershipForAuthenticatedUser(value: MethodStringParamsOrgRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMembershipForAuthenticatedUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withList(value: ParamsSince): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListBlockedUsers(value: MethodStringParamsOrgRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listBlockedUsers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListForAuthenticatedUser(value: ParamsPagePerpage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listForAuthenticatedUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListForUser(value: ParamsUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listForUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListHooks(value: ParamsOrgPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listHooks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListInstallations(value: MethodStringParamsOrgPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listInstallations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListInvitationTeams(value: ParamsInvitationid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listInvitationTeams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListMembers(value: ParamsFilterOrg): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listMembers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListMemberships(value: ParamsPerpageState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listMemberships")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListOutsideCollaborators(value: ParamsFilterOrgPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listOutsideCollaborators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListPendingInvitations(value: ParamsOrgPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listPendingInvitations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListPublicMembers(value: ParamsOrgPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listPublicMembers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPingHook(value: ParamsHookid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pingHook")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublicizeMembership(value: ParamsOrgUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicizeMembership")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveMember(value: ParamsOrgUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeMember")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveMembership(value: ParamsOrgUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeMembership")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveOutsideCollaborator(value: ParamsOrgUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeOutsideCollaborator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnblockUser(value: ParamsOrgUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unblockUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdate(value: ParamsBillingemail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateHook(value: ParamsConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateHook")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateMembership(value: ParamsOrgState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateMembership")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

