package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.GRANT_ACCESS
  - typingsSlinky.awsSdk.awsSdkStrings.DENY_ACCESS
  - java.lang.String
*/
trait RowLevelPermissionPolicy extends js.Object

object RowLevelPermissionPolicy {
  @scala.inline
  def GRANT_ACCESS: typingsSlinky.awsSdk.awsSdkStrings.GRANT_ACCESS = "GRANT_ACCESS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.GRANT_ACCESS]
  @scala.inline
  def DENY_ACCESS: typingsSlinky.awsSdk.awsSdkStrings.DENY_ACCESS = "DENY_ACCESS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DENY_ACCESS]
  @scala.inline
  implicit def apply(value: java.lang.String): RowLevelPermissionPolicy = value.asInstanceOf[RowLevelPermissionPolicy]
}

