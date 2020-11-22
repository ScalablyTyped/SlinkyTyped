package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAppImageConfigResponse extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the AppImageConfig.
    */
  var AppImageConfigArn: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.AppImageConfigArn] = js.native
}
object CreateAppImageConfigResponse {
  
  @scala.inline
  def apply(): CreateAppImageConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAppImageConfigResponse]
  }
  
  @scala.inline
  implicit class CreateAppImageConfigResponseOps[Self <: CreateAppImageConfigResponse] (val x: Self) extends AnyVal {
    
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
    def setAppImageConfigArn(value: AppImageConfigArn): Self = this.set("AppImageConfigArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppImageConfigArn: Self = this.set("AppImageConfigArn", js.undefined)
  }
}
