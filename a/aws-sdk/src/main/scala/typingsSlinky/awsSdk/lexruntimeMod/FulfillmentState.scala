package typingsSlinky.awsSdk.lexruntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.Fulfilled_
  - typingsSlinky.awsSdk.awsSdkStrings.Failed_
  - typingsSlinky.awsSdk.awsSdkStrings.ReadyForFulfillment
  - java.lang.String
*/
trait FulfillmentState extends js.Object

object FulfillmentState {
  @scala.inline
  def Fulfilled_ : typingsSlinky.awsSdk.awsSdkStrings.Fulfilled_ = "Fulfilled".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Fulfilled_]
  @scala.inline
  def Failed_ : typingsSlinky.awsSdk.awsSdkStrings.Failed_ = "Failed".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Failed_]
  @scala.inline
  def ReadyForFulfillment: typingsSlinky.awsSdk.awsSdkStrings.ReadyForFulfillment = "ReadyForFulfillment".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ReadyForFulfillment]
  @scala.inline
  implicit def apply(value: java.lang.String): FulfillmentState = value.asInstanceOf[FulfillmentState]
}

