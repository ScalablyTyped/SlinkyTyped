package typingsSlinky.awsSdkClientSqsNode.typesListDeadLetterSourceQueuesOutputMod

import typingsSlinky.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDeadLetterSourceQueuesOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>A list of source queue URLs that have the <code>RedrivePolicy</code> queue attribute configured with a dead-letter queue.</p>
    */
  var queueUrls: js.Array[String] = js.native
}

object ListDeadLetterSourceQueuesOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, queueUrls: js.Array[String]): ListDeadLetterSourceQueuesOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], queueUrls = queueUrls.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDeadLetterSourceQueuesOutput]
  }
  @scala.inline
  implicit class ListDeadLetterSourceQueuesOutputOps[Self <: ListDeadLetterSourceQueuesOutput] (val x: Self) extends AnyVal {
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
    def withQueueUrls(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queueUrls")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

