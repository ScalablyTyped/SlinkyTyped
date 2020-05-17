package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddMember extends js.Object {
  var addMember: ParamsTeamidUsername = js.native
  var addMemberLegacy: ParamsTeamidUsername = js.native
  var addOrUpdateMembership: ParamsRoleTeamid = js.native
  var addOrUpdateMembershipInOrg: ParamsOrgRole = js.native
  var addOrUpdateMembershipLegacy: ParamsRoleTeamid = js.native
  var addOrUpdateProject: ParamsPermissionProjectid = js.native
  var addOrUpdateProjectInOrg: ParamsOrgPermission = js.native
  var addOrUpdateProjectLegacy: ParamsPermissionProjectid = js.native
  var addOrUpdateRepo: ParamsPermissionRepo = js.native
  var addOrUpdateRepoInOrg: ParamsOrgOwner = js.native
  var addOrUpdateRepoLegacy: ParamsPermissionRepo = js.native
  var checkManagesRepo: ParamsRepoTeamid = js.native
  var checkManagesRepoInOrg: ParamsRepoTeamslug = js.native
  var checkManagesRepoLegacy: ParamsRepoTeamid = js.native
  var create: ParamsMaintainers = js.native
  var createDiscussion: ParamsBodyPrivate = js.native
  var createDiscussionComment: ParamsBodyDiscussionnumber = js.native
  var createDiscussionCommentInOrg: ParamsOrgTeamslug = js.native
  var createDiscussionCommentLegacy: ParamsBodyDiscussionnumber = js.native
  var createDiscussionInOrg: ParamsBodyOrg = js.native
  var createDiscussionLegacy: ParamsBodyPrivate = js.native
  var delete: ParamsTeamidRequired = js.native
  var deleteDiscussion: ParamsDiscussionnumberTeamid = js.native
  var deleteDiscussionComment: ParamsCommentnumberDiscussionnumber = js.native
  var deleteDiscussionCommentInOrg: ParamsCommentnumberDiscussionnumberOrg = js.native
  var deleteDiscussionCommentLegacy: ParamsCommentnumberDiscussionnumber = js.native
  var deleteDiscussionInOrg: ParamsDiscussionnumberOrgTeamslug = js.native
  var deleteDiscussionLegacy: ParamsDiscussionnumberTeamid = js.native
  var deleteInOrg: ParamsTeamslugRequired = js.native
  var deleteLegacy: ParamsTeamidRequired = js.native
  var get: ParamsTeamidRequired = js.native
  var getByName: ParamsTeamslugRequired = js.native
  var getDiscussion: ParamsDiscussionnumberTeamid = js.native
  var getDiscussionComment: ParamsCommentnumberDiscussionnumber = js.native
  var getDiscussionCommentInOrg: ParamsCommentnumberDiscussionnumberOrg = js.native
  var getDiscussionCommentLegacy: ParamsCommentnumberDiscussionnumber = js.native
  var getDiscussionInOrg: ParamsDiscussionnumberOrgTeamslug = js.native
  var getDiscussionLegacy: ParamsDiscussionnumberTeamid = js.native
  var getLegacy: ParamsTeamidRequired = js.native
  var getMember: ParamsTeamidUsername = js.native
  var getMemberLegacy: ParamsTeamidUsername = js.native
  var getMembership: ParamsTeamidUsername = js.native
  var getMembershipInOrg: ParamsTeamslugUsername = js.native
  var getMembershipLegacy: ParamsTeamidUsername = js.native
  var list: ParamsOrgPage = js.native
  var listChild: ParamsPerpageTeamid = js.native
  var listChildInOrg: ParamsPagePerpageTeamslug = js.native
  var listChildLegacy: ParamsPerpageTeamid = js.native
  var listDiscussionComments: ParamsDirectionDiscussionnumber = js.native
  var listDiscussionCommentsInOrg: ParamsDirectionDiscussionnumberOrg = js.native
  var listDiscussionCommentsLegacy: ParamsDirectionDiscussionnumber = js.native
  var listDiscussions: ParamsDirectionPagePerpage = js.native
  var listDiscussionsInOrg: ParamsDirectionOrgPage = js.native
  var listDiscussionsLegacy: ParamsDirectionPagePerpage = js.native
  var listForAuthenticatedUser: ParamsPagePerpage = js.native
  var listMembers: ParamsPerpageRole = js.native
  var listMembersInOrg: ParamsRoleTeamslug = js.native
  var listMembersLegacy: ParamsPerpageRole = js.native
  var listPendingInvitations: ParamsPerpageTeamid = js.native
  var listPendingInvitationsInOrg: ParamsPagePerpageTeamslug = js.native
  var listPendingInvitationsLegacy: ParamsPerpageTeamid = js.native
  var listProjects: MethodStringParamsPerpageTeamid = js.native
  var listProjectsInOrg: MethodStringParamsPagePerpageTeamslug = js.native
  var listProjectsLegacy: MethodStringParamsPerpageTeamid = js.native
  var listRepos: ParamsPerpageTeamid = js.native
  var listReposInOrg: ParamsPagePerpageTeamslug = js.native
  var listReposLegacy: ParamsPerpageTeamid = js.native
  var removeMember: ParamsTeamidUsername = js.native
  var removeMemberLegacy: ParamsTeamidUsername = js.native
  var removeMembership: ParamsTeamidUsername = js.native
  var removeMembershipInOrg: ParamsTeamslugUsername = js.native
  var removeMembershipLegacy: ParamsTeamidUsername = js.native
  var removeProject: ParamsProjectidTeamid = js.native
  var removeProjectInOrg: ParamsOrgProjectid = js.native
  var removeProjectLegacy: ParamsProjectidTeamid = js.native
  var removeRepo: ParamsRepoTeamid = js.native
  var removeRepoInOrg: ParamsRepoTeamslug = js.native
  var removeRepoLegacy: ParamsRepoTeamid = js.native
  var reviewProject: MethodStringParamsProjectidTeamid = js.native
  var reviewProjectInOrg: MethodStringParamsOrgProjectid = js.native
  var reviewProjectLegacy: MethodStringParamsProjectidTeamid = js.native
  var update: ParamsParentteamid = js.native
  var updateDiscussion: ParamsTeamidTitle = js.native
  var updateDiscussionComment: ParamsBodyCommentnumber = js.native
  var updateDiscussionCommentInOrg: ParamsBodyCommentnumberDiscussionnumber = js.native
  var updateDiscussionCommentLegacy: ParamsBodyCommentnumber = js.native
  var updateDiscussionInOrg: ParamsTeamslugTitle = js.native
  var updateDiscussionLegacy: ParamsTeamidTitle = js.native
  var updateInOrg: ParamsPrivacy = js.native
  var updateLegacy: ParamsParentteamid = js.native
}

