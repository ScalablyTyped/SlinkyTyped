package typingsSlinky.awsLambda

import typingsSlinky.awsLambda.apiGatewayAuthorizerMod.StatementAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNotAction extends StatementAction {
  var NotAction: String | js.Array[String] = js.native
}

object AnonNotAction {
  @scala.inline
  def apply(NotAction: String | js.Array[String]): AnonNotAction = {
    val __obj = js.Dynamic.literal(NotAction = NotAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNotAction]
  }
  @scala.inline
  implicit class AnonNotActionOps[Self <: AnonNotAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNotAction(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotAction")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

