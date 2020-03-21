package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddAssignees extends js.Object {
  var addAssignees: AnonParamsAnonAssignees
  var addLabels: AnonParamsAnonIssuenumber
  var checkAssignee: AnonParamsAnonAssignee
  var create: AnonParamsAnonLabels
  var createComment: AnonParamsAnonNumber
  var createLabel: AnonParamsAnonColor
  var createMilestone: AnonParamsAnonDueon
  var deleteComment: AnonParamsAnonCommentidOwner
  var deleteLabel: AnonParamsUrl
  var deleteMilestone: AnonParamsAnonMilestonenumber
  var get: AnonParamsAnonIssuenumberNumber
  var getComment: AnonParamsAnonCommentidOwner
  var getEvent: AnonParamsAnonEventid
  var getLabel: AnonParamsUrl
  var getMilestone: AnonParamsAnonMilestonenumber
  var list: AnonParamsAnonState
  var listAssignees: AnonParamsAnonOwnerPage
  var listComments: AnonParamsAnonNumberOwner
  var listCommentsForRepo: AnonParamsAnonDirectionOwner
  var listEvents: AnonParamsAnonPerpageRepo
  var listEventsForRepo: AnonParamsAnonOwnerPage
  var listEventsForTimeline: AnonMethodStringParamsAnonPerpageRepo
  var listForAuthenticatedUser: AnonParamsAnonState
  var listForOrg: AnonParamsAnonDirectionFilter
  var listForRepo: AnonParamsAnonCreator
  var listLabelsForMilestone: AnonParamsAnonMilestonenumberNumber
  var listLabelsForRepo: AnonParamsAnonOwnerPage
  var listLabelsOnIssue: AnonParamsAnonPerpageRepo
  var listMilestonesForRepo: AnonParamsAnonRepoSort
  var lock: AnonParamsAnonLockreason
  var removeAssignees: AnonParamsAnonAssignees
  var removeLabel: AnonParamsAnonIssuenumberName
  var removeLabels: AnonParamsAnonIssuenumberNumber
  var replaceLabels: AnonParamsAnonIssuenumberLabels
  var unlock: AnonParamsAnonIssuenumberNumber
  var update: AnonParamsAnonMilestone
  var updateComment: AnonParamsAnonOwnerRepo
  var updateLabel: AnonParamsAnonCurrentname
  var updateMilestone: AnonParamsAnonTitle
}

object AnonAddAssignees {
  @scala.inline
  def apply(
    addAssignees: AnonParamsAnonAssignees,
    addLabels: AnonParamsAnonIssuenumber,
    checkAssignee: AnonParamsAnonAssignee,
    create: AnonParamsAnonLabels,
    createComment: AnonParamsAnonNumber,
    createLabel: AnonParamsAnonColor,
    createMilestone: AnonParamsAnonDueon,
    deleteComment: AnonParamsAnonCommentidOwner,
    deleteLabel: AnonParamsUrl,
    deleteMilestone: AnonParamsAnonMilestonenumber,
    get: AnonParamsAnonIssuenumberNumber,
    getComment: AnonParamsAnonCommentidOwner,
    getEvent: AnonParamsAnonEventid,
    getLabel: AnonParamsUrl,
    getMilestone: AnonParamsAnonMilestonenumber,
    list: AnonParamsAnonState,
    listAssignees: AnonParamsAnonOwnerPage,
    listComments: AnonParamsAnonNumberOwner,
    listCommentsForRepo: AnonParamsAnonDirectionOwner,
    listEvents: AnonParamsAnonPerpageRepo,
    listEventsForRepo: AnonParamsAnonOwnerPage,
    listEventsForTimeline: AnonMethodStringParamsAnonPerpageRepo,
    listForAuthenticatedUser: AnonParamsAnonState,
    listForOrg: AnonParamsAnonDirectionFilter,
    listForRepo: AnonParamsAnonCreator,
    listLabelsForMilestone: AnonParamsAnonMilestonenumberNumber,
    listLabelsForRepo: AnonParamsAnonOwnerPage,
    listLabelsOnIssue: AnonParamsAnonPerpageRepo,
    listMilestonesForRepo: AnonParamsAnonRepoSort,
    lock: AnonParamsAnonLockreason,
    removeAssignees: AnonParamsAnonAssignees,
    removeLabel: AnonParamsAnonIssuenumberName,
    removeLabels: AnonParamsAnonIssuenumberNumber,
    replaceLabels: AnonParamsAnonIssuenumberLabels,
    unlock: AnonParamsAnonIssuenumberNumber,
    update: AnonParamsAnonMilestone,
    updateComment: AnonParamsAnonOwnerRepo,
    updateLabel: AnonParamsAnonCurrentname,
    updateMilestone: AnonParamsAnonTitle
  ): AnonAddAssignees = {
    val __obj = js.Dynamic.literal(addAssignees = addAssignees.asInstanceOf[js.Any], addLabels = addLabels.asInstanceOf[js.Any], checkAssignee = checkAssignee.asInstanceOf[js.Any], create = create.asInstanceOf[js.Any], createComment = createComment.asInstanceOf[js.Any], createLabel = createLabel.asInstanceOf[js.Any], createMilestone = createMilestone.asInstanceOf[js.Any], deleteComment = deleteComment.asInstanceOf[js.Any], deleteLabel = deleteLabel.asInstanceOf[js.Any], deleteMilestone = deleteMilestone.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], getComment = getComment.asInstanceOf[js.Any], getEvent = getEvent.asInstanceOf[js.Any], getLabel = getLabel.asInstanceOf[js.Any], getMilestone = getMilestone.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], listAssignees = listAssignees.asInstanceOf[js.Any], listComments = listComments.asInstanceOf[js.Any], listCommentsForRepo = listCommentsForRepo.asInstanceOf[js.Any], listEvents = listEvents.asInstanceOf[js.Any], listEventsForRepo = listEventsForRepo.asInstanceOf[js.Any], listEventsForTimeline = listEventsForTimeline.asInstanceOf[js.Any], listForAuthenticatedUser = listForAuthenticatedUser.asInstanceOf[js.Any], listForOrg = listForOrg.asInstanceOf[js.Any], listForRepo = listForRepo.asInstanceOf[js.Any], listLabelsForMilestone = listLabelsForMilestone.asInstanceOf[js.Any], listLabelsForRepo = listLabelsForRepo.asInstanceOf[js.Any], listLabelsOnIssue = listLabelsOnIssue.asInstanceOf[js.Any], listMilestonesForRepo = listMilestonesForRepo.asInstanceOf[js.Any], lock = lock.asInstanceOf[js.Any], removeAssignees = removeAssignees.asInstanceOf[js.Any], removeLabel = removeLabel.asInstanceOf[js.Any], removeLabels = removeLabels.asInstanceOf[js.Any], replaceLabels = replaceLabels.asInstanceOf[js.Any], unlock = unlock.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any], updateComment = updateComment.asInstanceOf[js.Any], updateLabel = updateLabel.asInstanceOf[js.Any], updateMilestone = updateMilestone.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAddAssignees]
  }
}

