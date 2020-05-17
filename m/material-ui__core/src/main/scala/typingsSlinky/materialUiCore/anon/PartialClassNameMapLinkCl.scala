package typingsSlinky.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/Link/Link.LinkClassKey>> */
@js.native
trait PartialClassNameMapLinkCl extends js.Object {
  var button: js.UndefOr[String] = js.native
  var root: js.UndefOr[String] = js.native
  var underlineAlways: js.UndefOr[String] = js.native
  var underlineHover: js.UndefOr[String] = js.native
  var underlineNone: js.UndefOr[String] = js.native
}

object PartialClassNameMapLinkCl {
  @scala.inline
  def apply(): PartialClassNameMapLinkCl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapLinkCl]
  }
  @scala.inline
  implicit class PartialClassNameMapLinkClOps[Self <: PartialClassNameMapLinkCl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withButton(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button")(js.undefined)
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
    def withUnderlineAlways(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underlineAlways")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnderlineAlways: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underlineAlways")(js.undefined)
        ret
    }
    @scala.inline
    def withUnderlineHover(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underlineHover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnderlineHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underlineHover")(js.undefined)
        ret
    }
    @scala.inline
    def withUnderlineNone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underlineNone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnderlineNone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underlineNone")(js.undefined)
        ret
    }
  }
  
}

