package typingsSlinky.officeUiFabricReact.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.officeUiFabricReact.coachmarkTypesMod.ICoachmark
import typingsSlinky.officeUiFabricReact.coachmarkTypesMod.ICoachmarkProps
import typingsSlinky.officeUiFabricReact.coachmarkTypesMod.ICoachmarkStyleProps
import typingsSlinky.officeUiFabricReact.coachmarkTypesMod.ICoachmarkStyles
import typingsSlinky.officeUiFabricReact.positioningContainerTypesMod.IPositioningContainerProps
import typingsSlinky.officeUiFabricReact.teachingBubbleTypesMod.ITeachingBubble
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CoachmarkBase
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.officeUiFabricReact.mod.CoachmarkBase] {
  @JSImport("office-ui-fabric-react", "CoachmarkBase")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    ariaAlertText: String = null,
    ariaDescribedBy: String = null,
    ariaDescribedByText: String = null,
    ariaLabelledBy: String = null,
    ariaLabelledByText: String = null,
    beaconColorOne: String = null,
    beaconColorTwo: String = null,
    beakHeight: Int | Double = null,
    beakWidth: Int | Double = null,
    collapsed: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    componentRef: IRefObject[ICoachmark] = null,
    delayBeforeCoachmarkAnimation: Int | Double = null,
    delayBeforeMouseOpen: Int | Double = null,
    height: Int | Double = null,
    isCollapsed: js.UndefOr[Boolean] = js.undefined,
    isPositionForced: js.UndefOr[Boolean] = js.undefined,
    mouseProximityOffset: Int | Double = null,
    onAnimationOpenEnd: () => Unit = null,
    onAnimationOpenStart: () => Unit = null,
    onDismiss: /* ev */ js.UndefOr[js.Any] => Unit = null,
    onMouseMove: /* e */ MouseEvent => Unit = null,
    persistentBeak: js.UndefOr[Boolean] = js.undefined,
    positioningContainerProps: IPositioningContainerProps = null,
    preventDismissOnLostFocus: js.UndefOr[Boolean] = js.undefined,
    preventFocusOnMount: js.UndefOr[Boolean] = js.undefined,
    styles: IStyleFunctionOrObject[ICoachmarkStyleProps, ICoachmarkStyles] = null,
    target: HTMLElement | String = null,
    teachingBubbleRef: ITeachingBubble = null,
    theme: ITheme = null,
    width: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.officeUiFabricReact.mod.CoachmarkBase] = {
    val __obj = js.Dynamic.literal()
    if (ariaAlertText != null) __obj.updateDynamic("ariaAlertText")(ariaAlertText.asInstanceOf[js.Any])
    if (ariaDescribedBy != null) __obj.updateDynamic("ariaDescribedBy")(ariaDescribedBy.asInstanceOf[js.Any])
    if (ariaDescribedByText != null) __obj.updateDynamic("ariaDescribedByText")(ariaDescribedByText.asInstanceOf[js.Any])
    if (ariaLabelledBy != null) __obj.updateDynamic("ariaLabelledBy")(ariaLabelledBy.asInstanceOf[js.Any])
    if (ariaLabelledByText != null) __obj.updateDynamic("ariaLabelledByText")(ariaLabelledByText.asInstanceOf[js.Any])
    if (beaconColorOne != null) __obj.updateDynamic("beaconColorOne")(beaconColorOne.asInstanceOf[js.Any])
    if (beaconColorTwo != null) __obj.updateDynamic("beaconColorTwo")(beaconColorTwo.asInstanceOf[js.Any])
    if (beakHeight != null) __obj.updateDynamic("beakHeight")(beakHeight.asInstanceOf[js.Any])
    if (beakWidth != null) __obj.updateDynamic("beakWidth")(beakWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (delayBeforeCoachmarkAnimation != null) __obj.updateDynamic("delayBeforeCoachmarkAnimation")(delayBeforeCoachmarkAnimation.asInstanceOf[js.Any])
    if (delayBeforeMouseOpen != null) __obj.updateDynamic("delayBeforeMouseOpen")(delayBeforeMouseOpen.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(isCollapsed)) __obj.updateDynamic("isCollapsed")(isCollapsed.asInstanceOf[js.Any])
    if (!js.isUndefined(isPositionForced)) __obj.updateDynamic("isPositionForced")(isPositionForced.asInstanceOf[js.Any])
    if (mouseProximityOffset != null) __obj.updateDynamic("mouseProximityOffset")(mouseProximityOffset.asInstanceOf[js.Any])
    if (onAnimationOpenEnd != null) __obj.updateDynamic("onAnimationOpenEnd")(js.Any.fromFunction0(onAnimationOpenEnd))
    if (onAnimationOpenStart != null) __obj.updateDynamic("onAnimationOpenStart")(js.Any.fromFunction0(onAnimationOpenStart))
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction1(onDismiss))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1(onMouseMove))
    if (!js.isUndefined(persistentBeak)) __obj.updateDynamic("persistentBeak")(persistentBeak.asInstanceOf[js.Any])
    if (positioningContainerProps != null) __obj.updateDynamic("positioningContainerProps")(positioningContainerProps.asInstanceOf[js.Any])
    if (!js.isUndefined(preventDismissOnLostFocus)) __obj.updateDynamic("preventDismissOnLostFocus")(preventDismissOnLostFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(preventFocusOnMount)) __obj.updateDynamic("preventFocusOnMount")(preventFocusOnMount.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (teachingBubbleRef != null) __obj.updateDynamic("teachingBubbleRef")(teachingBubbleRef.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.officeUiFabricReact.mod.CoachmarkBase] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.officeUiFabricReact.mod.CoachmarkBase](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ICoachmarkProps
}

