package typingsSlinky.mockFs.filesystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Create a directory for `process.cwd()`. This is `true` by default.
    */
  var createCwd: js.UndefOr[Boolean] = js.native
  /**
    * Create a directory for `os.tmpdir()`. This is `true` by default.
    */
  var createTmp: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateCwd(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createCwd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateCwd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createCwd")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateTmp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTmp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateTmp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTmp")(js.undefined)
        ret
    }
  }
  
}

