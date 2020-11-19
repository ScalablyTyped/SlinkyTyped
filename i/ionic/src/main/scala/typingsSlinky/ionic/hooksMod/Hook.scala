package typingsSlinky.ionic.hooksMod

import typingsSlinky.ionic.definitionsMod.HookFn
import typingsSlinky.ionic.definitionsMod.HookInput
import typingsSlinky.ionic.definitionsMod.HookName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ionic/lib/hooks", "Hook")
@js.native
abstract class Hook protected () extends js.Object {
  def this(e: HookDeps) = this()
  
  val e: HookDeps = js.native
  
  /* protected */ def loadHookFn(p: String): js.Promise[js.UndefOr[HookFn]] = js.native
  
  val name: HookName = js.native
  
  def run(input: HookInput): js.Promise[Unit] = js.native
  
  def script: String = js.native
}
