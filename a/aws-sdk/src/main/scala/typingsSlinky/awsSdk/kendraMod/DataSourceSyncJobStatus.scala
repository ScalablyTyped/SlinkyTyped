package typingsSlinky.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.FAILED
  - typingsSlinky.awsSdk.awsSdkStrings.SUCCEEDED
  - typingsSlinky.awsSdk.awsSdkStrings.SYNCING
  - typingsSlinky.awsSdk.awsSdkStrings.INCOMPLETE
  - typingsSlinky.awsSdk.awsSdkStrings.STOPPING
  - typingsSlinky.awsSdk.awsSdkStrings.ABORTED
  - java.lang.String
*/
trait DataSourceSyncJobStatus extends js.Object

object DataSourceSyncJobStatus {
  @scala.inline
  def FAILED: typingsSlinky.awsSdk.awsSdkStrings.FAILED = "FAILED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FAILED]
  @scala.inline
  def SUCCEEDED: typingsSlinky.awsSdk.awsSdkStrings.SUCCEEDED = "SUCCEEDED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SUCCEEDED]
  @scala.inline
  def SYNCING: typingsSlinky.awsSdk.awsSdkStrings.SYNCING = "SYNCING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SYNCING]
  @scala.inline
  def INCOMPLETE: typingsSlinky.awsSdk.awsSdkStrings.INCOMPLETE = "INCOMPLETE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.INCOMPLETE]
  @scala.inline
  def STOPPING: typingsSlinky.awsSdk.awsSdkStrings.STOPPING = "STOPPING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.STOPPING]
  @scala.inline
  def ABORTED: typingsSlinky.awsSdk.awsSdkStrings.ABORTED = "ABORTED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ABORTED]
  @scala.inline
  implicit def apply(value: java.lang.String): DataSourceSyncJobStatus = value.asInstanceOf[DataSourceSyncJobStatus]
}

