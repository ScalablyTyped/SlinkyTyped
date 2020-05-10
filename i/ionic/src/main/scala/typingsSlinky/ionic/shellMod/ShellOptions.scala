package typingsSlinky.ionic.shellMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShellOptions extends js.Object {
  val alterPath: js.UndefOr[js.Function1[/* p */ String, String]] = js.native
}

object ShellOptions {
  @scala.inline
  def apply(): ShellOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShellOptions]
  }
  @scala.inline
  implicit class ShellOptionsOps[Self <: ShellOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlterPath(value: /* p */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alterPath")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAlterPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alterPath")(js.undefined)
        ret
    }
  }
  
}

