package typingsSlinky.antDesignReactNative.portalManagerMod

import typingsSlinky.antDesignReactNative.AnonChildrenReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait State extends js.Object {
  var portals: js.Array[AnonChildrenReactNode] = js.native
}

object State {
  @scala.inline
  def apply(portals: js.Array[AnonChildrenReactNode]): State = {
    val __obj = js.Dynamic.literal(portals = portals.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  @scala.inline
  implicit class StateOps[Self <: State] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPortals(value: js.Array[AnonChildrenReactNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portals")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

