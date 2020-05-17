package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateBlob extends js.Object {
  var createBlob: ParamsContent = js.native
  var createCommit: ParamsAuthor = js.native
  var createRef: ParamsRef = js.native
  var createTag: ParamsMessage = js.native
  var createTree: ParamsBasetree = js.native
  var deleteRef: ParamsOwnerRef = js.native
  var getBlob: ParamsFilesha = js.native
  var getCommit: ParamsCommitsha = js.native
  var getRef: ParamsOwnerRef = js.native
  var getTag: ParamsTagsha = js.native
  var getTree: ParamsRecursive = js.native
  var listMatchingRefs: ParamsPerpageRef = js.native
  var listRefs: ParamsNamespace = js.native
  var updateRef: ParamsForce = js.native
}

object CreateBlob {
  @scala.inline
  def apply(
    createBlob: ParamsContent,
    createCommit: ParamsAuthor,
    createRef: ParamsRef,
    createTag: ParamsMessage,
    createTree: ParamsBasetree,
    deleteRef: ParamsOwnerRef,
    getBlob: ParamsFilesha,
    getCommit: ParamsCommitsha,
    getRef: ParamsOwnerRef,
    getTag: ParamsTagsha,
    getTree: ParamsRecursive,
    listMatchingRefs: ParamsPerpageRef,
    listRefs: ParamsNamespace,
    updateRef: ParamsForce
  ): CreateBlob = {
    val __obj = js.Dynamic.literal(createBlob = createBlob.asInstanceOf[js.Any], createCommit = createCommit.asInstanceOf[js.Any], createRef = createRef.asInstanceOf[js.Any], createTag = createTag.asInstanceOf[js.Any], createTree = createTree.asInstanceOf[js.Any], deleteRef = deleteRef.asInstanceOf[js.Any], getBlob = getBlob.asInstanceOf[js.Any], getCommit = getCommit.asInstanceOf[js.Any], getRef = getRef.asInstanceOf[js.Any], getTag = getTag.asInstanceOf[js.Any], getTree = getTree.asInstanceOf[js.Any], listMatchingRefs = listMatchingRefs.asInstanceOf[js.Any], listRefs = listRefs.asInstanceOf[js.Any], updateRef = updateRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBlob]
  }
  @scala.inline
  implicit class CreateBlobOps[Self <: CreateBlob] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateBlob(value: ParamsContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createBlob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateCommit(value: ParamsAuthor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createCommit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateRef(value: ParamsRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateTag(value: ParamsMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateTree(value: ParamsBasetree): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTree")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteRef(value: ParamsOwnerRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetBlob(value: ParamsFilesha): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBlob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetCommit(value: ParamsCommitsha): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCommit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetRef(value: ParamsOwnerRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetTag(value: ParamsTagsha): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetTree(value: ParamsRecursive): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTree")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListMatchingRefs(value: ParamsPerpageRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listMatchingRefs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListRefs(value: ParamsNamespace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listRefs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateRef(value: ParamsForce): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateRef")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

