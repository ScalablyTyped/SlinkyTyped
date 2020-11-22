package typingsSlinky.rcFieldForm.interfaceMod

import typingsSlinky.rcFieldForm.anon.Errors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidateErrorEntity[Values] extends js.Object {
  
  var errorFields: js.Array[Errors] = js.native
  
  var outOfDate: Boolean = js.native
  
  var values: Values = js.native
}
object ValidateErrorEntity {
  
  @scala.inline
  def apply[Values](errorFields: js.Array[Errors], outOfDate: Boolean, values: Values): ValidateErrorEntity[Values] = {
    val __obj = js.Dynamic.literal(errorFields = errorFields.asInstanceOf[js.Any], outOfDate = outOfDate.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidateErrorEntity[Values]]
  }
  
  @scala.inline
  implicit class ValidateErrorEntityOps[Self <: ValidateErrorEntity[_], Values] (val x: Self with ValidateErrorEntity[Values]) extends AnyVal {
    
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
    def setErrorFieldsVarargs(value: Errors*): Self = this.set("errorFields", js.Array(value :_*))
    
    @scala.inline
    def setErrorFields(value: js.Array[Errors]): Self = this.set("errorFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutOfDate(value: Boolean): Self = this.set("outOfDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: Values): Self = this.set("values", value.asInstanceOf[js.Any])
  }
}
