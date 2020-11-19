package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserDefinedVariableConfiguration extends js.Object {
  
  var dataType: js.UndefOr[String] = js.native
  
  var reportName: js.UndefOr[String] = js.native
  
  var variableType: js.UndefOr[String] = js.native
}
object UserDefinedVariableConfiguration {
  
  @scala.inline
  def apply(): UserDefinedVariableConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserDefinedVariableConfiguration]
  }
  
  @scala.inline
  implicit class UserDefinedVariableConfigurationOps[Self <: UserDefinedVariableConfiguration] (val x: Self) extends AnyVal {
    
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
    def setDataType(value: String): Self = this.set("dataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataType: Self = this.set("dataType", js.undefined)
    
    @scala.inline
    def setReportName(value: String): Self = this.set("reportName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReportName: Self = this.set("reportName", js.undefined)
    
    @scala.inline
    def setVariableType(value: String): Self = this.set("variableType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariableType: Self = this.set("variableType", js.undefined)
  }
}
