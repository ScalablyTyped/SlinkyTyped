package typingsSlinky.node.clusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// interfaces
trait ClusterSettings extends js.Object {
  var args: js.UndefOr[js.Array[String]] = js.undefined
   // default: process.execArgv
  var exec: js.UndefOr[String] = js.undefined
  var execArgv: js.UndefOr[js.Array[String]] = js.undefined
  var gid: js.UndefOr[Double] = js.undefined
  var inspectPort: js.UndefOr[Double | js.Function0[Double]] = js.undefined
  var silent: js.UndefOr[Boolean] = js.undefined
  var stdio: js.UndefOr[js.Array[_]] = js.undefined
  var uid: js.UndefOr[Double] = js.undefined
}

object ClusterSettings {
  @scala.inline
  def apply(): ClusterSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterSettings]
  }
  @scala.inline
  implicit class ClusterSettingsOps[Self <: ClusterSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArgsVarargs(value: String*): Self = this.set("args", js.Array(value :_*))
    @scala.inline
    def setArgs(value: js.Array[String]): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    @scala.inline
    def setExec(value: String): Self = this.set("exec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExec: Self = this.set("exec", js.undefined)
    @scala.inline
    def setExecArgvVarargs(value: String*): Self = this.set("execArgv", js.Array(value :_*))
    @scala.inline
    def setExecArgv(value: js.Array[String]): Self = this.set("execArgv", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecArgv: Self = this.set("execArgv", js.undefined)
    @scala.inline
    def setGid(value: Double): Self = this.set("gid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGid: Self = this.set("gid", js.undefined)
    @scala.inline
    def setInspectPortFunction0(value: () => Double): Self = this.set("inspectPort", js.Any.fromFunction0(value))
    @scala.inline
    def setInspectPort(value: Double | js.Function0[Double]): Self = this.set("inspectPort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInspectPort: Self = this.set("inspectPort", js.undefined)
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
    @scala.inline
    def setStdioVarargs(value: js.Any*): Self = this.set("stdio", js.Array(value :_*))
    @scala.inline
    def setStdio(value: js.Array[_]): Self = this.set("stdio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStdio: Self = this.set("stdio", js.undefined)
    @scala.inline
    def setUid(value: Double): Self = this.set("uid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUid: Self = this.set("uid", js.undefined)
  }
  
}

