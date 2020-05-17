package typingsSlinky.atom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientX extends js.Object {
  var clientX: Double = js.native
  var clientY: Double = js.native
}

object ClientX {
  @scala.inline
  def apply(clientX: Double, clientY: Double): ClientX = {
    val __obj = js.Dynamic.literal(clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientX]
  }
  @scala.inline
  implicit class ClientXOps[Self <: ClientX] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientY")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

