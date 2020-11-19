package typingsSlinky.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DistributionConfigurationSummary extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the distribution configuration.
    */
  var arn: js.UndefOr[ImageBuilderArn] = js.native
  
  /**
    * The date on which the distribution configuration was created.
    */
  var dateCreated: js.UndefOr[DateTime] = js.native
  
  /**
    * The date on which the distribution configuration was updated.
    */
  var dateUpdated: js.UndefOr[DateTime] = js.native
  
  /**
    * The description of the distribution configuration.
    */
  var description: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The name of the distribution configuration.
    */
  var name: js.UndefOr[ResourceName] = js.native
  
  /**
    * The tags associated with the distribution configuration.
    */
  var tags: js.UndefOr[TagMap] = js.native
}
object DistributionConfigurationSummary {
  
  @scala.inline
  def apply(): DistributionConfigurationSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DistributionConfigurationSummary]
  }
  
  @scala.inline
  implicit class DistributionConfigurationSummaryOps[Self <: DistributionConfigurationSummary] (val x: Self) extends AnyVal {
    
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
    def setArn(value: ImageBuilderArn): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setDateCreated(value: DateTime): Self = this.set("dateCreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateCreated: Self = this.set("dateCreated", js.undefined)
    
    @scala.inline
    def setDateUpdated(value: DateTime): Self = this.set("dateUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateUpdated: Self = this.set("dateUpdated", js.undefined)
    
    @scala.inline
    def setDescription(value: NonEmptyString): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setName(value: ResourceName): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
