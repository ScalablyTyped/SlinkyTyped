package typingsSlinky.jupyterlabLogconsole

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tokensMod {
  type ILoggerRegistryChange = typingsSlinky.jupyterlabLogconsole.jupyterlabLogconsoleStrings.append
  type IStateChange = typingsSlinky.jupyterlabCoreutils.interfacesMod.IChangedArgs[
    typingsSlinky.jupyterlabRendermime.tokensMod.IRenderMimeRegistry | typingsSlinky.jupyterlabLogconsole.tokensMod.LogLevel, 
    typingsSlinky.jupyterlabLogconsole.jupyterlabLogconsoleStrings.rendermime | typingsSlinky.jupyterlabLogconsole.jupyterlabLogconsoleStrings.level
  ]
}
