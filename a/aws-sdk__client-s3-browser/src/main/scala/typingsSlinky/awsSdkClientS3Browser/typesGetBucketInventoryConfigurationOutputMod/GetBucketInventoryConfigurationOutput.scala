package typingsSlinky.awsSdkClientS3Browser.typesGetBucketInventoryConfigurationOutputMod

import typingsSlinky.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.typesInventoryConfigurationMod.UnmarshalledInventoryConfiguration
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBucketInventoryConfigurationOutput
  extends MetadataBearer
     with OutputTypesUnion {
  /**
    * <p>Specifies the inventory configuration.</p>
    */
  var InventoryConfiguration: js.UndefOr[UnmarshalledInventoryConfiguration] = js.native
}

object GetBucketInventoryConfigurationOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): GetBucketInventoryConfigurationOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketInventoryConfigurationOutput]
  }
  @scala.inline
  implicit class GetBucketInventoryConfigurationOutputOps[Self <: GetBucketInventoryConfigurationOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInventoryConfiguration(value: UnmarshalledInventoryConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InventoryConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInventoryConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InventoryConfiguration")(js.undefined)
        ret
    }
  }
  
}

