package typingsSlinky.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PartitionInput extends StObject {
  
  /**
    * The last time at which the partition was accessed.
    */
  var LastAccessTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The last time at which column statistics were computed for this partition.
    */
  var LastAnalyzedTime: js.UndefOr[js.Date] = js.native
  
  /**
    * These key-value pairs define partition parameters.
    */
  var Parameters: js.UndefOr[ParametersMap] = js.native
  
  /**
    * Provides information about the physical location where the partition is stored.
    */
  var StorageDescriptor: js.UndefOr[typingsSlinky.awsSdk.glueMod.StorageDescriptor] = js.native
  
  /**
    * The values of the partition. Although this parameter is not required by the SDK, you must specify this parameter for a valid input. The values for the keys for the new partition must be passed as an array of String objects that must be ordered in the same order as the partition keys appearing in the Amazon S3 prefix. Otherwise AWS Glue will add the values to the wrong keys.
    */
  var Values: js.UndefOr[ValueStringList] = js.native
}
object PartitionInput {
  
  @scala.inline
  def apply(): PartitionInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartitionInput]
  }
  
  @scala.inline
  implicit class PartitionInputMutableBuilder[Self <: PartitionInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastAccessTime(value: js.Date): Self = StObject.set(x, "LastAccessTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastAccessTimeUndefined: Self = StObject.set(x, "LastAccessTime", js.undefined)
    
    @scala.inline
    def setLastAnalyzedTime(value: js.Date): Self = StObject.set(x, "LastAnalyzedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastAnalyzedTimeUndefined: Self = StObject.set(x, "LastAnalyzedTime", js.undefined)
    
    @scala.inline
    def setParameters(value: ParametersMap): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    @scala.inline
    def setStorageDescriptor(value: StorageDescriptor): Self = StObject.set(x, "StorageDescriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageDescriptorUndefined: Self = StObject.set(x, "StorageDescriptor", js.undefined)
    
    @scala.inline
    def setValues(value: ValueStringList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: ValueString*): Self = StObject.set(x, "Values", js.Array(value :_*))
  }
}
