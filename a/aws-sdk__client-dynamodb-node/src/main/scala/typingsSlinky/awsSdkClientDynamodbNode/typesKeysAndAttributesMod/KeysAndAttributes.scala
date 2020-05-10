package typingsSlinky.awsSdkClientDynamodbNode.typesKeysAndAttributesMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsSdkClientDynamodbNode.typesAttributeValueMod.AttributeValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeysAndAttributes extends js.Object {
  /**
    * <p>This is a legacy parameter. Use <code>ProjectionExpression</code> instead. For more information, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.html">Legacy Conditional Parameters</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
    */
  var AttributesToGet: js.UndefOr[js.Array[String] | js.Iterable[String]] = js.native
  /**
    * <p>The consistency of a read operation. If set to <code>true</code>, then a strongly consistent read is used; otherwise, an eventually consistent read is used.</p>
    */
  var ConsistentRead: js.UndefOr[Boolean] = js.native
  /**
    * <p>One or more substitution tokens for attribute names in an expression. The following are some use cases for using <code>ExpressionAttributeNames</code>:</p> <ul> <li> <p>To access an attribute whose name conflicts with a DynamoDB reserved word.</p> </li> <li> <p>To create a placeholder for repeating occurrences of an attribute name in an expression.</p> </li> <li> <p>To prevent special characters in an attribute name from being misinterpreted in an expression.</p> </li> </ul> <p>Use the <b>#</b> character in an expression to dereference an attribute name. For example, consider the following attribute name:</p> <ul> <li> <p> <code>Percentile</code> </p> </li> </ul> <p>The name of this attribute conflicts with a reserved word, so it cannot be used directly in an expression. (For the complete list of reserved words, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ReservedWords.html">Reserved Words</a> in the <i>Amazon DynamoDB Developer Guide</i>). To work around this, you could specify the following for <code>ExpressionAttributeNames</code>:</p> <ul> <li> <p> <code>{"#P":"Percentile"}</code> </p> </li> </ul> <p>You could then use this substitution in an expression, as in this example:</p> <ul> <li> <p> <code>#P = :val</code> </p> </li> </ul> <note> <p>Tokens that begin with the <b>:</b> character are <i>expression attribute values</i>, which are placeholders for the actual value at runtime.</p> </note> <p>For more information on expression attribute names, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html">Accessing Item Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
    */
  var ExpressionAttributeNames: js.UndefOr[StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]])] = js.native
  /**
    * <p>The primary key attribute values that define the items and the attributes associated with the items.</p>
    */
  var Keys: (js.Array[
    StringDictionary[AttributeValue] | (js.Iterable[js.Tuple2[String, AttributeValue]])
  ]) | (js.Iterable[
    StringDictionary[AttributeValue] | (js.Iterable[js.Tuple2[String, AttributeValue]])
  ]) = js.native
  /**
    * <p>A string that identifies one or more attributes to retrieve from the table. These attributes can include scalars, sets, or elements of a JSON document. The attributes in the <code>ProjectionExpression</code> must be separated by commas.</p> <p>If no attribute names are specified, then all attributes will be returned. If any of the requested attributes are not found, they will not appear in the result.</p> <p>For more information, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html">Accessing Item Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
    */
  var ProjectionExpression: js.UndefOr[String] = js.native
}

object KeysAndAttributes {
  @scala.inline
  def apply(
    Keys: (js.Array[
      StringDictionary[AttributeValue] | (js.Iterable[js.Tuple2[String, AttributeValue]])
    ]) | (js.Iterable[
      StringDictionary[AttributeValue] | (js.Iterable[js.Tuple2[String, AttributeValue]])
    ])
  ): KeysAndAttributes = {
    val __obj = js.Dynamic.literal(Keys = Keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeysAndAttributes]
  }
  @scala.inline
  implicit class KeysAndAttributesOps[Self <: KeysAndAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeysIterable(
      value: js.Iterable[
          StringDictionary[AttributeValue] | (js.Iterable[js.Tuple2[String, AttributeValue]])
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Keys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeys(
      value: (js.Array[
          StringDictionary[AttributeValue] | (js.Iterable[js.Tuple2[String, AttributeValue]])
        ]) | (js.Iterable[
          StringDictionary[AttributeValue] | (js.Iterable[js.Tuple2[String, AttributeValue]])
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Keys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttributesToGetIterable(value: js.Iterable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributesToGet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttributesToGet(value: js.Array[String] | js.Iterable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributesToGet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributesToGet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributesToGet")(js.undefined)
        ret
    }
    @scala.inline
    def withConsistentRead(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConsistentRead")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsistentRead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConsistentRead")(js.undefined)
        ret
    }
    @scala.inline
    def withExpressionAttributeNamesIterable(value: js.Iterable[js.Tuple2[String, String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpressionAttributeNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpressionAttributeNames(value: StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpressionAttributeNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpressionAttributeNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpressionAttributeNames")(js.undefined)
        ret
    }
    @scala.inline
    def withProjectionExpression(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProjectionExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectionExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProjectionExpression")(js.undefined)
        ret
    }
  }
  
}

