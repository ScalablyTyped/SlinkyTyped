package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCheckIsStarred extends js.Object {
  var checkIsStarred: AnonParamsAnonGistid
  var create: AnonParamsAnonDescription
  var createComment: AnonParamsAnonBodyGistid
  var delete: AnonParamsAnonGistid
  var deleteComment: AnonParamsAnonCommentid
  var fork: AnonParamsAnonGistid
  var get: AnonParamsAnonGistid
  var getComment: AnonParamsAnonCommentid
  var getRevision: AnonParamsAnonSha
  var list: AnonParamsAnonSince
  var listComments: AnonParamsAnonGistidPage
  var listCommits: AnonParamsAnonGistidPage
  var listForks: AnonParamsAnonGistidPage
  var listPublic: AnonParamsAnonSince
  var listPublicForUser: AnonParamsAnonPerpageSince
  var listStarred: AnonParamsAnonSince
  var star: AnonParamsAnonGistid
  var unstar: AnonParamsAnonGistid
  var update: AnonParamsAnonFiles
  var updateComment: AnonParamsAnonBodyCommentid
}

object AnonCheckIsStarred {
  @scala.inline
  def apply(
    checkIsStarred: AnonParamsAnonGistid,
    create: AnonParamsAnonDescription,
    createComment: AnonParamsAnonBodyGistid,
    delete: AnonParamsAnonGistid,
    deleteComment: AnonParamsAnonCommentid,
    fork: AnonParamsAnonGistid,
    get: AnonParamsAnonGistid,
    getComment: AnonParamsAnonCommentid,
    getRevision: AnonParamsAnonSha,
    list: AnonParamsAnonSince,
    listComments: AnonParamsAnonGistidPage,
    listCommits: AnonParamsAnonGistidPage,
    listForks: AnonParamsAnonGistidPage,
    listPublic: AnonParamsAnonSince,
    listPublicForUser: AnonParamsAnonPerpageSince,
    listStarred: AnonParamsAnonSince,
    star: AnonParamsAnonGistid,
    unstar: AnonParamsAnonGistid,
    update: AnonParamsAnonFiles,
    updateComment: AnonParamsAnonBodyCommentid
  ): AnonCheckIsStarred = {
    val __obj = js.Dynamic.literal(checkIsStarred = checkIsStarred.asInstanceOf[js.Any], create = create.asInstanceOf[js.Any], createComment = createComment.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], deleteComment = deleteComment.asInstanceOf[js.Any], fork = fork.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], getComment = getComment.asInstanceOf[js.Any], getRevision = getRevision.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], listComments = listComments.asInstanceOf[js.Any], listCommits = listCommits.asInstanceOf[js.Any], listForks = listForks.asInstanceOf[js.Any], listPublic = listPublic.asInstanceOf[js.Any], listPublicForUser = listPublicForUser.asInstanceOf[js.Any], listStarred = listStarred.asInstanceOf[js.Any], star = star.asInstanceOf[js.Any], unstar = unstar.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any], updateComment = updateComment.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCheckIsStarred]
  }
}

