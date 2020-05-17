package typingsSlinky.activexLibreoffice.com_.sun.star.script.vba

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XVBACompatibility extends js.Object {
  var ProjectName: String = js.native
  var RunningVBAScripts: Double = js.native
  var VBACompatibilityMode: Boolean = js.native
  def addVBAScriptListener(Listener: XVBAScriptListener): Unit = js.native
  def broadcastVBAScriptEvent(Identifier: Double, ModuleName: String): Unit = js.native
  def removeVBAScriptListener(Listener: XVBAScriptListener): Unit = js.native
}

object XVBACompatibility {
  @scala.inline
  def apply(
    ProjectName: String,
    RunningVBAScripts: Double,
    VBACompatibilityMode: Boolean,
    addVBAScriptListener: XVBAScriptListener => Unit,
    broadcastVBAScriptEvent: (Double, String) => Unit,
    removeVBAScriptListener: XVBAScriptListener => Unit
  ): XVBACompatibility = {
    val __obj = js.Dynamic.literal(ProjectName = ProjectName.asInstanceOf[js.Any], RunningVBAScripts = RunningVBAScripts.asInstanceOf[js.Any], VBACompatibilityMode = VBACompatibilityMode.asInstanceOf[js.Any], addVBAScriptListener = js.Any.fromFunction1(addVBAScriptListener), broadcastVBAScriptEvent = js.Any.fromFunction2(broadcastVBAScriptEvent), removeVBAScriptListener = js.Any.fromFunction1(removeVBAScriptListener))
    __obj.asInstanceOf[XVBACompatibility]
  }
  @scala.inline
  implicit class XVBACompatibilityOps[Self <: XVBACompatibility] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProjectName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProjectName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRunningVBAScripts(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RunningVBAScripts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVBACompatibilityMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VBACompatibilityMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddVBAScriptListener(value: XVBAScriptListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addVBAScriptListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBroadcastVBAScriptEvent(value: (Double, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("broadcastVBAScriptEvent")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRemoveVBAScriptListener(value: XVBAScriptListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeVBAScriptListener")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

