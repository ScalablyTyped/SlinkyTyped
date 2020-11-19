package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportJobRequest extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that authorizes Amazon Pinpoint to access the Amazon S3 location where you want to export endpoint definitions to.
    */
  var RoleArn: string = js.native
  
  /**
    * The URL of the location in an Amazon Simple Storage Service (Amazon S3) bucket where you want to export endpoint definitions to. This location is typically a folder that contains multiple files. The URL should be in the following format: s3://bucket-name/folder-name/.
    */
  var S3UrlPrefix: string = js.native
  
  /**
    * The identifier for the segment to export endpoint definitions from. If you don't specify this value, Amazon Pinpoint exports definitions for all the endpoints that are associated with the application.
    */
  var SegmentId: js.UndefOr[string] = js.native
  
  /**
    * The version of the segment to export endpoint definitions from, if specified.
    */
  var SegmentVersion: js.UndefOr[integer] = js.native
}
object ExportJobRequest {
  
  @scala.inline
  def apply(RoleArn: string, S3UrlPrefix: string): ExportJobRequest = {
    val __obj = js.Dynamic.literal(RoleArn = RoleArn.asInstanceOf[js.Any], S3UrlPrefix = S3UrlPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportJobRequest]
  }
  
  @scala.inline
  implicit class ExportJobRequestOps[Self <: ExportJobRequest] (val x: Self) extends AnyVal {
    
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
    def setRoleArn(value: string): Self = this.set("RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3UrlPrefix(value: string): Self = this.set("S3UrlPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentId(value: string): Self = this.set("SegmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegmentId: Self = this.set("SegmentId", js.undefined)
    
    @scala.inline
    def setSegmentVersion(value: integer): Self = this.set("SegmentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegmentVersion: Self = this.set("SegmentVersion", js.undefined)
  }
}
