package typingsSlinky.baiduApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonShareTickets extends js.Object {
  /** 每一项是一个 shareTicket ，对应一个转发对象 */
  var shareTickets: js.Array[String] = js.native
}

object AnonShareTickets {
  @scala.inline
  def apply(shareTickets: js.Array[String]): AnonShareTickets = {
    val __obj = js.Dynamic.literal(shareTickets = shareTickets.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonShareTickets]
  }
  @scala.inline
  implicit class AnonShareTicketsOps[Self <: AnonShareTickets] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShareTickets(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shareTickets")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

