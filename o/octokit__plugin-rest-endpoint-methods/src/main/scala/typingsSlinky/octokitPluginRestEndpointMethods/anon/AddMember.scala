package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddMember extends js.Object {
  var addMember: ParamsTeamidUsername
  var addMemberLegacy: ParamsTeamidUsername
  var addOrUpdateMembership: ParamsRoleTeamid
  var addOrUpdateMembershipInOrg: ParamsOrgRole
  var addOrUpdateMembershipLegacy: ParamsRoleTeamid
  var addOrUpdateProject: ParamsPermissionProjectid
  var addOrUpdateProjectInOrg: ParamsOrgPermission
  var addOrUpdateProjectLegacy: ParamsPermissionProjectid
  var addOrUpdateRepo: ParamsPermissionRepo
  var addOrUpdateRepoInOrg: ParamsOrgOwner
  var addOrUpdateRepoLegacy: ParamsPermissionRepo
  var checkManagesRepo: ParamsRepoTeamid
  var checkManagesRepoInOrg: ParamsRepoTeamslug
  var checkManagesRepoLegacy: ParamsRepoTeamid
  var create: ParamsMaintainers
  var createDiscussion: ParamsBodyPrivate
  var createDiscussionComment: ParamsBodyDiscussionnumber
  var createDiscussionCommentInOrg: ParamsOrgTeamslug
  var createDiscussionCommentLegacy: ParamsBodyDiscussionnumber
  var createDiscussionInOrg: ParamsBodyOrg
  var createDiscussionLegacy: ParamsBodyPrivate
  var delete: ParamsTeamidRequired
  var deleteDiscussion: ParamsDiscussionnumberTeamid
  var deleteDiscussionComment: ParamsCommentnumberDiscussionnumber
  var deleteDiscussionCommentInOrg: ParamsCommentnumberDiscussionnumberOrg
  var deleteDiscussionCommentLegacy: ParamsCommentnumberDiscussionnumber
  var deleteDiscussionInOrg: ParamsDiscussionnumberOrgTeamslug
  var deleteDiscussionLegacy: ParamsDiscussionnumberTeamid
  var deleteInOrg: ParamsTeamslugRequired
  var deleteLegacy: ParamsTeamidRequired
  var get: ParamsTeamidRequired
  var getByName: ParamsTeamslugRequired
  var getDiscussion: ParamsDiscussionnumberTeamid
  var getDiscussionComment: ParamsCommentnumberDiscussionnumber
  var getDiscussionCommentInOrg: ParamsCommentnumberDiscussionnumberOrg
  var getDiscussionCommentLegacy: ParamsCommentnumberDiscussionnumber
  var getDiscussionInOrg: ParamsDiscussionnumberOrgTeamslug
  var getDiscussionLegacy: ParamsDiscussionnumberTeamid
  var getLegacy: ParamsTeamidRequired
  var getMember: ParamsTeamidUsername
  var getMemberLegacy: ParamsTeamidUsername
  var getMembership: ParamsTeamidUsername
  var getMembershipInOrg: ParamsTeamslugUsername
  var getMembershipLegacy: ParamsTeamidUsername
  var list: ParamsOrgPage
  var listChild: ParamsPerpageTeamid
  var listChildInOrg: ParamsPagePerpageTeamslug
  var listChildLegacy: ParamsPerpageTeamid
  var listDiscussionComments: ParamsDirectionDiscussionnumber
  var listDiscussionCommentsInOrg: ParamsDirectionDiscussionnumberOrg
  var listDiscussionCommentsLegacy: ParamsDirectionDiscussionnumber
  var listDiscussions: ParamsDirectionPagePerpage
  var listDiscussionsInOrg: ParamsDirectionOrgPage
  var listDiscussionsLegacy: ParamsDirectionPagePerpage
  var listForAuthenticatedUser: ParamsPagePerpage
  var listMembers: ParamsPerpageRole
  var listMembersInOrg: ParamsRoleTeamslug
  var listMembersLegacy: ParamsPerpageRole
  var listPendingInvitations: ParamsPerpageTeamid
  var listPendingInvitationsInOrg: ParamsPagePerpageTeamslug
  var listPendingInvitationsLegacy: ParamsPerpageTeamid
  var listProjects: MethodStringParamsPerpageTeamid
  var listProjectsInOrg: MethodStringParamsPagePerpageTeamslug
  var listProjectsLegacy: MethodStringParamsPerpageTeamid
  var listRepos: ParamsPerpageTeamid
  var listReposInOrg: ParamsPagePerpageTeamslug
  var listReposLegacy: ParamsPerpageTeamid
  var removeMember: ParamsTeamidUsername
  var removeMemberLegacy: ParamsTeamidUsername
  var removeMembership: ParamsTeamidUsername
  var removeMembershipInOrg: ParamsTeamslugUsername
  var removeMembershipLegacy: ParamsTeamidUsername
  var removeProject: ParamsProjectidTeamid
  var removeProjectInOrg: ParamsOrgProjectid
  var removeProjectLegacy: ParamsProjectidTeamid
  var removeRepo: ParamsRepoTeamid
  var removeRepoInOrg: ParamsRepoTeamslug
  var removeRepoLegacy: ParamsRepoTeamid
  var reviewProject: MethodStringParamsProjectidTeamid
  var reviewProjectInOrg: MethodStringParamsOrgProjectid
  var reviewProjectLegacy: MethodStringParamsProjectidTeamid
  var update: ParamsParentteamid
  var updateDiscussion: ParamsTeamidTitle
  var updateDiscussionComment: ParamsBodyCommentnumber
  var updateDiscussionCommentInOrg: ParamsBodyCommentnumberDiscussionnumber
  var updateDiscussionCommentLegacy: ParamsBodyCommentnumber
  var updateDiscussionInOrg: ParamsTeamslugTitle
  var updateDiscussionLegacy: ParamsTeamidTitle
  var updateInOrg: ParamsPrivacy
  var updateLegacy: ParamsParentteamid
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
}

