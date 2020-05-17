package typingsSlinky.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.S
  - typingsSlinky.awsSdk.awsSdkStrings.N
  - typingsSlinky.awsSdk.awsSdkStrings.B
  - java.lang.String
*/
trait ScalarAttributeType extends js.Object

object ScalarAttributeType {
  @scala.inline
  def S: typingsSlinky.awsSdk.awsSdkStrings.S = "S".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.S]
  @scala.inline
  def N: typingsSlinky.awsSdk.awsSdkStrings.N = "N".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.N]
  @scala.inline
  def B: typingsSlinky.awsSdk.awsSdkStrings.B = "B".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.B]
  @scala.inline
  implicit def apply(value: java.lang.String): ScalarAttributeType = value.asInstanceOf[ScalarAttributeType]
}

