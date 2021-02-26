package typingsSlinky.awsSdk.anon

import typingsSlinky.awsSdk.dynamodbMod.TableName
import typingsSlinky.awsSdk.serviceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/dynamodb.DescribeTableInput & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
@js.native
trait DescribeTableInputwaiterW extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  
  /**
    * The name of the table to describe.
    */
  var TableName: typingsSlinky.awsSdk.dynamodbMod.TableName = js.native
}
object DescribeTableInputwaiterW {
  
  @scala.inline
  def apply(TableName: TableName): DescribeTableInputwaiterW = {
    val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTableInputwaiterW]
  }
  
  @scala.inline
  implicit class DescribeTableInputwaiterWMutableBuilder[Self <: DescribeTableInputwaiterW] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
    @scala.inline
    def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
  }
}
