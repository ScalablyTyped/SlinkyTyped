package typingsSlinky.devtoolsProtocol.mod.Protocol.Network

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCookiesRequest extends js.Object {
  
  /**
    * The list of URLs for which applicable cookies will be fetched.
    * If not specified, it's assumed to be set to the list containing
    * the URLs of the page and all of its subframes.
    */
  var urls: js.UndefOr[js.Array[String]] = js.native
}
object GetCookiesRequest {
  
  @scala.inline
  def apply(): GetCookiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCookiesRequest]
  }
  
  @scala.inline
  implicit class GetCookiesRequestOps[Self <: GetCookiesRequest] (val x: Self) extends AnyVal {
    
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
    def setUrlsVarargs(value: String*): Self = this.set("urls", js.Array(value :_*))
    
    @scala.inline
    def setUrls(value: js.Array[String]): Self = this.set("urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrls: Self = this.set("urls", js.undefined)
  }
}
