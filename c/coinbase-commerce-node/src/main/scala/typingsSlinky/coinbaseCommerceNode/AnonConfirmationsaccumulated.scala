package typingsSlinky.coinbaseCommerceNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonConfirmationsaccumulated extends js.Object {
  var confirmations_accumulated: Double = js.native
  var confirmations_required: Double = js.native
  var hash: String = js.native
  var height: Double = js.native
}

object AnonConfirmationsaccumulated {
  @scala.inline
  def apply(confirmations_accumulated: Double, confirmations_required: Double, hash: String, height: Double): AnonConfirmationsaccumulated = {
    val __obj = js.Dynamic.literal(confirmations_accumulated = confirmations_accumulated.asInstanceOf[js.Any], confirmations_required = confirmations_required.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConfirmationsaccumulated]
  }
  @scala.inline
  implicit class AnonConfirmationsaccumulatedOps[Self <: AnonConfirmationsaccumulated] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfirmations_accumulated(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmations_accumulated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfirmations_required(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmations_required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

