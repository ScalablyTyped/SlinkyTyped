package typingsSlinky.officeUiFabricReact.expandingCardTypesMod

import typingsSlinky.officeUiFabricReact.baseCardTypesMod.IBaseCardStyleProps
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IExpandingCardStyleProps extends IBaseCardStyleProps {
  /**
    * Height of the compact section of the card.
    */
  var compactCardHeight: js.UndefOr[Double] = js.native
  /**
    * Boolean flag that expanded card is in Expanded.mode === expanded && first frame was rendered.
    */
  var expandedCardFirstFrameRendered: js.UndefOr[Boolean] = js.native
  /**
    * Height of the expanded section of the card.
    */
  var expandedCardHeight: js.UndefOr[Double] = js.native
  /**
    * Whether the content of the expanded card overflows vertically.
    */
  var needsScroll: js.UndefOr[Boolean] = js.native
}

object IExpandingCardStyleProps {
  @scala.inline
  def apply(theme: ITheme): IExpandingCardStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExpandingCardStyleProps]
  }
  @scala.inline
  implicit class IExpandingCardStylePropsOps[Self <: IExpandingCardStyleProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompactCardHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compactCardHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompactCardHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compactCardHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandedCardFirstFrameRendered(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedCardFirstFrameRendered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandedCardFirstFrameRendered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedCardFirstFrameRendered")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandedCardHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedCardHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandedCardHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedCardHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withNeedsScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needsScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeedsScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needsScroll")(js.undefined)
        ret
    }
  }
  
}

