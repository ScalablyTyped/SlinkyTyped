package typingsSlinky.awsSdk.cognitosyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDatasetResponse extends StObject {
  
  /**
    * Meta data for a collection of data for an identity. An identity can have multiple datasets. A dataset can be general or associated with a particular entity in an application (like a saved game). Datasets are automatically created if they don't exist. Data is synced by dataset, and a dataset can hold up to 1MB of key-value pairs.
    */
  var Dataset: js.UndefOr[typingsSlinky.awsSdk.cognitosyncMod.Dataset] = js.native
}
object DescribeDatasetResponse {
  
  @scala.inline
  def apply(): DescribeDatasetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDatasetResponse]
  }
  
  @scala.inline
  implicit class DescribeDatasetResponseMutableBuilder[Self <: DescribeDatasetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataset(value: Dataset): Self = StObject.set(x, "Dataset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetUndefined: Self = StObject.set(x, "Dataset", js.undefined)
  }
}
