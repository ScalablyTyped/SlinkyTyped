package typingsSlinky.awsServerlessExpress.middlewareMod.httpAugmentingMod

import typingsSlinky.awsServerlessExpress.AnonContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IncomingMessage extends js.Object {
  var apiGateway: js.UndefOr[AnonContext] = js.native
}

object IncomingMessage {
  @scala.inline
  def apply(): IncomingMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncomingMessage]
  }
  @scala.inline
  implicit class IncomingMessageOps[Self <: IncomingMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiGateway(value: AnonContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiGateway")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiGateway: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiGateway")(js.undefined)
        ret
    }
  }
  
}

