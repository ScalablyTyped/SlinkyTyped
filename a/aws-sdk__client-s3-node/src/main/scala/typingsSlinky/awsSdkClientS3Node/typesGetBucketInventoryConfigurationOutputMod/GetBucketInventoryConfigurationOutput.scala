package typingsSlinky.awsSdkClientS3Node.typesGetBucketInventoryConfigurationOutputMod

import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typingsSlinky.awsSdkClientS3Node.typesInventoryConfigurationMod.UnmarshalledInventoryConfiguration
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBucketInventoryConfigurationOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInventoryConfiguration(value: UnmarshalledInventoryConfiguration): Self = this.set("InventoryConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInventoryConfiguration: Self = this.set("InventoryConfiguration", js.undefined)
  }
}
