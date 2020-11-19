package typingsSlinky.devtoolsProtocol.mod.Protocol.Storage

import typingsSlinky.devtoolsProtocol.mod.Protocol.Browser.BrowserContextID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClearCookiesRequest extends js.Object {
  
  /**
    * Browser context to use when called on the browser endpoint.
    */
  var browserContextId: js.UndefOr[BrowserContextID] = js.native
}
object ClearCookiesRequest {
  
  @scala.inline
  def apply(): ClearCookiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClearCookiesRequest]
  }
  
  @scala.inline
  implicit class ClearCookiesRequestOps[Self <: ClearCookiesRequest] (val x: Self) extends AnyVal {
    
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
    def setBrowserContextId(value: BrowserContextID): Self = this.set("browserContextId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrowserContextId: Self = this.set("browserContextId", js.undefined)
  }
}
