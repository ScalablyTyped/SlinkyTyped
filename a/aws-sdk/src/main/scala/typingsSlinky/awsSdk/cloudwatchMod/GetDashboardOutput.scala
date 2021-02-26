package typingsSlinky.awsSdk.cloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDashboardOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the dashboard.
    */
  var DashboardArn: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.DashboardArn] = js.native
  
  /**
    * The detailed information about the dashboard, including what widgets are included and their location on the dashboard. For more information about the DashboardBody syntax, see Dashboard Body Structure and Syntax. 
    */
  var DashboardBody: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.DashboardBody] = js.native
  
  /**
    * The name of the dashboard.
    */
  var DashboardName: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.DashboardName] = js.native
}
object GetDashboardOutput {
  
  @scala.inline
  def apply(): GetDashboardOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDashboardOutput]
  }
  
  @scala.inline
  implicit class GetDashboardOutputMutableBuilder[Self <: GetDashboardOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDashboardArn(value: DashboardArn): Self = StObject.set(x, "DashboardArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashboardArnUndefined: Self = StObject.set(x, "DashboardArn", js.undefined)
    
    @scala.inline
    def setDashboardBody(value: DashboardBody): Self = StObject.set(x, "DashboardBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashboardBodyUndefined: Self = StObject.set(x, "DashboardBody", js.undefined)
    
    @scala.inline
    def setDashboardName(value: DashboardName): Self = StObject.set(x, "DashboardName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashboardNameUndefined: Self = StObject.set(x, "DashboardName", js.undefined)
  }
}
