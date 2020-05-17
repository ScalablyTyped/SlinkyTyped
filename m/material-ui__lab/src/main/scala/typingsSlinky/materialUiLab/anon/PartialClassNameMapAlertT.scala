package typingsSlinky.materialUiLab.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/lab.@material-ui/lab/AlertTitle/AlertTitle.AlertTitleClassKey>> */
@js.native
trait PartialClassNameMapAlertT extends js.Object {
  var root: js.UndefOr[String] = js.native
}

object PartialClassNameMapAlertT {
  @scala.inline
  def apply(): PartialClassNameMapAlertT = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapAlertT]
  }
  @scala.inline
  implicit class PartialClassNameMapAlertTOps[Self <: PartialClassNameMapAlertT] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(js.undefined)
        ret
    }
  }
  
}

