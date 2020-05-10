package typingsSlinky.keycloakJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRptendpoint extends js.Object {
  var rpt_endpoint: String = js.native
}

object AnonRptendpoint {
  @scala.inline
  def apply(rpt_endpoint: String): AnonRptendpoint = {
    val __obj = js.Dynamic.literal(rpt_endpoint = rpt_endpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRptendpoint]
  }
  @scala.inline
  implicit class AnonRptendpointOps[Self <: AnonRptendpoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRpt_endpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rpt_endpoint")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

