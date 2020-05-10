package typingsSlinky.officeUiFabricReact.expandingCardTypesMod

import slinky.core.facade.ReactElement
import typingsSlinky.officeUiFabricReact.baseCardTypesMod.IBaseCardProps
import typingsSlinky.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IExpandingCardProps extends IBaseCardProps[IExpandingCard, IExpandingCardStyles, IExpandingCardStyleProps] {
  /**
    * Height of compact card
    * @defaultvalue 156
    */
  var compactCardHeight: js.UndefOr[Double] = js.native
  /**
    * Height of expanded card
    * @defaultvalue 384
    */
  var expandedCardHeight: js.UndefOr[Double] = js.native
  /**
    * Use to open the card in expanded format and not wait for the delay
    * @defaultvalue ExpandingCardMode.compact
    */
  var mode: js.UndefOr[ExpandingCardMode] = js.native
  /**
    *  Render function to populate compact content area
    */
  var onRenderCompactCard: js.UndefOr[IRenderFunction[_]] = js.native
  /**
    *  Render function to populate expanded content area
    */
  var onRenderExpandedCard: js.UndefOr[IRenderFunction[_]] = js.native
}

object IExpandingCardProps {
  @scala.inline
  def apply(): IExpandingCardProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IExpandingCardProps]
  }
  @scala.inline
  implicit class IExpandingCardPropsOps[Self <: IExpandingCardProps] (val x: Self) extends AnyVal {
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
    def withMode(value: ExpandingCardMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderCompactCard(
      value: (/* props */ js.UndefOr[_], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[_], ReactElement | Null]]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderCompactCard")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRenderCompactCard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderCompactCard")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderExpandedCard(
      value: (/* props */ js.UndefOr[_], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[_], ReactElement | Null]]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderExpandedCard")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRenderExpandedCard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderExpandedCard")(js.undefined)
        ret
    }
  }
  
}

