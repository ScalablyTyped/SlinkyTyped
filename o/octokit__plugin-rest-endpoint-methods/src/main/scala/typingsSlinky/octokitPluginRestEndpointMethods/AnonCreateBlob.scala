package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCreateBlob extends js.Object {
  var createBlob: AnonParamsAnonContent
  var createCommit: AnonParamsAnonAuthor
  var createRef: AnonParamsAnonRef
  var createTag: AnonParamsAnonMessage
  var createTree: AnonParamsAnonBasetree
  var deleteRef: AnonParamsAnonOwnerRef
  var getBlob: AnonParamsAnonFilesha
  var getCommit: AnonParamsAnonCommitsha
  var getRef: AnonParamsAnonOwnerRef
  var getTag: AnonParamsAnonTagsha
  var getTree: AnonParamsAnonRecursive
  var listMatchingRefs: AnonParamsAnonPerpageRef
  var listRefs: AnonParamsAnonNamespace
  var updateRef: AnonParamsAnonForce
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
}

