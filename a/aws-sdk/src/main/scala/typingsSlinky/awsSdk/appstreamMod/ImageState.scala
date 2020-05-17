package typingsSlinky.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.PENDING
  - typingsSlinky.awsSdk.awsSdkStrings.AVAILABLE
  - typingsSlinky.awsSdk.awsSdkStrings.FAILED
  - typingsSlinky.awsSdk.awsSdkStrings.COPYING
  - typingsSlinky.awsSdk.awsSdkStrings.DELETING
  - java.lang.String
*/
trait ImageState extends js.Object

object ImageState {
  @scala.inline
  def PENDING: typingsSlinky.awsSdk.awsSdkStrings.PENDING = "PENDING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PENDING]
  @scala.inline
  def AVAILABLE: typingsSlinky.awsSdk.awsSdkStrings.AVAILABLE = "AVAILABLE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.AVAILABLE]
  @scala.inline
  def FAILED: typingsSlinky.awsSdk.awsSdkStrings.FAILED = "FAILED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FAILED]
  @scala.inline
  def COPYING: typingsSlinky.awsSdk.awsSdkStrings.COPYING = "COPYING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.COPYING]
  @scala.inline
  def DELETING: typingsSlinky.awsSdk.awsSdkStrings.DELETING = "DELETING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DELETING]
  @scala.inline
  implicit def apply(value: java.lang.String): ImageState = value.asInstanceOf[ImageState]
}

