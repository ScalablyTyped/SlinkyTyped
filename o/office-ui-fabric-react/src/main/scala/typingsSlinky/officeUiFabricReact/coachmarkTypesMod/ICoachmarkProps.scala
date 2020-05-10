package typingsSlinky.officeUiFabricReact.coachmarkTypesMod

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import slinky.core.facade.ReactRef
import typingsSlinky.officeUiFabricReact.coachmarkBaseMod.CoachmarkBase
import typingsSlinky.officeUiFabricReact.positioningContainerTypesMod.IPositioningContainerProps
import typingsSlinky.officeUiFabricReact.teachingBubbleTypesMod.ITeachingBubble
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.std.Partial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICoachmarkProps extends ClassAttributes[CoachmarkBase] {
  /**
    * Text to announce to screen reader / narrator when Coachmark is displayed
    */
  var ariaAlertText: js.UndefOr[String] = js.native
  /**
    * Defines the element id referencing the element containing the description for the Coachmark.
    */
  var ariaDescribedBy: js.UndefOr[String] = js.native
  /**
    * Defines the text content for the ariaDescribedBy element
    */
  var ariaDescribedByText: js.UndefOr[String] = js.native
  /**
    *  Defines the element id referencing the element containing label text for Coachmark.
    */
  var ariaLabelledBy: js.UndefOr[String] = js.native
  /**
    *  Defines the text content for the ariaLabelledBy element
    */
  var ariaLabelledByText: js.UndefOr[String] = js.native
  /**
    * Beacon color one.
    */
  var beaconColorOne: js.UndefOr[String] = js.native
  /**
    * Beacon color two.
    */
  var beaconColorTwo: js.UndefOr[String] = js.native
  /**
    * The height of the Beak component.
    * @deprecated No longer used.
    */
  var beakHeight: js.UndefOr[Double] = js.native
  /**
    * The width of the Beak component.
    * @deprecated No longer used.
    */
  var beakWidth: js.UndefOr[Double] = js.native
  /**
    * If provided, additional class name to provide on the root element.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * The starting collapsed state for the Coachmark.  Use `isCollapsed` instead.
    * @defaultvalue true
    * @deprecated Use `isCollapsed` instead.
    */
  var collapsed: js.UndefOr[Boolean] = js.native
  /**
    * Color of the Coachmark/TeachingBubble.
    */
  var color: js.UndefOr[String] = js.native
  /**
    * Optional callback to access the ICoachmark interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[ICoachmark]] = js.native
  /**
    * Delay in milliseconds before Coachmark animation appears.
    * @defaultvalue 0
    */
  var delayBeforeCoachmarkAnimation: js.UndefOr[Double] = js.native
  /**
    * Delay before allowing mouse movements to open the Coachmark.
    * @defaultvalue 3600
    */
  var delayBeforeMouseOpen: js.UndefOr[Double] = js.native
  /**
    * The height of the Coachmark.
    * @deprecated No longer used.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * The starting collapsed state for the Coachmark.
    * @defaultvalue true
    */
  var isCollapsed: js.UndefOr[Boolean] = js.native
  /**
    * Whether or not to force the Coachmark/TeachingBubble content to fit within the window bounds.
    * @defaultvalue true
    */
  var isPositionForced: js.UndefOr[Boolean] = js.native
  /**
    * The distance in pixels the mouse is located
    * before opening up the Coachmark.
    * @defaultvalue 10
    */
  var mouseProximityOffset: js.UndefOr[Double] = js.native
  /**
    * Callback when the opening animation completes.
    */
  var onAnimationOpenEnd: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Callback when the opening animation begins.
    */
  var onAnimationOpenStart: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Callback when the Coachmark tries to close.
    */
  var onDismiss: js.UndefOr[js.Function1[/* ev */ js.UndefOr[js.Any], Unit]] = js.native
  /**
    * Callback to run when the mouse moves.
    */
  var onMouseMove: js.UndefOr[js.Function1[/* e */ MouseEvent, Unit]] = js.native
  /**
    * If true then the Coachmark beak (arrow pointing towards target) will always be visible as long as
    * Coachmark is visible
    * @defaultvalue false
    */
  var persistentBeak: js.UndefOr[Boolean] = js.native
  /**
    * Props to pass to the PositioningContainer component. Specify the `directionalHint` to indicate
    * on which edge the Coachmark/TeachingBubble should be positioned.
    * @defaultvalue directionalHint: DirectionalHint.bottomAutoEdge
    */
  var positioningContainerProps: js.UndefOr[IPositioningContainerProps] = js.native
  /**
    * If true then the Coachmark will not dismiss when it loses focus
    * @defaultvalue false
    */
  var preventDismissOnLostFocus: js.UndefOr[Boolean] = js.native
  /**
    * If true then focus will not be set to the Coachmark when it mounts. Useful in cases where focus on coachmark
    * is causing other components in page to dismiss upon losing focus.
    * @defaultvalue false
    */
  var preventFocusOnMount: js.UndefOr[Boolean] = js.native
  /**
    * Call to provide customized styling that will layer on top of the variant rules
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[ICoachmarkStyleProps, ICoachmarkStyles]] = js.native
  /**
    * The target that the Coachmark should try to position itself based on.
    */
  var target: HTMLElement | String | Null = js.native
  /**
    * Ref for TeachingBubble
    * @deprecated Coachmark uses `focusFirstChild` utility instead to focus on TeachingBubbleContent
    */
  var teachingBubbleRef: js.UndefOr[ITeachingBubble] = js.native
  /**
    * Theme provided by higher order component.
    */
  var theme: js.UndefOr[ITheme] = js.native
  /**
    * The width of the Coachmark.
    * @deprecated No longer used.
    */
  var width: js.UndefOr[Double] = js.native
}

