package typingsSlinky.ionic.nativeRunMod

import typingsSlinky.ionic.definitionsMod.IConfig
import typingsSlinky.ionic.definitionsMod.ILogger
import typingsSlinky.ionic.definitionsMod.IShell
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunNativeRunDeps extends js.Object {
  val config: IConfig
  val log: ILogger
  val shell: IShell
}

object RunNativeRunDeps {
  @scala.inline
  def apply(config: IConfig, log: ILogger, shell: IShell): RunNativeRunDeps = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RunNativeRunDeps]
  }
}

