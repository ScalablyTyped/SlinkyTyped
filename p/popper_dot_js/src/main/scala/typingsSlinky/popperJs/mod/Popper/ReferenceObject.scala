package typingsSlinky.popperJs.mod.Popper

import org.scalajs.dom.raw.ClientRect
import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReferenceObject extends js.Object {
  var clientHeight: Double = js.native
  var clientWidth: Double = js.native
  var referenceNode: js.UndefOr[Node] = js.native
  def getBoundingClientRect(): ClientRect = js.native
}

object ReferenceObject {
  @scala.inline
  def apply(clientHeight: Double, clientWidth: Double, getBoundingClientRect: () => ClientRect): ReferenceObject = {
    val __obj = js.Dynamic.literal(clientHeight = clientHeight.asInstanceOf[js.Any], clientWidth = clientWidth.asInstanceOf[js.Any], getBoundingClientRect = js.Any.fromFunction0(getBoundingClientRect))
    __obj.asInstanceOf[ReferenceObject]
  }
  @scala.inline
  implicit class ReferenceObjectOps[Self <: ReferenceObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetBoundingClientRect(value: () => ClientRect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBoundingClientRect")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReferenceNode(value: Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferenceNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceNode")(js.undefined)
        ret
    }
  }
  
}

