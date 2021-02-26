package typingsSlinky.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchUpdatePartitionRequestEntry extends StObject {
  
  /**
    * The structure used to update a partition.
    */
  var PartitionInput: typingsSlinky.awsSdk.glueMod.PartitionInput = js.native
  
  /**
    * A list of values defining the partitions.
    */
  var PartitionValueList: BoundedPartitionValueList = js.native
}
object BatchUpdatePartitionRequestEntry {
  
  @scala.inline
  def apply(PartitionInput: PartitionInput, PartitionValueList: BoundedPartitionValueList): BatchUpdatePartitionRequestEntry = {
    val __obj = js.Dynamic.literal(PartitionInput = PartitionInput.asInstanceOf[js.Any], PartitionValueList = PartitionValueList.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchUpdatePartitionRequestEntry]
  }
  
  @scala.inline
  implicit class BatchUpdatePartitionRequestEntryMutableBuilder[Self <: BatchUpdatePartitionRequestEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPartitionInput(value: PartitionInput): Self = StObject.set(x, "PartitionInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitionValueList(value: BoundedPartitionValueList): Self = StObject.set(x, "PartitionValueList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitionValueListVarargs(value: ValueString*): Self = StObject.set(x, "PartitionValueList", js.Array(value :_*))
  }
}
