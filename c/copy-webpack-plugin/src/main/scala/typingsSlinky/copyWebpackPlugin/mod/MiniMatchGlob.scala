package typingsSlinky.copyWebpackPlugin.mod

import typingsSlinky.minimatch.mod.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MiniMatchGlob extends IOptions {
  var glob: String = js.native
}

object MiniMatchGlob {
  @scala.inline
  def apply(glob: String): MiniMatchGlob = {
    val __obj = js.Dynamic.literal(glob = glob.asInstanceOf[js.Any])
    __obj.asInstanceOf[MiniMatchGlob]
  }
  @scala.inline
  implicit class MiniMatchGlobOps[Self <: MiniMatchGlob] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGlob(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glob")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

