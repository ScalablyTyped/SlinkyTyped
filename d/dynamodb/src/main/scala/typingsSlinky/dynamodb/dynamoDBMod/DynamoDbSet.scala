package typingsSlinky.dynamodb.dynamoDBMod

import typingsSlinky.dynamodb.dynamodbStrings.Binary
import typingsSlinky.dynamodb.dynamodbStrings.Number
import typingsSlinky.dynamodb.dynamodbStrings.String
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.dynamodb.dynamoDBMod.StringSet
  - typingsSlinky.dynamodb.dynamoDBMod.NumberSet
  - typingsSlinky.dynamodb.dynamoDBMod.BinarySet
*/
trait DynamoDbSet extends js.Object
object DynamoDbSet {
  
  @scala.inline
  def StringSet(`type`: String, values: js.Array[java.lang.String]): DynamoDbSet = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamoDbSet]
  }
  
  @scala.inline
  def NumberSet(`type`: Number, values: js.Array[Double]): DynamoDbSet = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamoDbSet]
  }
  
  @scala.inline
  def BinarySet(`type`: Binary, values: js.Array[binaryType]): DynamoDbSet = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamoDbSet]
  }
}
