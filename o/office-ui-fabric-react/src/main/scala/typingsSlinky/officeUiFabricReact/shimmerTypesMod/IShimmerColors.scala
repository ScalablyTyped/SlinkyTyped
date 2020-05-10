package typingsSlinky.officeUiFabricReact.shimmerTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IShimmerColors extends js.Object {
  /**
    * Defines the background color of the space in between and around shimmer elements (borders, gaps and
    * rounded corners).
    * @defaultvalue theme.palette.white
    */
  var background: js.UndefOr[String] = js.native
  /**
    * Defines the main background color which is the color you see when the wave is not animating.
    * @defaultvalue theme.palette.neutralLight
    */
  var shimmer: js.UndefOr[String] = js.native
  /**
    * Defines the tip color of the shimmer wave which gradually gets from and to `shimmer` color.
    * @defaultvalue theme.palette.neutralLighter
    */
  var shimmerWave: js.UndefOr[String] = js.native
}

object IShimmerColors {
  @scala.inline
  def apply(): IShimmerColors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IShimmerColors]
  }
  @scala.inline
  implicit class IShimmerColorsOps[Self <: IShimmerColors] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(js.undefined)
        ret
    }
    @scala.inline
    def withShimmer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shimmer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShimmer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shimmer")(js.undefined)
        ret
    }
    @scala.inline
    def withShimmerWave(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shimmerWave")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShimmerWave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shimmerWave")(js.undefined)
        ret
    }
  }
  
}

