package typingsSlinky.awsSdk.acmpcaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.UNSPECIFIED
  - typingsSlinky.awsSdk.awsSdkStrings.KEY_COMPROMISE
  - typingsSlinky.awsSdk.awsSdkStrings.CERTIFICATE_AUTHORITY_COMPROMISE
  - typingsSlinky.awsSdk.awsSdkStrings.AFFILIATION_CHANGED
  - typingsSlinky.awsSdk.awsSdkStrings.SUPERSEDED
  - typingsSlinky.awsSdk.awsSdkStrings.CESSATION_OF_OPERATION
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
  def CERTIFICATE_AUTHORITY_COMPROMISE: typingsSlinky.awsSdk.awsSdkStrings.CERTIFICATE_AUTHORITY_COMPROMISE = "CERTIFICATE_AUTHORITY_COMPROMISE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CERTIFICATE_AUTHORITY_COMPROMISE]
  @scala.inline
  def AFFILIATION_CHANGED: typingsSlinky.awsSdk.awsSdkStrings.AFFILIATION_CHANGED = "AFFILIATION_CHANGED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.AFFILIATION_CHANGED]
  @scala.inline
  def SUPERSEDED: typingsSlinky.awsSdk.awsSdkStrings.SUPERSEDED = "SUPERSEDED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SUPERSEDED]
  @scala.inline
  def CESSATION_OF_OPERATION: typingsSlinky.awsSdk.awsSdkStrings.CESSATION_OF_OPERATION = "CESSATION_OF_OPERATION".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CESSATION_OF_OPERATION]
  @scala.inline
  def PRIVILEGE_WITHDRAWN: typingsSlinky.awsSdk.awsSdkStrings.PRIVILEGE_WITHDRAWN = "PRIVILEGE_WITHDRAWN".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PRIVILEGE_WITHDRAWN]
  @scala.inline
  def A_A_COMPROMISE: typingsSlinky.awsSdk.awsSdkStrings.A_A_COMPROMISE = "A_A_COMPROMISE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.A_A_COMPROMISE]
  @scala.inline
  implicit def apply(value: java.lang.String): RevocationReason = value.asInstanceOf[RevocationReason]
}

