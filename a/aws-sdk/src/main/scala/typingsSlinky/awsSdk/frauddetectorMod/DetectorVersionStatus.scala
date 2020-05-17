package typingsSlinky.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.DRAFT
  - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
  - typingsSlinky.awsSdk.awsSdkStrings.INACTIVE
  - java.lang.String
*/
trait DetectorVersionStatus extends js.Object

object DetectorVersionStatus {
  @scala.inline
  def DRAFT: typingsSlinky.awsSdk.awsSdkStrings.DRAFT = "DRAFT".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DRAFT]
  @scala.inline
  def ACTIVE: typingsSlinky.awsSdk.awsSdkStrings.ACTIVE = "ACTIVE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ACTIVE]
  @scala.inline
  def INACTIVE: typingsSlinky.awsSdk.awsSdkStrings.INACTIVE = "INACTIVE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.INACTIVE]
  @scala.inline
  implicit def apply(value: String): DetectorVersionStatus = value.asInstanceOf[DetectorVersionStatus]
}

