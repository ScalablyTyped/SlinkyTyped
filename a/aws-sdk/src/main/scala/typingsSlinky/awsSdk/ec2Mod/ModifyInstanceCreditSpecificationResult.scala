package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyInstanceCreditSpecificationResult extends js.Object {
  /**
    * Information about the instances whose credit option for CPU usage was successfully modified.
    */
  var SuccessfulInstanceCreditSpecifications: js.UndefOr[SuccessfulInstanceCreditSpecificationSet] = js.native
  /**
    * Information about the instances whose credit option for CPU usage was not modified.
    */
  var UnsuccessfulInstanceCreditSpecifications: js.UndefOr[UnsuccessfulInstanceCreditSpecificationSet] = js.native
}

object ModifyInstanceCreditSpecificationResult {
  @scala.inline
  def apply(): ModifyInstanceCreditSpecificationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyInstanceCreditSpecificationResult]
  }
  @scala.inline
  implicit class ModifyInstanceCreditSpecificationResultOps[Self <: ModifyInstanceCreditSpecificationResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSuccessfulInstanceCreditSpecifications(value: SuccessfulInstanceCreditSpecificationSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SuccessfulInstanceCreditSpecifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuccessfulInstanceCreditSpecifications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SuccessfulInstanceCreditSpecifications")(js.undefined)
        ret
    }
    @scala.inline
    def withUnsuccessfulInstanceCreditSpecifications(value: UnsuccessfulInstanceCreditSpecificationSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnsuccessfulInstanceCreditSpecifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnsuccessfulInstanceCreditSpecifications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnsuccessfulInstanceCreditSpecifications")(js.undefined)
        ret
    }
  }
  
}

