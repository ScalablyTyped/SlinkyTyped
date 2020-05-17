package typingsSlinky.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.Granted
  - typingsSlinky.awsSdk.awsSdkStrings.Revoked_
  - java.lang.String
*/
trait QualificationStatus extends js.Object

object QualificationStatus {
  @scala.inline
  def Granted: typingsSlinky.awsSdk.awsSdkStrings.Granted = "Granted".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Granted]
  @scala.inline
  def Revoked_ : typingsSlinky.awsSdk.awsSdkStrings.Revoked_ = "Revoked".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Revoked_]
  @scala.inline
  implicit def apply(value: java.lang.String): QualificationStatus = value.asInstanceOf[QualificationStatus]
}

