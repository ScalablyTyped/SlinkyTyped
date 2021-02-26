package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeImageVersionResponse extends StObject {
  
  /**
    * The registry path of the container image on which this image version is based.
    */
  var BaseImage: js.UndefOr[ImageBaseImage] = js.native
  
  /**
    * The registry path of the container image that contains this image version.
    */
  var ContainerImage: js.UndefOr[ImageContainerImage] = js.native
  
  /**
    * When the version was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.native
  
  /**
    * When a create or delete operation fails, the reason for the failure.
    */
  var FailureReason: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.FailureReason] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the image the version is based on.
    */
  var ImageArn: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.ImageArn] = js.native
  
  /**
    * The ARN of the version.
    */
  var ImageVersionArn: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.ImageVersionArn] = js.native
  
  /**
    * The status of the version.
    */
  var ImageVersionStatus: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.ImageVersionStatus] = js.native
  
  /**
    * When the version was last modified.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The version number.
    */
  var Version: js.UndefOr[ImageVersionNumber] = js.native
}
object DescribeImageVersionResponse {
  
  @scala.inline
  def apply(): DescribeImageVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeImageVersionResponse]
  }
  
  @scala.inline
  implicit class DescribeImageVersionResponseMutableBuilder[Self <: DescribeImageVersionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseImage(value: ImageBaseImage): Self = StObject.set(x, "BaseImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseImageUndefined: Self = StObject.set(x, "BaseImage", js.undefined)
    
    @scala.inline
    def setContainerImage(value: ImageContainerImage): Self = StObject.set(x, "ContainerImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerImageUndefined: Self = StObject.set(x, "ContainerImage", js.undefined)
    
    @scala.inline
    def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    @scala.inline
    def setFailureReason(value: FailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    @scala.inline
    def setImageArn(value: ImageArn): Self = StObject.set(x, "ImageArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageArnUndefined: Self = StObject.set(x, "ImageArn", js.undefined)
    
    @scala.inline
    def setImageVersionArn(value: ImageVersionArn): Self = StObject.set(x, "ImageVersionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageVersionArnUndefined: Self = StObject.set(x, "ImageVersionArn", js.undefined)
    
    @scala.inline
    def setImageVersionStatus(value: ImageVersionStatus): Self = StObject.set(x, "ImageVersionStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageVersionStatusUndefined: Self = StObject.set(x, "ImageVersionStatus", js.undefined)
    
    @scala.inline
    def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    @scala.inline
    def setVersion(value: ImageVersionNumber): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
