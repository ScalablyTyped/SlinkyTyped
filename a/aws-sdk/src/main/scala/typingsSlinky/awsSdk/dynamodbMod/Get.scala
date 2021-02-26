package typingsSlinky.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Get extends StObject {
  
  /**
    * One or more substitution tokens for attribute names in the ProjectionExpression parameter.
    */
  var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.native
  
  /**
    * A map of attribute names to AttributeValue objects that specifies the primary key of the item to retrieve.
    */
  var Key: typingsSlinky.awsSdk.dynamodbMod.Key = js.native
  
  /**
    * A string that identifies one or more attributes of the specified item to retrieve from the table. The attributes in the expression must be separated by commas. If no attribute names are specified, then all attributes of the specified item are returned. If any of the requested attributes are not found, they do not appear in the result.
    */
  var ProjectionExpression: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.ProjectionExpression] = js.native
  
  /**
    * The name of the table from which to retrieve the specified item.
    */
  var TableName: typingsSlinky.awsSdk.dynamodbMod.TableName = js.native
}
object Get {
  
  @scala.inline
  def apply(Key: Key, TableName: TableName): Get = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Get]
  }
  
  @scala.inline
  implicit class GetMutableBuilder[Self <: Get] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpressionAttributeNames(value: ExpressionAttributeNameMap): Self = StObject.set(x, "ExpressionAttributeNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionAttributeNamesUndefined: Self = StObject.set(x, "ExpressionAttributeNames", js.undefined)
    
    @scala.inline
    def setKey(value: Key): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectionExpression(value: ProjectionExpression): Self = StObject.set(x, "ProjectionExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectionExpressionUndefined: Self = StObject.set(x, "ProjectionExpression", js.undefined)
    
    @scala.inline
    def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
  }
}
