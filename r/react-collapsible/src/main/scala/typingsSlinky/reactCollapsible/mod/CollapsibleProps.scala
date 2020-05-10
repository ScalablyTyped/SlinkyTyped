package typingsSlinky.reactCollapsible.mod

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.reactCollapsible.reactCollapsibleStrings.auto
import typingsSlinky.reactCollapsible.reactCollapsibleStrings.hidden
import typingsSlinky.reactCollapsible.reactCollapsibleStrings.inherit
import typingsSlinky.reactCollapsible.reactCollapsibleStrings.initial
import typingsSlinky.reactCollapsible.reactCollapsibleStrings.scroll
import typingsSlinky.reactCollapsible.reactCollapsibleStrings.unset
import typingsSlinky.reactCollapsible.reactCollapsibleStrings.visible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollapsibleProps
  extends AllHTMLAttributes[Collapsible]
     with ClassAttributes[Collapsible] {
  var accordionPosition: js.UndefOr[String | Double] = js.native
  var classParentString: js.UndefOr[String] = js.native
  var contentContainerTagName: js.UndefOr[String] = js.native
  var contentInnerClassName: js.UndefOr[String] = js.native
  var contentOuterClassName: js.UndefOr[String] = js.native
  var easing: js.UndefOr[String] = js.native
  var handleTriggerClick: js.UndefOr[js.Function1[/* accordionPosition */ js.UndefOr[String | Double], Unit]] = js.native
  var lazyRender: js.UndefOr[Boolean] = js.native
  var onClose: js.UndefOr[js.Function0[Unit]] = js.native
  var onClosing: js.UndefOr[js.Function0[Unit]] = js.native
  var onOpen: js.UndefOr[js.Function0[Unit]] = js.native
  var onOpening: js.UndefOr[js.Function0[Unit]] = js.native
  var openedClassName: js.UndefOr[String] = js.native
  var overflowWhenOpen: js.UndefOr[hidden | visible | auto | scroll | inherit | initial | unset] = js.native
  var transitionCloseTime: js.UndefOr[Double | Null] = js.native
  var transitionTime: js.UndefOr[Double] = js.native
  var trigger: String | ReactElement = js.native
  var triggerClassName: js.UndefOr[String] = js.native
  var triggerDisabled: js.UndefOr[Boolean] = js.native
  var triggerOpenedClassName: js.UndefOr[String] = js.native
  var triggerSibling: js.UndefOr[ReactElement] = js.native
  var triggerStyle: js.UndefOr[Null | CSSProperties] = js.native
  var triggerTagName: js.UndefOr[String] = js.native
  var triggerWhenOpen: js.UndefOr[String | ReactElement] = js.native
}

object CollapsibleProps {
  @scala.inline
  def apply(trigger: String | ReactElement): CollapsibleProps = {
    val __obj = js.Dynamic.literal(trigger = trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollapsibleProps]
  }
  @scala.inline
  implicit class CollapsiblePropsOps[Self <: CollapsibleProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTriggerReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrigger(value: String | ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccordionPosition(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accordionPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccordionPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accordionPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withClassParentString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classParentString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassParentString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classParentString")(js.undefined)
        ret
    }
    @scala.inline
    def withContentContainerTagName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentContainerTagName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentContainerTagName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentContainerTagName")(js.undefined)
        ret
    }
    @scala.inline
    def withContentInnerClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentInnerClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentInnerClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentInnerClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withContentOuterClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentOuterClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentOuterClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentOuterClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withEasing(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEasing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleTriggerClick(value: /* accordionPosition */ js.UndefOr[String | Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleTriggerClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHandleTriggerClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleTriggerClick")(js.undefined)
        ret
    }
    @scala.inline
    def withLazyRender(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazyRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLazyRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazyRender")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClosing(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClosing")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnClosing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClosing")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOpen(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpen")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOpening(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpening")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnOpening: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpening")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenedClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openedClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenedClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openedClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withOverflowWhenOpen(value: hidden | visible | auto | scroll | inherit | initial | unset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowWhenOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverflowWhenOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowWhenOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionCloseTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionCloseTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionCloseTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionCloseTime")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionCloseTimeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionCloseTime")(null)
        ret
    }
    @scala.inline
    def withTransitionTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionTime")(js.undefined)
        ret
    }
    @scala.inline
    def withTriggerClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTriggerClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withTriggerDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTriggerDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withTriggerOpenedClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerOpenedClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTriggerOpenedClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerOpenedClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withTriggerSibling(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerSibling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTriggerSibling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerSibling")(js.undefined)
        ret
    }
    @scala.inline
    def withTriggerStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTriggerStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTriggerStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerStyle")(null)
        ret
    }
    @scala.inline
    def withTriggerTagName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerTagName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTriggerTagName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerTagName")(js.undefined)
        ret
    }
    @scala.inline
    def withTriggerWhenOpenReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerWhenOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTriggerWhenOpen(value: String | ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerWhenOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTriggerWhenOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerWhenOpen")(js.undefined)
        ret
    }
  }
  
}

