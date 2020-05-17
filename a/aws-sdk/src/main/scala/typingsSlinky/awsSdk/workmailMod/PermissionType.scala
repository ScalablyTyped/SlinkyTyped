package typingsSlinky.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.FULL_ACCESS
  - typingsSlinky.awsSdk.awsSdkStrings.SEND_AS
  - typingsSlinky.awsSdk.awsSdkStrings.SEND_ON_BEHALF
  - java.lang.String
*/
trait PermissionType extends js.Object

object PermissionType {
  @scala.inline
  def FULL_ACCESS: typingsSlinky.awsSdk.awsSdkStrings.FULL_ACCESS = "FULL_ACCESS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FULL_ACCESS]
  @scala.inline
  def SEND_AS: typingsSlinky.awsSdk.awsSdkStrings.SEND_AS = "SEND_AS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SEND_AS]
  @scala.inline
  def SEND_ON_BEHALF: typingsSlinky.awsSdk.awsSdkStrings.SEND_ON_BEHALF = "SEND_ON_BEHALF".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SEND_ON_BEHALF]
  @scala.inline
  implicit def apply(value: java.lang.String): PermissionType = value.asInstanceOf[PermissionType]
}

