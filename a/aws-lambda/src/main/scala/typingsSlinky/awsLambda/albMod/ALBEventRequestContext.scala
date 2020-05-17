package typingsSlinky.awsLambda.albMod

import typingsSlinky.awsLambda.anon.TargetGroupArn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ALBEventRequestContext extends js.Object {
  var elb: TargetGroupArn = js.native
}

object ALBEventRequestContext {
  @scala.inline
  def apply(elb: TargetGroupArn): ALBEventRequestContext = {
    val __obj = js.Dynamic.literal(elb = elb.asInstanceOf[js.Any])
    __obj.asInstanceOf[ALBEventRequestContext]
  }
  @scala.inline
  implicit class ALBEventRequestContextOps[Self <: ALBEventRequestContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElb(value: TargetGroupArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elb")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