object ICoachmarkProps {
  @scala.inline
  def apply(): ICoachmarkProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICoachmarkProps]
  }
  @scala.inline
  implicit class ICoachmarkPropsOps[Self <: ICoachmarkProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAriaAlertText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaAlertText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaAlertText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaAlertText")(js.undefined)
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
    def withAriaDescribedByText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaDescribedByText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaDescribedByText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaDescribedByText")(js.undefined)
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
    def withAriaLabelledByText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabelledByText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaLabelledByText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabelledByText")(js.undefined)
        ret
    }
    @scala.inline
    def withBeaconColorOne(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beaconColorOne")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeaconColorOne: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beaconColorOne")(js.undefined)
        ret
    }
    @scala.inline
    def withBeaconColorTwo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beaconColorTwo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeaconColorTwo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beaconColorTwo")(js.undefined)
        ret
    }
    @scala.inline
    def withBeakHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beakHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeakHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beakHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withBeakWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beakWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeakWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beakWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapsed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsed")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withComponentRefFunction1(value: /* ref */ ICoachmark | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withComponentRefRefObject(value: ReactRef[ICoachmark]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentRef(value: IRefObject[ICoachmark]): Self = {
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
    def withDelayBeforeCoachmarkAnimation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayBeforeCoachmarkAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelayBeforeCoachmarkAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayBeforeCoachmarkAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withDelayBeforeMouseOpen(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayBeforeMouseOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelayBeforeMouseOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayBeforeMouseOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withIsCollapsed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCollapsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsCollapsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCollapsed")(js.undefined)
        ret
    }
    @scala.inline
    def withIsPositionForced(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPositionForced")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsPositionForced: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPositionForced")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseProximityOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseProximityOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMouseProximityOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseProximityOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAnimationOpenEnd(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnimationOpenEnd")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnAnimationOpenEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnimationOpenEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAnimationOpenStart(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnimationOpenStart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnAnimationOpenStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnimationOpenStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDismiss(value: /* ev */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDismiss")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDismiss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDismiss")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseMove(value: /* e */ MouseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseMove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseMove")(js.undefined)
        ret
    }
    @scala.inline
    def withPersistentBeak(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistentBeak")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersistentBeak: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistentBeak")(js.undefined)
        ret
    }
    @scala.inline
    def withPositioningContainerProps(value: IPositioningContainerProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positioningContainerProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositioningContainerProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positioningContainerProps")(js.undefined)
        ret
    }
    @scala.inline
    def withPreventDismissOnLostFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDismissOnLostFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreventDismissOnLostFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDismissOnLostFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withPreventFocusOnMount(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventFocusOnMount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreventFocusOnMount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventFocusOnMount")(js.undefined)
        ret
    }
    @scala.inline
    def withStylesFunction1(value: ICoachmarkStyleProps => Partial[ICoachmarkStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStyles(value: IStyleFunctionOrObject[ICoachmarkStyleProps, ICoachmarkStyles]): Self = {
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
    def withTargetNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(null)
        ret
    }
    @scala.inline
    def withTeachingBubbleRef(value: ITeachingBubble): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teachingBubbleRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTeachingBubbleRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teachingBubbleRef")(js.undefined)
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
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

