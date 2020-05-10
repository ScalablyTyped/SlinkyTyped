package typingsSlinky.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCf extends js.Object {
  var cf: CloudFrontEventrequestClo = js.native
}

object AnonCf {
  @scala.inline
  def apply(cf: CloudFrontEventrequestClo): AnonCf = {
    val __obj = js.Dynamic.literal(cf = cf.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCf]
  }
  @scala.inline
  implicit class AnonCfOps[Self <: AnonCf] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCf(value: CloudFrontEventrequestClo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cf")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

