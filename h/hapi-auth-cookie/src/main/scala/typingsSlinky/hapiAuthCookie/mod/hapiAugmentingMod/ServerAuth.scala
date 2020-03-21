package typingsSlinky.hapiAuthCookie.mod.hapiAugmentingMod

import typingsSlinky.hapiAuthCookie.hapiAuthCookieStrings.cookie
import typingsSlinky.hapiAuthCookie.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerAuth extends js.Object {
  @JSName("strategy")
  def strategy_cookie(name: String, scheme: cookie): Unit = js.native
  @JSName("strategy")
  def strategy_cookie(name: String, scheme: cookie, options: Options): Unit = js.native
}

