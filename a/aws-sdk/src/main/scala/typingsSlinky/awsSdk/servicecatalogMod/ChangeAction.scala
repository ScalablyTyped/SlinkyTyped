package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.ADD
  - typingsSlinky.awsSdk.awsSdkStrings.MODIFY
  - typingsSlinky.awsSdk.awsSdkStrings.REMOVE
  - java.lang.String
*/
trait ChangeAction extends js.Object

object ChangeAction {
  @scala.inline
  def ADD: typingsSlinky.awsSdk.awsSdkStrings.ADD = "ADD".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ADD]
  @scala.inline
  def MODIFY: typingsSlinky.awsSdk.awsSdkStrings.MODIFY = "MODIFY".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.MODIFY]
  @scala.inline
  def REMOVE: typingsSlinky.awsSdk.awsSdkStrings.REMOVE = "REMOVE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.REMOVE]
  @scala.inline
  implicit def apply(value: String): ChangeAction = value.asInstanceOf[ChangeAction]
}

