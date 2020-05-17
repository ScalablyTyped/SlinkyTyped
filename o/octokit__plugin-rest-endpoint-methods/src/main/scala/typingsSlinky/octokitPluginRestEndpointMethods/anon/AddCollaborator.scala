package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddCollaborator extends js.Object {
  var addCollaborator: ParamsPermission = js.native
  var createCard: ParamsColumnid = js.native
  var createColumn: ParamsProjectid = js.native
  var createForAuthenticatedUser: ParamsBodyName = js.native
  var createForOrg: ParamsNameOrg = js.native
  var createForRepo: ParamsNameOwner = js.native
  var delete: ParamsProjectidRequired = js.native
  var deleteCard: ParamsCardid = js.native
  var deleteColumn: ParamsColumnidRequired = js.native
  var get: ParamsProjectidRequired = js.native
  var getCard: ParamsCardid = js.native
  var getColumn: ParamsColumnidRequired = js.native
  var listCards: ParamsArchivedstate = js.native
  var listCollaborators: ParamsAffiliation = js.native
  var listColumns: ParamsPerpageProjectid = js.native
  var listForOrg: ParamsOrgPagePerpage = js.native
  var listForRepo: ParamsRepoState = js.native
  var listForUser: ParamsStateUsername = js.native
  var moveCard: ParamsPosition = js.native
  var moveColumn: ParamsColumnidPosition = js.native
  var removeCollaborator: ParamsProjectidUsername = js.native
  var reviewUserPermissionLevel: ParamsProjectidUsername = js.native
  var update: ParamsOrganizationpermission = js.native
  var updateCard: ParamsArchived = js.native
  var updateColumn: ParamsColumnidName = js.native
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
  @scala.inline
  implicit class AddCollaboratorOps[Self <: AddCollaborator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddCollaborator(value: ParamsPermission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addCollaborator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateCard(value: ParamsColumnid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createCard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateColumn(value: ParamsProjectid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateForAuthenticatedUser(value: ParamsBodyName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createForAuthenticatedUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateForOrg(value: ParamsNameOrg): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createForOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateForRepo(value: ParamsNameOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createForRepo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelete(value: ParamsProjectidRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteCard(value: ParamsCardid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteCard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteColumn(value: ParamsColumnidRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGet(value: ParamsProjectidRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetCard(value: ParamsCardid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetColumn(value: ParamsColumnidRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListCards(value: ParamsArchivedstate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listCards")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListCollaborators(value: ParamsAffiliation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listCollaborators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListColumns(value: ParamsPerpageProjectid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListForOrg(value: ParamsOrgPagePerpage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listForOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListForRepo(value: ParamsRepoState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listForRepo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListForUser(value: ParamsStateUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listForUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMoveCard(value: ParamsPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveCard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMoveColumn(value: ParamsColumnidPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveCollaborator(value: ParamsProjectidUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeCollaborator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReviewUserPermissionLevel(value: ParamsProjectidUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reviewUserPermissionLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdate(value: ParamsOrganizationpermission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateCard(value: ParamsArchived): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateCard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateColumn(value: ParamsColumnidName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateColumn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

