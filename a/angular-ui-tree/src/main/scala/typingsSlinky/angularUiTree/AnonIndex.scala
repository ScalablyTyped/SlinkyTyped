package typingsSlinky.angularUiTree

import typingsSlinky.angularUiTree.AngularUITree.IParentTreeNodeScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIndex extends js.Object {
  var index: Double = js.native
  var nodesScope: IParentTreeNodeScope = js.native
}

object AnonIndex {
  @scala.inline
  def apply(index: Double, nodesScope: IParentTreeNodeScope): AnonIndex = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], nodesScope = nodesScope.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIndex]
  }
  @scala.inline
  implicit class AnonIndexOps[Self <: AnonIndex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodesScope(value: IParentTreeNodeScope): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodesScope")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

