package typingsSlinky.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplateLocation extends js.Object {
  
  /**
    * The Amazon S3 bucket name.
    */
  var s3Bucket: S3Bucket = js.native
  
  /**
    * The list of S3 keys identifying the data source files.
    */
  var s3Key: S3Key = js.native
}
object TemplateLocation {
  
  @scala.inline
  def apply(s3Bucket: S3Bucket, s3Key: S3Key): TemplateLocation = {
    val __obj = js.Dynamic.literal(s3Bucket = s3Bucket.asInstanceOf[js.Any], s3Key = s3Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateLocation]
  }
  
  @scala.inline
  implicit class TemplateLocationOps[Self <: TemplateLocation] (val x: Self) extends AnyVal {
    
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
    def setS3Bucket(value: S3Bucket): Self = this.set("s3Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3Key(value: S3Key): Self = this.set("s3Key", value.asInstanceOf[js.Any])
  }
}
