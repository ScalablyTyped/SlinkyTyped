package typingsSlinky.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Limit extends StObject {
  
  var limit: js.UndefOr[String] = js.native
  
  var usage: js.UndefOr[String] = js.native
  
  var usageInDrive: js.UndefOr[String] = js.native
  
  var usageInDriveTrash: js.UndefOr[String] = js.native
}
object Limit {
  
  @scala.inline
  def apply(): Limit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Limit]
  }
  
  @scala.inline
  implicit class LimitMutableBuilder[Self <: Limit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLimit(value: String): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setUsage(value: String): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsageInDrive(value: String): Self = StObject.set(x, "usageInDrive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsageInDriveTrash(value: String): Self = StObject.set(x, "usageInDriveTrash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsageInDriveTrashUndefined: Self = StObject.set(x, "usageInDriveTrash", js.undefined)
    
    @scala.inline
    def setUsageInDriveUndefined: Self = StObject.set(x, "usageInDrive", js.undefined)
    
    @scala.inline
    def setUsageUndefined: Self = StObject.set(x, "usage", js.undefined)
  }
}
