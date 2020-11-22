package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Image extends js.Object {
  
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
  implicit class ImageOps[Self <: Image] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreationTime(value: js.Date): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageArn(value: ImageArn): Self = this.set("ImageArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageName(value: ImageName): Self = this.set("ImageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageStatus(value: ImageStatus): Self = this.set("ImageStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTime(value: js.Date): Self = this.set("LastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: ImageDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: ImageDisplayName): Self = this.set("DisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("DisplayName", js.undefined)
    
    @scala.inline
    def setFailureReason(value: FailureReason): Self = this.set("FailureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureReason: Self = this.set("FailureReason", js.undefined)
  }
}
