package typingsSlinky.jupyterlabLogconsole.tokensMod

import typingsSlinky.jupyterlabCoreutils.nbformatMod.nbformat.IOutput
import typingsSlinky.jupyterlabLogconsole.jupyterlabLogconsoleStrings.output
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOutputLog
  extends ILogPayloadBase
     with ILogPayload {
  /**
    * Log data as Notebook kernel output.
    */
  @JSName("data")
  var data_IOutputLog: IOutput = js.native
  /**
    * Type of log data.
    */
  @JSName("type")
  var type_IOutputLog: output = js.native
}

object IOutputLog {
  @scala.inline
  def apply(data: IOutput, level: LogLevel, `type`: output): IOutputLog = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOutputLog]
  }
  @scala.inline
  implicit class IOutputLogOps[Self <: IOutputLog] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: IOutput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: output): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

