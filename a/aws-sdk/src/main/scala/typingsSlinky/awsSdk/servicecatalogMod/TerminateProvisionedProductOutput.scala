package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TerminateProvisionedProductOutput extends js.Object {
  /**
    * Information about the result of this request.
    */
  var RecordDetail: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.RecordDetail] = js.native
}

object TerminateProvisionedProductOutput {
  @scala.inline
  def apply(): TerminateProvisionedProductOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TerminateProvisionedProductOutput]
  }
  @scala.inline
  implicit class TerminateProvisionedProductOutputOps[Self <: TerminateProvisionedProductOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRecordDetail(value: RecordDetail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecordDetail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecordDetail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecordDetail")(js.undefined)
        ret
    }
  }
  
}

