package typingsSlinky.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.JobFailed
  - typingsSlinky.awsSdk.awsSdkStrings.ConfigurationError
  - typingsSlinky.awsSdk.awsSdkStrings.PermissionError
  - typingsSlinky.awsSdk.awsSdkStrings.RevisionOutOfSync
  - typingsSlinky.awsSdk.awsSdkStrings.RevisionUnavailable
  - typingsSlinky.awsSdk.awsSdkStrings.SystemUnavailable
  - java.lang.String
*/
trait FailureType extends js.Object

object FailureType {
  @scala.inline
  def JobFailed: typingsSlinky.awsSdk.awsSdkStrings.JobFailed = "JobFailed".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.JobFailed]
  @scala.inline
  def ConfigurationError: typingsSlinky.awsSdk.awsSdkStrings.ConfigurationError = "ConfigurationError".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ConfigurationError]
  @scala.inline
  def PermissionError: typingsSlinky.awsSdk.awsSdkStrings.PermissionError = "PermissionError".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PermissionError]
  @scala.inline
  def RevisionOutOfSync: typingsSlinky.awsSdk.awsSdkStrings.RevisionOutOfSync = "RevisionOutOfSync".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.RevisionOutOfSync]
  @scala.inline
  def RevisionUnavailable: typingsSlinky.awsSdk.awsSdkStrings.RevisionUnavailable = "RevisionUnavailable".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.RevisionUnavailable]
  @scala.inline
  def SystemUnavailable: typingsSlinky.awsSdk.awsSdkStrings.SystemUnavailable = "SystemUnavailable".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SystemUnavailable]
  @scala.inline
  implicit def apply(value: java.lang.String): FailureType = value.asInstanceOf[FailureType]
}

