package typingsSlinky.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.REGULAR
  - typingsSlinky.awsSdk.awsSdkStrings.RATE_BASED
  - typingsSlinky.awsSdk.awsSdkStrings.GROUP
  - java.lang.String
*/
trait WafRuleType extends js.Object

object WafRuleType {
  @scala.inline
  def REGULAR: typingsSlinky.awsSdk.awsSdkStrings.REGULAR = "REGULAR".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.REGULAR]
  @scala.inline
  def RATE_BASED: typingsSlinky.awsSdk.awsSdkStrings.RATE_BASED = "RATE_BASED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.RATE_BASED]
  @scala.inline
  def GROUP: typingsSlinky.awsSdk.awsSdkStrings.GROUP = "GROUP".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.GROUP]
  @scala.inline
  implicit def apply(value: String): WafRuleType = value.asInstanceOf[WafRuleType]
}

