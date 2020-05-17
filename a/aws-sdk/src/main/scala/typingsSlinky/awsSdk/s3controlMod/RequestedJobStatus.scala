package typingsSlinky.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.Cancelled_
  - typingsSlinky.awsSdk.awsSdkStrings.Ready_
  - java.lang.String
*/
trait RequestedJobStatus extends js.Object

object RequestedJobStatus {
  @scala.inline
  def Cancelled_ : typingsSlinky.awsSdk.awsSdkStrings.Cancelled_ = "Cancelled".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Cancelled_]
  @scala.inline
  def Ready_ : typingsSlinky.awsSdk.awsSdkStrings.Ready_ = "Ready".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Ready_]
  @scala.inline
  implicit def apply(value: String): RequestedJobStatus = value.asInstanceOf[RequestedJobStatus]
}

