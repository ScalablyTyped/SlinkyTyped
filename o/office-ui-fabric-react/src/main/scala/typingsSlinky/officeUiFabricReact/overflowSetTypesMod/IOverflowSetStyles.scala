package typingsSlinky.officeUiFabricReact.overflowSetTypesMod

import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOverflowSetStyles extends js.Object {
  /** The style that is layered onto each individual item in the overflow set. */
  var item: js.UndefOr[IStyle] = js.native
  /** The style that is layered onto the overflow button for the overflow set. */
  var overflowButton: js.UndefOr[IStyle] = js.native
  /** The style that is layered onto the root element of OverflowSet. */
  var root: js.UndefOr[IStyle] = js.native
}

object IOverflowSetStyles {
  @scala.inline
  def apply(): IOverflowSetStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOverflowSetStyles]
  }
  @scala.inline
  implicit class IOverflowSetStylesOps[Self <: IOverflowSetStyles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItem(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(js.undefined)
        ret
    }
    @scala.inline
    def withItemNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(null)
        ret
    }
    @scala.inline
    def withOverflowButton(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverflowButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowButton")(js.undefined)
        ret
    }
    @scala.inline
    def withOverflowButtonNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowButton")(null)
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
  }
  
}

