package typingsSlinky.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeProtectionResponse extends js.Object {
  /**
    * The Protection object that is described.
    */
  var Protection: js.UndefOr[typingsSlinky.awsSdk.shieldMod.Protection] = js.native
}

object DescribeProtectionResponse {
  @scala.inline
  def apply(): DescribeProtectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeProtectionResponse]
  }
  @scala.inline
  implicit class DescribeProtectionResponseOps[Self <: DescribeProtectionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProtection(value: Protection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Protection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Protection")(js.undefined)
        ret
    }
  }
  
}

