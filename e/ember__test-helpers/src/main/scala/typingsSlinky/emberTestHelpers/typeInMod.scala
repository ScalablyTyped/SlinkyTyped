package typingsSlinky.emberTestHelpers

import typingsSlinky.emberTestHelpers.anon.Delay
import typingsSlinky.emberTestHelpers.mod.Target
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ember/test-helpers/dom/type-in", JSImport.Namespace)
@js.native
object typeInMod extends js.Object {
  
  def default(target: Target, text: String): js.Promise[Unit] = js.native
  def default(target: Target, text: String, options: Delay): js.Promise[Unit] = js.native
}
