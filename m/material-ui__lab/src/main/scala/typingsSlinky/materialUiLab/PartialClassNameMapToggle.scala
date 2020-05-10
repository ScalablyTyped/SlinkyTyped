package typingsSlinky.materialUiLab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/lab.@material-ui/lab/ToggleButtonGroup/ToggleButtonGroup.ToggleButtonGroupClassKey>> */
@js.native
trait PartialClassNameMapToggle extends js.Object {
  var grouped: js.UndefOr[String] = js.native
  var groupedSizeLarge: js.UndefOr[String] = js.native
  var groupedSizeSmall: js.UndefOr[String] = js.native
  var root: js.UndefOr[String] = js.native
}

object PartialClassNameMapToggle {
  @scala.inline
  def apply(): PartialClassNameMapToggle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapToggle]
  }
  @scala.inline
  implicit class PartialClassNameMapToggleOps[Self <: PartialClassNameMapToggle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGrouped(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grouped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrouped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grouped")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupedSizeLarge(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupedSizeLarge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupedSizeLarge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupedSizeLarge")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupedSizeSmall(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupedSizeSmall")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupedSizeSmall: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupedSizeSmall")(js.undefined)
        ret
    }
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

