package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.NoRisk
  - typingsSlinky.awsSdk.awsSdkStrings.AccountTakeover
  - typingsSlinky.awsSdk.awsSdkStrings.Block_
  - java.lang.String
*/
trait RiskDecisionType extends js.Object

object RiskDecisionType {
  @scala.inline
  def NoRisk: typingsSlinky.awsSdk.awsSdkStrings.NoRisk = "NoRisk".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.NoRisk]
  @scala.inline
  def AccountTakeover: typingsSlinky.awsSdk.awsSdkStrings.AccountTakeover = "AccountTakeover".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.AccountTakeover]
  @scala.inline
  def Block_ : typingsSlinky.awsSdk.awsSdkStrings.Block_ = "Block".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Block_]
  @scala.inline
  implicit def apply(value: String): RiskDecisionType = value.asInstanceOf[RiskDecisionType]
}

