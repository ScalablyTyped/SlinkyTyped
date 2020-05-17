package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.Processing_
  - typingsSlinky.awsSdk.awsSdkStrings.Acquired
  - typingsSlinky.awsSdk.awsSdkStrings.Failed_
  - java.lang.String
*/
trait OrderedPhoneNumberStatus extends js.Object

object OrderedPhoneNumberStatus {
  @scala.inline
  def Processing_ : typingsSlinky.awsSdk.awsSdkStrings.Processing_ = "Processing".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Processing_]
  @scala.inline
  def Acquired: typingsSlinky.awsSdk.awsSdkStrings.Acquired = "Acquired".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Acquired]
  @scala.inline
  def Failed_ : typingsSlinky.awsSdk.awsSdkStrings.Failed_ = "Failed".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Failed_]
  @scala.inline
  implicit def apply(value: java.lang.String): OrderedPhoneNumberStatus = value.asInstanceOf[OrderedPhoneNumberStatus]
}

