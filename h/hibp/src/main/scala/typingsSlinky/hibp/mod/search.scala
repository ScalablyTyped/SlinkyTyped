package typingsSlinky.hibp.mod

import typingsSlinky.hibp.anon.Truncate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hibp", "search")
@js.native
object search extends js.Object {
  
  def apply(account: String): js.Promise[SearchResults] = js.native
  def apply(account: String, breachOptions: Truncate): js.Promise[SearchResults] = js.native
}
