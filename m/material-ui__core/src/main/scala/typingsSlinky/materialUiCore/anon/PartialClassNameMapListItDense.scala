package typingsSlinky.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/ListItemText/ListItemText.ListItemTextClassKey>> */
@js.native
trait PartialClassNameMapListItDense extends js.Object {
  var dense: js.UndefOr[String] = js.native
  var inset: js.UndefOr[String] = js.native
  var primary: js.UndefOr[String] = js.native
  var root: js.UndefOr[String] = js.native
  var secondary: js.UndefOr[String] = js.native
  var textDense: js.UndefOr[String] = js.native
}

object PartialClassNameMapListItDense {
  @scala.inline
  def apply(): PartialClassNameMapListItDense = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapListItDense]
  }
  @scala.inline
  implicit class PartialClassNameMapListItDenseOps[Self <: PartialClassNameMapListItDense] (val x: Self) extends AnyVal {
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
    def withInset(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inset")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primary")(js.undefined)
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
    def withSecondary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondary")(js.undefined)
        ret
    }
    @scala.inline
    def withTextDense(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textDense")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextDense: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textDense")(js.undefined)
        ret
    }
  }
  
}

