package typingsSlinky.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.PARSING_FAILED
  - typingsSlinky.awsSdk.awsSdkStrings.VPC_ENDPOINT_SETUP_FAILED
  - java.lang.String
*/
trait ExecutionResultCode extends js.Object

object ExecutionResultCode {
  @scala.inline
  def PARSING_FAILED: typingsSlinky.awsSdk.awsSdkStrings.PARSING_FAILED = "PARSING_FAILED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PARSING_FAILED]
  @scala.inline
  def VPC_ENDPOINT_SETUP_FAILED: typingsSlinky.awsSdk.awsSdkStrings.VPC_ENDPOINT_SETUP_FAILED = "VPC_ENDPOINT_SETUP_FAILED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.VPC_ENDPOINT_SETUP_FAILED]
  @scala.inline
  implicit def apply(value: java.lang.String): ExecutionResultCode = value.asInstanceOf[ExecutionResultCode]
}

