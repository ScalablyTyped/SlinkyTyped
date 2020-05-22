package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddCollaborator extends js.Object {
  var addCollaborator: ParamsPermission
  var createCard: ParamsColumnid
  var createColumn: ParamsProjectid
  var createForAuthenticatedUser: ParamsBodyName
  var createForOrg: ParamsNameOrg
  var createForRepo: ParamsNameOwner
  var delete: ParamsProjectidRequired
  var deleteCard: ParamsCardid
  var deleteColumn: ParamsColumnidRequired
  var get: ParamsProjectidRequired
  var getCard: ParamsCardid
  var getColumn: ParamsColumnidRequired
  var listCards: ParamsArchivedstate
  var listCollaborators: ParamsAffiliation
  var listColumns: ParamsPerpageProjectid
  var listForOrg: ParamsOrgPagePerpage
  var listForRepo: ParamsRepoState
  var listForUser: ParamsStateUsername
  var moveCard: ParamsPosition
  var moveColumn: ParamsColumnidPosition
  var removeCollaborator: ParamsProjectidUsername
  var reviewUserPermissionLevel: ParamsProjectidUsername
  var update: ParamsOrganizationpermission
  var updateCard: ParamsArchived
  var updateColumn: ParamsColumnidName
}

object AddCollaborator {
  @scala.inline
  def apply(
    addCollaborator: ParamsPermission,
    createCard: ParamsColumnid,
    createColumn: ParamsProjectid,
    createForAuthenticatedUser: ParamsBodyName,
    createForOrg: ParamsNameOrg,
    createForRepo: ParamsNameOwner,
    delete: ParamsProjectidRequired,
    deleteCard: ParamsCardid,
    deleteColumn: ParamsColumnidRequired,
    get: ParamsProjectidRequired,
    getCard: ParamsCardid,
    getColumn: ParamsColumnidRequired,
    listCards: ParamsArchivedstate,
    listCollaborators: ParamsAffiliation,
    listColumns: ParamsPerpageProjectid,
    listForOrg: ParamsOrgPagePerpage,
    listForRepo: ParamsRepoState,
    listForUser: ParamsStateUsername,
    moveCard: ParamsPosition,
    moveColumn: ParamsColumnidPosition,
    removeCollaborator: ParamsProjectidUsername,
    reviewUserPermissionLevel: ParamsProjectidUsername,
    update: ParamsOrganizationpermission,
    updateCard: ParamsArchived,
    updateColumn: ParamsColumnidName
  ): AddCollaborator = {
    val __obj = js.Dynamic.literal(addCollaborator = addCollaborator.asInstanceOf[js.Any], createCard = createCard.asInstanceOf[js.Any], createColumn = createColumn.asInstanceOf[js.Any], createForAuthenticatedUser = createForAuthenticatedUser.asInstanceOf[js.Any], createForOrg = createForOrg.asInstanceOf[js.Any], createForRepo = createForRepo.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], deleteCard = deleteCard.asInstanceOf[js.Any], deleteColumn = deleteColumn.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], getCard = getCard.asInstanceOf[js.Any], getColumn = getColumn.asInstanceOf[js.Any], listCards = listCards.asInstanceOf[js.Any], listCollaborators = listCollaborators.asInstanceOf[js.Any], listColumns = listColumns.asInstanceOf[js.Any], listForOrg = listForOrg.asInstanceOf[js.Any], listForRepo = listForRepo.asInstanceOf[js.Any], listForUser = listForUser.asInstanceOf[js.Any], moveCard = moveCard.asInstanceOf[js.Any], moveColumn = moveColumn.asInstanceOf[js.Any], removeCollaborator = removeCollaborator.asInstanceOf[js.Any], reviewUserPermissionLevel = reviewUserPermissionLevel.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any], updateCard = updateCard.asInstanceOf[js.Any], updateColumn = updateColumn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddCollaborator]
  }
}

