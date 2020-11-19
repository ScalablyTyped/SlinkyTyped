package typingsSlinky.expressSession.anon

import typingsSlinky.expressSession.expressSessionStrings.auto
import typingsSlinky.expressSession.expressSessionStrings.lax
import typingsSlinky.expressSession.expressSessionStrings.none
import typingsSlinky.expressSession.expressSessionStrings.strict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Domain extends js.Object {
  
  var domain: js.UndefOr[String] = js.native
  
  var encode: js.UndefOr[js.Function1[/* val */ String, String]] = js.native
  
  var expires: js.UndefOr[js.Date] = js.native
  
  var httpOnly: js.UndefOr[Boolean] = js.native
  
  var maxAge: js.UndefOr[Double] = js.native
  
  var path: js.UndefOr[String] = js.native
  
  var sameSite: js.UndefOr[Boolean | lax | strict | none] = js.native
  
  var secure: js.UndefOr[Boolean | auto] = js.native
  
  var signed: js.UndefOr[Boolean] = js.native
}
object Domain {
  
  @scala.inline
  def apply(): Domain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Domain]
  }
  
  @scala.inline
  implicit class DomainOps[Self <: Domain] (val x: Self) extends AnyVal {
    
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
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    
    @scala.inline
    def setEncode(value: /* val */ String => String): Self = this.set("encode", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteEncode: Self = this.set("encode", js.undefined)
    
    @scala.inline
    def setExpires(value: js.Date): Self = this.set("expires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpires: Self = this.set("expires", js.undefined)
    
    @scala.inline
    def setHttpOnly(value: Boolean): Self = this.set("httpOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpOnly: Self = this.set("httpOnly", js.undefined)
    
    @scala.inline
    def setMaxAge(value: Double): Self = this.set("maxAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAge: Self = this.set("maxAge", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setSameSite(value: Boolean | lax | strict | none): Self = this.set("sameSite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSameSite: Self = this.set("sameSite", js.undefined)
    
    @scala.inline
    def setSecure(value: Boolean | auto): Self = this.set("secure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecure: Self = this.set("secure", js.undefined)
    
    @scala.inline
    def setSigned(value: Boolean): Self = this.set("signed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigned: Self = this.set("signed", js.undefined)
  }
}
