package typingsSlinky.awsSdk.amplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProductionBranch extends StObject {
  
  /**
    *  The branch name for the production branch. 
    */
  var branchName: js.UndefOr[BranchName] = js.native
  
  /**
    *  The last deploy time of the production branch. 
    */
  var lastDeployTime: js.UndefOr[js.Date] = js.native
  
  /**
    *  The status of the production branch. 
    */
  var status: js.UndefOr[Status] = js.native
  
  /**
    *  The thumbnail URL for the production branch. 
    */
  var thumbnailUrl: js.UndefOr[ThumbnailUrl] = js.native
}
object ProductionBranch {
  
  @scala.inline
  def apply(): ProductionBranch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductionBranch]
  }
  
  @scala.inline
  implicit class ProductionBranchMutableBuilder[Self <: ProductionBranch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBranchName(value: BranchName): Self = StObject.set(x, "branchName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBranchNameUndefined: Self = StObject.set(x, "branchName", js.undefined)
    
    @scala.inline
    def setLastDeployTime(value: js.Date): Self = StObject.set(x, "lastDeployTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastDeployTimeUndefined: Self = StObject.set(x, "lastDeployTime", js.undefined)
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setThumbnailUrl(value: ThumbnailUrl): Self = StObject.set(x, "thumbnailUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnailUrlUndefined: Self = StObject.set(x, "thumbnailUrl", js.undefined)
  }
}
