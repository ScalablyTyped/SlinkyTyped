package typingsSlinky.atJupyterlabLogconsole

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libLoggerMod {
  import typingsSlinky.atJupyterlabCoreutils.libNbformatMod.nbformat.IOutput
  import typingsSlinky.atJupyterlabLogconsole.Anon_Level

  /**
    * Custom Notebook Output with log info.
    */
  type ILogOutput = IOutput with Anon_Level
  type LogOutputModel = LogOutputModel_
  type Logger = Logger_
  type LoggerOutputAreaModel = LoggerOutputAreaModel_
}
