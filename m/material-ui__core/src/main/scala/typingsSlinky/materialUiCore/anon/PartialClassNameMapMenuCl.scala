package typingsSlinky.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/Menu/Menu.MenuClassKey>> */
@js.native
trait PartialClassNameMapMenuCl extends js.Object {
  var paper: js.UndefOr[String] = js.native
}

object PartialClassNameMapMenuCl {
  @scala.inline
  def apply(): PartialClassNameMapMenuCl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapMenuCl]
  }
  @scala.inline
  implicit class PartialClassNameMapMenuClOps[Self <: PartialClassNameMapMenuCl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPaper(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paper")(js.undefined)
        ret
    }
  }
  
}

