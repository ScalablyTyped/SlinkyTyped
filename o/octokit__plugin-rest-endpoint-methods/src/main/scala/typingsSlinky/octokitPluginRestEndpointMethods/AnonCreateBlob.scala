package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCreateBlob extends js.Object {
  var createBlob: AnonParamsAnonContent = js.native
  var createCommit: AnonParamsAnonAuthor = js.native
  var createRef: AnonParamsAnonRef = js.native
  var createTag: AnonParamsAnonMessage = js.native
  var createTree: AnonParamsAnonBasetree = js.native
  var deleteRef: AnonParamsAnonOwnerRef = js.native
  var getBlob: AnonParamsAnonFilesha = js.native
  var getCommit: AnonParamsAnonCommitsha = js.native
  var getRef: AnonParamsAnonOwnerRef = js.native
  var getTag: AnonParamsAnonTagsha = js.native
  var getTree: AnonParamsAnonRecursive = js.native
  var listMatchingRefs: AnonParamsAnonPerpageRef = js.native
  var listRefs: AnonParamsAnonNamespace = js.native
  var updateRef: AnonParamsAnonForce = js.native
}

object AnonCreateBlob {
  @scala.inline
  def apply(
    createBlob: AnonParamsAnonContent,
    createCommit: AnonParamsAnonAuthor,
    createRef: AnonParamsAnonRef,
    createTag: AnonParamsAnonMessage,
    createTree: AnonParamsAnonBasetree,
    deleteRef: AnonParamsAnonOwnerRef,
    getBlob: AnonParamsAnonFilesha,
    getCommit: AnonParamsAnonCommitsha,
    getRef: AnonParamsAnonOwnerRef,
    getTag: AnonParamsAnonTagsha,
    getTree: AnonParamsAnonRecursive,
    listMatchingRefs: AnonParamsAnonPerpageRef,
    listRefs: AnonParamsAnonNamespace,
    updateRef: AnonParamsAnonForce
  ): AnonCreateBlob = {
    val __obj = js.Dynamic.literal(createBlob = createBlob.asInstanceOf[js.Any], createCommit = createCommit.asInstanceOf[js.Any], createRef = createRef.asInstanceOf[js.Any], createTag = createTag.asInstanceOf[js.Any], createTree = createTree.asInstanceOf[js.Any], deleteRef = deleteRef.asInstanceOf[js.Any], getBlob = getBlob.asInstanceOf[js.Any], getCommit = getCommit.asInstanceOf[js.Any], getRef = getRef.asInstanceOf[js.Any], getTag = getTag.asInstanceOf[js.Any], getTree = getTree.asInstanceOf[js.Any], listMatchingRefs = listMatchingRefs.asInstanceOf[js.Any], listRefs = listRefs.asInstanceOf[js.Any], updateRef = updateRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCreateBlob]
  }
  @scala.inline
  implicit class AnonCreateBlobOps[Self <: AnonCreateBlob] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateBlob(value: AnonParamsAnonContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createBlob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateCommit(value: AnonParamsAnonAuthor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createCommit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateRef(value: AnonParamsAnonRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateTag(value: AnonParamsAnonMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateTree(value: AnonParamsAnonBasetree): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTree")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteRef(value: AnonParamsAnonOwnerRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetBlob(value: AnonParamsAnonFilesha): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBlob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetCommit(value: AnonParamsAnonCommitsha): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCommit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetRef(value: AnonParamsAnonOwnerRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetTag(value: AnonParamsAnonTagsha): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetTree(value: AnonParamsAnonRecursive): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTree")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListMatchingRefs(value: AnonParamsAnonPerpageRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listMatchingRefs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListRefs(value: AnonParamsAnonNamespace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listRefs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateRef(value: AnonParamsAnonForce): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateRef")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

