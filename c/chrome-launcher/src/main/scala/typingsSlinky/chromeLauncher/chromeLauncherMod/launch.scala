package typingsSlinky.chromeLauncher.chromeLauncherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("chrome-launcher/dist/chrome-launcher", "launch")
@js.native
object launch extends js.Object {
  
  def apply(): js.Promise[LaunchedChrome] = js.native
  def apply(opts: Options): js.Promise[LaunchedChrome] = js.native
}
