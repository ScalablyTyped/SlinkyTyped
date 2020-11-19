package typingsSlinky.openidClient.anon

import typingsSlinky.openidClient.openidClientStrings.GET
import typingsSlinky.openidClient.openidClientStrings.POST
import typingsSlinky.openidClient.openidClientStrings.body
import typingsSlinky.openidClient.openidClientStrings.header
import typingsSlinky.openidClient.openidClientStrings.query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Params extends js.Object {
  
  var params: js.UndefOr[js.Object] = js.native
  
  var tokenType: js.UndefOr[String] = js.native
  
  var verb: js.UndefOr[GET | POST] = js.native
  
  var via: js.UndefOr[header | body | query] = js.native
}
object Params {
  
  @scala.inline
  def apply(): Params = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Params]
  }
  
  @scala.inline
  implicit class ParamsOps[Self <: Params] (val x: Self) extends AnyVal {
    
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
    def setParams(value: js.Object): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    
    @scala.inline
    def setTokenType(value: String): Self = this.set("tokenType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTokenType: Self = this.set("tokenType", js.undefined)
    
    @scala.inline
    def setVerb(value: GET | POST): Self = this.set("verb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerb: Self = this.set("verb", js.undefined)
    
    @scala.inline
    def setVia(value: header | body | query): Self = this.set("via", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVia: Self = this.set("via", js.undefined)
  }
}
