package typingsSlinky.awsSdkClientKinesisBrowser.typesDescribeStreamSummaryOutputMod

import typingsSlinky.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKinesisBrowser.typesStreamDescriptionSummaryMod.UnmarshalledStreamDescriptionSummary
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStreamSummaryOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>A <a>StreamDescriptionSummary</a> containing information about the stream.</p>
    */
  var StreamDescriptionSummary: UnmarshalledStreamDescriptionSummary = js.native
}

object DescribeStreamSummaryOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, StreamDescriptionSummary: UnmarshalledStreamDescriptionSummary): DescribeStreamSummaryOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], StreamDescriptionSummary = StreamDescriptionSummary.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStreamSummaryOutput]
  }
  @scala.inline
  implicit class DescribeStreamSummaryOutputOps[Self <: DescribeStreamSummaryOutput] (val x: Self) extends AnyVal {
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
    def withStreamDescriptionSummary(value: UnmarshalledStreamDescriptionSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamDescriptionSummary")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

