package typingsSlinky.atJupyterlabLogconsole

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTokensMod {
  import typingsSlinky.atJupyterlabCoreutils.libInterfacesMod.IChangedArgs
  import typingsSlinky.atJupyterlabLogconsole.atJupyterlabLogconsoleStrings.append
  import typingsSlinky.atJupyterlabLogconsole.atJupyterlabLogconsoleStrings.level
  import typingsSlinky.atJupyterlabLogconsole.atJupyterlabLogconsoleStrings.rendermime
  import typingsSlinky.atJupyterlabRendermime.libTokensMod.IRenderMimeRegistry

  type ILoggerRegistryChange = append
  type IStateChange = IChangedArgs[IRenderMimeRegistry | LogLevel, rendermime | level]
}
