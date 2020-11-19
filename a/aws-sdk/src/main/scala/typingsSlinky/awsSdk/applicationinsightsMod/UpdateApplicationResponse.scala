package typingsSlinky.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateApplicationResponse extends js.Object {
  
  /**
    * Information about the application. 
    */
  var ApplicationInfo: js.UndefOr[typingsSlinky.awsSdk.applicationinsightsMod.ApplicationInfo] = js.native
}
object UpdateApplicationResponse {
  
  @scala.inline
  def apply(): UpdateApplicationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateApplicationResponse]
  }
  
  @scala.inline
  implicit class UpdateApplicationResponseOps[Self <: UpdateApplicationResponse] (val x: Self) extends AnyVal {
    
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
    def setApplicationInfo(value: ApplicationInfo): Self = this.set("ApplicationInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationInfo: Self = this.set("ApplicationInfo", js.undefined)
  }
}
