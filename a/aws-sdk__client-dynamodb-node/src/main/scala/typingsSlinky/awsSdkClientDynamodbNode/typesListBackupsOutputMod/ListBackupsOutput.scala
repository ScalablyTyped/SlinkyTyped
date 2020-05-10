package typingsSlinky.awsSdkClientDynamodbNode.typesListBackupsOutputMod

import typingsSlinky.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientDynamodbNode.typesBackupSummaryMod.UnmarshalledBackupSummary
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBackupsOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>List of <code>BackupSummary</code> objects.</p>
    */
  var BackupSummaries: js.UndefOr[js.Array[UnmarshalledBackupSummary]] = js.native
  /**
    * <p> The ARN of the backup last evaluated when the current page of results was returned, inclusive of the current page of results. This value may be specified as the <code>ExclusiveStartBackupArn</code> of a new <code>ListBackups</code> operation in order to fetch the next page of results. </p> <p> If <code>LastEvaluatedBackupArn</code> is empty, then the last page of results has been processed and there are no more results to be retrieved. </p> <p> If <code>LastEvaluatedBackupArn</code> is not empty, this may or may not indicate there is more data to be returned. All results are guaranteed to have been returned if and only if no value for <code>LastEvaluatedBackupArn</code> is returned. </p>
    */
  var LastEvaluatedBackupArn: js.UndefOr[String] = js.native
}

object ListBackupsOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): ListBackupsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBackupsOutput]
  }
  @scala.inline
  implicit class ListBackupsOutputOps[Self <: ListBackupsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$metadata(value: ResponseMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackupSummaries(value: js.Array[UnmarshalledBackupSummary]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupSummaries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackupSummaries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupSummaries")(js.undefined)
        ret
    }
    @scala.inline
    def withLastEvaluatedBackupArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastEvaluatedBackupArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastEvaluatedBackupArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastEvaluatedBackupArn")(js.undefined)
        ret
    }
  }
  
}

