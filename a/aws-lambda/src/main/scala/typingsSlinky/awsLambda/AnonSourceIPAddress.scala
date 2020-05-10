package typingsSlinky.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSourceIPAddress extends js.Object {
  var sourceIPAddress: String = js.native
}

object AnonSourceIPAddress {
  @scala.inline
  def apply(sourceIPAddress: String): AnonSourceIPAddress = {
    val __obj = js.Dynamic.literal(sourceIPAddress = sourceIPAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSourceIPAddress]
  }
  @scala.inline
  implicit class AnonSourceIPAddressOps[Self <: AnonSourceIPAddress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSourceIPAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceIPAddress")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

