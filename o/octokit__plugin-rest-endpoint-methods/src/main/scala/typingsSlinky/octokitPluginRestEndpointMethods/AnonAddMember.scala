package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAddMember extends js.Object {
  var addMember: AnonParamsAnonTeamidUsername = js.native
  var addMemberLegacy: AnonParamsAnonTeamidUsername = js.native
  var addOrUpdateMembership: AnonParamsAnonRoleTeamid = js.native
  var addOrUpdateMembershipInOrg: AnonParamsAnonOrgRole = js.native
  var addOrUpdateMembershipLegacy: AnonParamsAnonRoleTeamid = js.native
  var addOrUpdateProject: AnonParamsAnonPermissionProjectid = js.native
  var addOrUpdateProjectInOrg: AnonParamsAnonOrgPermission = js.native
  var addOrUpdateProjectLegacy: AnonParamsAnonPermissionProjectid = js.native
  var addOrUpdateRepo: AnonParamsAnonPermissionRepo = js.native
  var addOrUpdateRepoInOrg: AnonParamsAnonOrgOwner = js.native
  var addOrUpdateRepoLegacy: AnonParamsAnonPermissionRepo = js.native
  var checkManagesRepo: AnonParamsAnonRepoTeamid = js.native
  var checkManagesRepoInOrg: AnonParamsAnonRepoTeamslug = js.native
  var checkManagesRepoLegacy: AnonParamsAnonRepoTeamid = js.native
  var create: AnonParamsAnonMaintainers = js.native
  var createDiscussion: AnonParamsAnonBodyPrivate = js.native
  var createDiscussionComment: AnonParamsAnonBodyDiscussionnumber = js.native
  var createDiscussionCommentInOrg: AnonParamsAnonOrgTeamslug = js.native
  var createDiscussionCommentLegacy: AnonParamsAnonBodyDiscussionnumber = js.native
  var createDiscussionInOrg: AnonParamsAnonBodyOrg = js.native
  var createDiscussionLegacy: AnonParamsAnonBodyPrivate = js.native
  var delete: AnonParamsAnonTeamidAnonRequired = js.native
  var deleteDiscussion: AnonParamsAnonDiscussionnumberTeamid = js.native
  var deleteDiscussionComment: AnonParamsAnonCommentnumberDiscussionnumber = js.native
  var deleteDiscussionCommentInOrg: AnonParamsAnonCommentnumberDiscussionnumberOrg = js.native
  var deleteDiscussionCommentLegacy: AnonParamsAnonCommentnumberDiscussionnumber = js.native
  var deleteDiscussionInOrg: AnonParamsAnonDiscussionnumberOrgTeamslug = js.native
  var deleteDiscussionLegacy: AnonParamsAnonDiscussionnumberTeamid = js.native
  var deleteInOrg: AnonParamsAnonTeamslugAnonRequired = js.native
  var deleteLegacy: AnonParamsAnonTeamidAnonRequired = js.native
  var get: AnonParamsAnonTeamidAnonRequired = js.native
  var getByName: AnonParamsAnonTeamslugAnonRequired = js.native
  var getDiscussion: AnonParamsAnonDiscussionnumberTeamid = js.native
  var getDiscussionComment: AnonParamsAnonCommentnumberDiscussionnumber = js.native
  var getDiscussionCommentInOrg: AnonParamsAnonCommentnumberDiscussionnumberOrg = js.native
  var getDiscussionCommentLegacy: AnonParamsAnonCommentnumberDiscussionnumber = js.native
  var getDiscussionInOrg: AnonParamsAnonDiscussionnumberOrgTeamslug = js.native
  var getDiscussionLegacy: AnonParamsAnonDiscussionnumberTeamid = js.native
  var getLegacy: AnonParamsAnonTeamidAnonRequired = js.native
  var getMember: AnonParamsAnonTeamidUsername = js.native
  var getMemberLegacy: AnonParamsAnonTeamidUsername = js.native
  var getMembership: AnonParamsAnonTeamidUsername = js.native
  var getMembershipInOrg: AnonParamsAnonTeamslugUsername = js.native
  var getMembershipLegacy: AnonParamsAnonTeamidUsername = js.native
  var list: AnonParamsAnonOrgPage = js.native
  var listChild: AnonParamsAnonPerpageTeamid = js.native
  var listChildInOrg: AnonParamsAnonPagePerpageTeamslug = js.native
  var listChildLegacy: AnonParamsAnonPerpageTeamid = js.native
  var listDiscussionComments: AnonParamsAnonDirectionDiscussionnumber = js.native
  var listDiscussionCommentsInOrg: AnonParamsAnonDirectionDiscussionnumberOrg = js.native
  var listDiscussionCommentsLegacy: AnonParamsAnonDirectionDiscussionnumber = js.native
  var listDiscussions: AnonParamsAnonDirectionPagePerpage = js.native
  var listDiscussionsInOrg: AnonParamsAnonDirectionOrgPage = js.native
  var listDiscussionsLegacy: AnonParamsAnonDirectionPagePerpage = js.native
  var listForAuthenticatedUser: AnonParamsAnonPagePerpage = js.native
  var listMembers: AnonParamsAnonPerpageRole = js.native
  var listMembersInOrg: AnonParamsAnonRoleTeamslug = js.native
  var listMembersLegacy: AnonParamsAnonPerpageRole = js.native
  var listPendingInvitations: AnonParamsAnonPerpageTeamid = js.native
  var listPendingInvitationsInOrg: AnonParamsAnonPagePerpageTeamslug = js.native
  var listPendingInvitationsLegacy: AnonParamsAnonPerpageTeamid = js.native
  var listProjects: AnonMethodStringParamsAnonPerpageTeamid = js.native
  var listProjectsInOrg: AnonMethodStringParamsAnonPagePerpageTeamslug = js.native
  var listProjectsLegacy: AnonMethodStringParamsAnonPerpageTeamid = js.native
  var listRepos: AnonParamsAnonPerpageTeamid = js.native
  var listReposInOrg: AnonParamsAnonPagePerpageTeamslug = js.native
  var listReposLegacy: AnonParamsAnonPerpageTeamid = js.native
  var removeMember: AnonParamsAnonTeamidUsername = js.native
  var removeMemberLegacy: AnonParamsAnonTeamidUsername = js.native
  var removeMembership: AnonParamsAnonTeamidUsername = js.native
  var removeMembershipInOrg: AnonParamsAnonTeamslugUsername = js.native
  var removeMembershipLegacy: AnonParamsAnonTeamidUsername = js.native
  var removeProject: AnonParamsAnonProjectidTeamid = js.native
  var removeProjectInOrg: AnonParamsAnonOrgProjectid = js.native
  var removeProjectLegacy: AnonParamsAnonProjectidTeamid = js.native
  var removeRepo: AnonParamsAnonRepoTeamid = js.native
  var removeRepoInOrg: AnonParamsAnonRepoTeamslug = js.native
  var removeRepoLegacy: AnonParamsAnonRepoTeamid = js.native
  var reviewProject: AnonMethodStringParamsAnonProjectidTeamid = js.native
  var reviewProjectInOrg: AnonMethodStringParamsAnonOrgProjectid = js.native
  var reviewProjectLegacy: AnonMethodStringParamsAnonProjectidTeamid = js.native
  var update: AnonParamsAnonParentteamid = js.native
  var updateDiscussion: AnonParamsAnonTeamidTitle = js.native
  var updateDiscussionComment: AnonParamsAnonBodyCommentnumber = js.native
  var updateDiscussionCommentInOrg: AnonParamsAnonBodyCommentnumberDiscussionnumber = js.native
  var updateDiscussionCommentLegacy: AnonParamsAnonBodyCommentnumber = js.native
  var updateDiscussionInOrg: AnonParamsAnonTeamslugTitle = js.native
  var updateDiscussionLegacy: AnonParamsAnonTeamidTitle = js.native
  var updateInOrg: AnonParamsAnonPrivacy = js.native
  var updateLegacy: AnonParamsAnonParentteamid = js.native
}

