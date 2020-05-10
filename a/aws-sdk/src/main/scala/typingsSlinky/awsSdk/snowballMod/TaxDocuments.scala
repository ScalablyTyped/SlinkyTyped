package typingsSlinky.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaxDocuments extends js.Object {
  /**
    * The tax documents required in AWS Regions in India.
    */
  var IND: js.UndefOr[INDTaxDocuments] = js.native
}

object TaxDocuments {
  @scala.inline
  def apply(): TaxDocuments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaxDocuments]
  }
  @scala.inline
  implicit class TaxDocumentsOps[Self <: TaxDocuments] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIND(value: INDTaxDocuments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IND")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIND: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IND")(js.undefined)
        ret
    }
  }
  
}

