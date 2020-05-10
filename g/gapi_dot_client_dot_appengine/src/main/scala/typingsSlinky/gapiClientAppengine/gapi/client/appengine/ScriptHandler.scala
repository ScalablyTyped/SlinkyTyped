package typingsSlinky.gapiClientAppengine.gapi.client.appengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScriptHandler extends js.Object {
  /** Path to the script from the application root directory. */
  var scriptPath: js.UndefOr[String] = js.native
}

object ScriptHandler {
  @scala.inline
  def apply(): ScriptHandler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScriptHandler]
  }
  @scala.inline
  implicit class ScriptHandlerOps[Self <: ScriptHandler] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScriptPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScriptPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptPath")(js.undefined)
        ret
    }
  }
  
}