object AnonAddMember {
  @scala.inline
  def apply(
    addMember: AnonParamsAnonTeamidUsername,
    addMemberLegacy: AnonParamsAnonTeamidUsername,
    addOrUpdateMembership: AnonParamsAnonRoleTeamid,
    addOrUpdateMembershipInOrg: AnonParamsAnonOrgRole,
    addOrUpdateMembershipLegacy: AnonParamsAnonRoleTeamid,
    addOrUpdateProject: AnonParamsAnonPermissionProjectid,
    addOrUpdateProjectInOrg: AnonParamsAnonOrgPermission,
    addOrUpdateProjectLegacy: AnonParamsAnonPermissionProjectid,
    addOrUpdateRepo: AnonParamsAnonPermissionRepo,
    addOrUpdateRepoInOrg: AnonParamsAnonOrgOwner,
    addOrUpdateRepoLegacy: AnonParamsAnonPermissionRepo,
    checkManagesRepo: AnonParamsAnonRepoTeamid,
    checkManagesRepoInOrg: AnonParamsAnonRepoTeamslug,
    checkManagesRepoLegacy: AnonParamsAnonRepoTeamid,
    create: AnonParamsAnonMaintainers,
    createDiscussion: AnonParamsAnonBodyPrivate,
    createDiscussionComment: AnonParamsAnonBodyDiscussionnumber,
    createDiscussionCommentInOrg: AnonParamsAnonOrgTeamslug,
    createDiscussionCommentLegacy: AnonParamsAnonBodyDiscussionnumber,
    createDiscussionInOrg: AnonParamsAnonBodyOrg,
    createDiscussionLegacy: AnonParamsAnonBodyPrivate,
    delete: AnonParamsAnonTeamidAnonRequired,
    deleteDiscussion: AnonParamsAnonDiscussionnumberTeamid,
    deleteDiscussionComment: AnonParamsAnonCommentnumberDiscussionnumber,
    deleteDiscussionCommentInOrg: AnonParamsAnonCommentnumberDiscussionnumberOrg,
    deleteDiscussionCommentLegacy: AnonParamsAnonCommentnumberDiscussionnumber,
    deleteDiscussionInOrg: AnonParamsAnonDiscussionnumberOrgTeamslug,
    deleteDiscussionLegacy: AnonParamsAnonDiscussionnumberTeamid,
    deleteInOrg: AnonParamsAnonTeamslugAnonRequired,
    deleteLegacy: AnonParamsAnonTeamidAnonRequired,
    get: AnonParamsAnonTeamidAnonRequired,
    getByName: AnonParamsAnonTeamslugAnonRequired,
    getDiscussion: AnonParamsAnonDiscussionnumberTeamid,
    getDiscussionComment: AnonParamsAnonCommentnumberDiscussionnumber,
    getDiscussionCommentInOrg: AnonParamsAnonCommentnumberDiscussionnumberOrg,
    getDiscussionCommentLegacy: AnonParamsAnonCommentnumberDiscussionnumber,
    getDiscussionInOrg: AnonParamsAnonDiscussionnumberOrgTeamslug,
    getDiscussionLegacy: AnonParamsAnonDiscussionnumberTeamid,
    getLegacy: AnonParamsAnonTeamidAnonRequired,
    getMember: AnonParamsAnonTeamidUsername,
    getMemberLegacy: AnonParamsAnonTeamidUsername,
    getMembership: AnonParamsAnonTeamidUsername,
    getMembershipInOrg: AnonParamsAnonTeamslugUsername,
    getMembershipLegacy: AnonParamsAnonTeamidUsername,
    list: AnonParamsAnonOrgPage,
    listChild: AnonParamsAnonPerpageTeamid,
    listChildInOrg: AnonParamsAnonPagePerpageTeamslug,
    listChildLegacy: AnonParamsAnonPerpageTeamid,
    listDiscussionComments: AnonParamsAnonDirectionDiscussionnumber,
    listDiscussionCommentsInOrg: AnonParamsAnonDirectionDiscussionnumberOrg,
    listDiscussionCommentsLegacy: AnonParamsAnonDirectionDiscussionnumber,
    listDiscussions: AnonParamsAnonDirectionPagePerpage,
    listDiscussionsInOrg: AnonParamsAnonDirectionOrgPage,
    listDiscussionsLegacy: AnonParamsAnonDirectionPagePerpage,
    listForAuthenticatedUser: AnonParamsAnonPagePerpage,
    listMembers: AnonParamsAnonPerpageRole,
    listMembersInOrg: AnonParamsAnonRoleTeamslug,
    listMembersLegacy: AnonParamsAnonPerpageRole,
    listPendingInvitations: AnonParamsAnonPerpageTeamid,
    listPendingInvitationsInOrg: AnonParamsAnonPagePerpageTeamslug,
    listPendingInvitationsLegacy: AnonParamsAnonPerpageTeamid,
    listProjects: AnonMethodStringParamsAnonPerpageTeamid,
    listProjectsInOrg: AnonMethodStringParamsAnonPagePerpageTeamslug,
    listProjectsLegacy: AnonMethodStringParamsAnonPerpageTeamid,
    listRepos: AnonParamsAnonPerpageTeamid,
    listReposInOrg: AnonParamsAnonPagePerpageTeamslug,
    listReposLegacy: AnonParamsAnonPerpageTeamid,
    removeMember: AnonParamsAnonTeamidUsername,
    removeMemberLegacy: AnonParamsAnonTeamidUsername,
    removeMembership: AnonParamsAnonTeamidUsername,
    removeMembershipInOrg: AnonParamsAnonTeamslugUsername,
    removeMembershipLegacy: AnonParamsAnonTeamidUsername,
    removeProject: AnonParamsAnonProjectidTeamid,
    removeProjectInOrg: AnonParamsAnonOrgProjectid,
    removeProjectLegacy: AnonParamsAnonProjectidTeamid,
    removeRepo: AnonParamsAnonRepoTeamid,
    removeRepoInOrg: AnonParamsAnonRepoTeamslug,
    removeRepoLegacy: AnonParamsAnonRepoTeamid,
    reviewProject: AnonMethodStringParamsAnonProjectidTeamid,
    reviewProjectInOrg: AnonMethodStringParamsAnonOrgProjectid,
    reviewProjectLegacy: AnonMethodStringParamsAnonProjectidTeamid,
    update: AnonParamsAnonParentteamid,
    updateDiscussion: AnonParamsAnonTeamidTitle,
    updateDiscussionComment: AnonParamsAnonBodyCommentnumber,
    updateDiscussionCommentInOrg: AnonParamsAnonBodyCommentnumberDiscussionnumber,
    updateDiscussionCommentLegacy: AnonParamsAnonBodyCommentnumber,
    updateDiscussionInOrg: AnonParamsAnonTeamslugTitle,
    updateDiscussionLegacy: AnonParamsAnonTeamidTitle,
    updateInOrg: AnonParamsAnonPrivacy,
    updateLegacy: AnonParamsAnonParentteamid
  ): AnonAddMember = {
    val __obj = js.Dynamic.literal(addMember = addMember.asInstanceOf[js.Any], addMemberLegacy = addMemberLegacy.asInstanceOf[js.Any], addOrUpdateMembership = addOrUpdateMembership.asInstanceOf[js.Any], addOrUpdateMembershipInOrg = addOrUpdateMembershipInOrg.asInstanceOf[js.Any], addOrUpdateMembershipLegacy = addOrUpdateMembershipLegacy.asInstanceOf[js.Any], addOrUpdateProject = addOrUpdateProject.asInstanceOf[js.Any], addOrUpdateProjectInOrg = addOrUpdateProjectInOrg.asInstanceOf[js.Any], addOrUpdateProjectLegacy = addOrUpdateProjectLegacy.asInstanceOf[js.Any], addOrUpdateRepo = addOrUpdateRepo.asInstanceOf[js.Any], addOrUpdateRepoInOrg = addOrUpdateRepoInOrg.asInstanceOf[js.Any], addOrUpdateRepoLegacy = addOrUpdateRepoLegacy.asInstanceOf[js.Any], checkManagesRepo = checkManagesRepo.asInstanceOf[js.Any], checkManagesRepoInOrg = checkManagesRepoInOrg.asInstanceOf[js.Any], checkManagesRepoLegacy = checkManagesRepoLegacy.asInstanceOf[js.Any], create = create.asInstanceOf[js.Any], createDiscussion = createDiscussion.asInstanceOf[js.Any], createDiscussionComment = createDiscussionComment.asInstanceOf[js.Any], createDiscussionCommentInOrg = createDiscussionCommentInOrg.asInstanceOf[js.Any], createDiscussionCommentLegacy = createDiscussionCommentLegacy.asInstanceOf[js.Any], createDiscussionInOrg = createDiscussionInOrg.asInstanceOf[js.Any], createDiscussionLegacy = createDiscussionLegacy.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], deleteDiscussion = deleteDiscussion.asInstanceOf[js.Any], deleteDiscussionComment = deleteDiscussionComment.asInstanceOf[js.Any], deleteDiscussionCommentInOrg = deleteDiscussionCommentInOrg.asInstanceOf[js.Any], deleteDiscussionCommentLegacy = deleteDiscussionCommentLegacy.asInstanceOf[js.Any], deleteDiscussionInOrg = deleteDiscussionInOrg.asInstanceOf[js.Any], deleteDiscussionLegacy = deleteDiscussionLegacy.asInstanceOf[js.Any], deleteInOrg = deleteInOrg.asInstanceOf[js.Any], deleteLegacy = deleteLegacy.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], getByName = getByName.asInstanceOf[js.Any], getDiscussion = getDiscussion.asInstanceOf[js.Any], getDiscussionComment = getDiscussionComment.asInstanceOf[js.Any], getDiscussionCommentInOrg = getDiscussionCommentInOrg.asInstanceOf[js.Any], getDiscussionCommentLegacy = getDiscussionCommentLegacy.asInstanceOf[js.Any], getDiscussionInOrg = getDiscussionInOrg.asInstanceOf[js.Any], getDiscussionLegacy = getDiscussionLegacy.asInstanceOf[js.Any], getLegacy = getLegacy.asInstanceOf[js.Any], getMember = getMember.asInstanceOf[js.Any], getMemberLegacy = getMemberLegacy.asInstanceOf[js.Any], getMembership = getMembership.asInstanceOf[js.Any], getMembershipInOrg = getMembershipInOrg.asInstanceOf[js.Any], getMembershipLegacy = getMembershipLegacy.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], listChild = listChild.asInstanceOf[js.Any], listChildInOrg = listChildInOrg.asInstanceOf[js.Any], listChildLegacy = listChildLegacy.asInstanceOf[js.Any], listDiscussionComments = listDiscussionComments.asInstanceOf[js.Any], listDiscussionCommentsInOrg = listDiscussionCommentsInOrg.asInstanceOf[js.Any], listDiscussionCommentsLegacy = listDiscussionCommentsLegacy.asInstanceOf[js.Any], listDiscussions = listDiscussions.asInstanceOf[js.Any], listDiscussionsInOrg = listDiscussionsInOrg.asInstanceOf[js.Any], listDiscussionsLegacy = listDiscussionsLegacy.asInstanceOf[js.Any], listForAuthenticatedUser = listForAuthenticatedUser.asInstanceOf[js.Any], listMembers = listMembers.asInstanceOf[js.Any], listMembersInOrg = listMembersInOrg.asInstanceOf[js.Any], listMembersLegacy = listMembersLegacy.asInstanceOf[js.Any], listPendingInvitations = listPendingInvitations.asInstanceOf[js.Any], listPendingInvitationsInOrg = listPendingInvitationsInOrg.asInstanceOf[js.Any], listPendingInvitationsLegacy = listPendingInvitationsLegacy.asInstanceOf[js.Any], listProjects = listProjects.asInstanceOf[js.Any], listProjectsInOrg = listProjectsInOrg.asInstanceOf[js.Any], listProjectsLegacy = listProjectsLegacy.asInstanceOf[js.Any], listRepos = listRepos.asInstanceOf[js.Any], listReposInOrg = listReposInOrg.asInstanceOf[js.Any], listReposLegacy = listReposLegacy.asInstanceOf[js.Any], removeMember = removeMember.asInstanceOf[js.Any], removeMemberLegacy = removeMemberLegacy.asInstanceOf[js.Any], removeMembership = removeMembership.asInstanceOf[js.Any], removeMembershipInOrg = removeMembershipInOrg.asInstanceOf[js.Any], removeMembershipLegacy = removeMembershipLegacy.asInstanceOf[js.Any], removeProject = removeProject.asInstanceOf[js.Any], removeProjectInOrg = removeProjectInOrg.asInstanceOf[js.Any], removeProjectLegacy = removeProjectLegacy.asInstanceOf[js.Any], removeRepo = removeRepo.asInstanceOf[js.Any], removeRepoInOrg = removeRepoInOrg.asInstanceOf[js.Any], removeRepoLegacy = removeRepoLegacy.asInstanceOf[js.Any], reviewProject = reviewProject.asInstanceOf[js.Any], reviewProjectInOrg = reviewProjectInOrg.asInstanceOf[js.Any], reviewProjectLegacy = reviewProjectLegacy.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any], updateDiscussion = updateDiscussion.asInstanceOf[js.Any], updateDiscussionComment = updateDiscussionComment.asInstanceOf[js.Any], updateDiscussionCommentInOrg = updateDiscussionCommentInOrg.asInstanceOf[js.Any], updateDiscussionCommentLegacy = updateDiscussionCommentLegacy.asInstanceOf[js.Any], updateDiscussionInOrg = updateDiscussionInOrg.asInstanceOf[js.Any], updateDiscussionLegacy = updateDiscussionLegacy.asInstanceOf[js.Any], updateInOrg = updateInOrg.asInstanceOf[js.Any], updateLegacy = updateLegacy.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAddMember]
  }
  @scala.inline
  implicit class AnonAddMemberOps[Self <: AnonAddMember] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddMember(value: AnonParamsAnonTeamidUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addMember")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddMemberLegacy(value: AnonParamsAnonTeamidUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addMemberLegacy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddOrUpdateMembership(value: AnonParamsAnonRoleTeamid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOrUpdateMembership")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddOrUpdateMembershipInOrg(value: AnonParamsAnonOrgRole): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOrUpdateMembershipInOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddOrUpdateMembershipLegacy(value: AnonParamsAnonRoleTeamid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOrUpdateMembershipLegacy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddOrUpdateProject(value: AnonParamsAnonPermissionProjectid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOrUpdateProject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddOrUpdateProjectInOrg(value: AnonParamsAnonOrgPermission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOrUpdateProjectInOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddOrUpdateProjectLegacy(value: AnonParamsAnonPermissionProjectid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOrUpdateProjectLegacy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddOrUpdateRepo(value: AnonParamsAnonPermissionRepo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOrUpdateRepo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddOrUpdateRepoInOrg(value: AnonParamsAnonOrgOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOrUpdateRepoInOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddOrUpdateRepoLegacy(value: AnonParamsAnonPermissionRepo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOrUpdateRepoLegacy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckManagesRepo(value: AnonParamsAnonRepoTeamid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkManagesRepo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckManagesRepoInOrg(value: AnonParamsAnonRepoTeamslug): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkManagesRepoInOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckManagesRepoLegacy(value: AnonParamsAnonRepoTeamid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkManagesRepoLegacy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreate(value: AnonParamsAnonMaintainers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateDiscussion(value: AnonParamsAnonBodyPrivate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createDiscussion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateDiscussionComment(value: AnonParamsAnonBodyDiscussionnumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createDiscussionComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateDiscussionCommentInOrg(value: AnonParamsAnonOrgTeamslug): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createDiscussionCommentInOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateDiscussionCommentLegacy(value: AnonParamsAnonBodyDiscussionnumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createDiscussionCommentLegacy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateDiscussionInOrg(value: AnonParamsAnonBodyOrg): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createDiscussionInOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateDiscussionLegacy(value: AnonParamsAnonBodyPrivate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createDiscussionLegacy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelete(value: AnonParamsAnonTeamidAnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteDiscussion(value: AnonParamsAnonDiscussionnumberTeamid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteDiscussion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteDiscussionComment(value: AnonParamsAnonCommentnumberDiscussionnumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteDiscussionComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteDiscussionCommentInOrg(value: AnonParamsAnonCommentnumberDiscussionnumberOrg): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteDiscussionCommentInOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteDiscussionCommentLegacy(value: AnonParamsAnonCommentnumberDiscussionnumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteDiscussionCommentLegacy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteDiscussionInOrg(value: AnonParamsAnonDiscussionnumberOrgTeamslug): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteDiscussionInOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteDiscussionLegacy(value: AnonParamsAnonDiscussionnumberTeamid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteDiscussionLegacy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteInOrg(value: AnonParamsAnonTeamslugAnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteInOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteLegacy(value: AnonParamsAnonTeamidAnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteLegacy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGet(value: AnonParamsAnonTeamidAnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetByName(value: AnonParamsAnonTeamslugAnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getByName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetDiscussion(value: AnonParamsAnonDiscussionnumberTeamid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDiscussion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetDiscussionComment(value: AnonParamsAnonCommentnumberDiscussionnumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDiscussionComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetDiscussionCommentInOrg(value: AnonParamsAnonCommentnumberDiscussionnumberOrg): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDiscussionCommentInOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetDiscussionCommentLegacy(value: AnonParamsAnonCommentnumberDiscussionnumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDiscussionCommentLegacy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetDiscussionInOrg(value: AnonParamsAnonDiscussionnumberOrgTeamslug): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDiscussionInOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetDiscussionLegacy(value: AnonParamsAnonDiscussionnumberTeamid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDiscussionLegacy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetLegacy(value: AnonParamsAnonTeamidAnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLegacy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetMember(value: AnonParamsAnonTeamidUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMember")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetMemberLegacy(value: AnonParamsAnonTeamidUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMemberLegacy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetMembership(value: AnonParamsAnonTeamidUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMembership")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetMembershipInOrg(value: AnonParamsAnonTeamslugUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMembershipInOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetMembershipLegacy(value: AnonParamsAnonTeamidUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMembershipLegacy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withList(value: AnonParamsAnonOrgPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListChild(value: AnonParamsAnonPerpageTeamid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listChild")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListChildInOrg(value: AnonParamsAnonPagePerpageTeamslug): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listChildInOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListChildLegacy(value: AnonParamsAnonPerpageTeamid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listChildLegacy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListDiscussionComments(value: AnonParamsAnonDirectionDiscussionnumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listDiscussionComments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListDiscussionCommentsInOrg(value: AnonParamsAnonDirectionDiscussionnumberOrg): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listDiscussionCommentsInOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListDiscussionCommentsLegacy(value: AnonParamsAnonDirectionDiscussionnumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listDiscussionCommentsLegacy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListDiscussions(value: AnonParamsAnonDirectionPagePerpage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listDiscussions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListDiscussionsInOrg(value: AnonParamsAnonDirectionOrgPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listDiscussionsInOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListDiscussionsLegacy(value: AnonParamsAnonDirectionPagePerpage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listDiscussionsLegacy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListForAuthenticatedUser(value: AnonParamsAnonPagePerpage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listForAuthenticatedUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListMembers(value: AnonParamsAnonPerpageRole): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listMembers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListMembersInOrg(value: AnonParamsAnonRoleTeamslug): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listMembersInOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListMembersLegacy(value: AnonParamsAnonPerpageRole): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listMembersLegacy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListPendingInvitations(value: AnonParamsAnonPerpageTeamid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listPendingInvitations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListPendingInvitationsInOrg(value: AnonParamsAnonPagePerpageTeamslug): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listPendingInvitationsInOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListPendingInvitationsLegacy(value: AnonParamsAnonPerpageTeamid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listPendingInvitationsLegacy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListProjects(value: AnonMethodStringParamsAnonPerpageTeamid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listProjects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListProjectsInOrg(value: AnonMethodStringParamsAnonPagePerpageTeamslug): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listProjectsInOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListProjectsLegacy(value: AnonMethodStringParamsAnonPerpageTeamid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listProjectsLegacy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListRepos(value: AnonParamsAnonPerpageTeamid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listRepos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListReposInOrg(value: AnonParamsAnonPagePerpageTeamslug): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listReposInOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListReposLegacy(value: AnonParamsAnonPerpageTeamid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listReposLegacy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveMember(value: AnonParamsAnonTeamidUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeMember")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveMemberLegacy(value: AnonParamsAnonTeamidUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeMemberLegacy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveMembership(value: AnonParamsAnonTeamidUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeMembership")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveMembershipInOrg(value: AnonParamsAnonTeamslugUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeMembershipInOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveMembershipLegacy(value: AnonParamsAnonTeamidUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeMembershipLegacy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveProject(value: AnonParamsAnonProjectidTeamid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeProject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveProjectInOrg(value: AnonParamsAnonOrgProjectid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeProjectInOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveProjectLegacy(value: AnonParamsAnonProjectidTeamid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeProjectLegacy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveRepo(value: AnonParamsAnonRepoTeamid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeRepo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveRepoInOrg(value: AnonParamsAnonRepoTeamslug): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeRepoInOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveRepoLegacy(value: AnonParamsAnonRepoTeamid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeRepoLegacy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReviewProject(value: AnonMethodStringParamsAnonProjectidTeamid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reviewProject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReviewProjectInOrg(value: AnonMethodStringParamsAnonOrgProjectid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reviewProjectInOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReviewProjectLegacy(value: AnonMethodStringParamsAnonProjectidTeamid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reviewProjectLegacy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdate(value: AnonParamsAnonParentteamid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateDiscussion(value: AnonParamsAnonTeamidTitle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateDiscussion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateDiscussionComment(value: AnonParamsAnonBodyCommentnumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateDiscussionComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateDiscussionCommentInOrg(value: AnonParamsAnonBodyCommentnumberDiscussionnumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateDiscussionCommentInOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateDiscussionCommentLegacy(value: AnonParamsAnonBodyCommentnumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateDiscussionCommentLegacy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateDiscussionInOrg(value: AnonParamsAnonTeamslugTitle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateDiscussionInOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateDiscussionLegacy(value: AnonParamsAnonTeamidTitle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateDiscussionLegacy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateInOrg(value: AnonParamsAnonPrivacy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateInOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateLegacy(value: AnonParamsAnonParentteamid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateLegacy")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

