package typingsSlinky.greasemonkey

import typingsSlinky.greasemonkey.GM.ScriptInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonScript extends js.Object {
  /** An object containing data about the currently running script */
  var script: ScriptInfo = js.native
  /**
    * The name of the user script engine handling this script's execution.
    * The string `Greasemonkey`
    */
  var scriptHandler: String = js.native
  /**
    * A string, the entire literal Metadata Block (without the delimiters)
    * for the currently running script
    */
  var scriptMetaStr: String = js.native
  /** The version of Greasemonkey, a string e.g. `4.0` */
  var version: String = js.native
}

object AnonScript {
  @scala.inline
  def apply(script: ScriptInfo, scriptHandler: String, scriptMetaStr: String, version: String): AnonScript = {
    val __obj = js.Dynamic.literal(script = script.asInstanceOf[js.Any], scriptHandler = scriptHandler.asInstanceOf[js.Any], scriptMetaStr = scriptMetaStr.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonScript]
  }
  @scala.inline
  implicit class AnonScriptOps[Self <: AnonScript] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScript(value: ScriptInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("script")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScriptHandler(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScriptMetaStr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptMetaStr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

