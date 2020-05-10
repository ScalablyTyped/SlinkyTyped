package typingsSlinky.firebaseDatabase.childrenNodeMod.firebaseDatabaseDistSrcCoreSnapNodeAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NamedNode extends js.Object {
  var MAX: NamedNode = js.native
  var MIN: NamedNode = js.native
}

object NamedNode {
  @scala.inline
  def apply(MAX: NamedNode, MIN: NamedNode): NamedNode = {
    val __obj = js.Dynamic.literal(MAX = MAX.asInstanceOf[js.Any], MIN = MIN.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamedNode]
  }
  @scala.inline
  implicit class NamedNodeOps[Self <: NamedNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMAX(value: NamedNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MAX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMIN(value: NamedNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MIN")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

