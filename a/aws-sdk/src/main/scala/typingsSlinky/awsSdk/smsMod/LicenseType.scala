package typingsSlinky.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.AWS
  - typingsSlinky.awsSdk.awsSdkStrings.BYOL
  - java.lang.String
*/
trait LicenseType extends js.Object

object LicenseType {
  @scala.inline
  def AWS: typingsSlinky.awsSdk.awsSdkStrings.AWS = "AWS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.AWS]
  @scala.inline
  def BYOL: typingsSlinky.awsSdk.awsSdkStrings.BYOL = "BYOL".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.BYOL]
  @scala.inline
  implicit def apply(value: String): LicenseType = value.asInstanceOf[LicenseType]
}

