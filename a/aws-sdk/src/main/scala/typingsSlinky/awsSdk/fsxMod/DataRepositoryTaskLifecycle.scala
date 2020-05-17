package typingsSlinky.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.PENDING
  - typingsSlinky.awsSdk.awsSdkStrings.EXECUTING
  - typingsSlinky.awsSdk.awsSdkStrings.FAILED
  - typingsSlinky.awsSdk.awsSdkStrings.SUCCEEDED
  - typingsSlinky.awsSdk.awsSdkStrings.CANCELED
  - typingsSlinky.awsSdk.awsSdkStrings.CANCELING
  - java.lang.String
*/
trait DataRepositoryTaskLifecycle extends js.Object

object DataRepositoryTaskLifecycle {
  @scala.inline
  def PENDING: typingsSlinky.awsSdk.awsSdkStrings.PENDING = "PENDING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PENDING]
  @scala.inline
  def EXECUTING: typingsSlinky.awsSdk.awsSdkStrings.EXECUTING = "EXECUTING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.EXECUTING]
  @scala.inline
  def FAILED: typingsSlinky.awsSdk.awsSdkStrings.FAILED = "FAILED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FAILED]
  @scala.inline
  def SUCCEEDED: typingsSlinky.awsSdk.awsSdkStrings.SUCCEEDED = "SUCCEEDED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SUCCEEDED]
  @scala.inline
  def CANCELED: typingsSlinky.awsSdk.awsSdkStrings.CANCELED = "CANCELED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CANCELED]
  @scala.inline
  def CANCELING: typingsSlinky.awsSdk.awsSdkStrings.CANCELING = "CANCELING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CANCELING]
  @scala.inline
  implicit def apply(value: String): DataRepositoryTaskLifecycle = value.asInstanceOf[DataRepositoryTaskLifecycle]
}

