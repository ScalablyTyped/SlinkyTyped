package typingsSlinky.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImagePipeline extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the image pipeline.
    */
  var arn: js.UndefOr[ImageBuilderArn] = js.native
  
  /**
    * The date on which this image pipeline was created.
    */
  var dateCreated: js.UndefOr[DateTime] = js.native
  
  /**
    * The date on which this image pipeline was last run.
    */
  var dateLastRun: js.UndefOr[DateTime] = js.native
  
  /**
    * The date on which this image pipeline will next be run.
    */
  var dateNextRun: js.UndefOr[DateTime] = js.native
  
  /**
    * The date on which this image pipeline was last updated.
    */
  var dateUpdated: js.UndefOr[DateTime] = js.native
  
  /**
    * The description of the image pipeline.
    */
  var description: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the distribution configuration associated with this image pipeline.
    */
  var distributionConfigurationArn: js.UndefOr[Arn] = js.native
  
  /**
    *  Collects additional information about the image being created, including the operating system (OS) version and package list. This information is used to enhance the overall experience of using EC2 Image Builder. Enabled by default. 
    */
  var enhancedImageMetadataEnabled: js.UndefOr[NullableBoolean] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the image recipe associated with this image pipeline.
    */
  var imageRecipeArn: js.UndefOr[Arn] = js.native
  
  /**
    * The image tests configuration of the image pipeline.
    */
  var imageTestsConfiguration: js.UndefOr[ImageTestsConfiguration] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the infrastructure configuration associated with this image pipeline.
    */
  var infrastructureConfigurationArn: js.UndefOr[Arn] = js.native
  
  /**
    * The name of the image pipeline.
    */
  var name: js.UndefOr[ResourceName] = js.native
  
  /**
    * The platform of the image pipeline.
    */
  var platform: js.UndefOr[Platform] = js.native
  
  /**
    * The schedule of the image pipeline.
    */
  var schedule: js.UndefOr[Schedule] = js.native
  
  /**
    * The status of the image pipeline.
    */
  var status: js.UndefOr[PipelineStatus] = js.native
  
  /**
    * The tags of this image pipeline.
    */
  var tags: js.UndefOr[TagMap] = js.native
}
object ImagePipeline {
  
  @scala.inline
  def apply(): ImagePipeline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImagePipeline]
  }
  
  @scala.inline
  implicit class ImagePipelineMutableBuilder[Self <: ImagePipeline] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: ImageBuilderArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setDateCreated(value: DateTime): Self = StObject.set(x, "dateCreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateCreatedUndefined: Self = StObject.set(x, "dateCreated", js.undefined)
    
    @scala.inline
    def setDateLastRun(value: DateTime): Self = StObject.set(x, "dateLastRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateLastRunUndefined: Self = StObject.set(x, "dateLastRun", js.undefined)
    
    @scala.inline
    def setDateNextRun(value: DateTime): Self = StObject.set(x, "dateNextRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateNextRunUndefined: Self = StObject.set(x, "dateNextRun", js.undefined)
    
    @scala.inline
    def setDateUpdated(value: DateTime): Self = StObject.set(x, "dateUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUpdatedUndefined: Self = StObject.set(x, "dateUpdated", js.undefined)
    
    @scala.inline
    def setDescription(value: NonEmptyString): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDistributionConfigurationArn(value: Arn): Self = StObject.set(x, "distributionConfigurationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistributionConfigurationArnUndefined: Self = StObject.set(x, "distributionConfigurationArn", js.undefined)
    
    @scala.inline
    def setEnhancedImageMetadataEnabled(value: NullableBoolean): Self = StObject.set(x, "enhancedImageMetadataEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnhancedImageMetadataEnabledUndefined: Self = StObject.set(x, "enhancedImageMetadataEnabled", js.undefined)
    
    @scala.inline
    def setImageRecipeArn(value: Arn): Self = StObject.set(x, "imageRecipeArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageRecipeArnUndefined: Self = StObject.set(x, "imageRecipeArn", js.undefined)
    
    @scala.inline
    def setImageTestsConfiguration(value: ImageTestsConfiguration): Self = StObject.set(x, "imageTestsConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageTestsConfigurationUndefined: Self = StObject.set(x, "imageTestsConfiguration", js.undefined)
    
    @scala.inline
    def setInfrastructureConfigurationArn(value: Arn): Self = StObject.set(x, "infrastructureConfigurationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfrastructureConfigurationArnUndefined: Self = StObject.set(x, "infrastructureConfigurationArn", js.undefined)
    
    @scala.inline
    def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPlatform(value: Platform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    @scala.inline
    def setSchedule(value: Schedule): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
    
    @scala.inline
    def setStatus(value: PipelineStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
