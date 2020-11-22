package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DashboardVersion extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var Arn: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.Arn] = js.native
  
  /**
    * The time that this dashboard version was created.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The Amazon Resource Numbers (ARNs) for the datasets that are associated with this version of the dashboard.
    */
  var DataSetArns: js.UndefOr[DataSetArnsList] = js.native
  
  /**
    * Description.
    */
  var Description: js.UndefOr[VersionDescription] = js.native
  
  /**
    * Errors associated with this dashboard version.
    */
  var Errors: js.UndefOr[DashboardErrorList] = js.native
  
  /**
    * A list of the associated sheets with the unique identifier and name of each sheet.
    */
  var Sheets: js.UndefOr[SheetList] = js.native
  
  /**
    * Source entity ARN.
    */
  var SourceEntityArn: js.UndefOr[Arn] = js.native
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[ResourceStatus] = js.native
  
  /**
    * The ARN of the theme associated with a version of the dashboard.
    */
  var ThemeArn: js.UndefOr[Arn] = js.native
  
  /**
    * Version number for this version of the dashboard.
    */
  var VersionNumber: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.VersionNumber] = js.native
}
object DashboardVersion {
  
  @scala.inline
  def apply(): DashboardVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DashboardVersion]
  }
  
  @scala.inline
  implicit class DashboardVersionOps[Self <: DashboardVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArn(value: Arn): Self = this.set("Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    
    @scala.inline
    def setCreatedTime(value: js.Date): Self = this.set("CreatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedTime: Self = this.set("CreatedTime", js.undefined)
    
    @scala.inline
    def setDataSetArnsVarargs(value: Arn*): Self = this.set("DataSetArns", js.Array(value :_*))
    
    @scala.inline
    def setDataSetArns(value: DataSetArnsList): Self = this.set("DataSetArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSetArns: Self = this.set("DataSetArns", js.undefined)
    
    @scala.inline
    def setDescription(value: VersionDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: DashboardError*): Self = this.set("Errors", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: DashboardErrorList): Self = this.set("Errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrors: Self = this.set("Errors", js.undefined)
    
    @scala.inline
    def setSheetsVarargs(value: Sheet*): Self = this.set("Sheets", js.Array(value :_*))
    
    @scala.inline
    def setSheets(value: SheetList): Self = this.set("Sheets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSheets: Self = this.set("Sheets", js.undefined)
    
    @scala.inline
    def setSourceEntityArn(value: Arn): Self = this.set("SourceEntityArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceEntityArn: Self = this.set("SourceEntityArn", js.undefined)
    
    @scala.inline
    def setStatus(value: ResourceStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setThemeArn(value: Arn): Self = this.set("ThemeArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThemeArn: Self = this.set("ThemeArn", js.undefined)
    
    @scala.inline
    def setVersionNumber(value: VersionNumber): Self = this.set("VersionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionNumber: Self = this.set("VersionNumber", js.undefined)
  }
}
