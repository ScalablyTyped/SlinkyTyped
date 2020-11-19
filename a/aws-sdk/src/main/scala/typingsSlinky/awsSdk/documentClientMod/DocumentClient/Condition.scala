package typingsSlinky.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Condition extends js.Object {
  
  /**
    * One or more values to evaluate against the supplied attribute. The number of values in the list depends on the ComparisonOperator being used. For type Number, value comparisons are numeric. String value comparisons for greater than, equals, or less than are based on ASCII character code values. For example, a is greater than A, and a is greater than B. For a list of code values, see http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters. For Binary, DynamoDB treats each byte of the binary data as unsigned when it compares binary values.
    */
  var AttributeValueList: js.UndefOr[typingsSlinky.awsSdk.documentClientMod.DocumentClient.AttributeValueList] = js.native
  
  /**
    * A comparator for evaluating attributes. For example, equals, greater than, less than, etc. The following comparison operators are available:  EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS | NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN  The following are descriptions of each comparison operator.    EQ : Equal. EQ is supported for all data types, including lists and maps.  AttributeValueList can contain only one AttributeValue element of type String, Number, Binary, String Set, Number Set, or Binary Set. If an item contains an AttributeValue element of a different type than the one provided in the request, the value does not match. For example, {"S":"6"} does not equal {"N":"6"}. Also, {"N":"6"} does not equal {"NS":["6", "2", "1"]}.     NE : Not equal. NE is supported for all data types, including lists and maps.  AttributeValueList can contain only one AttributeValue of type String, Number, Binary, String Set, Number Set, or Binary Set. If an item contains an AttributeValue of a different type than the one provided in the request, the value does not match. For example, {"S":"6"} does not equal {"N":"6"}. Also, {"N":"6"} does not equal {"NS":["6", "2", "1"]}.     LE : Less than or equal.   AttributeValueList can contain only one AttributeValue element of type String, Number, or Binary (not a set type). If an item contains an AttributeValue element of a different type than the one provided in the request, the value does not match. For example, {"S":"6"} does not equal {"N":"6"}. Also, {"N":"6"} does not compare to {"NS":["6", "2", "1"]}.     LT : Less than.   AttributeValueList can contain only one AttributeValue of type String, Number, or Binary (not a set type). If an item contains an AttributeValue element of a different type than the one provided in the request, the value does not match. For example, {"S":"6"} does not equal {"N":"6"}. Also, {"N":"6"} does not compare to {"NS":["6", "2", "1"]}.     GE : Greater than or equal.   AttributeValueList can contain only one AttributeValue element of type String, Number, or Binary (not a set type). If an item contains an AttributeValue element of a different type than the one provided in the request, the value does not match. For example, {"S":"6"} does not equal {"N":"6"}. Also, {"N":"6"} does not compare to {"NS":["6", "2", "1"]}.     GT : Greater than.   AttributeValueList can contain only one AttributeValue element of type String, Number, or Binary (not a set type). If an item contains an AttributeValue element of a different type than the one provided in the request, the value does not match. For example, {"S":"6"} does not equal {"N":"6"}. Also, {"N":"6"} does not compare to {"NS":["6", "2", "1"]}.     NOT_NULL : The attribute exists. NOT_NULL is supported for all data types, including lists and maps.  This operator tests for the existence of an attribute, not its data type. If the data type of attribute "a" is null, and you evaluate it using NOT_NULL, the result is a Boolean true. This result is because the attribute "a" exists; its data type is not relevant to the NOT_NULL comparison operator.     NULL : The attribute does not exist. NULL is supported for all data types, including lists and maps.  This operator tests for the nonexistence of an attribute, not its data type. If the data type of attribute "a" is null, and you evaluate it using NULL, the result is a Boolean false. This is because the attribute "a" exists; its data type is not relevant to the NULL comparison operator.     CONTAINS : Checks for a subsequence, or value in a set.  AttributeValueList can contain only one AttributeValue element of type String, Number, or Binary (not a set type). If the target attribute of the comparison is of type String, then the operator checks for a substring match. If the target attribute of the comparison is of type Binary, then the operator looks for a subsequence of the target that matches the input. If the target attribute of the comparison is a set ("SS", "NS", or "BS"), then the operator evaluates to true if it finds an exact match with any member of the set. CONTAINS is supported for lists: When evaluating "a CONTAINS b", "a" can be a list; however, "b" cannot be a set, a map, or a list.    NOT_CONTAINS : Checks for absence of a subsequence, or absence of a value in a set.  AttributeValueList can contain only one AttributeValue element of type String, Number, or Binary (not a set type). If the target attribute of the comparison is a String, then the operator checks for the absence of a substring match. If the target attribute of the comparison is Binary, then the operator checks for the absence of a subsequence of the target that matches the input. If the target attribute of the comparison is a set ("SS", "NS", or "BS"), then the operator evaluates to true if it does not find an exact match with any member of the set. NOT_CONTAINS is supported for lists: When evaluating "a NOT CONTAINS b", "a" can be a list; however, "b" cannot be a set, a map, or a list.    BEGINS_WITH : Checks for a prefix.   AttributeValueList can contain only one AttributeValue of type String or Binary (not a Number or a set type). The target attribute of the comparison must be of type String or Binary (not a Number or a set type).     IN : Checks for matching elements in a list.  AttributeValueList can contain one or more AttributeValue elements of type String, Number, or Binary. These attributes are compared against an existing attribute of an item. If any elements of the input are equal to the item attribute, the expression evaluates to true.    BETWEEN : Greater than or equal to the first value, and less than or equal to the second value.   AttributeValueList must contain two AttributeValue elements of the same type, either String, Number, or Binary (not a set type). A target attribute matches if the target value is greater than, or equal to, the first element and less than, or equal to, the second element. If an item contains an AttributeValue element of a different type than the one provided in the request, the value does not match. For example, {"S":"6"} does not compare to {"N":"6"}. Also, {"N":"6"} does not compare to {"NS":["6", "2", "1"]}    For usage examples of AttributeValueList and ComparisonOperator, see Legacy Conditional Parameters in the Amazon DynamoDB Developer Guide.
    */
  var ComparisonOperator: typingsSlinky.awsSdk.documentClientMod.DocumentClient.ComparisonOperator = js.native
}
object Condition {
  
  @scala.inline
  def apply(ComparisonOperator: ComparisonOperator): Condition = {
    val __obj = js.Dynamic.literal(ComparisonOperator = ComparisonOperator.asInstanceOf[js.Any])
    __obj.asInstanceOf[Condition]
  }
  
  @scala.inline
  implicit class ConditionOps[Self <: Condition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setComparisonOperator(value: ComparisonOperator): Self = this.set("ComparisonOperator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeValueListVarargs(value: AttributeValue*): Self = this.set("AttributeValueList", js.Array(value :_*))
    
    @scala.inline
    def setAttributeValueList(value: AttributeValueList): Self = this.set("AttributeValueList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributeValueList: Self = this.set("AttributeValueList", js.undefined)
  }
}
