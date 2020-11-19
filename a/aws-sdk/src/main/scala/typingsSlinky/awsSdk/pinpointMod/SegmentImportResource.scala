package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SegmentImportResource extends js.Object {
  
  /**
    * The number of channel types in the endpoint definitions that were imported to create the segment.
    */
  var ChannelCounts: js.UndefOr[MapOfInteger] = js.native
  
  /**
    * (Deprecated) Your AWS account ID, which you assigned to an external ID key in an IAM trust policy. Amazon Pinpoint previously used this value to assume an IAM role when importing endpoint definitions, but we removed this requirement. We don't recommend use of external IDs for IAM roles that are assumed by Amazon Pinpoint.
    */
  var ExternalId: string = js.native
  
  /**
    * The format of the files that were imported to create the segment. Valid values are: CSV, for comma-separated values format; and, JSON, for newline-delimited JSON format.
    */
  var Format: typingsSlinky.awsSdk.pinpointMod.Format = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that authorized Amazon Pinpoint to access the Amazon S3 location to import endpoint definitions from.
    */
  var RoleArn: string = js.native
  
  /**
    * The URL of the Amazon Simple Storage Service (Amazon S3) bucket that the endpoint definitions were imported from to create the segment.
    */
  var S3Url: string = js.native
  
  /**
    * The number of endpoint definitions that were imported successfully to create the segment.
    */
  var Size: integer = js.native
}
object SegmentImportResource {
  
  @scala.inline
  def apply(ExternalId: string, Format: Format, RoleArn: string, S3Url: string, Size: integer): SegmentImportResource = {
    val __obj = js.Dynamic.literal(ExternalId = ExternalId.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any], S3Url = S3Url.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any])
    __obj.asInstanceOf[SegmentImportResource]
  }
  
  @scala.inline
  implicit class SegmentImportResourceOps[Self <: SegmentImportResource] (val x: Self) extends AnyVal {
    
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
    def setExternalId(value: string): Self = this.set("ExternalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: Format): Self = this.set("Format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: string): Self = this.set("RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3Url(value: string): Self = this.set("S3Url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: integer): Self = this.set("Size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelCounts(value: MapOfInteger): Self = this.set("ChannelCounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelCounts: Self = this.set("ChannelCounts", js.undefined)
  }
}
