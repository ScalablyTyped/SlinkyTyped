package typingsSlinky.openfin

import typingsSlinky.node.childProcessMod.ChildProcess
import typingsSlinky.openfin.wireMod.ConfigWithRuntime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openfin/_v2/launcher/win-launch", JSImport.Namespace)
@js.native
object winLaunchMod extends js.Object {
  
  def default(config: ConfigWithRuntime, manifestLocation: String, namedPipeName: String): js.Promise[ChildProcess] = js.native
}
