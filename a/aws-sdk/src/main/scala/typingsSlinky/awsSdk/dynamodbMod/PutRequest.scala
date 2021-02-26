package typingsSlinky.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutRequest extends StObject {
  
  /**
    * A map of attribute name to attribute values, representing the primary key of an item to be processed by PutItem. All of the table's primary key attributes must be specified, and their data types must match those of the table's key schema. If any attributes are present in the item that are part of an index key schema for the table, their types must match the index key schema.
    */
  var Item: PutItemInputAttributeMap = js.native
}
object PutRequest {
  
  @scala.inline
  def apply(Item: PutItemInputAttributeMap): PutRequest = {
    val __obj = js.Dynamic.literal(Item = Item.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRequest]
  }
  
  @scala.inline
  implicit class PutRequestMutableBuilder[Self <: PutRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItem(value: PutItemInputAttributeMap): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
  }
}
