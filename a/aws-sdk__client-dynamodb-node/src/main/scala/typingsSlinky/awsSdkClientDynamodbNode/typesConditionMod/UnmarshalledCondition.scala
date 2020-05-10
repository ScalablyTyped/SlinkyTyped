package typingsSlinky.awsSdkClientDynamodbNode.typesConditionMod

import typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.BEGINS_WITH
import typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.BETWEEN
import typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.CONTAINS
import typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.EQ
import typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.GE
import typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.GT
import typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.IN
import typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.LE
import typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.LT
import typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.NE
import typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.NOT_CONTAINS
import typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.NOT_NULL
import typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.NULL
import typingsSlinky.awsSdkClientDynamodbNode.typesAttributeValueMod.UnmarshalledAttributeValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledCondition extends Condition {
  /**
    * <p>One or more values to evaluate against the supplied attribute. The number of values in the list depends on the <code>ComparisonOperator</code> being used.</p> <p>For type Number, value comparisons are numeric.</p> <p>String value comparisons for greater than, equals, or less than are based on ASCII character code values. For example, <code>a</code> is greater than <code>A</code>, and <code>a</code> is greater than <code>B</code>. For a list of code values, see <a href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters">http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.</p> <p>For Binary, DynamoDB treats each byte of the binary data as unsigned when it compares binary values.</p>
    */
  @JSName("AttributeValueList")
  var AttributeValueList_UnmarshalledCondition: js.UndefOr[js.Array[UnmarshalledAttributeValue]] = js.native
}

object UnmarshalledCondition {
  @scala.inline
  def apply(
    ComparisonOperator: EQ | NE | IN | LE | LT | GE | GT | BETWEEN | NOT_NULL | NULL | CONTAINS | NOT_CONTAINS | BEGINS_WITH | String
  ): UnmarshalledCondition = {
    val __obj = js.Dynamic.literal(ComparisonOperator = ComparisonOperator.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledCondition]
  }
  @scala.inline
  implicit class UnmarshalledConditionOps[Self <: UnmarshalledCondition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributeValueList(value: js.Array[UnmarshalledAttributeValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeValueList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributeValueList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeValueList")(js.undefined)
        ret
    }
  }
  
}

