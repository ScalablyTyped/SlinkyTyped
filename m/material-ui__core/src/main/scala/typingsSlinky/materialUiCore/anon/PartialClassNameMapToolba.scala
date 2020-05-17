package typingsSlinky.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/Toolbar/Toolbar.ToolbarClassKey>> */
@js.native
trait PartialClassNameMapToolba extends js.Object {
  var dense: js.UndefOr[String] = js.native
  var gutters: js.UndefOr[String] = js.native
  var regular: js.UndefOr[String] = js.native
  var root: js.UndefOr[String] = js.native
}

object PartialClassNameMapToolba {
  @scala.inline
  def apply(): PartialClassNameMapToolba = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapToolba]
  }
  @scala.inline
  implicit class PartialClassNameMapToolbaOps[Self <: PartialClassNameMapToolba] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDense(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dense")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDense: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dense")(js.undefined)
        ret
    }
    @scala.inline
    def withGutters(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gutters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGutters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gutters")(js.undefined)
        ret
    }
    @scala.inline
    def withRegular(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regular")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegular: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regular")(js.undefined)
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

