package typingsSlinky.connectBusboy.mod._Global_.Express

import typingsSlinky.busboy.busboy.Busboy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request extends js.Object {
  var busboy: Busboy = js.native
}

object Request {
  @scala.inline
  def apply(busboy: Busboy): Request = {
    val __obj = js.Dynamic.literal(busboy = busboy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
  @scala.inline
  implicit class RequestOps[Self <: Request] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBusboy(value: Busboy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("busboy")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

