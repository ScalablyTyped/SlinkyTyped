package typingsSlinky.evernote.mod.Types

import typingsSlinky.evernote.anon.LongIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("evernote", "Types.UserIdentity")
@js.native
class UserIdentity () extends js.Object {
  def this(args: LongIdentifier) = this()
  
  var longIdentifier: js.UndefOr[Double] = js.native
  
  var stringIdentifier: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[UserIdentityType] = js.native
}
