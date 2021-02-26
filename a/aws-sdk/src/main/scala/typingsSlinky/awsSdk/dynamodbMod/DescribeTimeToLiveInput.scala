package typingsSlinky.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeTimeToLiveInput extends StObject {
  
  /**
    * The name of the table to be described.
    */
  var TableName: typingsSlinky.awsSdk.dynamodbMod.TableName = js.native
}
object DescribeTimeToLiveInput {
  
  @scala.inline
  def apply(TableName: TableName): DescribeTimeToLiveInput = {
    val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTimeToLiveInput]
  }
  
  @scala.inline
  implicit class DescribeTimeToLiveInputMutableBuilder[Self <: DescribeTimeToLiveInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
  }
}
