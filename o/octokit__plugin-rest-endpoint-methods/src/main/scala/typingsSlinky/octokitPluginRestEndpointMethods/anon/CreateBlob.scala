package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateBlob extends js.Object {
  var createBlob: ParamsContent
  var createCommit: ParamsAuthor
  var createRef: ParamsRef
  var createTag: ParamsMessage
  var createTree: ParamsBasetree
  var deleteRef: ParamsOwnerRef
  var getBlob: ParamsFilesha
  var getCommit: ParamsCommitsha
  var getRef: ParamsOwnerRef
  var getTag: ParamsTagsha
  var getTree: ParamsRecursive
  var listMatchingRefs: ParamsPerpageRef
  var listRefs: ParamsNamespace
  var updateRef: ParamsForce
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
}

