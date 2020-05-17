package typingsSlinky.materialUiCore.anon

import typingsSlinky.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Snackbar.SnackbarClassKey>> */
@js.native
trait PartialStyleRulesSnackbar extends js.Object {
  var anchorOriginBottomCenter: js.UndefOr[CSSProperties] = js.native
  var anchorOriginBottomLeft: js.UndefOr[CSSProperties] = js.native
  var anchorOriginBottomRight: js.UndefOr[CSSProperties] = js.native
  var anchorOriginTopCenter: js.UndefOr[CSSProperties] = js.native
  var anchorOriginTopLeft: js.UndefOr[CSSProperties] = js.native
  var anchorOriginTopRight: js.UndefOr[CSSProperties] = js.native
  var root: js.UndefOr[CSSProperties] = js.native
}

object PartialStyleRulesSnackbar {
  @scala.inline
  def apply(): PartialStyleRulesSnackbar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesSnackbar]
  }
  @scala.inline
  implicit class PartialStyleRulesSnackbarOps[Self <: PartialStyleRulesSnackbar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnchorOriginBottomCenter(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorOriginBottomCenter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnchorOriginBottomCenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorOriginBottomCenter")(js.undefined)
        ret
    }
    @scala.inline
    def withAnchorOriginBottomLeft(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorOriginBottomLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnchorOriginBottomLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorOriginBottomLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withAnchorOriginBottomRight(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorOriginBottomRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnchorOriginBottomRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorOriginBottomRight")(js.undefined)
        ret
    }
    @scala.inline
    def withAnchorOriginTopCenter(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorOriginTopCenter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnchorOriginTopCenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorOriginTopCenter")(js.undefined)
        ret
    }
    @scala.inline
    def withAnchorOriginTopLeft(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorOriginTopLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnchorOriginTopLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorOriginTopLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withAnchorOriginTopRight(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorOriginTopRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnchorOriginTopRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorOriginTopRight")(js.undefined)
        ret
    }
    @scala.inline
    def withRoot(value: CSSProperties): Self = {
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

