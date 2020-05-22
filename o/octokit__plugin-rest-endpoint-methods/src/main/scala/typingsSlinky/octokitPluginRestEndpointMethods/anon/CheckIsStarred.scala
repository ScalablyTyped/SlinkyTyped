package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckIsStarred extends js.Object {
  var checkIsStarred: ParamsGistid
  var create: ParamsDescription
  var createComment: ParamsBodyGistid
  var delete: ParamsGistid
  var deleteComment: ParamsCommentid
  var fork: ParamsGistid
  var get: ParamsGistid
  var getComment: ParamsCommentid
  var getRevision: ParamsSha
  var list: ParamsSince
  var listComments: ParamsGistidPage
  var listCommits: ParamsGistidPage
  var listForks: ParamsGistidPage
  var listPublic: ParamsSince
  var listPublicForUser: ParamsPerpageSince
  var listStarred: ParamsSince
  var star: ParamsGistid
  var unstar: ParamsGistid
  var update: ParamsFiles
  var updateComment: ParamsBodyCommentid
}

object CheckIsStarred {
  @scala.inline
  def apply(
    checkIsStarred: ParamsGistid,
    create: ParamsDescription,
    createComment: ParamsBodyGistid,
    delete: ParamsGistid,
    deleteComment: ParamsCommentid,
    fork: ParamsGistid,
    get: ParamsGistid,
    getComment: ParamsCommentid,
    getRevision: ParamsSha,
    list: ParamsSince,
    listComments: ParamsGistidPage,
    listCommits: ParamsGistidPage,
    listForks: ParamsGistidPage,
    listPublic: ParamsSince,
    listPublicForUser: ParamsPerpageSince,
    listStarred: ParamsSince,
    star: ParamsGistid,
    unstar: ParamsGistid,
    update: ParamsFiles,
    updateComment: ParamsBodyCommentid
  ): CheckIsStarred = {
    val __obj = js.Dynamic.literal(checkIsStarred = checkIsStarred.asInstanceOf[js.Any], create = create.asInstanceOf[js.Any], createComment = createComment.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], deleteComment = deleteComment.asInstanceOf[js.Any], fork = fork.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], getComment = getComment.asInstanceOf[js.Any], getRevision = getRevision.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], listComments = listComments.asInstanceOf[js.Any], listCommits = listCommits.asInstanceOf[js.Any], listForks = listForks.asInstanceOf[js.Any], listPublic = listPublic.asInstanceOf[js.Any], listPublicForUser = listPublicForUser.asInstanceOf[js.Any], listStarred = listStarred.asInstanceOf[js.Any], star = star.asInstanceOf[js.Any], unstar = unstar.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any], updateComment = updateComment.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckIsStarred]
  }
}

