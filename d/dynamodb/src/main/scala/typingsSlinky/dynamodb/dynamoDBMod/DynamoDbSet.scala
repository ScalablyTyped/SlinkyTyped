package typingsSlinky.dynamodb.dynamoDBMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.dynamodb.dynamoDBMod.StringSet
  - typingsSlinky.dynamodb.dynamoDBMod.NumberSet
  - typingsSlinky.dynamodb.dynamoDBMod.BinarySet
*/
trait DynamoDbSet extends js.Object

object DynamoDbSet {
  @scala.inline
  implicit def apply(value: BinarySet): DynamoDbSet = value.asInstanceOf[DynamoDbSet]
  @scala.inline
  implicit def apply(value: NumberSet): DynamoDbSet = value.asInstanceOf[DynamoDbSet]
  @scala.inline
  implicit def apply(value: StringSet): DynamoDbSet = value.asInstanceOf[DynamoDbSet]
}

