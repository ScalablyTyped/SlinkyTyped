package typingsSlinky.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnitInvoiceTaxLine extends js.Object {
  
  /** [required] Tax amount for the tax type. */
  var taxAmount: js.UndefOr[Price] = js.native
  
  /** Optional name of the tax type. This should only be provided if `taxType` is `otherFeeTax`. */
  var taxName: js.UndefOr[String] = js.native
  
  /** [required] Type of the tax. Acceptable values are: - "`otherFee`" - "`otherFeeTax`" - "`sales`" */
  var taxType: js.UndefOr[String] = js.native
}
object UnitInvoiceTaxLine {
  
  @scala.inline
  def apply(): UnitInvoiceTaxLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnitInvoiceTaxLine]
  }
  
  @scala.inline
  implicit class UnitInvoiceTaxLineOps[Self <: UnitInvoiceTaxLine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTaxAmount(value: Price): Self = this.set("taxAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaxAmount: Self = this.set("taxAmount", js.undefined)
    
    @scala.inline
    def setTaxName(value: String): Self = this.set("taxName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaxName: Self = this.set("taxName", js.undefined)
    
    @scala.inline
    def setTaxType(value: String): Self = this.set("taxType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaxType: Self = this.set("taxType", js.undefined)
  }
}
