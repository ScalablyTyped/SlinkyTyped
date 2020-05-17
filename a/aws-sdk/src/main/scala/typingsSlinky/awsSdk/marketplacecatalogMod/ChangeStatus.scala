package typingsSlinky.awsSdk.marketplacecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.PREPARING
  - typingsSlinky.awsSdk.awsSdkStrings.APPLYING
  - typingsSlinky.awsSdk.awsSdkStrings.SUCCEEDED
  - typingsSlinky.awsSdk.awsSdkStrings.CANCELLED
  - typingsSlinky.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
trait ChangeStatus extends js.Object

object ChangeStatus {
  @scala.inline
  def PREPARING: typingsSlinky.awsSdk.awsSdkStrings.PREPARING = "PREPARING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PREPARING]
  @scala.inline
  def APPLYING: typingsSlinky.awsSdk.awsSdkStrings.APPLYING = "APPLYING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.APPLYING]
  @scala.inline
  def SUCCEEDED: typingsSlinky.awsSdk.awsSdkStrings.SUCCEEDED = "SUCCEEDED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SUCCEEDED]
  @scala.inline
  def CANCELLED: typingsSlinky.awsSdk.awsSdkStrings.CANCELLED = "CANCELLED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CANCELLED]
  @scala.inline
  def FAILED: typingsSlinky.awsSdk.awsSdkStrings.FAILED = "FAILED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FAILED]
  @scala.inline
  implicit def apply(value: String): ChangeStatus = value.asInstanceOf[ChangeStatus]
}

