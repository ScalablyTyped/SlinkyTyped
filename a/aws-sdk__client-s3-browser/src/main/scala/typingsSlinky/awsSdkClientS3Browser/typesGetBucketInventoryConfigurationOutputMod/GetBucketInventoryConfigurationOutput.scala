package typingsSlinky.awsSdkClientS3Browser.typesGetBucketInventoryConfigurationOutputMod

import typingsSlinky.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.typesInventoryConfigurationMod.UnmarshalledInventoryConfiguration
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketInventoryConfigurationOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * <p>Specifies the inventory configuration.</p>
    */
  var InventoryConfiguration: js.UndefOr[UnmarshalledInventoryConfiguration] = js.undefined
}

object GetBucketInventoryConfigurationOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, InventoryConfiguration: UnmarshalledInventoryConfiguration = null): GetBucketInventoryConfigurationOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (InventoryConfiguration != null) __obj.updateDynamic("InventoryConfiguration")(InventoryConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketInventoryConfigurationOutput]
  }
}

