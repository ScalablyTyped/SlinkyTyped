package typingsSlinky.officeUiFabricReact.shimmerLineTypesMod

import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IShimmerLineStyles extends js.Object {
  /**
    * Bottom-left corner SVG of the ShimmerLine component.
    */
  var bottomLeftCorner: js.UndefOr[IStyle] = js.native
  /**
    * Bottom-right corner SVG of the ShimmerLine component.
    */
  var bottomRightCorner: js.UndefOr[IStyle] = js.native
  /**
    * Root of the ShimmerLine component.
    */
  var root: js.UndefOr[IStyle] = js.native
  /**
    * Top-left corner SVG of the ShimmerLine component.
    */
  var topLeftCorner: js.UndefOr[IStyle] = js.native
  /**
    * Top-right corner SVG of the ShimmerLine component.
    */
  var topRightCorner: js.UndefOr[IStyle] = js.native
}

object IShimmerLineStyles {
  @scala.inline
  def apply(): IShimmerLineStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IShimmerLineStyles]
  }
  @scala.inline
  implicit class IShimmerLineStylesOps[Self <: IShimmerLineStyles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBottomLeftCorner(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomLeftCorner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBottomLeftCorner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomLeftCorner")(js.undefined)
        ret
    }
    @scala.inline
    def withBottomLeftCornerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomLeftCorner")(null)
        ret
    }
    @scala.inline
    def withBottomRightCorner(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomRightCorner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBottomRightCorner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomRightCorner")(js.undefined)
        ret
    }
    @scala.inline
    def withBottomRightCornerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomRightCorner")(null)
        ret
    }
    @scala.inline
    def withRoot(value: IStyle): Self = {
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
    def withRootNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(null)
        ret
    }
    @scala.inline
    def withTopLeftCorner(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topLeftCorner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopLeftCorner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topLeftCorner")(js.undefined)
        ret
    }
    @scala.inline
    def withTopLeftCornerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topLeftCorner")(null)
        ret
    }
    @scala.inline
    def withTopRightCorner(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topRightCorner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopRightCorner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topRightCorner")(js.undefined)
        ret
    }
    @scala.inline
    def withTopRightCornerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topRightCorner")(null)
        ret
    }
  }
  
}

