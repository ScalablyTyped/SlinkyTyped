package typingsSlinky.officeUiFabricReact.scrollablePaneTypesMod

import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IScrollablePaneStyles extends js.Object {
  /**
    * Style set for the contentContainer element.
    */
  var contentContainer: IStyle = js.native
  /**
    * Style set for the root element.
    */
  var root: IStyle = js.native
  /**
    * Style set for the stickyAbove element.
    */
  var stickyAbove: IStyle = js.native
  /**
    * Style set for the stickyBelow element.
    */
  var stickyBelow: IStyle = js.native
  /**
    * Style set for the stickyBelowItems element.
    */
  var stickyBelowItems: IStyle = js.native
}

object IScrollablePaneStyles {
  @scala.inline
  def apply(): IScrollablePaneStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IScrollablePaneStyles]
  }
  @scala.inline
  implicit class IScrollablePaneStylesOps[Self <: IScrollablePaneStyles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentContainer(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withContentContainerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentContainer")(null)
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
    def withStickyAbove(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickyAbove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStickyAbove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickyAbove")(js.undefined)
        ret
    }
    @scala.inline
    def withStickyAboveNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickyAbove")(null)
        ret
    }
    @scala.inline
    def withStickyBelow(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickyBelow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStickyBelow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickyBelow")(js.undefined)
        ret
    }
    @scala.inline
    def withStickyBelowNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickyBelow")(null)
        ret
    }
    @scala.inline
    def withStickyBelowItems(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickyBelowItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStickyBelowItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickyBelowItems")(js.undefined)
        ret
    }
    @scala.inline
    def withStickyBelowItemsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickyBelowItems")(null)
        ret
    }
  }
  
}

