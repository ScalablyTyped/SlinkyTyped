package typingsSlinky.octokitRequest.anon

import typingsSlinky.octokitRequest.octokitRequestStrings.error
import typingsSlinky.octokitRequest.octokitRequestStrings.follow
import typingsSlinky.octokitRequest.octokitRequestStrings.manual
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Redirect extends js.Object {
  
  var redirect: js.UndefOr[error | follow | manual] = js.native
}
object Redirect {
  
  @scala.inline
  def apply(): Redirect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Redirect]
  }
  
  @scala.inline
  implicit class RedirectOps[Self <: Redirect] (val x: Self) extends AnyVal {
    
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
    def setRedirect(value: error | follow | manual): Self = this.set("redirect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedirect: Self = this.set("redirect", js.undefined)
  }
}
