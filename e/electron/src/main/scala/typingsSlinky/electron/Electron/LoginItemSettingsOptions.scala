package typingsSlinky.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoginItemSettingsOptions extends js.Object {
  /**
    * The command-line arguments to compare against. Defaults to an empty array.
    */
  var args: js.UndefOr[js.Array[String]] = js.native
  /**
    * The executable path to compare against. Defaults to process.execPath.
    */
  var path: js.UndefOr[String] = js.native
}

object LoginItemSettingsOptions {
  @scala.inline
  def apply(): LoginItemSettingsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoginItemSettingsOptions]
  }
  @scala.inline
  implicit class LoginItemSettingsOptionsOps[Self <: LoginItemSettingsOptions] (val x: Self) extends AnyVal {
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
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
  }
  
}

