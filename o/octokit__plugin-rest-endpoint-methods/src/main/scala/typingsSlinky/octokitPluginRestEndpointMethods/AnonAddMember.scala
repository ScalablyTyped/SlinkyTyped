package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddMember extends js.Object {
  var addMember: AnonParamsAnonTeamidUsername
  var addMemberLegacy: AnonParamsAnonTeamidUsername
  var addOrUpdateMembership: AnonParamsAnonRoleTeamid
  var addOrUpdateMembershipInOrg: AnonParamsAnonOrgRole
  var addOrUpdateMembershipLegacy: AnonParamsAnonRoleTeamid
  var addOrUpdateProject: AnonParamsAnonPermissionProjectid
  var addOrUpdateProjectInOrg: AnonParamsAnonOrgPermission
  var addOrUpdateProjectLegacy: AnonParamsAnonPermissionProjectid
  var addOrUpdateRepo: AnonParamsAnonPermissionRepo
  var addOrUpdateRepoInOrg: AnonParamsAnonOrgOwner
  var addOrUpdateRepoLegacy: AnonParamsAnonPermissionRepo
  var checkManagesRepo: AnonParamsAnonRepoTeamid
  var checkManagesRepoInOrg: AnonParamsAnonRepoTeamslug
  var checkManagesRepoLegacy: AnonParamsAnonRepoTeamid
  var create: AnonParamsAnonMaintainers
  var createDiscussion: AnonParamsAnonBodyPrivate
  var createDiscussionComment: AnonParamsAnonBodyDiscussionnumber
  var createDiscussionCommentInOrg: AnonParamsAnonOrgTeamslug
  var createDiscussionCommentLegacy: AnonParamsAnonBodyDiscussionnumber
  var createDiscussionInOrg: AnonParamsAnonBodyOrg
  var createDiscussionLegacy: AnonParamsAnonBodyPrivate
  var delete: AnonParamsAnonTeamidAnonRequired
  var deleteDiscussion: AnonParamsAnonDiscussionnumberTeamid
  var deleteDiscussionComment: AnonParamsAnonCommentnumberDiscussionnumber
  var deleteDiscussionCommentInOrg: AnonParamsAnonCommentnumberDiscussionnumberOrg
  var deleteDiscussionCommentLegacy: AnonParamsAnonCommentnumberDiscussionnumber
  var deleteDiscussionInOrg: AnonParamsAnonDiscussionnumberOrgTeamslug
  var deleteDiscussionLegacy: AnonParamsAnonDiscussionnumberTeamid
  var deleteInOrg: AnonParamsAnonTeamslugAnonRequired
  var deleteLegacy: AnonParamsAnonTeamidAnonRequired
  var get: AnonParamsAnonTeamidAnonRequired
  var getByName: AnonParamsAnonTeamslugAnonRequired
  var getDiscussion: AnonParamsAnonDiscussionnumberTeamid
  var getDiscussionComment: AnonParamsAnonCommentnumberDiscussionnumber
  var getDiscussionCommentInOrg: AnonParamsAnonCommentnumberDiscussionnumberOrg
  var getDiscussionCommentLegacy: AnonParamsAnonCommentnumberDiscussionnumber
  var getDiscussionInOrg: AnonParamsAnonDiscussionnumberOrgTeamslug
  var getDiscussionLegacy: AnonParamsAnonDiscussionnumberTeamid
  var getLegacy: AnonParamsAnonTeamidAnonRequired
  var getMember: AnonParamsAnonTeamidUsername
  var getMemberLegacy: AnonParamsAnonTeamidUsername
  var getMembership: AnonParamsAnonTeamidUsername
  var getMembershipInOrg: AnonParamsAnonTeamslugUsername
  var getMembershipLegacy: AnonParamsAnonTeamidUsername
  var list: AnonParamsAnonOrgPage
  var listChild: AnonParamsAnonPerpageTeamid
  var listChildInOrg: AnonParamsAnonPagePerpageTeamslug
  var listChildLegacy: AnonParamsAnonPerpageTeamid
  var listDiscussionComments: AnonParamsAnonDirectionDiscussionnumber
  var listDiscussionCommentsInOrg: AnonParamsAnonDirectionDiscussionnumberOrg
  var listDiscussionCommentsLegacy: AnonParamsAnonDirectionDiscussionnumber
  var listDiscussions: AnonParamsAnonDirectionPagePerpage
  var listDiscussionsInOrg: AnonParamsAnonDirectionOrgPage
  var listDiscussionsLegacy: AnonParamsAnonDirectionPagePerpage
  var listForAuthenticatedUser: AnonParamsAnonPagePerpage
  var listMembers: AnonParamsAnonPerpageRole
  var listMembersInOrg: AnonParamsAnonRoleTeamslug
  var listMembersLegacy: AnonParamsAnonPerpageRole
  var listPendingInvitations: AnonParamsAnonPerpageTeamid
  var listPendingInvitationsInOrg: AnonParamsAnonPagePerpageTeamslug
  var listPendingInvitationsLegacy: AnonParamsAnonPerpageTeamid
  var listProjects: AnonMethodStringParamsAnonPerpageTeamid
  var listProjectsInOrg: AnonMethodStringParamsAnonPagePerpageTeamslug
  var listProjectsLegacy: AnonMethodStringParamsAnonPerpageTeamid
  var listRepos: AnonParamsAnonPerpageTeamid
  var listReposInOrg: AnonParamsAnonPagePerpageTeamslug
  var listReposLegacy: AnonParamsAnonPerpageTeamid
  var removeMember: AnonParamsAnonTeamidUsername
  var removeMemberLegacy: AnonParamsAnonTeamidUsername
  var removeMembership: AnonParamsAnonTeamidUsername
  var removeMembershipInOrg: AnonParamsAnonTeamslugUsername
  var removeMembershipLegacy: AnonParamsAnonTeamidUsername
  var removeProject: AnonParamsAnonProjectidTeamid
  var removeProjectInOrg: AnonParamsAnonOrgProjectid
  var removeProjectLegacy: AnonParamsAnonProjectidTeamid
  var removeRepo: AnonParamsAnonRepoTeamid
  var removeRepoInOrg: AnonParamsAnonRepoTeamslug
  var removeRepoLegacy: AnonParamsAnonRepoTeamid
  var reviewProject: AnonMethodStringParamsAnonProjectidTeamid
  var reviewProjectInOrg: AnonMethodStringParamsAnonOrgProjectid
  var reviewProjectLegacy: AnonMethodStringParamsAnonProjectidTeamid
  var update: AnonParamsAnonParentteamid
  var updateDiscussion: AnonParamsAnonTeamidTitle
  var updateDiscussionComment: AnonParamsAnonBodyCommentnumber
  var updateDiscussionCommentInOrg: AnonParamsAnonBodyCommentnumberDiscussionnumber
  var updateDiscussionCommentLegacy: AnonParamsAnonBodyCommentnumber
  var updateDiscussionInOrg: AnonParamsAnonTeamslugTitle
  var updateDiscussionLegacy: AnonParamsAnonTeamidTitle
  var updateInOrg: AnonParamsAnonPrivacy
  var updateLegacy: AnonParamsAnonParentteamid
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
}

