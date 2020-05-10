package typingsSlinky.postmark.bounceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BounceActivationResponse extends js.Object {
  var Bounce: typingsSlinky.postmark.bounceMod.Bounce = js.native
  var Message: String = js.native
}

object BounceActivationResponse {
  @scala.inline
  def apply(Bounce: Bounce, Message: String): BounceActivationResponse = {
    val __obj = js.Dynamic.literal(Bounce = Bounce.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[BounceActivationResponse]
  }
  @scala.inline
  implicit class BounceActivationResponseOps[Self <: BounceActivationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBounce(value: Bounce): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bounce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Message")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

