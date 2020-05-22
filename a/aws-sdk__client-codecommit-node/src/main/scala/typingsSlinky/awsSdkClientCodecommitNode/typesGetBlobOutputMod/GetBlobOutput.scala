package typingsSlinky.awsSdkClientCodecommitNode.typesGetBlobOutputMod

import typingsSlinky.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBlobOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>The content of the blob, usually a file.</p>
    */
  var content: js.typedarray.Uint8Array
}

object GetBlobOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, content: js.typedarray.Uint8Array): GetBlobOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBlobOutput]
  }
}

