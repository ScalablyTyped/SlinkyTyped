package typingsSlinky.officeUiFabricReact.hoverCardTypesMod

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactRef
import typingsSlinky.officeUiFabricReact.expandingCardTypesMod.IExpandingCardProps
import typingsSlinky.officeUiFabricReact.plainCardTypesMod.IPlainCardProps
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.std.Partial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import typingsSlinky.uifabricUtilities.keyCodesMod.KeyCodes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHoverCardProps extends HTMLAttributes[HTMLDivElement] {
  /**
    * Length of card dismiss delay. A min number is necessary for pointer to hop between target and card
    * @defaultvalue 100
    */
  var cardDismissDelay: js.UndefOr[Double] = js.native
  /**
    * Length of compact card delay
    * @defaultvalue 500
    */
  var cardOpenDelay: js.UndefOr[Double] = js.native
  /**
    * Optional callback to access the IHoverCardHost interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[IHoverCard]] = js.native
  /**
    * This prop is to separate the target to anchor hover card from the target to attach event listener.
    * If set, this prop separates the target to anchor the hover card from the target to attach the event listener.
    * When no `eventListenerTarget` given, HoverCard will use `target` prop or its root to set event listener.
    */
  var eventListenerTarget: js.UndefOr[HTMLElement | String | Null] = js.native
  /**
    * Time in ms when expanded card should open after compact card
    * @defaultvalue 1500
    */
  var expandedCardOpenDelay: js.UndefOr[Double] = js.native
  /**
    * Additional ExpandingCard props to pass through HoverCard like renderers, target. gapSpace etc.
    * Used along with 'type' prop set to HoverCardType.expanding.
    * Reference detail properties in ICardProps and IExpandingCardProps.
    */
  var expandingCardProps: js.UndefOr[IExpandingCardProps] = js.native
  /**
    * Enables instant open of the full card upon click
    * @defaultvalue false
    */
  var instantOpenOnClick: js.UndefOr[Boolean] = js.native
  /**
    * Callback when visible card is expanded.
    */
  var onCardExpand: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Callback when card hides
    */
  var onCardHide: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Callback when card becomes visible
    */
  var onCardVisible: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * HotKey used for opening the HoverCard when tabbed to target.
    * @defaultvalue 'KeyCodes.c'
    */
  var openHotKey: js.UndefOr[KeyCodes] = js.native
  /**
    * Additional PlainCard props to pass through HoverCard like renderers, target, gapSpace etc.
    * Used along with 'type' prop set to HoverCardType.plain.
    * See for more details ICardProps and IPlainCardProps interfaces.
    */
  var plainCardProps: js.UndefOr[IPlainCardProps] = js.native
  /**
    * Whether or not to mark the container as described by the hover card.
    * If not specified, the caller should mark as element as described by the hover card id.
    */
  var setAriaDescribedBy: js.UndefOr[Boolean] = js.native
  /**
    * Set to true to set focus on the first focusable element in the card. Works in pair with the 'trapFocus' prop.
    * @defaultvalue false
    */
  var setInitialFocus: js.UndefOr[Boolean] = js.native
  /**
    * Should block hover card or not
    */
  var shouldBlockHoverCard: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * If true disables Card dismiss upon mouse leave, so that card sticks around.
    * @defaultvalue false
    */
  var sticky: js.UndefOr[Boolean] = js.native
  /**
    * Custom styles for this component
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IHoverCardStyleProps, IHoverCardStyles]] = js.native
  /**
    * Optional target element to tag hover card on. If not provided and using HoverCard as a wrapper, don't set the
    * 'data-is-focusable=true' attribute to the root of the wrapped child.
    * If no target is given, HoverCard will use its root as a target and become the focusable element with a
    * focus listener attached to it.
    */
  var target: js.UndefOr[HTMLElement | String | Null] = js.native
  /**
    * Theme provided by higher order component.
    */
  var theme: js.UndefOr[ITheme] = js.native
  /**
    * Set to true if you want to render the content of the HoverCard in a FocusTrapZone for accessibility reasons.
    * Optionally 'setInitialFocus' prop can be set to true to move focus inside the FocusTrapZone.
    */
  var trapFocus: js.UndefOr[Boolean] = js.native
  /**
    * Type of the hover card to render.
    * @defaultvalue HoverCardType.expanding
    */
  var `type`: js.UndefOr[HoverCardType] = js.native
}

object IHoverCardProps {
  @scala.inline
  def apply(): IHoverCardProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHoverCardProps]
  }
  @scala.inline
  implicit class IHoverCardPropsOps[Self <: IHoverCardProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCardDismissDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardDismissDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCardDismissDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardDismissDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withCardOpenDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardOpenDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCardOpenDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardOpenDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withComponentRefFunction1(value: /* ref */ IHoverCard | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withComponentRefRefObject(value: ReactRef[IHoverCard]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentRef(value: IRefObject[IHoverCard]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponentRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.undefined)
        ret
    }
    @scala.inline
    def withEventListenerTargetHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventListenerTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventListenerTarget(value: HTMLElement | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventListenerTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventListenerTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventListenerTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withEventListenerTargetNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventListenerTarget")(null)
        ret
    }
    @scala.inline
    def withExpandedCardOpenDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedCardOpenDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandedCardOpenDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedCardOpenDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandingCardProps(value: IExpandingCardProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandingCardProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandingCardProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandingCardProps")(js.undefined)
        ret
    }
    @scala.inline
    def withInstantOpenOnClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instantOpenOnClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstantOpenOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instantOpenOnClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCardExpand(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCardExpand")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnCardExpand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCardExpand")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCardHide(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCardHide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnCardHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCardHide")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCardVisible(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCardVisible")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnCardVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCardVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenHotKey(value: KeyCodes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openHotKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenHotKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openHotKey")(js.undefined)
        ret
    }
    @scala.inline
    def withPlainCardProps(value: IPlainCardProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plainCardProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlainCardProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plainCardProps")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAriaDescribedBy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAriaDescribedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetAriaDescribedBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAriaDescribedBy")(js.undefined)
        ret
    }
    @scala.inline
    def withSetInitialFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setInitialFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetInitialFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setInitialFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldBlockHoverCard(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldBlockHoverCard")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutShouldBlockHoverCard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldBlockHoverCard")(js.undefined)
        ret
    }
    @scala.inline
    def withSticky(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sticky")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSticky: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sticky")(js.undefined)
        ret
    }
    @scala.inline
    def withStylesFunction1(value: IHoverCardStyleProps => Partial[IHoverCardStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStyles(value: IStyleFunctionOrObject[IHoverCardStyleProps, IHoverCardStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: HTMLElement | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(null)
        ret
    }
    @scala.inline
    def withTheme(value: ITheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
    @scala.inline
    def withTrapFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trapFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrapFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trapFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: HoverCardType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

