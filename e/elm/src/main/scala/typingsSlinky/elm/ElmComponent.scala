package typingsSlinky.elm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElmComponent[P] extends js.Object {
  var ports: P = js.native
}

object ElmComponent {
  @scala.inline
  def apply[P](ports: P): ElmComponent[P] = {
    val __obj = js.Dynamic.literal(ports = ports.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElmComponent[P]]
  }
  @scala.inline
  implicit class ElmComponentOps[Self[p] <: ElmComponent[p], P] (val x: Self[P]) extends AnyVal {
    @scala.inline
    def duplicate: Self[P] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[P]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[P] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[P] with Other]
    @scala.inline
    def withPorts(value: P): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ports")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

