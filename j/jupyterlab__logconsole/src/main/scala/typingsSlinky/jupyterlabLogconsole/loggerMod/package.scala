package typingsSlinky.jupyterlabLogconsole

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object loggerMod {
  
  /**
    * Custom Notebook Output with log info.
    */
  type ILogOutput = typingsSlinky.jupyterlabNbformat.mod.IOutput with typingsSlinky.jupyterlabLogconsole.anon.Level
  
  type LogOutputModel = typingsSlinky.jupyterlabLogconsole.loggerMod.LogOutputModel_
  
  type Logger = typingsSlinky.jupyterlabLogconsole.loggerMod.Logger_
  
  type LoggerOutputAreaModel = typingsSlinky.jupyterlabLogconsole.loggerMod.LoggerOutputAreaModel_
}
