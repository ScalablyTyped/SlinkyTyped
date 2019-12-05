package typingsSlinky.atAwsDashSdkClientDashS3DashNode

import typingsSlinky.atAwsDashSdkClientDashS3DashNode.typesOutputTypesUnionMod._OutputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashS3DashNode.typesUnderscoreCORSRuleMod._UnmarshalledCORSRule
import typingsSlinky.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/types/GetBucketCorsOutput", JSImport.Namespace)
@js.native
object typesGetBucketCorsOutputMod extends js.Object {
  @js.native
  trait GetBucketCorsOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    /**
      * _CORSRules shape
      */
    var CORSRules: js.UndefOr[js.Array[_UnmarshalledCORSRule]] = js.native
  }
  
}

