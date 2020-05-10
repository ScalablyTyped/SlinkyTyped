package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCheckIsStarred extends js.Object {
  var checkIsStarred: AnonParamsAnonGistid = js.native
  var create: AnonParamsAnonDescription = js.native
  var createComment: AnonParamsAnonBodyGistid = js.native
  var delete: AnonParamsAnonGistid = js.native
  var deleteComment: AnonParamsAnonCommentid = js.native
  var fork: AnonParamsAnonGistid = js.native
  var get: AnonParamsAnonGistid = js.native
  var getComment: AnonParamsAnonCommentid = js.native
  var getRevision: AnonParamsAnonSha = js.native
  var list: AnonParamsAnonSince = js.native
  var listComments: AnonParamsAnonGistidPage = js.native
  var listCommits: AnonParamsAnonGistidPage = js.native
  var listForks: AnonParamsAnonGistidPage = js.native
  var listPublic: AnonParamsAnonSince = js.native
  var listPublicForUser: AnonParamsAnonPerpageSince = js.native
  var listStarred: AnonParamsAnonSince = js.native
  var star: AnonParamsAnonGistid = js.native
  var unstar: AnonParamsAnonGistid = js.native
  var update: AnonParamsAnonFiles = js.native
  var updateComment: AnonParamsAnonBodyCommentid = js.native
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
  @scala.inline
  implicit class AnonCheckIsStarredOps[Self <: AnonCheckIsStarred] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckIsStarred(value: AnonParamsAnonGistid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkIsStarred")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreate(value: AnonParamsAnonDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateComment(value: AnonParamsAnonBodyGistid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelete(value: AnonParamsAnonGistid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteComment(value: AnonParamsAnonCommentid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFork(value: AnonParamsAnonGistid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fork")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGet(value: AnonParamsAnonGistid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetComment(value: AnonParamsAnonCommentid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetRevision(value: AnonParamsAnonSha): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRevision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withList(value: AnonParamsAnonSince): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListComments(value: AnonParamsAnonGistidPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listComments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListCommits(value: AnonParamsAnonGistidPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listCommits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListForks(value: AnonParamsAnonGistidPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listForks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListPublic(value: AnonParamsAnonSince): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listPublic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListPublicForUser(value: AnonParamsAnonPerpageSince): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listPublicForUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListStarred(value: AnonParamsAnonSince): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listStarred")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStar(value: AnonParamsAnonGistid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("star")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnstar(value: AnonParamsAnonGistid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unstar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdate(value: AnonParamsAnonFiles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateComment(value: AnonParamsAnonBodyCommentid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateComment")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

