package typingsSlinky.ionic.commandsConfigBaseMod

import typingsSlinky.atIonicCliDashFramework.definitionsMod.CommandLineInputs
import typingsSlinky.atIonicCliDashFramework.definitionsMod.CommandLineOptions
import typingsSlinky.ionic.libCommandMod.Command
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/commands/config/base", "BaseConfigCommand")
@js.native
abstract class BaseConfigCommand () extends Command {
  def generateContext(inputs: CommandLineInputs, options: CommandLineOptions): ConfigContext = js.native
  def interpretValue(): js.Any = js.native
  def interpretValue(v: String): js.Any = js.native
  def interpretValue(v: String, expectJson: Boolean): js.Any = js.native
  def jsonStringify(v: js.Any): String = js.native
}

