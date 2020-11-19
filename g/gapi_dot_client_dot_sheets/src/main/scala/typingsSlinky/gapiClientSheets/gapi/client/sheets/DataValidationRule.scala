package typingsSlinky.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataValidationRule extends js.Object {
  
  /** The condition that data in the cell must match. */
  var condition: js.UndefOr[BooleanCondition] = js.native
  
  /** A message to show the user when adding data to the cell. */
  var inputMessage: js.UndefOr[String] = js.native
  
  /**
    * True if the UI should be customized based on the kind of condition.
    * If true, "List" conditions will show a dropdown.
    */
  var showCustomUi: js.UndefOr[Boolean] = js.native
  
  /** True if invalid data should be rejected. */
  var strict: js.UndefOr[Boolean] = js.native
}
object DataValidationRule {
  
  @scala.inline
  def apply(): DataValidationRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataValidationRule]
  }
  
  @scala.inline
  implicit class DataValidationRuleOps[Self <: DataValidationRule] (val x: Self) extends AnyVal {
    
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
    def setCondition(value: BooleanCondition): Self = this.set("condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCondition: Self = this.set("condition", js.undefined)
    
    @scala.inline
    def setInputMessage(value: String): Self = this.set("inputMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputMessage: Self = this.set("inputMessage", js.undefined)
    
    @scala.inline
    def setShowCustomUi(value: Boolean): Self = this.set("showCustomUi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowCustomUi: Self = this.set("showCustomUi", js.undefined)
    
    @scala.inline
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrict: Self = this.set("strict", js.undefined)
  }
}
