package typingsSlinky.awsSdk.resourcegroupstaggingapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagResourcesOutput extends StObject {
  
  /**
    * A map containing a key-value pair for each failed item that couldn't be tagged. The key is the ARN of the failed resource. The value is a FailureInfo object that contains an error code, a status code, and an error message. If there are no errors, the FailedResourcesMap is empty.
    */
  var FailedResourcesMap: js.UndefOr[typingsSlinky.awsSdk.resourcegroupstaggingapiMod.FailedResourcesMap] = js.native
}
object TagResourcesOutput {
  
  @scala.inline
  def apply(): TagResourcesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagResourcesOutput]
  }
  
  @scala.inline
  implicit class TagResourcesOutputMutableBuilder[Self <: TagResourcesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailedResourcesMap(value: FailedResourcesMap): Self = StObject.set(x, "FailedResourcesMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedResourcesMapUndefined: Self = StObject.set(x, "FailedResourcesMap", js.undefined)
  }
}
