package typingsSlinky.cypress

import typingsSlinky.cypress.Cypress.CookieDefaults
import typingsSlinky.cypress.Cypress.DebugOptions
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Debug extends js.Object {
  def debug(enabled: Boolean): Unit = js.native
  def debug(enabled: Boolean, options: Partial[DebugOptions]): Unit = js.native
  def defaults(options: Partial[CookieDefaults]): Unit = js.native
  def preserveOnce(names: String*): Unit = js.native
}