object AddMember {
  @scala.inline
  def apply(
    addMember: ParamsTeamidUsername,
    addMemberLegacy: ParamsTeamidUsername,
    addOrUpdateMembership: ParamsRoleTeamid,
    addOrUpdateMembershipInOrg: ParamsOrgRole,
    addOrUpdateMembershipLegacy: ParamsRoleTeamid,
    addOrUpdateProject: ParamsPermissionProjectid,
    addOrUpdateProjectInOrg: ParamsOrgPermission,
    addOrUpdateProjectLegacy: ParamsPermissionProjectid,
    addOrUpdateRepo: ParamsPermissionRepo,
    addOrUpdateRepoInOrg: ParamsOrgOwner,
    addOrUpdateRepoLegacy: ParamsPermissionRepo,
    checkManagesRepo: ParamsRepoTeamid,
    checkManagesRepoInOrg: ParamsRepoTeamslug,
    checkManagesRepoLegacy: ParamsRepoTeamid,
    create: ParamsMaintainers,
    createDiscussion: ParamsBodyPrivate,
    createDiscussionComment: ParamsBodyDiscussionnumber,
    createDiscussionCommentInOrg: ParamsOrgTeamslug,
    createDiscussionCommentLegacy: ParamsBodyDiscussionnumber,
    createDiscussionInOrg: ParamsBodyOrg,
    createDiscussionLegacy: ParamsBodyPrivate,
    delete: ParamsTeamidRequired,
    deleteDiscussion: ParamsDiscussionnumberTeamid,
    deleteDiscussionComment: ParamsCommentnumberDiscussionnumber,
    deleteDiscussionCommentInOrg: ParamsCommentnumberDiscussionnumberOrg,
    deleteDiscussionCommentLegacy: ParamsCommentnumberDiscussionnumber,
    deleteDiscussionInOrg: ParamsDiscussionnumberOrgTeamslug,
    deleteDiscussionLegacy: ParamsDiscussionnumberTeamid,
    deleteInOrg: ParamsTeamslugRequired,
    deleteLegacy: ParamsTeamidRequired,
    get: ParamsTeamidRequired,
    getByName: ParamsTeamslugRequired,
    getDiscussion: ParamsDiscussionnumberTeamid,
    getDiscussionComment: ParamsCommentnumberDiscussionnumber,
    getDiscussionCommentInOrg: ParamsCommentnumberDiscussionnumberOrg,
    getDiscussionCommentLegacy: ParamsCommentnumberDiscussionnumber,
    getDiscussionInOrg: ParamsDiscussionnumberOrgTeamslug,
    getDiscussionLegacy: ParamsDiscussionnumberTeamid,
    getLegacy: ParamsTeamidRequired,
    getMember: ParamsTeamidUsername,
    getMemberLegacy: ParamsTeamidUsername,
    getMembership: ParamsTeamidUsername,
    getMembershipInOrg: ParamsTeamslugUsername,
    getMembershipLegacy: ParamsTeamidUsername,
    list: ParamsOrgPage,
    listChild: ParamsPerpageTeamid,
    listChildInOrg: ParamsPagePerpageTeamslug,
    listChildLegacy: ParamsPerpageTeamid,
    listDiscussionComments: ParamsDirectionDiscussionnumber,
    listDiscussionCommentsInOrg: ParamsDirectionDiscussionnumberOrg,
    listDiscussionCommentsLegacy: ParamsDirectionDiscussionnumber,
    listDiscussions: ParamsDirectionPagePerpage,
    listDiscussionsInOrg: ParamsDirectionOrgPage,
    listDiscussionsLegacy: ParamsDirectionPagePerpage,
    listForAuthenticatedUser: ParamsPagePerpage,
    listMembers: ParamsPerpageRole,
    listMembersInOrg: ParamsRoleTeamslug,
    listMembersLegacy: ParamsPerpageRole,
    listPendingInvitations: ParamsPerpageTeamid,
    listPendingInvitationsInOrg: ParamsPagePerpageTeamslug,
    listPendingInvitationsLegacy: ParamsPerpageTeamid,
    listProjects: MethodStringParamsPerpageTeamid,
    listProjectsInOrg: MethodStringParamsPagePerpageTeamslug,
    listProjectsLegacy: MethodStringParamsPerpageTeamid,
    listRepos: ParamsPerpageTeamid,
    listReposInOrg: ParamsPagePerpageTeamslug,
    listReposLegacy: ParamsPerpageTeamid,
    removeMember: ParamsTeamidUsername,
    removeMemberLegacy: ParamsTeamidUsername,
    removeMembership: ParamsTeamidUsername,
    removeMembershipInOrg: ParamsTeamslugUsername,
    removeMembershipLegacy: ParamsTeamidUsername,
    removeProject: ParamsProjectidTeamid,
    removeProjectInOrg: ParamsOrgProjectid,
    removeProjectLegacy: ParamsProjectidTeamid,
    removeRepo: ParamsRepoTeamid,
    removeRepoInOrg: ParamsRepoTeamslug,
    removeRepoLegacy: ParamsRepoTeamid,
    reviewProject: MethodStringParamsProjectidTeamid,
    reviewProjectInOrg: MethodStringParamsOrgProjectid,
    reviewProjectLegacy: MethodStringParamsProjectidTeamid,
    update: ParamsParentteamid,
    updateDiscussion: ParamsTeamidTitle,
    updateDiscussionComment: ParamsBodyCommentnumber,
    updateDiscussionCommentInOrg: ParamsBodyCommentnumberDiscussionnumber,
    updateDiscussionCommentLegacy: ParamsBodyCommentnumber,
    updateDiscussionInOrg: ParamsTeamslugTitle,
    updateDiscussionLegacy: ParamsTeamidTitle,
    updateInOrg: ParamsPrivacy,
    updateLegacy: ParamsParentteamid
  ): AddMember = {
    val __obj = js.Dynamic.literal(addMember = addMember.asInstanceOf[js.Any], addMemberLegacy = addMemberLegacy.asInstanceOf[js.Any], addOrUpdateMembership = addOrUpdateMembership.asInstanceOf[js.Any], addOrUpdateMembershipInOrg = addOrUpdateMembershipInOrg.asInstanceOf[js.Any], addOrUpdateMembershipLegacy = addOrUpdateMembershipLegacy.asInstanceOf[js.Any], addOrUpdateProject = addOrUpdateProject.asInstanceOf[js.Any], addOrUpdateProjectInOrg = addOrUpdateProjectInOrg.asInstanceOf[js.Any], addOrUpdateProjectLegacy = addOrUpdateProjectLegacy.asInstanceOf[js.Any], addOrUpdateRepo = addOrUpdateRepo.asInstanceOf[js.Any], addOrUpdateRepoInOrg = addOrUpdateRepoInOrg.asInstanceOf[js.Any], addOrUpdateRepoLegacy = addOrUpdateRepoLegacy.asInstanceOf[js.Any], checkManagesRepo = checkManagesRepo.asInstanceOf[js.Any], checkManagesRepoInOrg = checkManagesRepoInOrg.asInstanceOf[js.Any], checkManagesRepoLegacy = checkManagesRepoLegacy.asInstanceOf[js.Any], create = create.asInstanceOf[js.Any], createDiscussion = createDiscussion.asInstanceOf[js.Any], createDiscussionComment = createDiscussionComment.asInstanceOf[js.Any], createDiscussionCommentInOrg = createDiscussionCommentInOrg.asInstanceOf[js.Any], createDiscussionCommentLegacy = createDiscussionCommentLegacy.asInstanceOf[js.Any], createDiscussionInOrg = createDiscussionInOrg.asInstanceOf[js.Any], createDiscussionLegacy = createDiscussionLegacy.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], deleteDiscussion = deleteDiscussion.asInstanceOf[js.Any], deleteDiscussionComment = deleteDiscussionComment.asInstanceOf[js.Any], deleteDiscussionCommentInOrg = deleteDiscussionCommentInOrg.asInstanceOf[js.Any], deleteDiscussionCommentLegacy = deleteDiscussionCommentLegacy.asInstanceOf[js.Any], deleteDiscussionInOrg = deleteDiscussionInOrg.asInstanceOf[js.Any], deleteDiscussionLegacy = deleteDiscussionLegacy.asInstanceOf[js.Any], deleteInOrg = deleteInOrg.asInstanceOf[js.Any], deleteLegacy = deleteLegacy.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], getByName = getByName.asInstanceOf[js.Any], getDiscussion = getDiscussion.asInstanceOf[js.Any], getDiscussionComment = getDiscussionComment.asInstanceOf[js.Any], getDiscussionCommentInOrg = getDiscussionCommentInOrg.asInstanceOf[js.Any], getDiscussionCommentLegacy = getDiscussionCommentLegacy.asInstanceOf[js.Any], getDiscussionInOrg = getDiscussionInOrg.asInstanceOf[js.Any], getDiscussionLegacy = getDiscussionLegacy.asInstanceOf[js.Any], getLegacy = getLegacy.asInstanceOf[js.Any], getMember = getMember.asInstanceOf[js.Any], getMemberLegacy = getMemberLegacy.asInstanceOf[js.Any], getMembership = getMembership.asInstanceOf[js.Any], getMembershipInOrg = getMembershipInOrg.asInstanceOf[js.Any], getMembershipLegacy = getMembershipLegacy.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], listChild = listChild.asInstanceOf[js.Any], listChildInOrg = listChildInOrg.asInstanceOf[js.Any], listChildLegacy = listChildLegacy.asInstanceOf[js.Any], listDiscussionComments = listDiscussionComments.asInstanceOf[js.Any], listDiscussionCommentsInOrg = listDiscussionCommentsInOrg.asInstanceOf[js.Any], listDiscussionCommentsLegacy = listDiscussionCommentsLegacy.asInstanceOf[js.Any], listDiscussions = listDiscussions.asInstanceOf[js.Any], listDiscussionsInOrg = listDiscussionsInOrg.asInstanceOf[js.Any], listDiscussionsLegacy = listDiscussionsLegacy.asInstanceOf[js.Any], listForAuthenticatedUser = listForAuthenticatedUser.asInstanceOf[js.Any], listMembers = listMembers.asInstanceOf[js.Any], listMembersInOrg = listMembersInOrg.asInstanceOf[js.Any], listMembersLegacy = listMembersLegacy.asInstanceOf[js.Any], listPendingInvitations = listPendingInvitations.asInstanceOf[js.Any], listPendingInvitationsInOrg = listPendingInvitationsInOrg.asInstanceOf[js.Any], listPendingInvitationsLegacy = listPendingInvitationsLegacy.asInstanceOf[js.Any], listProjects = listProjects.asInstanceOf[js.Any], listProjectsInOrg = listProjectsInOrg.asInstanceOf[js.Any], listProjectsLegacy = listProjectsLegacy.asInstanceOf[js.Any], listRepos = listRepos.asInstanceOf[js.Any], listReposInOrg = listReposInOrg.asInstanceOf[js.Any], listReposLegacy = listReposLegacy.asInstanceOf[js.Any], removeMember = removeMember.asInstanceOf[js.Any], removeMemberLegacy = removeMemberLegacy.asInstanceOf[js.Any], removeMembership = removeMembership.asInstanceOf[js.Any], removeMembershipInOrg = removeMembershipInOrg.asInstanceOf[js.Any], removeMembershipLegacy = removeMembershipLegacy.asInstanceOf[js.Any], removeProject = removeProject.asInstanceOf[js.Any], removeProjectInOrg = removeProjectInOrg.asInstanceOf[js.Any], removeProjectLegacy = removeProjectLegacy.asInstanceOf[js.Any], removeRepo = removeRepo.asInstanceOf[js.Any], removeRepoInOrg = removeRepoInOrg.asInstanceOf[js.Any], removeRepoLegacy = removeRepoLegacy.asInstanceOf[js.Any], reviewProject = reviewProject.asInstanceOf[js.Any], reviewProjectInOrg = reviewProjectInOrg.asInstanceOf[js.Any], reviewProjectLegacy = reviewProjectLegacy.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any], updateDiscussion = updateDiscussion.asInstanceOf[js.Any], updateDiscussionComment = updateDiscussionComment.asInstanceOf[js.Any], updateDiscussionCommentInOrg = updateDiscussionCommentInOrg.asInstanceOf[js.Any], updateDiscussionCommentLegacy = updateDiscussionCommentLegacy.asInstanceOf[js.Any], updateDiscussionInOrg = updateDiscussionInOrg.asInstanceOf[js.Any], updateDiscussionLegacy = updateDiscussionLegacy.asInstanceOf[js.Any], updateInOrg = updateInOrg.asInstanceOf[js.Any], updateLegacy = updateLegacy.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddMember]
  }
  @scala.inline
  implicit class AddMemberOps[Self <: AddMember] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddMember(value: ParamsTeamidUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addMember")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddMemberLegacy(value: ParamsTeamidUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addMemberLegacy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddOrUpdateMembership(value: ParamsRoleTeamid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOrUpdateMembership")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddOrUpdateMembershipInOrg(value: ParamsOrgRole): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOrUpdateMembershipInOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddOrUpdateMembershipLegacy(value: ParamsRoleTeamid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOrUpdateMembershipLegacy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddOrUpdateProject(value: ParamsPermissionProjectid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOrUpdateProject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddOrUpdateProjectInOrg(value: ParamsOrgPermission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOrUpdateProjectInOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddOrUpdateProjectLegacy(value: ParamsPermissionProjectid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOrUpdateProjectLegacy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddOrUpdateRepo(value: ParamsPermissionRepo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOrUpdateRepo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddOrUpdateRepoInOrg(value: ParamsOrgOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOrUpdateRepoInOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddOrUpdateRepoLegacy(value: ParamsPermissionRepo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOrUpdateRepoLegacy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckManagesRepo(value: ParamsRepoTeamid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkManagesRepo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckManagesRepoInOrg(value: ParamsRepoTeamslug): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkManagesRepoInOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckManagesRepoLegacy(value: ParamsRepoTeamid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkManagesRepoLegacy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreate(value: ParamsMaintainers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateDiscussion(value: ParamsBodyPrivate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createDiscussion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateDiscussionComment(value: ParamsBodyDiscussionnumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createDiscussionComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateDiscussionCommentInOrg(value: ParamsOrgTeamslug): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createDiscussionCommentInOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateDiscussionCommentLegacy(value: ParamsBodyDiscussionnumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createDiscussionCommentLegacy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateDiscussionInOrg(value: ParamsBodyOrg): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createDiscussionInOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateDiscussionLegacy(value: ParamsBodyPrivate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createDiscussionLegacy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelete(value: ParamsTeamidRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteDiscussion(value: ParamsDiscussionnumberTeamid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteDiscussion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteDiscussionComment(value: ParamsCommentnumberDiscussionnumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteDiscussionComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteDiscussionCommentInOrg(value: ParamsCommentnumberDiscussionnumberOrg): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteDiscussionCommentInOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteDiscussionCommentLegacy(value: ParamsCommentnumberDiscussionnumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteDiscussionCommentLegacy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteDiscussionInOrg(value: ParamsDiscussionnumberOrgTeamslug): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteDiscussionInOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteDiscussionLegacy(value: ParamsDiscussionnumberTeamid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteDiscussionLegacy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteInOrg(value: ParamsTeamslugRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteInOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteLegacy(value: ParamsTeamidRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteLegacy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGet(value: ParamsTeamidRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetByName(value: ParamsTeamslugRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getByName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetDiscussion(value: ParamsDiscussionnumberTeamid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDiscussion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetDiscussionComment(value: ParamsCommentnumberDiscussionnumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDiscussionComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetDiscussionCommentInOrg(value: ParamsCommentnumberDiscussionnumberOrg): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDiscussionCommentInOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetDiscussionCommentLegacy(value: ParamsCommentnumberDiscussionnumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDiscussionCommentLegacy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetDiscussionInOrg(value: ParamsDiscussionnumberOrgTeamslug): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDiscussionInOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetDiscussionLegacy(value: ParamsDiscussionnumberTeamid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDiscussionLegacy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetLegacy(value: ParamsTeamidRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLegacy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetMember(value: ParamsTeamidUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMember")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetMemberLegacy(value: ParamsTeamidUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMemberLegacy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetMembership(value: ParamsTeamidUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMembership")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetMembershipInOrg(value: ParamsTeamslugUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMembershipInOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetMembershipLegacy(value: ParamsTeamidUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMembershipLegacy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withList(value: ParamsOrgPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListChild(value: ParamsPerpageTeamid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listChild")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListChildInOrg(value: ParamsPagePerpageTeamslug): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listChildInOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListChildLegacy(value: ParamsPerpageTeamid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listChildLegacy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListDiscussionComments(value: ParamsDirectionDiscussionnumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listDiscussionComments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListDiscussionCommentsInOrg(value: ParamsDirectionDiscussionnumberOrg): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listDiscussionCommentsInOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListDiscussionCommentsLegacy(value: ParamsDirectionDiscussionnumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listDiscussionCommentsLegacy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListDiscussions(value: ParamsDirectionPagePerpage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listDiscussions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListDiscussionsInOrg(value: ParamsDirectionOrgPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listDiscussionsInOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListDiscussionsLegacy(value: ParamsDirectionPagePerpage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listDiscussionsLegacy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListForAuthenticatedUser(value: ParamsPagePerpage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listForAuthenticatedUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListMembers(value: ParamsPerpageRole): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listMembers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListMembersInOrg(value: ParamsRoleTeamslug): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listMembersInOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListMembersLegacy(value: ParamsPerpageRole): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listMembersLegacy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListPendingInvitations(value: ParamsPerpageTeamid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listPendingInvitations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListPendingInvitationsInOrg(value: ParamsPagePerpageTeamslug): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listPendingInvitationsInOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListPendingInvitationsLegacy(value: ParamsPerpageTeamid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listPendingInvitationsLegacy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListProjects(value: MethodStringParamsPerpageTeamid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listProjects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListProjectsInOrg(value: MethodStringParamsPagePerpageTeamslug): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listProjectsInOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListProjectsLegacy(value: MethodStringParamsPerpageTeamid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listProjectsLegacy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListRepos(value: ParamsPerpageTeamid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listRepos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListReposInOrg(value: ParamsPagePerpageTeamslug): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listReposInOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListReposLegacy(value: ParamsPerpageTeamid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listReposLegacy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveMember(value: ParamsTeamidUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeMember")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveMemberLegacy(value: ParamsTeamidUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeMemberLegacy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveMembership(value: ParamsTeamidUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeMembership")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveMembershipInOrg(value: ParamsTeamslugUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeMembershipInOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveMembershipLegacy(value: ParamsTeamidUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeMembershipLegacy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveProject(value: ParamsProjectidTeamid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeProject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveProjectInOrg(value: ParamsOrgProjectid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeProjectInOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveProjectLegacy(value: ParamsProjectidTeamid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeProjectLegacy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveRepo(value: ParamsRepoTeamid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeRepo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveRepoInOrg(value: ParamsRepoTeamslug): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeRepoInOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveRepoLegacy(value: ParamsRepoTeamid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeRepoLegacy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReviewProject(value: MethodStringParamsProjectidTeamid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reviewProject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReviewProjectInOrg(value: MethodStringParamsOrgProjectid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reviewProjectInOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReviewProjectLegacy(value: MethodStringParamsProjectidTeamid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reviewProjectLegacy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdate(value: ParamsParentteamid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateDiscussion(value: ParamsTeamidTitle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateDiscussion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateDiscussionComment(value: ParamsBodyCommentnumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateDiscussionComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateDiscussionCommentInOrg(value: ParamsBodyCommentnumberDiscussionnumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateDiscussionCommentInOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateDiscussionCommentLegacy(value: ParamsBodyCommentnumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateDiscussionCommentLegacy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateDiscussionInOrg(value: ParamsTeamslugTitle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateDiscussionInOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateDiscussionLegacy(value: ParamsTeamidTitle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateDiscussionLegacy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateInOrg(value: ParamsPrivacy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateInOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateLegacy(value: ParamsParentteamid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateLegacy")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

