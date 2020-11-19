package typingsSlinky.openfin.nixLaunchMod

import typingsSlinky.node.childProcessMod.ChildProcess
import typingsSlinky.openfin.wireMod.ConfigWithRuntime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openfin/_v2/launcher/nix-launch", JSImport.Default)
@js.native
object default extends js.Object {
  
  def apply(config: ConfigWithRuntime, osConfig: OsConfig): js.Promise[ChildProcess] = js.native
}
