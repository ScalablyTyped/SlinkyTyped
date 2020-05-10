package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnsuccessfulInstanceCreditSpecificationItem extends js.Object {
  /**
    * The applicable error for the burstable performance instance whose credit option for CPU usage was not modified.
    */
  var Error: js.UndefOr[UnsuccessfulInstanceCreditSpecificationItemError] = js.native
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[String] = js.native
}

object UnsuccessfulInstanceCreditSpecificationItem {
  @scala.inline
  def apply(): UnsuccessfulInstanceCreditSpecificationItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnsuccessfulInstanceCreditSpecificationItem]
  }
  @scala.inline
  implicit class UnsuccessfulInstanceCreditSpecificationItemOps[Self <: UnsuccessfulInstanceCreditSpecificationItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError(value: UnsuccessfulInstanceCreditSpecificationItemError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Error")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceId")(js.undefined)
        ret
    }
  }
  
}

