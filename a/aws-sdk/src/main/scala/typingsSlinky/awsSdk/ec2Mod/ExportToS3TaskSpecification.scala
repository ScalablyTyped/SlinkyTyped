package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportToS3TaskSpecification extends StObject {
  
  /**
    * The container format used to combine disk images with metadata (such as OVF). If absent, only the disk image is exported.
    */
  var ContainerFormat: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.ContainerFormat] = js.native
  
  /**
    * The format for the exported image.
    */
  var DiskImageFormat: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.DiskImageFormat] = js.native
  
  /**
    * The Amazon S3 bucket for the destination image. The destination bucket must exist and grant WRITE and READ_ACP permissions to the AWS account vm-import-export@amazon.com.
    */
  var S3Bucket: js.UndefOr[String] = js.native
  
  /**
    * The image is written to a single object in the Amazon S3 bucket at the S3 key s3prefix + exportTaskId + '.' + diskImageFormat.
    */
  var S3Prefix: js.UndefOr[String] = js.native
}
object ExportToS3TaskSpecification {
  
  @scala.inline
  def apply(): ExportToS3TaskSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportToS3TaskSpecification]
  }
  
  @scala.inline
  implicit class ExportToS3TaskSpecificationMutableBuilder[Self <: ExportToS3TaskSpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerFormat(value: ContainerFormat): Self = StObject.set(x, "ContainerFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerFormatUndefined: Self = StObject.set(x, "ContainerFormat", js.undefined)
    
    @scala.inline
    def setDiskImageFormat(value: DiskImageFormat): Self = StObject.set(x, "DiskImageFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiskImageFormatUndefined: Self = StObject.set(x, "DiskImageFormat", js.undefined)
    
    @scala.inline
    def setS3Bucket(value: String): Self = StObject.set(x, "S3Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3BucketUndefined: Self = StObject.set(x, "S3Bucket", js.undefined)
    
    @scala.inline
    def setS3Prefix(value: String): Self = StObject.set(x, "S3Prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3PrefixUndefined: Self = StObject.set(x, "S3Prefix", js.undefined)
  }
}
