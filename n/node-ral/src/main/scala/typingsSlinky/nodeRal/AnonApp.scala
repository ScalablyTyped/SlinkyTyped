package typingsSlinky.nodeRal

import typingsSlinky.nodeRal.mod.RalLogger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonApp extends js.Object {
  var app: String = js.native
  var format_wf: String = js.native
  var logInstance: RalLogger = js.native
  var log_path: String = js.native
}

object AnonApp {
  @scala.inline
  def apply(app: String, format_wf: String, logInstance: RalLogger, log_path: String): AnonApp = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], format_wf = format_wf.asInstanceOf[js.Any], logInstance = logInstance.asInstanceOf[js.Any], log_path = log_path.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonApp]
  }
  @scala.inline
  implicit class AnonAppOps[Self <: AnonApp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormat_wf(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format_wf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogInstance(value: RalLogger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logInstance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLog_path(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log_path")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

