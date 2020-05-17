package typingsSlinky.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.FailedDocumentsOnly
  - typingsSlinky.awsSdk.awsSdkStrings.AllDocuments
  - java.lang.String
*/
trait ElasticsearchS3BackupMode extends js.Object

object ElasticsearchS3BackupMode {
  @scala.inline
  def FailedDocumentsOnly: typingsSlinky.awsSdk.awsSdkStrings.FailedDocumentsOnly = "FailedDocumentsOnly".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FailedDocumentsOnly]
  @scala.inline
  def AllDocuments: typingsSlinky.awsSdk.awsSdkStrings.AllDocuments = "AllDocuments".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.AllDocuments]
  @scala.inline
  implicit def apply(value: String): ElasticsearchS3BackupMode = value.asInstanceOf[ElasticsearchS3BackupMode]
}

