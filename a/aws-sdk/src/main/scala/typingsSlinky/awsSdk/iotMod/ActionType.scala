package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.PUBLISH
  - typingsSlinky.awsSdk.awsSdkStrings.SUBSCRIBE
  - typingsSlinky.awsSdk.awsSdkStrings.RECEIVE
  - typingsSlinky.awsSdk.awsSdkStrings.CONNECT
  - java.lang.String
*/
trait ActionType extends js.Object

object ActionType {
  @scala.inline
  def PUBLISH: typingsSlinky.awsSdk.awsSdkStrings.PUBLISH = "PUBLISH".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PUBLISH]
  @scala.inline
  def SUBSCRIBE: typingsSlinky.awsSdk.awsSdkStrings.SUBSCRIBE = "SUBSCRIBE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SUBSCRIBE]
  @scala.inline
  def RECEIVE: typingsSlinky.awsSdk.awsSdkStrings.RECEIVE = "RECEIVE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.RECEIVE]
  @scala.inline
  def CONNECT: typingsSlinky.awsSdk.awsSdkStrings.CONNECT = "CONNECT".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CONNECT]
  @scala.inline
  implicit def apply(value: java.lang.String): ActionType = value.asInstanceOf[ActionType]
}

