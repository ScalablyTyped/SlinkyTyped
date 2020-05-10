package typingsSlinky.jupyterlabLogconsole.tokensMod

import typingsSlinky.jupyterlabLogconsole.jupyterlabLogconsoleStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITextLog
  extends ILogPayloadBase
     with ILogPayload {
  /**
    * Log data as plain text.
    */
  @JSName("data")
  var data_ITextLog: String = js.native
  /**
    * Type of log data.
    */
  @JSName("type")
  var type_ITextLog: text = js.native
}

object ITextLog {
  @scala.inline
  def apply(data: String, level: LogLevel, `type`: text): ITextLog = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITextLog]
  }
  @scala.inline
  implicit class ITextLogOps[Self <: ITextLog] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: text): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

