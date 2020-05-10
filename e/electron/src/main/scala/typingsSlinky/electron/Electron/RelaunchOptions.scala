package typingsSlinky.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelaunchOptions extends js.Object {
  var args: js.UndefOr[js.Array[String]] = js.native
  var execPath: js.UndefOr[String] = js.native
}

object RelaunchOptions {
  @scala.inline
  def apply(): RelaunchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelaunchOptions]
  }
  @scala.inline
  implicit class RelaunchOptionsOps[Self <: RelaunchOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(js.undefined)
        ret
    }
    @scala.inline
    def withExecPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execPath")(js.undefined)
        ret
    }
  }
  
}

