package typingsSlinky.memFsEditor.anon

import typingsSlinky.glob.mod.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobOptions extends js.Object {
  var globOptions: js.UndefOr[IOptions] = js.native
}

object GlobOptions {
  @scala.inline
  def apply(): GlobOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobOptions]
  }
  @scala.inline
  implicit class GlobOptionsOps[Self <: GlobOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGlobOptions(value: IOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globOptions")(js.undefined)
        ret
    }
  }
  
}

