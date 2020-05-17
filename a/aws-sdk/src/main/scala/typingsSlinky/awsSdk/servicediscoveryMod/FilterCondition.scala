package typingsSlinky.awsSdk.servicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.EQ
  - typingsSlinky.awsSdk.awsSdkStrings.IN
  - typingsSlinky.awsSdk.awsSdkStrings.BETWEEN
  - java.lang.String
*/
trait FilterCondition extends js.Object

object FilterCondition {
  @scala.inline
  def EQ: typingsSlinky.awsSdk.awsSdkStrings.EQ = "EQ".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.EQ]
  @scala.inline
  def IN: typingsSlinky.awsSdk.awsSdkStrings.IN = "IN".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.IN]
  @scala.inline
  def BETWEEN: typingsSlinky.awsSdk.awsSdkStrings.BETWEEN = "BETWEEN".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.BETWEEN]
  @scala.inline
  implicit def apply(value: String): FilterCondition = value.asInstanceOf[FilterCondition]
}

