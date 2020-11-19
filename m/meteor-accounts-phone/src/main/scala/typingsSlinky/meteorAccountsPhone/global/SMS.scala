package typingsSlinky.meteorAccountsPhone.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SMS")
@js.native
object SMS extends js.Object {
  
  def send(options: js.Object): Unit = js.native
  def send(options: js.Object, callback: js.Function): Unit = js.native
  
  @js.native
  object phoneTemplate extends js.Object {
    
    var from: String = js.native
    
    var text: js.Function = js.native
  }
  
  @js.native
  object twilio extends js.Object {
    
    var ACCOUNT_SID: js.UndefOr[String] = js.native
    
    var AUTH_TOKEN: js.UndefOr[String] = js.native
    
    var FROM: js.UndefOr[String] = js.native
  }
}
