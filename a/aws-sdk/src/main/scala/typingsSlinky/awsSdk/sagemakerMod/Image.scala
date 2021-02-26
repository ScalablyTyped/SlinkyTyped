package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Image extends StObject {
  
  /**
    * When the image was created.
    */
  var CreationTime: js.Date = js.native
  
  /**
    * The description of the image.
    */
  var Description: js.UndefOr[ImageDescription] = js.native
  
  /**
    * The name of the image as displayed.
    */
  var DisplayName: js.UndefOr[ImageDisplayName] = js.native
  
  /**
    * When a create, update, or delete operation fails, the reason for the failure.
    */
  var FailureReason: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.FailureReason] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the image.
    */
  var ImageArn: typingsSlinky.awsSdk.sagemakerMod.ImageArn = js.native
  
  /**
    * The name of the image.
    */
  var ImageName: typingsSlinky.awsSdk.sagemakerMod.ImageName = js.native
  
  /**
    * The status of the image.
    */
  var ImageStatus: typingsSlinky.awsSdk.sagemakerMod.ImageStatus = js.native
  
  /**
    * When the image was last modified.
    */
  var LastModifiedTime: js.Date = js.native
}
object Image {
  
  @scala.inline
  def apply(
    CreationTime: js.Date,
    ImageArn: ImageArn,
    ImageName: ImageName,
    ImageStatus: ImageStatus,
    LastModifiedTime: js.Date
  ): Image = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], ImageArn = ImageArn.asInstanceOf[js.Any], ImageName = ImageName.asInstanceOf[js.Any], ImageStatus = ImageStatus.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
  
  @scala.inline
  implicit class ImageMutableBuilder[Self <: Image] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: ImageDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: ImageDisplayName): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    @scala.inline
    def setFailureReason(value: FailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    @scala.inline
    def setImageArn(value: ImageArn): Self = StObject.set(x, "ImageArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageName(value: ImageName): Self = StObject.set(x, "ImageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageStatus(value: ImageStatus): Self = StObject.set(x, "ImageStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
  }
}
