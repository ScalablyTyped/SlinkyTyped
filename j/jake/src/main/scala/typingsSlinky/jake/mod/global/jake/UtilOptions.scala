package typingsSlinky.jake.mod.global.jake

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

////////////////////////////////////////////////////////////////////////////////////
// File-utils //////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////
@js.native
trait UtilOptions extends js.Object {
  var silent: js.UndefOr[Boolean] = js.native
}

object UtilOptions {
  @scala.inline
  def apply(): UtilOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UtilOptions]
  }
  @scala.inline
  implicit class UtilOptionsOps[Self <: UtilOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSilent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSilent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(js.undefined)
        ret
    }
  }
  
}

