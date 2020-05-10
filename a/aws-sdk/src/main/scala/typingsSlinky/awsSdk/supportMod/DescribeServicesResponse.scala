package typingsSlinky.awsSdk.supportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeServicesResponse extends js.Object {
  /**
    * A JSON-formatted list of AWS services.
    */
  var services: js.UndefOr[ServiceList] = js.native
}

object DescribeServicesResponse {
  @scala.inline
  def apply(): DescribeServicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeServicesResponse]
  }
  @scala.inline
  implicit class DescribeServicesResponseOps[Self <: DescribeServicesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withServices(value: ServiceList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("services")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("services")(js.undefined)
        ret
    }
  }
  
}

