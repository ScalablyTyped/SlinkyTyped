package typingsSlinky.passportClientCert.mod

import typingsSlinky.passportClientCert.passportClientCertBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StrategyOptions extends js.Object {
  
  var passReqToCallback: js.UndefOr[`false`] = js.native
}
object StrategyOptions {
  
  @scala.inline
  def apply(): StrategyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrategyOptions]
  }
  
  @scala.inline
  implicit class StrategyOptionsOps[Self <: StrategyOptions] (val x: Self) extends AnyVal {
    
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
    def setPassReqToCallback(value: `false`): Self = this.set("passReqToCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassReqToCallback: Self = this.set("passReqToCallback", js.undefined)
  }
}
