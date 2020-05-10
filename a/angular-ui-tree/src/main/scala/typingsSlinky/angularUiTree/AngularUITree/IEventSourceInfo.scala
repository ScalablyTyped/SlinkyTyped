package typingsSlinky.angularUiTree.AngularUITree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEventSourceInfo extends js.Object {
  var cloneModel: js.Any = js.native
  var index: Double = js.native
  var nodeScope: ITreeNodeScope = js.native
  var nodesScope: ITreeNodeScope = js.native
}

object IEventSourceInfo {
  @scala.inline
  def apply(cloneModel: js.Any, index: Double, nodeScope: ITreeNodeScope, nodesScope: ITreeNodeScope): IEventSourceInfo = {
    val __obj = js.Dynamic.literal(cloneModel = cloneModel.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], nodeScope = nodeScope.asInstanceOf[js.Any], nodesScope = nodesScope.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEventSourceInfo]
  }
  @scala.inline
  implicit class IEventSourceInfoOps[Self <: IEventSourceInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloneModel(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloneModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeScope(value: ITreeNodeScope): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeScope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodesScope(value: ITreeNodeScope): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodesScope")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

