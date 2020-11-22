package typingsSlinky.jupyterlabLogconsole.tokensMod

import typingsSlinky.jupyterlabLogconsole.jupyterlabLogconsoleStrings.html
import typingsSlinky.jupyterlabLogconsole.jupyterlabLogconsoleStrings.output
import typingsSlinky.jupyterlabLogconsole.jupyterlabLogconsoleStrings.text
import typingsSlinky.jupyterlabNbformat.mod.IOutput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jupyterlabLogconsole.tokensMod.ITextLog
  - typingsSlinky.jupyterlabLogconsole.tokensMod.IHtmlLog
  - typingsSlinky.jupyterlabLogconsole.tokensMod.IOutputLog
*/
trait ILogPayload extends js.Object
object ILogPayload {
  
  @scala.inline
  def ITextLog(data: String, level: LogLevel, `type`: text): ILogPayload = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILogPayload]
  }
  
  @scala.inline
  def IHtmlLog(data: String, level: LogLevel, `type`: html): ILogPayload = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILogPayload]
  }
  
  @scala.inline
  def IOutputLog(data: IOutput, level: LogLevel, `type`: output): ILogPayload = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILogPayload]
  }
}
