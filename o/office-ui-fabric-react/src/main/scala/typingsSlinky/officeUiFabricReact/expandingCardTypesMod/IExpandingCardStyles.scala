package typingsSlinky.officeUiFabricReact.expandingCardTypesMod

import typingsSlinky.officeUiFabricReact.baseCardTypesMod.IBaseCardStyles
import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IExpandingCardStyles extends IBaseCardStyles {
  /**
    * Style for the main card element.
    */
  var compactCard: js.UndefOr[IStyle] = js.native
  /**
    * Base Style for the expanded card content.
    */
  var expandedCard: js.UndefOr[IStyle] = js.native
  /**
    * Style for the expanded card scroll content.
    */
  var expandedCardScroll: js.UndefOr[IStyle] = js.native
}

object IExpandingCardStyles {
  @scala.inline
  def apply(): IExpandingCardStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IExpandingCardStyles]
  }
  @scala.inline
  implicit class IExpandingCardStylesOps[Self <: IExpandingCardStyles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompactCard(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compactCard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompactCard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compactCard")(js.undefined)
        ret
    }
    @scala.inline
    def withCompactCardNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compactCard")(null)
        ret
    }
    @scala.inline
    def withExpandedCard(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedCard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandedCard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedCard")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandedCardNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedCard")(null)
        ret
    }
    @scala.inline
    def withExpandedCardScroll(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedCardScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandedCardScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedCardScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandedCardScrollNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedCardScroll")(null)
        ret
    }
  }
  
}

