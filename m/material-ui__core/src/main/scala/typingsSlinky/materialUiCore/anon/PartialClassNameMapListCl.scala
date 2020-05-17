package typingsSlinky.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/List/List.ListClassKey>> */
@js.native
trait PartialClassNameMapListCl extends js.Object {
  var dense: js.UndefOr[String] = js.native
  var padding: js.UndefOr[String] = js.native
  var root: js.UndefOr[String] = js.native
  var subheader: js.UndefOr[String] = js.native
}

object PartialClassNameMapListCl {
  @scala.inline
  def apply(): PartialClassNameMapListCl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapListCl]
  }
  @scala.inline
  implicit class PartialClassNameMapListClOps[Self <: PartialClassNameMapListCl] (val x: Self) extends AnyVal {
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
    def withPadding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
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
    @scala.inline
    def withSubheader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subheader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubheader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subheader")(js.undefined)
        ret
    }
  }
  
}

