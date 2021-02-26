package typingsSlinky.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlobalSecondaryIndexAutoScalingUpdate extends StObject {
  
  /**
    * The name of the global secondary index.
    */
  var IndexName: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.IndexName] = js.native
  
  var ProvisionedWriteCapacityAutoScalingUpdate: js.UndefOr[AutoScalingSettingsUpdate] = js.native
}
object GlobalSecondaryIndexAutoScalingUpdate {
  
  @scala.inline
  def apply(): GlobalSecondaryIndexAutoScalingUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalSecondaryIndexAutoScalingUpdate]
  }
  
  @scala.inline
  implicit class GlobalSecondaryIndexAutoScalingUpdateMutableBuilder[Self <: GlobalSecondaryIndexAutoScalingUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndexName(value: IndexName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexNameUndefined: Self = StObject.set(x, "IndexName", js.undefined)
    
    @scala.inline
    def setProvisionedWriteCapacityAutoScalingUpdate(value: AutoScalingSettingsUpdate): Self = StObject.set(x, "ProvisionedWriteCapacityAutoScalingUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisionedWriteCapacityAutoScalingUpdateUndefined: Self = StObject.set(x, "ProvisionedWriteCapacityAutoScalingUpdate", js.undefined)
  }
}
