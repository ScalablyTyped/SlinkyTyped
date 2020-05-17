package typingsSlinky.awsSdk.route53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.FORWARD
  - typingsSlinky.awsSdk.awsSdkStrings.SYSTEM
  - typingsSlinky.awsSdk.awsSdkStrings.RECURSIVE
  - java.lang.String
*/
trait RuleTypeOption extends js.Object

object RuleTypeOption {
  @scala.inline
  def FORWARD: typingsSlinky.awsSdk.awsSdkStrings.FORWARD = "FORWARD".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FORWARD]
  @scala.inline
  def SYSTEM: typingsSlinky.awsSdk.awsSdkStrings.SYSTEM = "SYSTEM".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SYSTEM]
  @scala.inline
  def RECURSIVE: typingsSlinky.awsSdk.awsSdkStrings.RECURSIVE = "RECURSIVE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.RECURSIVE]
  @scala.inline
  implicit def apply(value: String): RuleTypeOption = value.asInstanceOf[RuleTypeOption]
}

