package typingsSlinky.hibp.mod

import typingsSlinky.hibp.anon.ApiKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hibp", "breachedAccount")
@js.native
object breachedAccount extends js.Object {
  
  def apply(account: String): js.Promise[js.Array[Breach_] | Null] = js.native
  def apply(account: String, options: ApiKey): js.Promise[js.Array[Breach_] | Null] = js.native
}
