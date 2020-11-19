package typingsSlinky.hapiCookie.mod.hapiHapiAugmentingMod

import typingsSlinky.hapiCookie.hapiCookieStrings.cookie
import typingsSlinky.hapiCookie.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerAuth extends js.Object {
  
  @JSName("strategy")
  def strategy_cookie(name: String, scheme: cookie): Unit = js.native
  @JSName("strategy")
  def strategy_cookie(name: String, scheme: cookie, options: Options): Unit = js.native
}
