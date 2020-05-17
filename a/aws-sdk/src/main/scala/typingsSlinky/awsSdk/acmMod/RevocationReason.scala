package typingsSlinky.awsSdk.acmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.UNSPECIFIED
  - typingsSlinky.awsSdk.awsSdkStrings.KEY_COMPROMISE
  - typingsSlinky.awsSdk.awsSdkStrings.CA_COMPROMISE
  - typingsSlinky.awsSdk.awsSdkStrings.AFFILIATION_CHANGED
  - typingsSlinky.awsSdk.awsSdkStrings.SUPERCEDED
  - typingsSlinky.awsSdk.awsSdkStrings.CESSATION_OF_OPERATION
  - typingsSlinky.awsSdk.awsSdkStrings.CERTIFICATE_HOLD
  - typingsSlinky.awsSdk.awsSdkStrings.REMOVE_FROM_CRL
  - typingsSlinky.awsSdk.awsSdkStrings.PRIVILEGE_WITHDRAWN
  - typingsSlinky.awsSdk.awsSdkStrings.A_A_COMPROMISE
  - java.lang.String
*/
trait RevocationReason extends js.Object

object RevocationReason {
  @scala.inline
  def UNSPECIFIED: typingsSlinky.awsSdk.awsSdkStrings.UNSPECIFIED = "UNSPECIFIED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.UNSPECIFIED]
  @scala.inline
  def KEY_COMPROMISE: typingsSlinky.awsSdk.awsSdkStrings.KEY_COMPROMISE = "KEY_COMPROMISE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.KEY_COMPROMISE]
  @scala.inline
  def CA_COMPROMISE: typingsSlinky.awsSdk.awsSdkStrings.CA_COMPROMISE = "CA_COMPROMISE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CA_COMPROMISE]
  @scala.inline
  def AFFILIATION_CHANGED: typingsSlinky.awsSdk.awsSdkStrings.AFFILIATION_CHANGED = "AFFILIATION_CHANGED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.AFFILIATION_CHANGED]
  @scala.inline
  def SUPERCEDED: typingsSlinky.awsSdk.awsSdkStrings.SUPERCEDED = "SUPERCEDED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SUPERCEDED]
  @scala.inline
  def CESSATION_OF_OPERATION: typingsSlinky.awsSdk.awsSdkStrings.CESSATION_OF_OPERATION = "CESSATION_OF_OPERATION".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CESSATION_OF_OPERATION]
  @scala.inline
  def CERTIFICATE_HOLD: typingsSlinky.awsSdk.awsSdkStrings.CERTIFICATE_HOLD = "CERTIFICATE_HOLD".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CERTIFICATE_HOLD]
  @scala.inline
  def REMOVE_FROM_CRL: typingsSlinky.awsSdk.awsSdkStrings.REMOVE_FROM_CRL = "REMOVE_FROM_CRL".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.REMOVE_FROM_CRL]
  @scala.inline
  def PRIVILEGE_WITHDRAWN: typingsSlinky.awsSdk.awsSdkStrings.PRIVILEGE_WITHDRAWN = "PRIVILEGE_WITHDRAWN".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PRIVILEGE_WITHDRAWN]
  @scala.inline
  def A_A_COMPROMISE: typingsSlinky.awsSdk.awsSdkStrings.A_A_COMPROMISE = "A_A_COMPROMISE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.A_A_COMPROMISE]
  @scala.inline
  implicit def apply(value: java.lang.String): RevocationReason = value.asInstanceOf[RevocationReason]
}

