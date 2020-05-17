package typingsSlinky.awsSdk.servicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.CREATE_NAMESPACE
  - typingsSlinky.awsSdk.awsSdkStrings.DELETE_NAMESPACE
  - typingsSlinky.awsSdk.awsSdkStrings.UPDATE_SERVICE
  - typingsSlinky.awsSdk.awsSdkStrings.REGISTER_INSTANCE
  - typingsSlinky.awsSdk.awsSdkStrings.DEREGISTER_INSTANCE
  - java.lang.String
*/
trait OperationType extends js.Object

object OperationType {
  @scala.inline
  def CREATE_NAMESPACE: typingsSlinky.awsSdk.awsSdkStrings.CREATE_NAMESPACE = "CREATE_NAMESPACE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CREATE_NAMESPACE]
  @scala.inline
  def DELETE_NAMESPACE: typingsSlinky.awsSdk.awsSdkStrings.DELETE_NAMESPACE = "DELETE_NAMESPACE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DELETE_NAMESPACE]
  @scala.inline
  def UPDATE_SERVICE: typingsSlinky.awsSdk.awsSdkStrings.UPDATE_SERVICE = "UPDATE_SERVICE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.UPDATE_SERVICE]
  @scala.inline
  def REGISTER_INSTANCE: typingsSlinky.awsSdk.awsSdkStrings.REGISTER_INSTANCE = "REGISTER_INSTANCE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.REGISTER_INSTANCE]
  @scala.inline
  def DEREGISTER_INSTANCE: typingsSlinky.awsSdk.awsSdkStrings.DEREGISTER_INSTANCE = "DEREGISTER_INSTANCE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DEREGISTER_INSTANCE]
  @scala.inline
  implicit def apply(value: String): OperationType = value.asInstanceOf[OperationType]
}

