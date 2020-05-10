package typingsSlinky.awsSdkClientKinesisBrowser.typesPutRecordsOutputMod

import typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.KMS
import typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.NONE
import typingsSlinky.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKinesisBrowser.typesPutRecordsResultEntryMod.UnmarshalledPutRecordsResultEntry
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutRecordsOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>The encryption type used on the records. This parameter can be one of the following values:</p> <ul> <li> <p> <code>NONE</code>: Do not encrypt the records.</p> </li> <li> <p> <code>KMS</code>: Use server-side encryption on the records using a customer-managed AWS KMS key.</p> </li> </ul>
    */
  var EncryptionType: js.UndefOr[NONE | KMS | String] = js.native
  /**
    * <p>The number of unsuccessfully processed records in a <code>PutRecords</code> request.</p>
    */
  var FailedRecordCount: js.UndefOr[Double] = js.native
  /**
    * <p>An array of successfully and unsuccessfully processed record results, correlated with the request by natural ordering. A record that is successfully added to a stream includes <code>SequenceNumber</code> and <code>ShardId</code> in the result. A record that fails to be added to a stream includes <code>ErrorCode</code> and <code>ErrorMessage</code> in the result.</p>
    */
  var Records: js.Array[UnmarshalledPutRecordsResultEntry] = js.native
}

object PutRecordsOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, Records: js.Array[UnmarshalledPutRecordsResultEntry]): PutRecordsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], Records = Records.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRecordsOutput]
  }
  @scala.inline
  implicit class PutRecordsOutputOps[Self <: PutRecordsOutput] (val x: Self) extends AnyVal {
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
    def withRecords(value: js.Array[UnmarshalledPutRecordsResultEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Records")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncryptionType(value: NONE | KMS | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncryptionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryptionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncryptionType")(js.undefined)
        ret
    }
    @scala.inline
    def withFailedRecordCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailedRecordCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailedRecordCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailedRecordCount")(js.undefined)
        ret
    }
  }
  
}

