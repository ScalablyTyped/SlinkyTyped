package typingsSlinky.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INDTaxDocuments extends js.Object {
  /**
    * The Goods and Services Tax (GST) documents required in AWS Regions in India.
    */
  var GSTIN: js.UndefOr[typingsSlinky.awsSdk.snowballMod.GSTIN] = js.native
}

object INDTaxDocuments {
  @scala.inline
  def apply(): INDTaxDocuments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INDTaxDocuments]
  }
  @scala.inline
  implicit class INDTaxDocumentsOps[Self <: INDTaxDocuments] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGSTIN(value: GSTIN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GSTIN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGSTIN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GSTIN")(js.undefined)
        ret
    }
  }
  
}

