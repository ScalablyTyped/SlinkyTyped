package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckIsStarred extends js.Object {
  var checkIsStarred: ParamsGistid = js.native
  var create: ParamsDescription = js.native
  var createComment: ParamsBodyGistid = js.native
  var delete: ParamsGistid = js.native
  var deleteComment: ParamsCommentid = js.native
  var fork: ParamsGistid = js.native
  var get: ParamsGistid = js.native
  var getComment: ParamsCommentid = js.native
  var getRevision: ParamsSha = js.native
  var list: ParamsSince = js.native
  var listComments: ParamsGistidPage = js.native
  var listCommits: ParamsGistidPage = js.native
  var listForks: ParamsGistidPage = js.native
  var listPublic: ParamsSince = js.native
  var listPublicForUser: ParamsPerpageSince = js.native
  var listStarred: ParamsSince = js.native
  var star: ParamsGistid = js.native
  var unstar: ParamsGistid = js.native
  var update: ParamsFiles = js.native
  var updateComment: ParamsBodyCommentid = js.native
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
  @scala.inline
  implicit class CheckIsStarredOps[Self <: CheckIsStarred] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckIsStarred(value: ParamsGistid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkIsStarred")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreate(value: ParamsDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateComment(value: ParamsBodyGistid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelete(value: ParamsGistid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteComment(value: ParamsCommentid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFork(value: ParamsGistid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fork")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGet(value: ParamsGistid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetComment(value: ParamsCommentid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetRevision(value: ParamsSha): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRevision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withList(value: ParamsSince): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListComments(value: ParamsGistidPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listComments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListCommits(value: ParamsGistidPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listCommits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListForks(value: ParamsGistidPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listForks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListPublic(value: ParamsSince): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listPublic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListPublicForUser(value: ParamsPerpageSince): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listPublicForUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListStarred(value: ParamsSince): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listStarred")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStar(value: ParamsGistid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("star")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnstar(value: ParamsGistid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unstar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdate(value: ParamsFiles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateComment(value: ParamsBodyCommentid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateComment")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

