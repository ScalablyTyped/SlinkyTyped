package typingsSlinky.glReact

import typingsSlinky.glReact.mod.Bus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGlParentBus extends js.Object {
  var glParent: Bus = js.native
}

object AnonGlParentBus {
  @scala.inline
  def apply(glParent: Bus): AnonGlParentBus = {
    val __obj = js.Dynamic.literal(glParent = glParent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGlParentBus]
  }
  @scala.inline
  implicit class AnonGlParentBusOps[Self <: AnonGlParentBus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGlParent(value: Bus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glParent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

