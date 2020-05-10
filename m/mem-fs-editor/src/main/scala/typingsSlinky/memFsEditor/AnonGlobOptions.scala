package typingsSlinky.memFsEditor

import typingsSlinky.glob.mod.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGlobOptions extends js.Object {
  var globOptions: js.UndefOr[IOptions] = js.native
}

object AnonGlobOptions {
  @scala.inline
  def apply(): AnonGlobOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonGlobOptions]
  }
  @scala.inline
  implicit class AnonGlobOptionsOps[Self <: AnonGlobOptions] (val x: Self) extends AnyVal {
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

