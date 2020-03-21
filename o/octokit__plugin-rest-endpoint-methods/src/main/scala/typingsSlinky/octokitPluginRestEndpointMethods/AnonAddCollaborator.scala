package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddCollaborator extends js.Object {
  var addCollaborator: AnonParamsAnonPermission
  var createCard: AnonParamsAnonColumnid
  var createColumn: AnonParamsAnonProjectid
  var createForAuthenticatedUser: AnonParamsAnonBodyName
  var createForOrg: AnonParamsAnonNameOrg
  var createForRepo: AnonParamsAnonNameOwner
  var delete: AnonParamsAnonProjectidAnonRequired
  var deleteCard: AnonParamsAnonCardid
  var deleteColumn: AnonParamsAnonColumnidAnonRequired
  var get: AnonParamsAnonProjectidAnonRequired
  var getCard: AnonParamsAnonCardid
  var getColumn: AnonParamsAnonColumnidAnonRequired
  var listCards: AnonParamsAnonArchivedstate
  var listCollaborators: AnonParamsAnonAffiliation
  var listColumns: AnonParamsAnonPerpageProjectid
  var listForOrg: AnonParamsAnonOrgPagePerpage
  var listForRepo: AnonParamsAnonRepoState
  var listForUser: AnonParamsAnonStateUsername
  var moveCard: AnonParamsAnonPosition
  var moveColumn: AnonParamsAnonColumnidPosition
  var removeCollaborator: AnonParamsAnonProjectidUsername
  var reviewUserPermissionLevel: AnonParamsAnonProjectidUsername
  var update: AnonParamsAnonOrganizationpermission
  var updateCard: AnonParamsAnonArchived
  var updateColumn: AnonParamsAnonColumnidName
}

object AnonAddCollaborator {
  @scala.inline
  def apply(
    addCollaborator: AnonParamsAnonPermission,
    createCard: AnonParamsAnonColumnid,
    createColumn: AnonParamsAnonProjectid,
    createForAuthenticatedUser: AnonParamsAnonBodyName,
    createForOrg: AnonParamsAnonNameOrg,
    createForRepo: AnonParamsAnonNameOwner,
    delete: AnonParamsAnonProjectidAnonRequired,
    deleteCard: AnonParamsAnonCardid,
    deleteColumn: AnonParamsAnonColumnidAnonRequired,
    get: AnonParamsAnonProjectidAnonRequired,
    getCard: AnonParamsAnonCardid,
    getColumn: AnonParamsAnonColumnidAnonRequired,
    listCards: AnonParamsAnonArchivedstate,
    listCollaborators: AnonParamsAnonAffiliation,
    listColumns: AnonParamsAnonPerpageProjectid,
    listForOrg: AnonParamsAnonOrgPagePerpage,
    listForRepo: AnonParamsAnonRepoState,
    listForUser: AnonParamsAnonStateUsername,
    moveCard: AnonParamsAnonPosition,
    moveColumn: AnonParamsAnonColumnidPosition,
    removeCollaborator: AnonParamsAnonProjectidUsername,
    reviewUserPermissionLevel: AnonParamsAnonProjectidUsername,
    update: AnonParamsAnonOrganizationpermission,
    updateCard: AnonParamsAnonArchived,
    updateColumn: AnonParamsAnonColumnidName
  ): AnonAddCollaborator = {
    val __obj = js.Dynamic.literal(addCollaborator = addCollaborator.asInstanceOf[js.Any], createCard = createCard.asInstanceOf[js.Any], createColumn = createColumn.asInstanceOf[js.Any], createForAuthenticatedUser = createForAuthenticatedUser.asInstanceOf[js.Any], createForOrg = createForOrg.asInstanceOf[js.Any], createForRepo = createForRepo.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], deleteCard = deleteCard.asInstanceOf[js.Any], deleteColumn = deleteColumn.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], getCard = getCard.asInstanceOf[js.Any], getColumn = getColumn.asInstanceOf[js.Any], listCards = listCards.asInstanceOf[js.Any], listCollaborators = listCollaborators.asInstanceOf[js.Any], listColumns = listColumns.asInstanceOf[js.Any], listForOrg = listForOrg.asInstanceOf[js.Any], listForRepo = listForRepo.asInstanceOf[js.Any], listForUser = listForUser.asInstanceOf[js.Any], moveCard = moveCard.asInstanceOf[js.Any], moveColumn = moveColumn.asInstanceOf[js.Any], removeCollaborator = removeCollaborator.asInstanceOf[js.Any], reviewUserPermissionLevel = reviewUserPermissionLevel.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any], updateCard = updateCard.asInstanceOf[js.Any], updateColumn = updateColumn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAddCollaborator]
  }
}

