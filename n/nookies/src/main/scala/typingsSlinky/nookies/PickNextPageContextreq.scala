package typingsSlinky.nookies

import typingsSlinky.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<next.next.NextPageContext, 'req'> */
@js.native
trait PickNextPageContextreq extends js.Object {
  var req: js.UndefOr[IncomingMessage] = js.native
}

object PickNextPageContextreq {
  @scala.inline
  def apply(): PickNextPageContextreq = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickNextPageContextreq]
  }
  @scala.inline
  implicit class PickNextPageContextreqOps[Self <: PickNextPageContextreq] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReq(value: IncomingMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("req")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReq: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("req")(js.undefined)
        ret
    }
  }
  
}

