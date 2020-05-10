package typingsSlinky.awsSdkClientKinesisBrowser.typesGetRecordsOutputMod

import typingsSlinky.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKinesisBrowser.typesRecordMod.UnmarshalledRecord
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRecordsOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>The number of milliseconds the <a>GetRecords</a> response is from the tip of the stream, indicating how far behind current time the consumer is. A value of zero indicates that record processing is caught up, and there are no new records to process at this moment.</p>
    */
  var MillisBehindLatest: js.UndefOr[Double] = js.native
  /**
    * <p>The next position in the shard from which to start sequentially reading data records. If set to <code>null</code>, the shard has been closed and the requested iterator does not return any more data. </p>
    */
  var NextShardIterator: js.UndefOr[String] = js.native
  /**
    * <p>The data records retrieved from the shard.</p>
    */
  var Records: js.Array[UnmarshalledRecord] = js.native
}

object GetRecordsOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, Records: js.Array[UnmarshalledRecord]): GetRecordsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], Records = Records.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRecordsOutput]
  }
  @scala.inline
  implicit class GetRecordsOutputOps[Self <: GetRecordsOutput] (val x: Self) extends AnyVal {
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
    def withRecords(value: js.Array[UnmarshalledRecord]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Records")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMillisBehindLatest(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MillisBehindLatest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMillisBehindLatest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MillisBehindLatest")(js.undefined)
        ret
    }
    @scala.inline
    def withNextShardIterator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextShardIterator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextShardIterator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextShardIterator")(js.undefined)
        ret
    }
  }
  
}

