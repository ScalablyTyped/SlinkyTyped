package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.PendingVerification
  - typingsSlinky.awsSdk.awsSdkStrings.Valid_
  - typingsSlinky.awsSdk.awsSdkStrings.Invalid_
  - java.lang.String
*/
trait ContactMethodStatus extends js.Object

object ContactMethodStatus {
  @scala.inline
  def PendingVerification: typingsSlinky.awsSdk.awsSdkStrings.PendingVerification = "PendingVerification".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PendingVerification]
  @scala.inline
  def Valid_ : typingsSlinky.awsSdk.awsSdkStrings.Valid_ = "Valid".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Valid_]
  @scala.inline
  def Invalid_ : typingsSlinky.awsSdk.awsSdkStrings.Invalid_ = "Invalid".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Invalid_]
  @scala.inline
  implicit def apply(value: String): ContactMethodStatus = value.asInstanceOf[ContactMethodStatus]
}

