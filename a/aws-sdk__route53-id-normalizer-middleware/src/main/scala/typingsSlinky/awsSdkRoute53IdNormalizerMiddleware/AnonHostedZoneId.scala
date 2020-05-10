package typingsSlinky.awsSdkRoute53IdNormalizerMiddleware

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHostedZoneId extends js.Object {
  var HostedZoneId: String = js.native
}

object AnonHostedZoneId {
  @scala.inline
  def apply(HostedZoneId: String): AnonHostedZoneId = {
    val __obj = js.Dynamic.literal(HostedZoneId = HostedZoneId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHostedZoneId]
  }
  @scala.inline
  implicit class AnonHostedZoneIdOps[Self <: AnonHostedZoneId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHostedZoneId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HostedZoneId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

