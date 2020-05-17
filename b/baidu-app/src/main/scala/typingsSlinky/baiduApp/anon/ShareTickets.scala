package typingsSlinky.baiduApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShareTickets extends js.Object {
  /** 每一项是一个 shareTicket ，对应一个转发对象 */
  var shareTickets: js.Array[String] = js.native
}

object ShareTickets {
  @scala.inline
  def apply(shareTickets: js.Array[String]): ShareTickets = {
    val __obj = js.Dynamic.literal(shareTickets = shareTickets.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareTickets]
  }
  @scala.inline
  implicit class ShareTicketsOps[Self <: ShareTickets] (val x: Self) extends AnyVal {
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

