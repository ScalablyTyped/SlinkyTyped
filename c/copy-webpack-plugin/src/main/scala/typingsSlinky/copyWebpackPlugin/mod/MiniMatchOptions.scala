package typingsSlinky.copyWebpackPlugin.mod

import typingsSlinky.minimatch.mod.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MiniMatchOptions extends IOptions {
  var cwd: js.UndefOr[String] = js.native
}

object MiniMatchOptions {
  @scala.inline
  def apply(): MiniMatchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MiniMatchOptions]
  }
  @scala.inline
  implicit class MiniMatchOptionsOps[Self <: MiniMatchOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCwd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cwd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCwd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cwd")(js.undefined)
        ret
    }
  }
  
}

