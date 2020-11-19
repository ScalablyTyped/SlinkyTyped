package typingsSlinky.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RateGroup extends js.Object {
  
  /**
    * A list of shipping labels defining the products to which this rate group applies to. This is a disjunction: only one of the labels has to match for the
    * rate group to apply. May only be empty for the last rate group of a service. Required.
    */
  var applicableShippingLabels: js.UndefOr[js.Array[String]] = js.native
  
  /** A list of carrier rates that can be referred to by mainTable or singleValue. */
  var carrierRates: js.UndefOr[js.Array[CarrierRate]] = js.native
  
  /** A table defining the rate group, when singleValue is not expressive enough. Can only be set if singleValue is not set. */
  var mainTable: js.UndefOr[Table] = js.native
  
  /** The value of the rate group (e.g. flat rate $10). Can only be set if mainTable and subtables are not set. */
  var singleValue: js.UndefOr[Value] = js.native
  
  /** A list of subtables referred to by mainTable. Can only be set if mainTable is set. */
  var subtables: js.UndefOr[js.Array[Table]] = js.native
}
object RateGroup {
  
  @scala.inline
  def apply(): RateGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RateGroup]
  }
  
  @scala.inline
  implicit class RateGroupOps[Self <: RateGroup] (val x: Self) extends AnyVal {
    
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
    def setApplicableShippingLabelsVarargs(value: String*): Self = this.set("applicableShippingLabels", js.Array(value :_*))
    
    @scala.inline
    def setApplicableShippingLabels(value: js.Array[String]): Self = this.set("applicableShippingLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicableShippingLabels: Self = this.set("applicableShippingLabels", js.undefined)
    
    @scala.inline
    def setCarrierRatesVarargs(value: CarrierRate*): Self = this.set("carrierRates", js.Array(value :_*))
    
    @scala.inline
    def setCarrierRates(value: js.Array[CarrierRate]): Self = this.set("carrierRates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCarrierRates: Self = this.set("carrierRates", js.undefined)
    
    @scala.inline
    def setMainTable(value: Table): Self = this.set("mainTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMainTable: Self = this.set("mainTable", js.undefined)
    
    @scala.inline
    def setSingleValue(value: Value): Self = this.set("singleValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSingleValue: Self = this.set("singleValue", js.undefined)
    
    @scala.inline
    def setSubtablesVarargs(value: Table*): Self = this.set("subtables", js.Array(value :_*))
    
    @scala.inline
    def setSubtables(value: js.Array[Table]): Self = this.set("subtables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubtables: Self = this.set("subtables", js.undefined)
  }
}
