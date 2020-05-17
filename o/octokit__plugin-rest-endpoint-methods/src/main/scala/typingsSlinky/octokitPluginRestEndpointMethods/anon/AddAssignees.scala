package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddAssignees extends js.Object {
  var addAssignees: ParamsAssignees = js.native
  var addLabels: ParamsIssuenumber = js.native
  var checkAssignee: ParamsAssignee = js.native
  var create: ParamsLabels = js.native
  var createComment: ParamsNumber = js.native
  var createLabel: ParamsColor = js.native
  var createMilestone: ParamsDueon = js.native
  var deleteComment: ParamsCommentidOwner = js.native
  var deleteLabel: ParamsUrl = js.native
  var deleteMilestone: ParamsMilestonenumber = js.native
  var get: ParamsIssuenumberNumber = js.native
  var getComment: ParamsCommentidOwner = js.native
  var getEvent: ParamsEventid = js.native
  var getLabel: ParamsUrl = js.native
  var getMilestone: ParamsMilestonenumber = js.native
  var list: ParamsState = js.native
  var listAssignees: ParamsOwnerPage = js.native
  var listComments: ParamsNumberOwner = js.native
  var listCommentsForRepo: ParamsDirectionOwner = js.native
  var listEvents: ParamsPerpageRepo = js.native
  var listEventsForRepo: ParamsOwnerPage = js.native
  var listEventsForTimeline: MethodStringParamsPerpageRepo = js.native
  var listForAuthenticatedUser: ParamsState = js.native
  var listForOrg: ParamsDirectionFilter = js.native
  var listForRepo: ParamsCreator = js.native
  var listLabelsForMilestone: ParamsMilestonenumberNumber = js.native
  var listLabelsForRepo: ParamsOwnerPage = js.native
  var listLabelsOnIssue: ParamsPerpageRepo = js.native
  var listMilestonesForRepo: ParamsRepoSort = js.native
  var lock: ParamsLockreason = js.native
  var removeAssignees: ParamsAssignees = js.native
  var removeLabel: ParamsIssuenumberName = js.native
  var removeLabels: ParamsIssuenumberNumber = js.native
  var replaceLabels: ParamsIssuenumberLabels = js.native
  var unlock: ParamsIssuenumberNumber = js.native
  var update: ParamsMilestone = js.native
  var updateComment: ParamsOwnerRepo = js.native
  var updateLabel: ParamsCurrentname = js.native
  var updateMilestone: ParamsTitle = js.native
}

