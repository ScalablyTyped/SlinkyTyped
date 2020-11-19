package typingsSlinky.jestConfig.mod

import typingsSlinky.jestConfig.anon.Configs
import typingsSlinky.jestTypes.configMod.Argv
import typingsSlinky.jestTypes.configMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jest-config", "readConfigs")
@js.native
object readConfigs extends js.Object {
  
  def apply(argv: Argv, projectPaths: js.Array[Path]): js.Promise[Configs] = js.native
}
