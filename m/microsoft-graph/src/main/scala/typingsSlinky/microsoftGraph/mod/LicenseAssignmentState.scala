package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LicenseAssignmentState extends js.Object {
  
  var assignedByGroup: js.UndefOr[NullableOption[String]] = js.native
  
  var disabledPlans: js.UndefOr[NullableOption[js.Array[String]]] = js.native
  
  var error: js.UndefOr[NullableOption[String]] = js.native
  
  var skuId: js.UndefOr[NullableOption[String]] = js.native
  
  var state: js.UndefOr[NullableOption[String]] = js.native
}
object LicenseAssignmentState {
  
  @scala.inline
  def apply(): LicenseAssignmentState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LicenseAssignmentState]
  }
  
  @scala.inline
  implicit class LicenseAssignmentStateOps[Self <: LicenseAssignmentState] (val x: Self) extends AnyVal {
    
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
    def setAssignedByGroup(value: NullableOption[String]): Self = this.set("assignedByGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssignedByGroup: Self = this.set("assignedByGroup", js.undefined)
    
    @scala.inline
    def setAssignedByGroupNull: Self = this.set("assignedByGroup", null)
    
    @scala.inline
    def setDisabledPlansVarargs(value: String*): Self = this.set("disabledPlans", js.Array(value :_*))
    
    @scala.inline
    def setDisabledPlans(value: NullableOption[js.Array[String]]): Self = this.set("disabledPlans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabledPlans: Self = this.set("disabledPlans", js.undefined)
    
    @scala.inline
    def setDisabledPlansNull: Self = this.set("disabledPlans", null)
    
    @scala.inline
    def setError(value: NullableOption[String]): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setErrorNull: Self = this.set("error", null)
    
    @scala.inline
    def setSkuId(value: NullableOption[String]): Self = this.set("skuId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkuId: Self = this.set("skuId", js.undefined)
    
    @scala.inline
    def setSkuIdNull: Self = this.set("skuId", null)
    
    @scala.inline
    def setState(value: NullableOption[String]): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setStateNull: Self = this.set("state", null)
  }
}
