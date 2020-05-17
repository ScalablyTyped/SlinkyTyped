package typingsSlinky.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.NON_PROVISIONABLE
  - typingsSlinky.awsSdk.awsSdkStrings.IMMUTABLE
  - typingsSlinky.awsSdk.awsSdkStrings.FULLY_MUTABLE
  - java.lang.String
*/
trait ProvisioningType extends js.Object

object ProvisioningType {
  @scala.inline
  def NON_PROVISIONABLE: typingsSlinky.awsSdk.awsSdkStrings.NON_PROVISIONABLE = "NON_PROVISIONABLE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.NON_PROVISIONABLE]
  @scala.inline
  def IMMUTABLE: typingsSlinky.awsSdk.awsSdkStrings.IMMUTABLE = "IMMUTABLE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.IMMUTABLE]
  @scala.inline
  def FULLY_MUTABLE: typingsSlinky.awsSdk.awsSdkStrings.FULLY_MUTABLE = "FULLY_MUTABLE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FULLY_MUTABLE]
  @scala.inline
  implicit def apply(value: String): ProvisioningType = value.asInstanceOf[ProvisioningType]
}

