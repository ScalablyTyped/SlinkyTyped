package typingsSlinky.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeMaintenanceWindowsResult extends StObject {
  
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.ssmMod.NextToken] = js.native
  
  /**
    * Information about the maintenance windows.
    */
  var WindowIdentities: js.UndefOr[MaintenanceWindowIdentityList] = js.native
}
object DescribeMaintenanceWindowsResult {
  
  @scala.inline
  def apply(): DescribeMaintenanceWindowsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeMaintenanceWindowsResult]
  }
  
  @scala.inline
  implicit class DescribeMaintenanceWindowsResultMutableBuilder[Self <: DescribeMaintenanceWindowsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setWindowIdentities(value: MaintenanceWindowIdentityList): Self = StObject.set(x, "WindowIdentities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowIdentitiesUndefined: Self = StObject.set(x, "WindowIdentities", js.undefined)
    
    @scala.inline
    def setWindowIdentitiesVarargs(value: MaintenanceWindowIdentity*): Self = StObject.set(x, "WindowIdentities", js.Array(value :_*))
  }
}
