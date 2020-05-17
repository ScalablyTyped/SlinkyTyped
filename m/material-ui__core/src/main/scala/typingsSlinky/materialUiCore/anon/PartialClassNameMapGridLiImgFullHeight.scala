package typingsSlinky.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/GridListTile/GridListTile.GridListTileClassKey>> */
@js.native
trait PartialClassNameMapGridLiImgFullHeight extends js.Object {
  var imgFullHeight: js.UndefOr[String] = js.native
  var imgFullWidth: js.UndefOr[String] = js.native
  var root: js.UndefOr[String] = js.native
  var tile: js.UndefOr[String] = js.native
}

object PartialClassNameMapGridLiImgFullHeight {
  @scala.inline
  def apply(): PartialClassNameMapGridLiImgFullHeight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapGridLiImgFullHeight]
  }
  @scala.inline
  implicit class PartialClassNameMapGridLiImgFullHeightOps[Self <: PartialClassNameMapGridLiImgFullHeight] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImgFullHeight(value: String): Self = {
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
    def withImgFullWidth(value: String): Self = {
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
    def withTile(value: String): Self = {
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

