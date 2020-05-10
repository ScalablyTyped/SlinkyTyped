package typingsSlinky.parityPmr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PMRMessage extends js.Object {
  var canceledQuantity: js.UndefOr[Double] = js.native
  var incomingOrderNumber: js.UndefOr[Double] = js.native
  var instrument: js.UndefOr[String] = js.native
  var matchNumber: js.UndefOr[Double] = js.native
  var messageType: String = js.native
  var orderNumber: js.UndefOr[String] = js.native
  var price: js.UndefOr[Double] = js.native
  var quantity: js.UndefOr[Double] = js.native
  var restingOrderNumber: js.UndefOr[Double] = js.native
  var side: js.UndefOr[String] = js.native
  var timestamp: js.UndefOr[Double] = js.native
  var username: js.UndefOr[String] = js.native
  var version: js.UndefOr[Double] = js.native
}

object PMRMessage {
  @scala.inline
  def apply(messageType: String): PMRMessage = {
    val __obj = js.Dynamic.literal(messageType = messageType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PMRMessage]
  }
  @scala.inline
  implicit class PMRMessageOps[Self <: PMRMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessageType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanceledQuantity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canceledQuantity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanceledQuantity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canceledQuantity")(js.undefined)
        ret
    }
    @scala.inline
    def withIncomingOrderNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incomingOrderNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncomingOrderNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incomingOrderNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withInstrument(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instrument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstrument: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instrument")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withOrderNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrderNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withPrice(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("price")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("price")(js.undefined)
        ret
    }
    @scala.inline
    def withQuantity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuantity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantity")(js.undefined)
        ret
    }
    @scala.inline
    def withRestingOrderNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restingOrderNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestingOrderNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restingOrderNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withSide(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("side")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("side")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestamp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsername: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

