package typingsSlinky.awsSdkClientDynamodbBrowser.typesDescribeEndpointsOutputMod

import typingsSlinky.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.typesEndpointMod.UnmarshalledEndpoint
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeEndpointsOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * _Endpoints shape
    */
  var Endpoints: js.Array[UnmarshalledEndpoint]
}

object DescribeEndpointsOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, Endpoints: js.Array[UnmarshalledEndpoint]): DescribeEndpointsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], Endpoints = Endpoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEndpointsOutput]
  }
}

