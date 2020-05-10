package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INxTreeNode extends js.Object {
  /**
    * Attribute dimension values.
    */
  var qAttrDims: js.UndefOr[INxAttributeDimValues] = js.native
  /**
    * Attribute expression values.
    */
  var qAttrExps: js.UndefOr[INxAttributeExpressionValues] = js.native
  /**
    * Element number
    */
  var qElemNo: Double = js.native
  /**
    * A generated number applicable to this page only. Used so that children can easily identify who their parents are.
    */
  var qNodeNr: Double = js.native
  /**
    * The children of this node in the tree structure.
    */
  var qNodes: INxTreeNode = js.native
  /**
    * The qNodeNr of this node's parent for the current page.
    */
  var qParentNode: Double = js.native
  /**
    * Row index in the data matrix.
    * The indexing starts from 0.
    */
  var qRow: Double = js.native
  /**
    * The text version of the value, if available.
    */
  var qText: String = js.native
  /**
    * Type of the cell.
    */
  var qType: NxTreeNodeType = js.native
  /**
    * The measures for this node.
    */
  var qValues: INxTreeValue = js.native
}

object INxTreeNode {
  @scala.inline
  def apply(
    qElemNo: Double,
    qNodeNr: Double,
    qNodes: INxTreeNode,
    qParentNode: Double,
    qRow: Double,
    qText: String,
    qType: NxTreeNodeType,
    qValues: INxTreeValue
  ): INxTreeNode = {
    val __obj = js.Dynamic.literal(qElemNo = qElemNo.asInstanceOf[js.Any], qNodeNr = qNodeNr.asInstanceOf[js.Any], qNodes = qNodes.asInstanceOf[js.Any], qParentNode = qParentNode.asInstanceOf[js.Any], qRow = qRow.asInstanceOf[js.Any], qText = qText.asInstanceOf[js.Any], qType = qType.asInstanceOf[js.Any], qValues = qValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxTreeNode]
  }
  @scala.inline
  implicit class INxTreeNodeOps[Self <: INxTreeNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQElemNo(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qElemNo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQNodeNr(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qNodeNr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQNodes(value: INxTreeNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQParentNode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qParentNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQRow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQType(value: NxTreeNodeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQValues(value: INxTreeValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQAttrDims(value: INxAttributeDimValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qAttrDims")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQAttrDims: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qAttrDims")(js.undefined)
        ret
    }
    @scala.inline
    def withQAttrExps(value: INxAttributeExpressionValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qAttrExps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQAttrExps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qAttrExps")(js.undefined)
        ret
    }
  }
  
}

