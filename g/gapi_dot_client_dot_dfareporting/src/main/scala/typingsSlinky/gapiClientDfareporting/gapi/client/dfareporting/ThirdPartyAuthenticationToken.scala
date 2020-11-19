package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThirdPartyAuthenticationToken extends js.Object {
  
  /** Name of the third-party authentication token. */
  var name: js.UndefOr[String] = js.native
  
  /** Value of the third-party authentication token. This is a read-only, auto-generated field. */
  var value: js.UndefOr[String] = js.native
}
object ThirdPartyAuthenticationToken {
  
  @scala.inline
  def apply(): ThirdPartyAuthenticationToken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThirdPartyAuthenticationToken]
  }
  
  @scala.inline
  implicit class ThirdPartyAuthenticationTokenOps[Self <: ThirdPartyAuthenticationToken] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
