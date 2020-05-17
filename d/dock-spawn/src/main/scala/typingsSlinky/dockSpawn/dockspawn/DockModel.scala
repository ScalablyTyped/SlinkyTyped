package typingsSlinky.dockSpawn.dockspawn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DockModel extends js.Object {
  var documentManagerNode: DockNode = js.native
  var rootNode: DockNode = js.native
}

object DockModel {
  @scala.inline
  def apply(documentManagerNode: DockNode, rootNode: DockNode): DockModel = {
    val __obj = js.Dynamic.literal(documentManagerNode = documentManagerNode.asInstanceOf[js.Any], rootNode = rootNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DockModel]
  }
  @scala.inline
  implicit class DockModelOps[Self <: DockModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocumentManagerNode(value: DockNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentManagerNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRootNode(value: DockNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootNode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

