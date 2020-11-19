package typingsSlinky.hpp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var checkBody: js.UndefOr[Boolean] = js.native
  
  var checkBodyOnlyForContentType: js.UndefOr[String] = js.native
  
  var checkQuery: js.UndefOr[Boolean] = js.native
  
  var whitelist: js.UndefOr[String | js.Array[String]] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setCheckBody(value: Boolean): Self = this.set("checkBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckBody: Self = this.set("checkBody", js.undefined)
    
    @scala.inline
    def setCheckBodyOnlyForContentType(value: String): Self = this.set("checkBodyOnlyForContentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckBodyOnlyForContentType: Self = this.set("checkBodyOnlyForContentType", js.undefined)
    
    @scala.inline
    def setCheckQuery(value: Boolean): Self = this.set("checkQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckQuery: Self = this.set("checkQuery", js.undefined)
    
    @scala.inline
    def setWhitelistVarargs(value: String*): Self = this.set("whitelist", js.Array(value :_*))
    
    @scala.inline
    def setWhitelist(value: String | js.Array[String]): Self = this.set("whitelist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhitelist: Self = this.set("whitelist", js.undefined)
  }
}
