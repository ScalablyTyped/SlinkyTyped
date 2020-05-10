package typingsSlinky.fluentuiReactFocus.focusZoneTypesMod

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import typingsSlinky.fluentuiReactFocus.focusZoneFocusZoneMod.FocusZone
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFocusZoneProps extends HTMLAttributes[HTMLElement | FocusZone] {
  /** Allow focus to move to root */
  var allowFocusRoot: js.UndefOr[Boolean] = js.native
  /**
    * Allows tab key to be handled to tab through a list of items in the focus zone,
    * an unfortunate side effect is that users will not be able to tab out of the focus zone
    * and have to hit escape or some other key.
    * @deprecated Use `handleTabKey` instead.
    *
    */
  var allowTabKey: js.UndefOr[Boolean] = js.native
  /**
    * Sets the aria-describedby attribute.
    * @deprecated Directly use the `aria-describedby` attribute instead
    */
  var ariaDescribedBy: js.UndefOr[String] = js.native
  /**
    * Sets the aria-labelledby attribute.
    * @deprecated Directly use the `aria-labelledby` attribute instead
    */
  var ariaLabelledBy: js.UndefOr[String] = js.native
  /**
    * A component that should be used as the root element of the FocusZone component.
    */
  var as: js.UndefOr[ReactElement] = js.native
  /**
    * Whether the to check for data-no-horizontal-wrap or data-no-vertical-wrap attributes
    * when determining how to move focus
    * @defaultvalue false
    */
  var checkForNoWrap: js.UndefOr[Boolean] = js.native
  /**
    * Optional callback to access the IFocusZone interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[IFocusZone]] = js.native
  /**
    * Optionally provide a selector for identifying the intial active element.
    */
  var defaultActiveElement: js.UndefOr[String] = js.native
  /**
    * Defines which arrows to react to.
    * @defaultvalue FocusZoneDirection.bidirectional
    */
  var direction: js.UndefOr[FocusZoneDirection] = js.native
  /**
    * If set, the FocusZone will not be tabbable and keyboard navigation will be disabled.
    * This does not affect disabled attribute of any child.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether the FocusZone should allow focus events to propagate past the FocusZone
    */
  var doNotAllowFocusEventToPropagate: js.UndefOr[Boolean] = js.native
  /**
    * Element type the root element will use. Default is "div".
    * @deprecated Use 'as' instead.
    */
  var elementType: js.UndefOr[js.Any] = js.native
  /**
    * Allows tab key to be handled to tab through a list of items in the focus zone,
    * an unfortunate side effect is that users will not be able to tab out of the focus zone
    * and have to hit escape or some other key.
    */
  var handleTabKey: js.UndefOr[FocusZoneTabbableElements] = js.native
  /**
    * If set, will cycle to the beginning of the targets once the user navigates to the
    * next target while at the end, and to the end when navigate to the previous at the beginning.
    */
  var isCircularNavigation: js.UndefOr[Boolean] = js.native
  /**
    * If provided, this callback will be executed on keypresses to determine if the user
    * intends to navigate into the inner zone. Returning true will ask the first inner zone to
    * set focus.
    */
  var isInnerZoneKeystroke: js.UndefOr[js.Function1[/* ev */ SyntheticKeyboardEvent[HTMLElement], Boolean]] = js.native
  /**
    * Callback for when one of immediate children elements gets active by getting focused
    * or by having one of its respective children elements focused.
    */
  var onActiveElementChanged: js.UndefOr[
    js.Function2[
      /* element */ js.UndefOr[HTMLElement], 
      /* ev */ js.UndefOr[SyntheticFocusEvent[HTMLElement]], 
      Unit
    ]
  ] = js.native
  /**
    * Callback method for determining if focus should indeed be set on the given element.
    * @param element - The child element within the zone to focus.
    * @returns True if focus should be set to the given element, false to avoid setting focus.
    */
  var onBeforeFocus: js.UndefOr[js.Function1[/* childElement */ js.UndefOr[HTMLElement], Boolean]] = js.native
  /**
    * Callback to notify creators that focus has been set on the FocusZone
    */
  var onFocusNotification: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Deprecated at v1.12.1. DIV props provided to the FocusZone will be mixed into the root element.
    * @deprecated DIV props provided to the FocusZone will be mixed into the root element.
    */
  var rootProps: js.UndefOr[HTMLAttributes[HTMLDivElement]] = js.native
  /**
    * A callback method to determine if the input element should lose focus on arrow keys
    *  @param inputElement - The input element which is to loose focus.
    *  @returns True if input element should loose focus or false otherwise.
    */
  var shouldInputLoseFocusOnArrowKey: js.UndefOr[js.Function1[/* inputElement */ HTMLInputElement, Boolean]] = js.native
}

