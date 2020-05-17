package typingsSlinky.memFsEditor.anon

import typingsSlinky.glob.mod.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobOptionsIOptions extends js.Object {
  var globOptions: IOptions = js.native
}

object GlobOptionsIOptions {
  @scala.inline
  def apply(globOptions: IOptions): GlobOptionsIOptions = {
    val __obj = js.Dynamic.literal(globOptions = globOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobOptionsIOptions]
  }
  @scala.inline
  implicit class GlobOptionsIOptionsOps[Self <: GlobOptionsIOptions] (val x: Self) extends AnyVal {
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
  }
  
}

