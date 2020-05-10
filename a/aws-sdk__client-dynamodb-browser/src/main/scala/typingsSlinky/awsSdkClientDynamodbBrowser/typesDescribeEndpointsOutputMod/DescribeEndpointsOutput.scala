package typingsSlinky.awsSdkClientDynamodbBrowser.typesDescribeEndpointsOutputMod

import typingsSlinky.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.typesEndpointMod.UnmarshalledEndpoint
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEndpointsOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * _Endpoints shape
    */
  var Endpoints: js.Array[UnmarshalledEndpoint] = js.native
}

object DescribeEndpointsOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, Endpoints: js.Array[UnmarshalledEndpoint]): DescribeEndpointsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], Endpoints = Endpoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEndpointsOutput]
  }
  @scala.inline
  implicit class DescribeEndpointsOutputOps[Self <: DescribeEndpointsOutput] (val x: Self) extends AnyVal {
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
    def withEndpoints(value: js.Array[UnmarshalledEndpoint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Endpoints")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

