package typingsSlinky.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.ACCOUNT
  - typingsSlinky.awsSdk.awsSdkStrings.ORGANIZATIONAL_UNIT
  - typingsSlinky.awsSdk.awsSdkStrings.ROOT
  - java.lang.String
*/
trait TargetType extends js.Object

object TargetType {
  @scala.inline
  def ACCOUNT: typingsSlinky.awsSdk.awsSdkStrings.ACCOUNT = "ACCOUNT".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ACCOUNT]
  @scala.inline
  def ORGANIZATIONAL_UNIT: typingsSlinky.awsSdk.awsSdkStrings.ORGANIZATIONAL_UNIT = "ORGANIZATIONAL_UNIT".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ORGANIZATIONAL_UNIT]
  @scala.inline
  def ROOT: typingsSlinky.awsSdk.awsSdkStrings.ROOT = "ROOT".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ROOT]
  @scala.inline
  implicit def apply(value: String): TargetType = value.asInstanceOf[TargetType]
}

