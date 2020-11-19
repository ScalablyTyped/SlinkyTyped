package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetEbsDefaultKmsKeyIdResult extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the default CMK for encryption by default.
    */
  var KmsKeyId: js.UndefOr[String] = js.native
}
object GetEbsDefaultKmsKeyIdResult {
  
  @scala.inline
  def apply(): GetEbsDefaultKmsKeyIdResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEbsDefaultKmsKeyIdResult]
  }
  
  @scala.inline
  implicit class GetEbsDefaultKmsKeyIdResultOps[Self <: GetEbsDefaultKmsKeyIdResult] (val x: Self) extends AnyVal {
    
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
    def setKmsKeyId(value: String): Self = this.set("KmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsKeyId: Self = this.set("KmsKeyId", js.undefined)
  }
}
