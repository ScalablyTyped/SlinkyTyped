package typingsSlinky.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateReportGroupInput extends StObject {
  
  /**
    *  A ReportExportConfig object that contains information about where the report group test results are exported. 
    */
  var exportConfig: ReportExportConfig = js.native
  
  /**
    *  The name of the report group. 
    */
  var name: ReportGroupName = js.native
  
  /**
    *  A list of tag key and value pairs associated with this report group.  These tags are available for use by AWS services that support AWS CodeBuild report group tags.
    */
  var tags: js.UndefOr[TagList] = js.native
  
  /**
    *  The type of report group. 
    */
  var `type`: ReportType = js.native
}
object CreateReportGroupInput {
  
  @scala.inline
  def apply(exportConfig: ReportExportConfig, name: ReportGroupName, `type`: ReportType): CreateReportGroupInput = {
    val __obj = js.Dynamic.literal(exportConfig = exportConfig.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateReportGroupInput]
  }
  
  @scala.inline
  implicit class CreateReportGroupInputMutableBuilder[Self <: CreateReportGroupInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExportConfig(value: ReportExportConfig): Self = StObject.set(x, "exportConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: ReportGroupName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setType(value: ReportType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
