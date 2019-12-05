package typingsSlinky.atAwsDashSdkClientDashDynamodbDashNode

import typingsSlinky.atAwsDashSdkClientDashDynamodbDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreTableDescriptionMod._UnmarshalledTableDescription
import typingsSlinky.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-node/types/RestoreTableToPointInTimeOutput", JSImport.Namespace)
@js.native
object typesRestoreTableToPointInTimeOutputMod extends js.Object {
  @js.native
  trait RestoreTableToPointInTimeOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>Represents the properties of a table.</p>
      */
    var TableDescription: js.UndefOr[_UnmarshalledTableDescription] = js.native
  }
  
}

