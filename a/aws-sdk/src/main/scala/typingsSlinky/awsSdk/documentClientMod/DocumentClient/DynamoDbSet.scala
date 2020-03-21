package typingsSlinky.awsSdk.documentClientMod.DocumentClient

import typingsSlinky.awsSdk.awsSdkStrings.Binary_
import typingsSlinky.awsSdk.awsSdkStrings.Number_
import typingsSlinky.awsSdk.awsSdkStrings.String_
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
  def StringSet(`type`: String_, values: js.Array[java.lang.String]): DynamoDbSet = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamoDbSet]
  }
  @scala.inline
  def NumberSet(`type`: Number_, values: js.Array[scala.Double]): DynamoDbSet = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamoDbSet]
  }
  @scala.inline
  def BinarySet(`type`: Binary_, values: js.Array[binaryType]): DynamoDbSet = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamoDbSet]
  }
}

