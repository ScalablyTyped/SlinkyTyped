package typingsSlinky.officeUiFabricReact.shimmerTypesMod

import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IShimmerStyles extends js.Object {
  /** Refers to wrapper element of the children only. */
  var dataWrapper: js.UndefOr[IStyle] = js.native
  /** Refers to the root wrapper element. */
  var root: js.UndefOr[IStyle] = js.native
  /** Styles for the hidden helper element to aid with screen readers. */
  var screenReaderText: js.UndefOr[IStyle] = js.native
  /** Refers to gradient element of the shimmer animation only. */
  var shimmerGradient: js.UndefOr[IStyle] = js.native
  /** Refers to wrapper element of the shimmer only. */
  var shimmerWrapper: js.UndefOr[IStyle] = js.native
}

object IShimmerStyles {
  @scala.inline
  def apply(): IShimmerStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IShimmerStyles]
  }
  @scala.inline
  implicit class IShimmerStylesOps[Self <: IShimmerStyles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataWrapper(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataWrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataWrapper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataWrapper")(js.undefined)
        ret
    }
    @scala.inline
    def withDataWrapperNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataWrapper")(null)
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
    def withScreenReaderText(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenReaderText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScreenReaderText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenReaderText")(js.undefined)
        ret
    }
    @scala.inline
    def withScreenReaderTextNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenReaderText")(null)
        ret
    }
    @scala.inline
    def withShimmerGradient(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shimmerGradient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShimmerGradient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shimmerGradient")(js.undefined)
        ret
    }
    @scala.inline
    def withShimmerGradientNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shimmerGradient")(null)
        ret
    }
    @scala.inline
    def withShimmerWrapper(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shimmerWrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShimmerWrapper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shimmerWrapper")(js.undefined)
        ret
    }
    @scala.inline
    def withShimmerWrapperNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shimmerWrapper")(null)
        ret
    }
  }
  
}

