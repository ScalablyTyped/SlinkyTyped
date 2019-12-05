package typingsSlinky.atAwsDashSdkClientDashS3DashNode

import typingsSlinky.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.requester_
import typingsSlinky.atAwsDashSdkClientDashS3DashNode.typesOutputTypesUnionMod._OutputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashS3DashNode.typesUnderscoreDeletedObjectMod._UnmarshalledDeletedObject
import typingsSlinky.atAwsDashSdkClientDashS3DashNode.typesUnderscoreErrorMod._UnmarshalledError
import typingsSlinky.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/types/DeleteObjectsOutput", JSImport.Namespace)
@js.native
object typesDeleteObjectsOutputMod extends js.Object {
  @js.native
  trait DeleteObjectsOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    /**
      * _DeletedObjects shape
      */
    var Deleted: js.UndefOr[js.Array[_UnmarshalledDeletedObject]] = js.native
    /**
      * _Errors shape
      */
    var Errors: js.UndefOr[js.Array[_UnmarshalledError]] = js.native
    /**
      * <p>If present, indicates that the requester was successfully charged for the request.</p>
      */
    var RequestCharged: js.UndefOr[requester_ | String] = js.native
  }
  
}

