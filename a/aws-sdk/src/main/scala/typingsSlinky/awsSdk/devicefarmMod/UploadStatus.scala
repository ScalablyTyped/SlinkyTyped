package typingsSlinky.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.INITIALIZED
  - typingsSlinky.awsSdk.awsSdkStrings.PROCESSING
  - typingsSlinky.awsSdk.awsSdkStrings.SUCCEEDED
  - typingsSlinky.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
trait UploadStatus extends js.Object

object UploadStatus {
  @scala.inline
  def INITIALIZED: typingsSlinky.awsSdk.awsSdkStrings.INITIALIZED = "INITIALIZED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.INITIALIZED]
  @scala.inline
  def PROCESSING: typingsSlinky.awsSdk.awsSdkStrings.PROCESSING = "PROCESSING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PROCESSING]
  @scala.inline
  def SUCCEEDED: typingsSlinky.awsSdk.awsSdkStrings.SUCCEEDED = "SUCCEEDED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SUCCEEDED]
  @scala.inline
  def FAILED: typingsSlinky.awsSdk.awsSdkStrings.FAILED = "FAILED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FAILED]
  @scala.inline
  implicit def apply(value: java.lang.String): UploadStatus = value.asInstanceOf[UploadStatus]
}

