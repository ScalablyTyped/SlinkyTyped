package typingsSlinky.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.PRE_UPGRADE_CHECK
  - typingsSlinky.awsSdk.awsSdkStrings.SNAPSHOT
  - typingsSlinky.awsSdk.awsSdkStrings.UPGRADE
  - java.lang.String
*/
trait UpgradeStep extends js.Object

object UpgradeStep {
  @scala.inline
  def PRE_UPGRADE_CHECK: typingsSlinky.awsSdk.awsSdkStrings.PRE_UPGRADE_CHECK = "PRE_UPGRADE_CHECK".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PRE_UPGRADE_CHECK]
  @scala.inline
  def SNAPSHOT: typingsSlinky.awsSdk.awsSdkStrings.SNAPSHOT = "SNAPSHOT".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SNAPSHOT]
  @scala.inline
  def UPGRADE: typingsSlinky.awsSdk.awsSdkStrings.UPGRADE = "UPGRADE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.UPGRADE]
  @scala.inline
  implicit def apply(value: java.lang.String): UpgradeStep = value.asInstanceOf[UpgradeStep]
}

