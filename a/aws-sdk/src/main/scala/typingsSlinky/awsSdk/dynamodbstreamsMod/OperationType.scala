package typingsSlinky.awsSdk.dynamodbstreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.INSERT
  - typingsSlinky.awsSdk.awsSdkStrings.MODIFY
  - typingsSlinky.awsSdk.awsSdkStrings.REMOVE
  - java.lang.String
*/
trait OperationType extends js.Object

object OperationType {
  @scala.inline
  def INSERT: typingsSlinky.awsSdk.awsSdkStrings.INSERT = "INSERT".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.INSERT]
  @scala.inline
  def MODIFY: typingsSlinky.awsSdk.awsSdkStrings.MODIFY = "MODIFY".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.MODIFY]
  @scala.inline
  def REMOVE: typingsSlinky.awsSdk.awsSdkStrings.REMOVE = "REMOVE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.REMOVE]
  @scala.inline
  implicit def apply(value: java.lang.String): OperationType = value.asInstanceOf[OperationType]
}

