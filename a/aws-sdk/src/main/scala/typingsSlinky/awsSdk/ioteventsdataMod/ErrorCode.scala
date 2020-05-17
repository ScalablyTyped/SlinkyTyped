package typingsSlinky.awsSdk.ioteventsdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.ResourceNotFoundException
  - typingsSlinky.awsSdk.awsSdkStrings.InvalidRequestException
  - typingsSlinky.awsSdk.awsSdkStrings.InternalFailureException
  - typingsSlinky.awsSdk.awsSdkStrings.ServiceUnavailableException
  - typingsSlinky.awsSdk.awsSdkStrings.ThrottlingException
  - java.lang.String
*/
trait ErrorCode extends js.Object

object ErrorCode {
  @scala.inline
  def ResourceNotFoundException: typingsSlinky.awsSdk.awsSdkStrings.ResourceNotFoundException = "ResourceNotFoundException".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ResourceNotFoundException]
  @scala.inline
  def InvalidRequestException: typingsSlinky.awsSdk.awsSdkStrings.InvalidRequestException = "InvalidRequestException".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.InvalidRequestException]
  @scala.inline
  def InternalFailureException: typingsSlinky.awsSdk.awsSdkStrings.InternalFailureException = "InternalFailureException".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.InternalFailureException]
  @scala.inline
  def ServiceUnavailableException: typingsSlinky.awsSdk.awsSdkStrings.ServiceUnavailableException = "ServiceUnavailableException".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ServiceUnavailableException]
  @scala.inline
  def ThrottlingException: typingsSlinky.awsSdk.awsSdkStrings.ThrottlingException = "ThrottlingException".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ThrottlingException]
  @scala.inline
  implicit def apply(value: String): ErrorCode = value.asInstanceOf[ErrorCode]
}

