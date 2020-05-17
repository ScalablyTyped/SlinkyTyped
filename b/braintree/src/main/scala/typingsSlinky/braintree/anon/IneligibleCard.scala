package typingsSlinky.braintree.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IneligibleCard extends js.Object {
  var IneligibleCard: String = js.native
  var InsufficientPoints: String = js.native
  var Success: String = js.native
}

object IneligibleCard {
  @scala.inline
  def apply(IneligibleCard: String, InsufficientPoints: String, Success: String): IneligibleCard = {
    val __obj = js.Dynamic.literal(IneligibleCard = IneligibleCard.asInstanceOf[js.Any], InsufficientPoints = InsufficientPoints.asInstanceOf[js.Any], Success = Success.asInstanceOf[js.Any])
    __obj.asInstanceOf[IneligibleCard]
  }
  @scala.inline
  implicit class IneligibleCardOps[Self <: IneligibleCard] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIneligibleCard(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IneligibleCard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsufficientPoints(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InsufficientPoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccess(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Success")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

