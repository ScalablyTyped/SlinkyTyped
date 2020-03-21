package typingsSlinky.awsSdkClientDynamodbBrowser

import typingsSlinky.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.typesTimeToLiveSpecificationMod.UnmarshalledTimeToLiveSpecification
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-browser/types/UpdateTimeToLiveOutput", JSImport.Namespace)
@js.native
object typesUpdateTimeToLiveOutputMod extends js.Object {
  @js.native
  trait UpdateTimeToLiveOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>Represents the output of an <code>UpdateTimeToLive</code> operation.</p>
      */
    var TimeToLiveSpecification: js.UndefOr[UnmarshalledTimeToLiveSpecification] = js.native
  }
  
}

