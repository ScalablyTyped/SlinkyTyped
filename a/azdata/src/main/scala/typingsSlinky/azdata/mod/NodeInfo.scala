package typingsSlinky.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeInfo extends js.Object {
  /**
  		 * Informs who provides the children to a node, used by data explorer tree view api
  		 */
  var childProvider: js.UndefOr[String] = js.native
  var errorMessage: String = js.native
  /**
  		 * Optional iconType for the object in the tree. Currently this only supports
  		 * an icon name or SqlThemeIcon name, rather than a path to an icon.
  		 * If not defined, the nodeType + nodeStatus / nodeSubType values
  		 * will be used instead.
  		 */
  var iconType: js.UndefOr[String | SqlThemeIcon] = js.native
  var isLeaf: Boolean = js.native
  var label: String = js.native
  var metadata: ObjectMetadata = js.native
  var nodePath: String = js.native
  var nodeStatus: String = js.native
  var nodeSubType: String = js.native
  var nodeType: String = js.native
  /**
  		 * Holds the connection profile for nodes, used by data explorer tree view api
  		 */
  var payload: js.UndefOr[js.Any] = js.native
}

object NodeInfo {
  @scala.inline
  def apply(
    errorMessage: String,
    isLeaf: Boolean,
    label: String,
    metadata: ObjectMetadata,
    nodePath: String,
    nodeStatus: String,
    nodeSubType: String,
    nodeType: String
  ): NodeInfo = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], isLeaf = isLeaf.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], nodePath = nodePath.asInstanceOf[js.Any], nodeStatus = nodeStatus.asInstanceOf[js.Any], nodeSubType = nodeSubType.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeInfo]
  }
  @scala.inline
  implicit class NodeInfoOps[Self <: NodeInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsLeaf(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLeaf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadata(value: ObjectMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeSubType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeSubType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildProvider(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childProvider")(js.undefined)
        ret
    }
    @scala.inline
    def withIconType(value: String | SqlThemeIcon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconType")(js.undefined)
        ret
    }
    @scala.inline
    def withPayload(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(js.undefined)
        ret
    }
  }
  
}

