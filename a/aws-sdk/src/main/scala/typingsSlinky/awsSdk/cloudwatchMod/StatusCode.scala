package typingsSlinky.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.Complete_
  - typingsSlinky.awsSdk.awsSdkStrings.InternalError
  - typingsSlinky.awsSdk.awsSdkStrings.PartialData
  - java.lang.String
*/
trait StatusCode extends js.Object

object StatusCode {
  @scala.inline
  def Complete_ : typingsSlinky.awsSdk.awsSdkStrings.Complete_ = "Complete".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Complete_]
  @scala.inline
  def InternalError: typingsSlinky.awsSdk.awsSdkStrings.InternalError = "InternalError".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.InternalError]
  @scala.inline
  def PartialData: typingsSlinky.awsSdk.awsSdkStrings.PartialData = "PartialData".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PartialData]
  @scala.inline
  implicit def apply(value: String): StatusCode = value.asInstanceOf[StatusCode]
}

