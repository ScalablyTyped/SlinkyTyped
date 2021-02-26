package typingsSlinky.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the image.
    */
  var arn: js.UndefOr[ImageBuilderArn] = js.native
  
  /**
    * The date on which this image was created.
    */
  var dateCreated: js.UndefOr[DateTime] = js.native
  
  /**
    * The name of the image.
    */
  var name: js.UndefOr[ResourceName] = js.native
  
  /**
    * The operating system version of the instance. For example, Amazon Linux 2, Ubuntu 18, or Microsoft Windows Server 2019. 
    */
  var osVersion: js.UndefOr[OsVersion] = js.native
  
  /**
    * The output resources produced when creating this image.
    */
  var outputResources: js.UndefOr[OutputResources] = js.native
  
  /**
    * The owner of the image.
    */
  var owner: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The platform of the image.
    */
  var platform: js.UndefOr[Platform] = js.native
  
  /**
    * The state of the image.
    */
  var state: js.UndefOr[ImageState] = js.native
  
  /**
    * The tags of the image.
    */
  var tags: js.UndefOr[TagMap] = js.native
  
  /**
    * The version of the image.
    */
  var version: js.UndefOr[VersionNumber] = js.native
}
object ImageSummary {
  
  @scala.inline
  def apply(): ImageSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageSummary]
  }
  
  @scala.inline
  implicit class ImageSummaryMutableBuilder[Self <: ImageSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: ImageBuilderArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setDateCreated(value: DateTime): Self = StObject.set(x, "dateCreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateCreatedUndefined: Self = StObject.set(x, "dateCreated", js.undefined)
    
    @scala.inline
    def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOsVersion(value: OsVersion): Self = StObject.set(x, "osVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOsVersionUndefined: Self = StObject.set(x, "osVersion", js.undefined)
    
    @scala.inline
    def setOutputResources(value: OutputResources): Self = StObject.set(x, "outputResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputResourcesUndefined: Self = StObject.set(x, "outputResources", js.undefined)
    
    @scala.inline
    def setOwner(value: NonEmptyString): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setPlatform(value: Platform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    @scala.inline
    def setState(value: ImageState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setVersion(value: VersionNumber): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
