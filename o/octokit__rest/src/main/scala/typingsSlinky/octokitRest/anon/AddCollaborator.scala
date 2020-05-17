package typingsSlinky.octokitRest.anon

import typingsSlinky.octokitRest.mod.Octokit.AnyResponse
import typingsSlinky.octokitRest.mod.Octokit.ProjectsAddCollaboratorParams
import typingsSlinky.octokitRest.mod.Octokit.ProjectsCreateCardParams
import typingsSlinky.octokitRest.mod.Octokit.ProjectsCreateCardResponse
import typingsSlinky.octokitRest.mod.Octokit.ProjectsCreateColumnParams
import typingsSlinky.octokitRest.mod.Octokit.ProjectsCreateColumnResponse
import typingsSlinky.octokitRest.mod.Octokit.ProjectsCreateForAuthenticatedUserParams
import typingsSlinky.octokitRest.mod.Octokit.ProjectsCreateForAuthenticatedUserResponse
import typingsSlinky.octokitRest.mod.Octokit.ProjectsCreateForOrgParams
import typingsSlinky.octokitRest.mod.Octokit.ProjectsCreateForOrgResponse
import typingsSlinky.octokitRest.mod.Octokit.ProjectsCreateForRepoParams
import typingsSlinky.octokitRest.mod.Octokit.ProjectsCreateForRepoResponse
import typingsSlinky.octokitRest.mod.Octokit.ProjectsDeleteCardParams
import typingsSlinky.octokitRest.mod.Octokit.ProjectsDeleteColumnParams
import typingsSlinky.octokitRest.mod.Octokit.ProjectsDeleteParams
import typingsSlinky.octokitRest.mod.Octokit.ProjectsGetCardParams
import typingsSlinky.octokitRest.mod.Octokit.ProjectsGetCardResponse
import typingsSlinky.octokitRest.mod.Octokit.ProjectsGetColumnParams
import typingsSlinky.octokitRest.mod.Octokit.ProjectsGetColumnResponse
import typingsSlinky.octokitRest.mod.Octokit.ProjectsGetParams
import typingsSlinky.octokitRest.mod.Octokit.ProjectsGetResponse
import typingsSlinky.octokitRest.mod.Octokit.ProjectsListCardsParams
import typingsSlinky.octokitRest.mod.Octokit.ProjectsListCardsResponse
import typingsSlinky.octokitRest.mod.Octokit.ProjectsListCollaboratorsParams
import typingsSlinky.octokitRest.mod.Octokit.ProjectsListCollaboratorsResponse
import typingsSlinky.octokitRest.mod.Octokit.ProjectsListColumnsParams
import typingsSlinky.octokitRest.mod.Octokit.ProjectsListColumnsResponse
import typingsSlinky.octokitRest.mod.Octokit.ProjectsListForOrgParams
import typingsSlinky.octokitRest.mod.Octokit.ProjectsListForOrgResponse
import typingsSlinky.octokitRest.mod.Octokit.ProjectsListForRepoParams
import typingsSlinky.octokitRest.mod.Octokit.ProjectsListForRepoResponse
import typingsSlinky.octokitRest.mod.Octokit.ProjectsListForUserParams
import typingsSlinky.octokitRest.mod.Octokit.ProjectsListForUserResponse
import typingsSlinky.octokitRest.mod.Octokit.ProjectsMoveCardParams
import typingsSlinky.octokitRest.mod.Octokit.ProjectsMoveColumnParams
import typingsSlinky.octokitRest.mod.Octokit.ProjectsRemoveCollaboratorParams
import typingsSlinky.octokitRest.mod.Octokit.ProjectsReviewUserPermissionLevelParams
import typingsSlinky.octokitRest.mod.Octokit.ProjectsReviewUserPermissionLevelResponse
import typingsSlinky.octokitRest.mod.Octokit.ProjectsUpdateCardParams
import typingsSlinky.octokitRest.mod.Octokit.ProjectsUpdateCardResponse
import typingsSlinky.octokitRest.mod.Octokit.ProjectsUpdateColumnParams
import typingsSlinky.octokitRest.mod.Octokit.ProjectsUpdateColumnResponse
import typingsSlinky.octokitRest.mod.Octokit.ProjectsUpdateParams
import typingsSlinky.octokitRest.mod.Octokit.ProjectsUpdateResponse
import typingsSlinky.octokitRest.mod.Octokit.RequestOptions
import typingsSlinky.octokitRest.mod.Octokit.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddCollaborator extends js.Object {
  /**
    * Adds a collaborator to a an organization project and sets their permission level. You must be an organization owner or a project `admin` to add a collaborator.
    */
  @JSName("addCollaborator")
  var addCollaborator_Original: `265` = js.native
  /**
    * **Note**: GitHub's REST API v3 considers every pull request an issue, but not every issue is a pull request. For this reason, "Issues" endpoints may return both issues and pull requests in the response. You can identify pull requests by the `pull_request` key.
    *
    * Be aware that the `id` of a pull request returned from "Issues" endpoints will be an _issue id_. To find out the pull request id, use the "[List pull requests](https://developer.github.com/v3/pulls/#list-pull-requests)" endpoint.
    */
  @JSName("createCard")
  var createCard_Original: `266` = js.native
  @JSName("createColumn")
  var createColumn_Original: `267` = js.native
  @JSName("createForAuthenticatedUser")
  var createForAuthenticatedUser_Original: `268` = js.native
  /**
    * Creates an organization project board. Returns a `404 Not Found` status if projects are disabled in the organization. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.
    */
  @JSName("createForOrg")
  var createForOrg_Original: `269` = js.native
  /**
    * Creates a repository project board. Returns a `404 Not Found` status if projects are disabled in the repository. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.
    */
  @JSName("createForRepo")
  var createForRepo_Original: `270` = js.native
  @JSName("deleteCard")
  var deleteCard_Original: `272` = js.native
  @JSName("deleteColumn")
  var deleteColumn_Original: `273` = js.native
  /**
    * Deletes a project board. Returns a `404 Not Found` status if projects are disabled.
    */
  @JSName("delete")
  var delete_Original: `271` = js.native
  @JSName("getCard")
  var getCard_Original: `275` = js.native
  @JSName("getColumn")
  var getColumn_Original: `276` = js.native
  /**
    * Gets a project by its `id`. Returns a `404 Not Found` status if projects are disabled. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.
    */
  @JSName("get")
  var get_Original: `274` = js.native
  @JSName("listCards")
  var listCards_Original: `277` = js.native
  /**
    * Lists the collaborators for an organization project. For a project, the list of collaborators includes outside collaborators, organization members that are direct collaborators, organization members with access through team memberships, organization members with access through default organization permissions, and organization owners. You must be an organization owner or a project `admin` to list collaborators.
    */
  @JSName("listCollaborators")
  var listCollaborators_Original: `278` = js.native
  @JSName("listColumns")
  var listColumns_Original: `279` = js.native
  /**
    * Lists the projects in an organization. Returns a `404 Not Found` status if projects are disabled in the organization. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.
    *
    * s
    */
  @JSName("listForOrg")
  var listForOrg_Original: `280` = js.native
  /**
    * Lists the projects in a repository. Returns a `404 Not Found` status if projects are disabled in the repository. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.
    */
  @JSName("listForRepo")
  var listForRepo_Original: `281` = js.native
  @JSName("listForUser")
  var listForUser_Original: `282` = js.native
  @JSName("moveCard")
  var moveCard_Original: `283` = js.native
  @JSName("moveColumn")
  var moveColumn_Original: `284` = js.native
  /**
    * Removes a collaborator from an organization project. You must be an organization owner or a project `admin` to remove a collaborator.
    */
  @JSName("removeCollaborator")
  var removeCollaborator_Original: `285` = js.native
  /**
    * Returns the collaborator's permission level for an organization project. Possible values for the `permission` key: `admin`, `write`, `read`, `none`. You must be an organization owner or a project `admin` to review a user's permission level.
    */
  @JSName("reviewUserPermissionLevel")
  var reviewUserPermissionLevel_Original: `286` = js.native
  @JSName("updateCard")
  var updateCard_Original: `288` = js.native
  @JSName("updateColumn")
  var updateColumn_Original: `289` = js.native
  /**
    * Updates a project board's information. Returns a `404 Not Found` status if projects are disabled. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.
    */
  @JSName("update")
  var update_Original: `287` = js.native
  /**
    * Adds a collaborator to a an organization project and sets their permission level. You must be an organization owner or a project `admin` to add a collaborator.
    */
  def addCollaborator(): js.Promise[AnyResponse] = js.native
  def addCollaborator(params: RequestOptions with ProjectsAddCollaboratorParams): js.Promise[AnyResponse] = js.native
  /**
    * **Note**: GitHub's REST API v3 considers every pull request an issue, but not every issue is a pull request. For this reason, "Issues" endpoints may return both issues and pull requests in the response. You can identify pull requests by the `pull_request` key.
    *
    * Be aware that the `id` of a pull request returned from "Issues" endpoints will be an _issue id_. To find out the pull request id, use the "[List pull requests](https://developer.github.com/v3/pulls/#list-pull-requests)" endpoint.
    */
  def createCard(): js.Promise[Response[ProjectsCreateCardResponse]] = js.native
  def createCard(params: RequestOptions with ProjectsCreateCardParams): js.Promise[Response[ProjectsCreateCardResponse]] = js.native
  def createColumn(): js.Promise[Response[ProjectsCreateColumnResponse]] = js.native
  def createColumn(params: RequestOptions with ProjectsCreateColumnParams): js.Promise[Response[ProjectsCreateColumnResponse]] = js.native
  def createForAuthenticatedUser(): js.Promise[Response[ProjectsCreateForAuthenticatedUserResponse]] = js.native
  def createForAuthenticatedUser(params: RequestOptions with ProjectsCreateForAuthenticatedUserParams): js.Promise[Response[ProjectsCreateForAuthenticatedUserResponse]] = js.native
  /**
    * Creates an organization project board. Returns a `404 Not Found` status if projects are disabled in the organization. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.
    */
  def createForOrg(): js.Promise[Response[ProjectsCreateForOrgResponse]] = js.native
  def createForOrg(params: RequestOptions with ProjectsCreateForOrgParams): js.Promise[Response[ProjectsCreateForOrgResponse]] = js.native
  /**
    * Creates a repository project board. Returns a `404 Not Found` status if projects are disabled in the repository. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.
    */
  def createForRepo(): js.Promise[Response[ProjectsCreateForRepoResponse]] = js.native
  def createForRepo(params: RequestOptions with ProjectsCreateForRepoParams): js.Promise[Response[ProjectsCreateForRepoResponse]] = js.native
  /**
    * Deletes a project board. Returns a `404 Not Found` status if projects are disabled.
    */
  def delete(): js.Promise[AnyResponse] = js.native
  def delete(params: RequestOptions with ProjectsDeleteParams): js.Promise[AnyResponse] = js.native
  def deleteCard(): js.Promise[AnyResponse] = js.native
  def deleteCard(params: RequestOptions with ProjectsDeleteCardParams): js.Promise[AnyResponse] = js.native
  def deleteColumn(): js.Promise[AnyResponse] = js.native
  def deleteColumn(params: RequestOptions with ProjectsDeleteColumnParams): js.Promise[AnyResponse] = js.native
  /**
    * Gets a project by its `id`. Returns a `404 Not Found` status if projects are disabled. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.
    */
  def get(): js.Promise[Response[ProjectsGetResponse]] = js.native
  def get(params: RequestOptions with ProjectsGetParams): js.Promise[Response[ProjectsGetResponse]] = js.native
  def getCard(): js.Promise[Response[ProjectsGetCardResponse]] = js.native
  def getCard(params: RequestOptions with ProjectsGetCardParams): js.Promise[Response[ProjectsGetCardResponse]] = js.native
  def getColumn(): js.Promise[Response[ProjectsGetColumnResponse]] = js.native
  def getColumn(params: RequestOptions with ProjectsGetColumnParams): js.Promise[Response[ProjectsGetColumnResponse]] = js.native
  def listCards(): js.Promise[Response[ProjectsListCardsResponse]] = js.native
  def listCards(params: RequestOptions with ProjectsListCardsParams): js.Promise[Response[ProjectsListCardsResponse]] = js.native
  /**
    * Lists the collaborators for an organization project. For a project, the list of collaborators includes outside collaborators, organization members that are direct collaborators, organization members with access through team memberships, organization members with access through default organization permissions, and organization owners. You must be an organization owner or a project `admin` to list collaborators.
    */
  def listCollaborators(): js.Promise[Response[ProjectsListCollaboratorsResponse]] = js.native
  def listCollaborators(params: RequestOptions with ProjectsListCollaboratorsParams): js.Promise[Response[ProjectsListCollaboratorsResponse]] = js.native
  def listColumns(): js.Promise[Response[ProjectsListColumnsResponse]] = js.native
  def listColumns(params: RequestOptions with ProjectsListColumnsParams): js.Promise[Response[ProjectsListColumnsResponse]] = js.native
  /**
    * Lists the projects in an organization. Returns a `404 Not Found` status if projects are disabled in the organization. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.
    *
    * s
    */
  def listForOrg(): js.Promise[Response[ProjectsListForOrgResponse]] = js.native
  def listForOrg(params: RequestOptions with ProjectsListForOrgParams): js.Promise[Response[ProjectsListForOrgResponse]] = js.native
  /**
    * Lists the projects in a repository. Returns a `404 Not Found` status if projects are disabled in the repository. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.
    */
  def listForRepo(): js.Promise[Response[ProjectsListForRepoResponse]] = js.native
  def listForRepo(params: RequestOptions with ProjectsListForRepoParams): js.Promise[Response[ProjectsListForRepoResponse]] = js.native
  def listForUser(): js.Promise[Response[ProjectsListForUserResponse]] = js.native
  def listForUser(params: RequestOptions with ProjectsListForUserParams): js.Promise[Response[ProjectsListForUserResponse]] = js.native
  def moveCard(): js.Promise[AnyResponse] = js.native
  def moveCard(params: RequestOptions with ProjectsMoveCardParams): js.Promise[AnyResponse] = js.native
  def moveColumn(): js.Promise[AnyResponse] = js.native
  def moveColumn(params: RequestOptions with ProjectsMoveColumnParams): js.Promise[AnyResponse] = js.native
  /**
    * Removes a collaborator from an organization project. You must be an organization owner or a project `admin` to remove a collaborator.
    */
  def removeCollaborator(): js.Promise[AnyResponse] = js.native
  def removeCollaborator(params: RequestOptions with ProjectsRemoveCollaboratorParams): js.Promise[AnyResponse] = js.native
  /**
    * Returns the collaborator's permission level for an organization project. Possible values for the `permission` key: `admin`, `write`, `read`, `none`. You must be an organization owner or a project `admin` to review a user's permission level.
    */
  def reviewUserPermissionLevel(): js.Promise[Response[ProjectsReviewUserPermissionLevelResponse]] = js.native
  def reviewUserPermissionLevel(params: RequestOptions with ProjectsReviewUserPermissionLevelParams): js.Promise[Response[ProjectsReviewUserPermissionLevelResponse]] = js.native
  /**
    * Updates a project board's information. Returns a `404 Not Found` status if projects are disabled. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.
    */
  def update(): js.Promise[Response[ProjectsUpdateResponse]] = js.native
  def update(params: RequestOptions with ProjectsUpdateParams): js.Promise[Response[ProjectsUpdateResponse]] = js.native
  def updateCard(): js.Promise[Response[ProjectsUpdateCardResponse]] = js.native
  def updateCard(params: RequestOptions with ProjectsUpdateCardParams): js.Promise[Response[ProjectsUpdateCardResponse]] = js.native
  def updateColumn(): js.Promise[Response[ProjectsUpdateColumnResponse]] = js.native
  def updateColumn(params: RequestOptions with ProjectsUpdateColumnParams): js.Promise[Response[ProjectsUpdateColumnResponse]] = js.native
}

