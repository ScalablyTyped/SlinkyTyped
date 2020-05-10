package typingsSlinky.materialUiCore

import typingsSlinky.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/GridListTile.GridListTileClassKey>> */
@js.native
trait PartialStyleRulesGridListImgFullHeight extends js.Object {
  var imgFullHeight: js.UndefOr[CSSProperties] = js.native
  var imgFullWidth: js.UndefOr[CSSProperties] = js.native
  var root: js.UndefOr[CSSProperties] = js.native
  var tile: js.UndefOr[CSSProperties] = js.native
}

object PartialStyleRulesGridListImgFullHeight {
  @scala.inline
  def apply(): PartialStyleRulesGridListImgFullHeight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesGridListImgFullHeight]
  }
  @scala.inline
  implicit class PartialStyleRulesGridListImgFullHeightOps[Self <: PartialStyleRulesGridListImgFullHeight] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImgFullHeight(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imgFullHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImgFullHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imgFullHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withImgFullWidth(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imgFullWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImgFullWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imgFullWidth")(js.undefined)
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
    @scala.inline
    def withTile(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tile")(js.undefined)
        ret
    }
  }
  
}

