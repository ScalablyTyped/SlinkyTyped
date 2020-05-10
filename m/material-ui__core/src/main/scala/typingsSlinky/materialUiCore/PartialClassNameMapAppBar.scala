package typingsSlinky.materialUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/AppBar/AppBar.AppBarClassKey>> */
@js.native
trait PartialClassNameMapAppBar extends js.Object {
  var colorDefault: js.UndefOr[String] = js.native
  var colorPrimary: js.UndefOr[String] = js.native
  var colorSecondary: js.UndefOr[String] = js.native
  var positionAbsolute: js.UndefOr[String] = js.native
  var positionFixed: js.UndefOr[String] = js.native
  var positionRelative: js.UndefOr[String] = js.native
  var positionStatic: js.UndefOr[String] = js.native
  var positionSticky: js.UndefOr[String] = js.native
  var root: js.UndefOr[String] = js.native
}

object PartialClassNameMapAppBar {
  @scala.inline
  def apply(): PartialClassNameMapAppBar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapAppBar]
  }
  @scala.inline
  implicit class PartialClassNameMapAppBarOps[Self <: PartialClassNameMapAppBar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColorDefault(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorDefault")(js.undefined)
        ret
    }
    @scala.inline
    def withColorPrimary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorPrimary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorPrimary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorPrimary")(js.undefined)
        ret
    }
    @scala.inline
    def withColorSecondary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorSecondary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorSecondary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorSecondary")(js.undefined)
        ret
    }
    @scala.inline
    def withPositionAbsolute(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionAbsolute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositionAbsolute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionAbsolute")(js.undefined)
        ret
    }
    @scala.inline
    def withPositionFixed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionFixed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositionFixed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionFixed")(js.undefined)
        ret
    }
    @scala.inline
    def withPositionRelative(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionRelative")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositionRelative: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionRelative")(js.undefined)
        ret
    }
    @scala.inline
    def withPositionStatic(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionStatic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositionStatic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionStatic")(js.undefined)
        ret
    }
    @scala.inline
    def withPositionSticky(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionSticky")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositionSticky: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionSticky")(js.undefined)
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

