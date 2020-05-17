package typingsSlinky.awsSdk.budgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.GREATER_THAN
  - typingsSlinky.awsSdk.awsSdkStrings.LESS_THAN
  - typingsSlinky.awsSdk.awsSdkStrings.EQUAL_TO
  - java.lang.String
*/
trait ComparisonOperator extends js.Object

object ComparisonOperator {
  @scala.inline
  def GREATER_THAN: typingsSlinky.awsSdk.awsSdkStrings.GREATER_THAN = "GREATER_THAN".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.GREATER_THAN]
  @scala.inline
  def LESS_THAN: typingsSlinky.awsSdk.awsSdkStrings.LESS_THAN = "LESS_THAN".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.LESS_THAN]
  @scala.inline
  def EQUAL_TO: typingsSlinky.awsSdk.awsSdkStrings.EQUAL_TO = "EQUAL_TO".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.EQUAL_TO]
  @scala.inline
  implicit def apply(value: String): ComparisonOperator = value.asInstanceOf[ComparisonOperator]
}