object IFocusZoneProps {
  @scala.inline
  def apply(): IFocusZoneProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFocusZoneProps]
  }
  @scala.inline
  implicit class IFocusZonePropsOps[Self <: IFocusZoneProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowFocusRoot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowFocusRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowFocusRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowFocusRoot")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowTabKey(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowTabKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowTabKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowTabKey")(js.undefined)
        ret
    }
    @scala.inline
    def withAriaDescribedBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaDescribedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaDescribedBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaDescribedBy")(js.undefined)
        ret
    }
    @scala.inline
    def withAriaLabelledBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabelledBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaLabelledBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabelledBy")(js.undefined)
        ret
    }
    @scala.inline
    def withAsFunctionComponent(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAsComponentClass(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAs(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckForNoWrap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkForNoWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckForNoWrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkForNoWrap")(js.undefined)
        ret
    }
    @scala.inline
    def withComponentRefFunction1(value: /* ref */ IFocusZone | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withComponentRefRefObject(value: ReactRef[IFocusZone]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentRef(value: IRefObject[IFocusZone]): Self = {
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
    def withDefaultActiveElement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultActiveElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultActiveElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultActiveElement")(js.undefined)
        ret
    }
    @scala.inline
    def withDirection(value: FocusZoneDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withDoNotAllowFocusEventToPropagate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doNotAllowFocusEventToPropagate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoNotAllowFocusEventToPropagate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doNotAllowFocusEventToPropagate")(js.undefined)
        ret
    }
    @scala.inline
    def withElementType(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElementType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementType")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleTabKey(value: FocusZoneTabbableElements): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleTabKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandleTabKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleTabKey")(js.undefined)
        ret
    }
    @scala.inline
    def withIsCircularNavigation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCircularNavigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsCircularNavigation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCircularNavigation")(js.undefined)
        ret
    }
    @scala.inline
    def withIsInnerZoneKeystroke(value: /* ev */ SyntheticKeyboardEvent[HTMLElement] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInnerZoneKeystroke")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIsInnerZoneKeystroke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInnerZoneKeystroke")(js.undefined)
        ret
    }
    @scala.inline
    def withOnActiveElementChanged(
      value: (/* element */ js.UndefOr[HTMLElement], /* ev */ js.UndefOr[SyntheticFocusEvent[HTMLElement]]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onActiveElementChanged")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnActiveElementChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onActiveElementChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBeforeFocus(value: /* childElement */ js.UndefOr[HTMLElement] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeFocus")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnBeforeFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFocusNotification(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocusNotification")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnFocusNotification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocusNotification")(js.undefined)
        ret
    }
    @scala.inline
    def withRootProps(value: HTMLAttributes[HTMLDivElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootProps")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldInputLoseFocusOnArrowKey(value: /* inputElement */ HTMLInputElement => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldInputLoseFocusOnArrowKey")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutShouldInputLoseFocusOnArrowKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldInputLoseFocusOnArrowKey")(js.undefined)
        ret
    }
  }
  
}

