package typingsSlinky.firefoxWebextBrowser.browser.identity

import typingsSlinky.firefoxWebextBrowser.browser.manifest.HttpURL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LaunchWebAuthFlowDetails extends js.Object {
  
  var interactive: js.UndefOr[Boolean] = js.native
  
  var url: HttpURL = js.native
}
object LaunchWebAuthFlowDetails {
  
  @scala.inline
  def apply(url: HttpURL): LaunchWebAuthFlowDetails = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchWebAuthFlowDetails]
  }
  
  @scala.inline
  implicit class LaunchWebAuthFlowDetailsOps[Self <: LaunchWebAuthFlowDetails] (val x: Self) extends AnyVal {
    
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
    def setUrl(value: HttpURL): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInteractive(value: Boolean): Self = this.set("interactive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInteractive: Self = this.set("interactive", js.undefined)
  }
}
