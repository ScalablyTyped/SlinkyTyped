package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageVersion extends StObject {
  
  /**
    * When the version was created.
    */
  var CreationTime: js.Date = js.native
  
  /**
    * When a create or delete operation fails, the reason for the failure.
    */
  var FailureReason: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.FailureReason] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the image the version is based on.
    */
  var ImageArn: typingsSlinky.awsSdk.sagemakerMod.ImageArn = js.native
  
  /**
    * The ARN of the version.
    */
  var ImageVersionArn: typingsSlinky.awsSdk.sagemakerMod.ImageVersionArn = js.native
  
  /**
    * The status of the version.
    */
  var ImageVersionStatus: typingsSlinky.awsSdk.sagemakerMod.ImageVersionStatus = js.native
  
  /**
    * When the version was last modified.
    */
  var LastModifiedTime: js.Date = js.native
  
  /**
    * The version number.
    */
  var Version: ImageVersionNumber = js.native
}
object ImageVersion {
  
  @scala.inline
  def apply(
    CreationTime: js.Date,
    ImageArn: ImageArn,
    ImageVersionArn: ImageVersionArn,
    ImageVersionStatus: ImageVersionStatus,
    LastModifiedTime: js.Date,
    Version: ImageVersionNumber
  ): ImageVersion = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], ImageArn = ImageArn.asInstanceOf[js.Any], ImageVersionArn = ImageVersionArn.asInstanceOf[js.Any], ImageVersionStatus = ImageVersionStatus.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageVersion]
  }
  
  @scala.inline
  implicit class ImageVersionMutableBuilder[Self <: ImageVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureReason(value: FailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    @scala.inline
    def setImageArn(value: ImageArn): Self = StObject.set(x, "ImageArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageVersionArn(value: ImageVersionArn): Self = StObject.set(x, "ImageVersionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageVersionStatus(value: ImageVersionStatus): Self = StObject.set(x, "ImageVersionStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: ImageVersionNumber): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
  }
}
