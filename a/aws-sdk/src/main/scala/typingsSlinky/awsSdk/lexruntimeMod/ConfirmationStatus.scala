package typingsSlinky.awsSdk.lexruntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.None_
  - typingsSlinky.awsSdk.awsSdkStrings.Confirmed_
  - typingsSlinky.awsSdk.awsSdkStrings.Denied_
  - java.lang.String
*/
trait ConfirmationStatus extends js.Object

object ConfirmationStatus {
  @scala.inline
  def None_ : typingsSlinky.awsSdk.awsSdkStrings.None_ = "None".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.None_]
  @scala.inline
  def Confirmed_ : typingsSlinky.awsSdk.awsSdkStrings.Confirmed_ = "Confirmed".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Confirmed_]
  @scala.inline
  def Denied_ : typingsSlinky.awsSdk.awsSdkStrings.Denied_ = "Denied".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Denied_]
  @scala.inline
  implicit def apply(value: java.lang.String): ConfirmationStatus = value.asInstanceOf[ConfirmationStatus]
}

