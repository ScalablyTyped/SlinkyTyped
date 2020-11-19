package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportTransitGatewayRoutesResult extends js.Object {
  
  /**
    * The URL of the exported file in Amazon S3. For example, s3://bucket_name/VPCTransitGateway/TransitGatewayRouteTables/file_name.
    */
  var S3Location: js.UndefOr[String] = js.native
}
object ExportTransitGatewayRoutesResult {
  
  @scala.inline
  def apply(): ExportTransitGatewayRoutesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportTransitGatewayRoutesResult]
  }
  
  @scala.inline
  implicit class ExportTransitGatewayRoutesResultOps[Self <: ExportTransitGatewayRoutesResult] (val x: Self) extends AnyVal {
    
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
    def setS3Location(value: String): Self = this.set("S3Location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3Location: Self = this.set("S3Location", js.undefined)
  }
}
