package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.CREATE
  - typingsSlinky.awsSdk.awsSdkStrings.UPDATE
  - typingsSlinky.awsSdk.awsSdkStrings.DELETE
  - java.lang.String
*/
trait StackSetOperationType extends js.Object

object StackSetOperationType {
  @scala.inline
  def CREATE: typingsSlinky.awsSdk.awsSdkStrings.CREATE = "CREATE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CREATE]
  @scala.inline
  def UPDATE: typingsSlinky.awsSdk.awsSdkStrings.UPDATE = "UPDATE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.UPDATE]
  @scala.inline
  def DELETE: typingsSlinky.awsSdk.awsSdkStrings.DELETE = "DELETE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DELETE]
  @scala.inline
  implicit def apply(value: String): StackSetOperationType = value.asInstanceOf[StackSetOperationType]
}

