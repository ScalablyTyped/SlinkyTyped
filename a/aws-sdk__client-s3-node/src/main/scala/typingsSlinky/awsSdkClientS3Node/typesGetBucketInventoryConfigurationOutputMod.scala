package typingsSlinky.awsSdkClientS3Node

import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typingsSlinky.awsSdkClientS3Node.typesInventoryConfigurationMod.UnmarshalledInventoryConfiguration
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/types/GetBucketInventoryConfigurationOutput", JSImport.Namespace)
@js.native
object typesGetBucketInventoryConfigurationOutputMod extends js.Object {
  @js.native
  trait GetBucketInventoryConfigurationOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    /**
      * <p>Specifies the inventory configuration.</p>
      */
    var InventoryConfiguration: js.UndefOr[UnmarshalledInventoryConfiguration] = js.native
  }
  
}

