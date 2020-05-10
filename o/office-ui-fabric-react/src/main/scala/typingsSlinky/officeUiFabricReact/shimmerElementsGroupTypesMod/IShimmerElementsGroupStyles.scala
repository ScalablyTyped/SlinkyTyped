package typingsSlinky.officeUiFabricReact.shimmerElementsGroupTypesMod

import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IShimmerElementsGroupStyles extends js.Object {
  /**
    * Represents the wrapper root element holding all elements inside.
    */
  var root: js.UndefOr[IStyle] = js.native
}

object IShimmerElementsGroupStyles {
  @scala.inline
  def apply(): IShimmerElementsGroupStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IShimmerElementsGroupStyles]
  }
  @scala.inline
  implicit class IShimmerElementsGroupStylesOps[Self <: IShimmerElementsGroupStyles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
  }
  
}

