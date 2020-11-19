package typingsSlinky.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenerateChangeSetResponse extends js.Object {
  
  /**
    * Location of the Amazon S3 object.
    */
  var s3Location: js.UndefOr[S3Location] = js.native
}
object GenerateChangeSetResponse {
  
  @scala.inline
  def apply(): GenerateChangeSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateChangeSetResponse]
  }
  
  @scala.inline
  implicit class GenerateChangeSetResponseOps[Self <: GenerateChangeSetResponse] (val x: Self) extends AnyVal {
    
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
    def setS3Location(value: S3Location): Self = this.set("s3Location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3Location: Self = this.set("s3Location", js.undefined)
  }
}
