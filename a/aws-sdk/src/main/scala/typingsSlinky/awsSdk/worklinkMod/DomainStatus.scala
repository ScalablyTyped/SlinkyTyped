package typingsSlinky.awsSdk.worklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.PENDING_VALIDATION
  - typingsSlinky.awsSdk.awsSdkStrings.ASSOCIATING
  - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
  - typingsSlinky.awsSdk.awsSdkStrings.INACTIVE
  - typingsSlinky.awsSdk.awsSdkStrings.DISASSOCIATING
  - typingsSlinky.awsSdk.awsSdkStrings.DISASSOCIATED
  - typingsSlinky.awsSdk.awsSdkStrings.FAILED_TO_ASSOCIATE
  - typingsSlinky.awsSdk.awsSdkStrings.FAILED_TO_DISASSOCIATE
  - java.lang.String
*/
trait DomainStatus extends js.Object

object DomainStatus {
  @scala.inline
  def PENDING_VALIDATION: typingsSlinky.awsSdk.awsSdkStrings.PENDING_VALIDATION = "PENDING_VALIDATION".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PENDING_VALIDATION]
  @scala.inline
  def ASSOCIATING: typingsSlinky.awsSdk.awsSdkStrings.ASSOCIATING = "ASSOCIATING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ASSOCIATING]
  @scala.inline
  def ACTIVE: typingsSlinky.awsSdk.awsSdkStrings.ACTIVE = "ACTIVE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ACTIVE]
  @scala.inline
  def INACTIVE: typingsSlinky.awsSdk.awsSdkStrings.INACTIVE = "INACTIVE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.INACTIVE]
  @scala.inline
  def DISASSOCIATING: typingsSlinky.awsSdk.awsSdkStrings.DISASSOCIATING = "DISASSOCIATING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DISASSOCIATING]
  @scala.inline
  def DISASSOCIATED: typingsSlinky.awsSdk.awsSdkStrings.DISASSOCIATED = "DISASSOCIATED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DISASSOCIATED]
  @scala.inline
  def FAILED_TO_ASSOCIATE: typingsSlinky.awsSdk.awsSdkStrings.FAILED_TO_ASSOCIATE = "FAILED_TO_ASSOCIATE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FAILED_TO_ASSOCIATE]
  @scala.inline
  def FAILED_TO_DISASSOCIATE: typingsSlinky.awsSdk.awsSdkStrings.FAILED_TO_DISASSOCIATE = "FAILED_TO_DISASSOCIATE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FAILED_TO_DISASSOCIATE]
  @scala.inline
  implicit def apply(value: String): DomainStatus = value.asInstanceOf[DomainStatus]
}

