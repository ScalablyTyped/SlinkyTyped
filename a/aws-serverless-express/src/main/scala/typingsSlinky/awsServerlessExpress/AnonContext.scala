package typingsSlinky.awsServerlessExpress

import typingsSlinky.awsLambda.handlerMod.Context
import typingsSlinky.awsServerlessExpress.middlewareMod.NonFunctionProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonContext extends js.Object {
  var context: NonFunctionProperties[Context] = js.native
  var event: OmitAPIGatewayProxyEventb = js.native
}

object AnonContext {
  @scala.inline
  def apply(context: NonFunctionProperties[Context], event: OmitAPIGatewayProxyEventb): AnonContext = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContext]
  }
  @scala.inline
  implicit class AnonContextOps[Self <: AnonContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContext(value: NonFunctionProperties[Context]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvent(value: OmitAPIGatewayProxyEventb): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

