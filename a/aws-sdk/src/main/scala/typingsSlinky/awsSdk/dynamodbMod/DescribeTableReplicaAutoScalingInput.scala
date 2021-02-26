package typingsSlinky.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeTableReplicaAutoScalingInput extends StObject {
  
  /**
    * The name of the table.
    */
  var TableName: typingsSlinky.awsSdk.dynamodbMod.TableName = js.native
}
object DescribeTableReplicaAutoScalingInput {
  
  @scala.inline
  def apply(TableName: TableName): DescribeTableReplicaAutoScalingInput = {
    val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTableReplicaAutoScalingInput]
  }
  
  @scala.inline
  implicit class DescribeTableReplicaAutoScalingInputMutableBuilder[Self <: DescribeTableReplicaAutoScalingInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
  }
}
