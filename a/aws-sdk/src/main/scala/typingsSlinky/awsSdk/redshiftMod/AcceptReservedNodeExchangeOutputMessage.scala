package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcceptReservedNodeExchangeOutputMessage extends js.Object {
  /**
    * 
    */
  var ExchangedReservedNode: js.UndefOr[ReservedNode] = js.native
}

object AcceptReservedNodeExchangeOutputMessage {
  @scala.inline
  def apply(): AcceptReservedNodeExchangeOutputMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcceptReservedNodeExchangeOutputMessage]
  }
  @scala.inline
  implicit class AcceptReservedNodeExchangeOutputMessageOps[Self <: AcceptReservedNodeExchangeOutputMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExchangedReservedNode(value: ReservedNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExchangedReservedNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExchangedReservedNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExchangedReservedNode")(js.undefined)
        ret
    }
  }
  
}

