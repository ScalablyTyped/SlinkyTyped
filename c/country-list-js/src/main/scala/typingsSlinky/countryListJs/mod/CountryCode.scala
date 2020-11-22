package typingsSlinky.countryListJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CountryCode extends js.Object {
  
  var iso2: String = js.native
  
  var iso3: String = js.native
}
object CountryCode {
  
  @scala.inline
  def apply(iso2: String, iso3: String): CountryCode = {
    val __obj = js.Dynamic.literal(iso2 = iso2.asInstanceOf[js.Any], iso3 = iso3.asInstanceOf[js.Any])
    __obj.asInstanceOf[CountryCode]
  }
  
  @scala.inline
  implicit class CountryCodeOps[Self <: CountryCode] (val x: Self) extends AnyVal {
    
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
    def setIso2(value: String): Self = this.set("iso2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIso3(value: String): Self = this.set("iso3", value.asInstanceOf[js.Any])
  }
}
