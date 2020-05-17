package typingsSlinky.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.documentClientMod.DocumentClient.StringSet
  - typingsSlinky.awsSdk.documentClientMod.DocumentClient.NumberSet
  - typingsSlinky.awsSdk.documentClientMod.DocumentClient.BinarySet
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

