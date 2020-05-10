package typingsSlinky.reactStickyEl.mod.Sticky

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.reactStickyEl.reactStickyElStrings.bottom
import typingsSlinky.reactStickyEl.reactStickyElStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props[HolderProps /* <: js.Object */] extends HTMLAttributes[HTMLElement] {
  /**
    * Sticky state will be triggered when the bottom of the element is
    * `bottomOffset` pixels from the bottom of the `scrollElement`.
    *
    * Defaults to `0`.
    */
  var bottomOffset: js.UndefOr[Double] = js.native
  /**
    * Selector to define a `boundaryElement`. It should be one of the parents
    * of the current element.
    *
    * Defaults to `null`.
    */
  var boundaryElement: js.UndefOr[String] = js.native
  /**
    * Allows you to disable sticking by setting this prop to `true`.
    *
    * Defaults to `false`.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * If `false` then boundaryEl should have position: relative. In this case
    * sticky element won't disappear on reaching it's boundaries.
    *
    * Defaults to `true`.
    */
  var hideOnBoundaryHit: js.UndefOr[Boolean] = js.native
  /**
    * Anything that can be used by React.createElement. Used for holder
    * element. If you want to use some custom component, please be sure that
    * you don't lose style and className props.
    *
    * Defaults to 'div'.
    */
  var holderCmp: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 118 */ js.Any
  ] = js.native
  /**
    * These props will be used to create `holderElement`.
    */
  var holderProps: js.UndefOr[HolderProps] = js.native
  /**
    * 'top' or 'bottom' - to which side element should stick.
    *
    * Defaults to 'top'.
    */
  var mode: js.UndefOr[top | bottom] = js.native
  /**
    * This handler will be called right before changing `fixed` state.
    *
    * Defaults to `null`.
    */
  var onFixedToggle: js.UndefOr[js.Function1[/* fixed */ Boolean, Unit]] = js.native
  /**
    * If your DOM structure is mutating (you are adding/removing elements), it
    * will be usefull to provide `positionRecheckInterval` greater than zero,
    * in this case position check will be also performed using setInterval in
    * addition to scroll events.
    *
    * Defaults to `0`.
    */
  var positionRecheckInterval: js.UndefOr[Double] = js.native
  /**
    * Selector to define a `scrollElement`. All position checks will be
    * performed according to this element, also it will be listened for
    * 'scroll' event.
    *
    * It should be one of the parents of the current element. Possible
    * selectors: 'body', 'window', '#{id}', anything suitable for
    * `Element.matches`.
    *
    * Defaults to `window`.
    */
  var scrollElement: js.UndefOr[String] = js.native
  /**
    * You can also specify a class name to be applied when the element becomes
    * sticky.
    *
    * Defaults to 'sticky'.
    */
  var stickyClassName: js.UndefOr[String] = js.native
  /**
    * In the event that you wish to override the style rules applied, simply
    * pass in the style object as a prop.
    *
    * Note: You likely want to avoid messing with the following attributes in
    * your stickyStyle: `left`, `top`, and `width`.
    */
  var stickyStyle: js.UndefOr[CSSProperties] = js.native
  /**
    * Sticky state will be triggered when the top of the element is `topOffset`
    * pixels from the top of the `scrollElement`. Positive numbers give the
    * impression of a lazy sticky state, whereas negative numbers are more
    * eager in their attachment.
    *
    * Defaults to `0`.
    */
  var topOffset: js.UndefOr[Double] = js.native
  /**
    * Anything that can be used by `React.createElement`. Used for `wrapper
    * element`. If you want to use some custom component, please be sure that
    * you don't lose `style` and `className` props.
    *
    * Defaults to 'div'.
    */
  var wrapperCmp: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 118 */ js.Any
  ] = js.native
}

object Props {
  @scala.inline
  def apply[HolderProps](): Props[HolderProps] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Props[HolderProps]]
  }
  @scala.inline
  implicit class PropsOps[Self[holderprops] <: Props[holderprops], HolderProps] (val x: Self[HolderProps]) extends AnyVal {
    @scala.inline
    def duplicate: Self[HolderProps] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[HolderProps]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[HolderProps] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[HolderProps] with Other]
    @scala.inline
    def withBottomOffset(value: Double): Self[HolderProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBottomOffset: Self[HolderProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withBoundaryElement(value: String): Self[HolderProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundaryElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoundaryElement: Self[HolderProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundaryElement")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self[HolderProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self[HolderProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withHideOnBoundaryHit(value: Boolean): Self[HolderProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideOnBoundaryHit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideOnBoundaryHit: Self[HolderProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideOnBoundaryHit")(js.undefined)
        ret
    }
    @scala.inline
    def withHolderCmp(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 118 */ js.Any): Self[HolderProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("holderCmp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHolderCmp: Self[HolderProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("holderCmp")(js.undefined)
        ret
    }
    @scala.inline
    def withHolderProps(value: HolderProps): Self[HolderProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("holderProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHolderProps: Self[HolderProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("holderProps")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: top | bottom): Self[HolderProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self[HolderProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFixedToggle(value: /* fixed */ Boolean => Unit): Self[HolderProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFixedToggle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFixedToggle: Self[HolderProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFixedToggle")(js.undefined)
        ret
    }
    @scala.inline
    def withPositionRecheckInterval(value: Double): Self[HolderProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionRecheckInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositionRecheckInterval: Self[HolderProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionRecheckInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollElement(value: String): Self[HolderProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollElement: Self[HolderProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollElement")(js.undefined)
        ret
    }
    @scala.inline
    def withStickyClassName(value: String): Self[HolderProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickyClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStickyClassName: Self[HolderProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickyClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withStickyStyle(value: CSSProperties): Self[HolderProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickyStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStickyStyle: Self[HolderProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickyStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTopOffset(value: Double): Self[HolderProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopOffset: Self[HolderProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapperCmp(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 118 */ js.Any): Self[HolderProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapperCmp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapperCmp: Self[HolderProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapperCmp")(js.undefined)
        ret
    }
  }
  
}

