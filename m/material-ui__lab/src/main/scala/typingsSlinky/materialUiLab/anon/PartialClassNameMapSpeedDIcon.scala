package typingsSlinky.materialUiLab.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/lab.@material-ui/lab/SpeedDialIcon/SpeedDialIcon.SpeedDialIconClassKey>> */
@js.native
trait PartialClassNameMapSpeedDIcon extends js.Object {
  var icon: js.UndefOr[String] = js.native
  var iconOpen: js.UndefOr[String] = js.native
  var iconWithOpenIconOpen: js.UndefOr[String] = js.native
  var openIcon: js.UndefOr[String] = js.native
  var openIconOpen: js.UndefOr[String] = js.native
  var root: js.UndefOr[String] = js.native
}

object PartialClassNameMapSpeedDIcon {
  @scala.inline
  def apply(): PartialClassNameMapSpeedDIcon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapSpeedDIcon]
  }
  @scala.inline
  implicit class PartialClassNameMapSpeedDIconOps[Self <: PartialClassNameMapSpeedDIcon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withIconOpen(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withIconWithOpenIconOpen(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconWithOpenIconOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconWithOpenIconOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconWithOpenIconOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenIconOpen(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openIconOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenIconOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openIconOpen")(js.undefined)
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

