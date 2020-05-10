package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INxPageTreeNode extends js.Object {
  /**
    * When set to true, generated nodes (based on current selection) will be inserted into the returned tree even when
    * there is no actual value. For example, suppose you are looking for hybrid car sales at all car dealerships.
    * Normally, only dealerships where hybrid cars are sold would be part of the returned tree but with qAllValues set to true,
    * all available dealerships will be included regardless if they sold any hybrid cars or not.
    */
  var qAllValues: Boolean = js.native
  /**
    * The area of the tree to be fetched. If no area is defined on a dimension, all existing nodes are included.
    */
  var qArea: IRect = js.native
}

object INxPageTreeNode {
  @scala.inline
  def apply(qAllValues: Boolean, qArea: IRect): INxPageTreeNode = {
    val __obj = js.Dynamic.literal(qAllValues = qAllValues.asInstanceOf[js.Any], qArea = qArea.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxPageTreeNode]
  }
  @scala.inline
  implicit class INxPageTreeNodeOps[Self <: INxPageTreeNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQAllValues(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qAllValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQArea(value: IRect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qArea")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