object AddAssignees {
  @scala.inline
  def apply(
    addAssignees: ParamsAssignees,
    addLabels: ParamsIssuenumber,
    checkAssignee: ParamsAssignee,
    create: ParamsLabels,
    createComment: ParamsNumber,
    createLabel: ParamsColor,
    createMilestone: ParamsDueon,
    deleteComment: ParamsCommentidOwner,
    deleteLabel: ParamsUrl,
    deleteMilestone: ParamsMilestonenumber,
    get: ParamsIssuenumberNumber,
    getComment: ParamsCommentidOwner,
    getEvent: ParamsEventid,
    getLabel: ParamsUrl,
    getMilestone: ParamsMilestonenumber,
    list: ParamsState,
    listAssignees: ParamsOwnerPage,
    listComments: ParamsNumberOwner,
    listCommentsForRepo: ParamsDirectionOwner,
    listEvents: ParamsPerpageRepo,
    listEventsForRepo: ParamsOwnerPage,
    listEventsForTimeline: MethodStringParamsPerpageRepo,
    listForAuthenticatedUser: ParamsState,
    listForOrg: ParamsDirectionFilter,
    listForRepo: ParamsCreator,
    listLabelsForMilestone: ParamsMilestonenumberNumber,
    listLabelsForRepo: ParamsOwnerPage,
    listLabelsOnIssue: ParamsPerpageRepo,
    listMilestonesForRepo: ParamsRepoSort,
    lock: ParamsLockreason,
    removeAssignees: ParamsAssignees,
    removeLabel: ParamsIssuenumberName,
    removeLabels: ParamsIssuenumberNumber,
    replaceLabels: ParamsIssuenumberLabels,
    unlock: ParamsIssuenumberNumber,
    update: ParamsMilestone,
    updateComment: ParamsOwnerRepo,
    updateLabel: ParamsCurrentname,
    updateMilestone: ParamsTitle
  ): AddAssignees = {
    val __obj = js.Dynamic.literal(addAssignees = addAssignees.asInstanceOf[js.Any], addLabels = addLabels.asInstanceOf[js.Any], checkAssignee = checkAssignee.asInstanceOf[js.Any], create = create.asInstanceOf[js.Any], createComment = createComment.asInstanceOf[js.Any], createLabel = createLabel.asInstanceOf[js.Any], createMilestone = createMilestone.asInstanceOf[js.Any], deleteComment = deleteComment.asInstanceOf[js.Any], deleteLabel = deleteLabel.asInstanceOf[js.Any], deleteMilestone = deleteMilestone.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], getComment = getComment.asInstanceOf[js.Any], getEvent = getEvent.asInstanceOf[js.Any], getLabel = getLabel.asInstanceOf[js.Any], getMilestone = getMilestone.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], listAssignees = listAssignees.asInstanceOf[js.Any], listComments = listComments.asInstanceOf[js.Any], listCommentsForRepo = listCommentsForRepo.asInstanceOf[js.Any], listEvents = listEvents.asInstanceOf[js.Any], listEventsForRepo = listEventsForRepo.asInstanceOf[js.Any], listEventsForTimeline = listEventsForTimeline.asInstanceOf[js.Any], listForAuthenticatedUser = listForAuthenticatedUser.asInstanceOf[js.Any], listForOrg = listForOrg.asInstanceOf[js.Any], listForRepo = listForRepo.asInstanceOf[js.Any], listLabelsForMilestone = listLabelsForMilestone.asInstanceOf[js.Any], listLabelsForRepo = listLabelsForRepo.asInstanceOf[js.Any], listLabelsOnIssue = listLabelsOnIssue.asInstanceOf[js.Any], listMilestonesForRepo = listMilestonesForRepo.asInstanceOf[js.Any], lock = lock.asInstanceOf[js.Any], removeAssignees = removeAssignees.asInstanceOf[js.Any], removeLabel = removeLabel.asInstanceOf[js.Any], removeLabels = removeLabels.asInstanceOf[js.Any], replaceLabels = replaceLabels.asInstanceOf[js.Any], unlock = unlock.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any], updateComment = updateComment.asInstanceOf[js.Any], updateLabel = updateLabel.asInstanceOf[js.Any], updateMilestone = updateMilestone.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddAssignees]
  }
  @scala.inline
  implicit class AddAssigneesOps[Self <: AddAssignees] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddAssignees(value: ParamsAssignees): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addAssignees")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddLabels(value: ParamsIssuenumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckAssignee(value: ParamsAssignee): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkAssignee")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreate(value: ParamsLabels): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateComment(value: ParamsNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateLabel(value: ParamsColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateMilestone(value: ParamsDueon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createMilestone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteComment(value: ParamsCommentidOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteLabel(value: ParamsUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteMilestone(value: ParamsMilestonenumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteMilestone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGet(value: ParamsIssuenumberNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetComment(value: ParamsCommentidOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetEvent(value: ParamsEventid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetLabel(value: ParamsUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetMilestone(value: ParamsMilestonenumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMilestone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withList(value: ParamsState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListAssignees(value: ParamsOwnerPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listAssignees")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListComments(value: ParamsNumberOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listComments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListCommentsForRepo(value: ParamsDirectionOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listCommentsForRepo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListEvents(value: ParamsPerpageRepo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListEventsForRepo(value: ParamsOwnerPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listEventsForRepo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListEventsForTimeline(value: MethodStringParamsPerpageRepo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listEventsForTimeline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListForAuthenticatedUser(value: ParamsState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listForAuthenticatedUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListForOrg(value: ParamsDirectionFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listForOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListForRepo(value: ParamsCreator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listForRepo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListLabelsForMilestone(value: ParamsMilestonenumberNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listLabelsForMilestone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListLabelsForRepo(value: ParamsOwnerPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listLabelsForRepo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListLabelsOnIssue(value: ParamsPerpageRepo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listLabelsOnIssue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListMilestonesForRepo(value: ParamsRepoSort): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listMilestonesForRepo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLock(value: ParamsLockreason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveAssignees(value: ParamsAssignees): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAssignees")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveLabel(value: ParamsIssuenumberName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveLabels(value: ParamsIssuenumberNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplaceLabels(value: ParamsIssuenumberLabels): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnlock(value: ParamsIssuenumberNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdate(value: ParamsMilestone): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateComment(value: ParamsOwnerRepo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateLabel(value: ParamsCurrentname): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateMilestone(value: ParamsTitle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateMilestone")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

