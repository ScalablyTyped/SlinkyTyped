package typingsSlinky.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.CREATE
  - typingsSlinky.awsSdk.awsSdkStrings.DELETE
  - typingsSlinky.awsSdk.awsSdkStrings.UPSERT
  - java.lang.String
*/
trait ChangeAction extends js.Object

object ChangeAction {
  @scala.inline
  def CREATE: typingsSlinky.awsSdk.awsSdkStrings.CREATE = "CREATE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CREATE]
  @scala.inline
  def DELETE: typingsSlinky.awsSdk.awsSdkStrings.DELETE = "DELETE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DELETE]
  @scala.inline
  def UPSERT: typingsSlinky.awsSdk.awsSdkStrings.UPSERT = "UPSERT".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.UPSERT]
  @scala.inline
  implicit def apply(value: String): ChangeAction = value.asInstanceOf[ChangeAction]
}

