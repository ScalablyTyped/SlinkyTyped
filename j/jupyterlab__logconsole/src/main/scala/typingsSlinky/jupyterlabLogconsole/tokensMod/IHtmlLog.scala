package typingsSlinky.jupyterlabLogconsole.tokensMod

import typingsSlinky.jupyterlabLogconsole.jupyterlabLogconsoleStrings.html
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHtmlLog
  extends ILogPayloadBase
     with ILogPayload {
  /**
    * Log data as HTML string.
    */
  @JSName("data")
  var data_IHtmlLog: String = js.native
  /**
    * Type of log data.
    */
  @JSName("type")
  var type_IHtmlLog: html = js.native
}

object IHtmlLog {
  @scala.inline
  def apply(data: String, level: LogLevel, `type`: html): IHtmlLog = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHtmlLog]
  }
  @scala.inline
  implicit class IHtmlLogOps[Self <: IHtmlLog] (val x: Self) extends AnyVal {
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
    def withType(value: html): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

