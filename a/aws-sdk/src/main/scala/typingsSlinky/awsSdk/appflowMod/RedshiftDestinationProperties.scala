package typingsSlinky.awsSdk.appflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RedshiftDestinationProperties extends js.Object {
  
  /**
    *  The object key for the bucket in which Amazon AppFlow places the destination files. 
    */
  var bucketPrefix: js.UndefOr[BucketPrefix] = js.native
  
  /**
    *  The settings that determine how Amazon AppFlow handles an error when placing data in the Amazon Redshift destination. For example, this setting would determine if the flow should fail after one insertion error, or continue and attempt to insert every record regardless of the initial failure. ErrorHandlingConfig is a part of the destination connector details. 
    */
  var errorHandlingConfig: js.UndefOr[ErrorHandlingConfig] = js.native
  
  /**
    *  The intermediate bucket that Amazon AppFlow uses when moving data into Amazon Redshift. 
    */
  var intermediateBucketName: BucketName = js.native
  
  /**
    *  The object specified in the Amazon Redshift flow destination. 
    */
  var `object`: Object = js.native
}
object RedshiftDestinationProperties {
  
  @scala.inline
  def apply(intermediateBucketName: BucketName, `object`: Object): RedshiftDestinationProperties = {
    val __obj = js.Dynamic.literal(intermediateBucketName = intermediateBucketName.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedshiftDestinationProperties]
  }
  
  @scala.inline
  implicit class RedshiftDestinationPropertiesOps[Self <: RedshiftDestinationProperties] (val x: Self) extends AnyVal {
    
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
    def setIntermediateBucketName(value: BucketName): Self = this.set("intermediateBucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject(value: Object): Self = this.set("object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketPrefix(value: BucketPrefix): Self = this.set("bucketPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBucketPrefix: Self = this.set("bucketPrefix", js.undefined)
    
    @scala.inline
    def setErrorHandlingConfig(value: ErrorHandlingConfig): Self = this.set("errorHandlingConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorHandlingConfig: Self = this.set("errorHandlingConfig", js.undefined)
  }
}
