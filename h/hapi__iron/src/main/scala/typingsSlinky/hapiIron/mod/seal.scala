package typingsSlinky.hapiIron.mod

import typingsSlinky.hapiIron.mod.password.Secret
import typingsSlinky.hapiIron.mod.password.Specific
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@hapi/iron", "seal")
@js.native
object seal extends js.Object {
  
  def apply(`object`: js.Any, password: Password_, options: SealOptions): js.Promise[String] = js.native
  def apply(`object`: js.Any, password: Secret, options: SealOptions): js.Promise[String] = js.native
  def apply(`object`: js.Any, password: Specific, options: SealOptions): js.Promise[String] = js.native
}
