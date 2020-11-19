package typingsSlinky.googleapis.searchconsoleV1Mod.searchconsoleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Mobile-friendly test request.
  */
@js.native
trait SchemaRunMobileFriendlyTestRequest extends js.Object {
  
  /**
    * Whether or not screenshot is requested. Default is false.
    */
  var requestScreenshot: js.UndefOr[Boolean] = js.native
  
  /**
    * URL for inspection.
    */
  var url: js.UndefOr[String] = js.native
}
object SchemaRunMobileFriendlyTestRequest {
  
  @scala.inline
  def apply(): SchemaRunMobileFriendlyTestRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRunMobileFriendlyTestRequest]
  }
  
  @scala.inline
  implicit class SchemaRunMobileFriendlyTestRequestOps[Self <: SchemaRunMobileFriendlyTestRequest] (val x: Self) extends AnyVal {
    
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
    def setRequestScreenshot(value: Boolean): Self = this.set("requestScreenshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestScreenshot: Self = this.set("requestScreenshot", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
