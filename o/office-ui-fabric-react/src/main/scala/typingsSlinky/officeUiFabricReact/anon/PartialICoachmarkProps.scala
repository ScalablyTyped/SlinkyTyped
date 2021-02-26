package typingsSlinky.officeUiFabricReact.anon

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import slinky.core.facade.ReactRef
import typingsSlinky.fluentuiTheme.ithemeMod.ITheme
import typingsSlinky.officeUiFabricReact.coachmarkBaseMod.CoachmarkBase
import typingsSlinky.officeUiFabricReact.coachmarkTypesMod.ICoachmark
import typingsSlinky.officeUiFabricReact.coachmarkTypesMod.ICoachmarkStyleProps
import typingsSlinky.officeUiFabricReact.coachmarkTypesMod.ICoachmarkStyles
import typingsSlinky.officeUiFabricReact.positioningContainerTypesMod.IPositioningContainerProps
import typingsSlinky.officeUiFabricReact.teachingBubbleTypesMod.ITeachingBubble
import typingsSlinky.react.mod.LegacyRef
import typingsSlinky.uifabricMergeStyles.deepPartialMod.DeepPartial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<office-ui-fabric-react.office-ui-fabric-react/lib/components/Coachmark/Coachmark.types.ICoachmarkProps> */
@js.native
trait PartialICoachmarkProps extends StObject {
  
  var ariaAlertText: js.UndefOr[String] = js.native
  
  var ariaDescribedBy: js.UndefOr[String] = js.native
  
  var ariaDescribedByText: js.UndefOr[String] = js.native
  
  var ariaLabelledBy: js.UndefOr[String] = js.native
  
  var ariaLabelledByText: js.UndefOr[String] = js.native
  
  var beaconColorOne: js.UndefOr[String] = js.native
  
  var beaconColorTwo: js.UndefOr[String] = js.native
  
  var beakHeight: js.UndefOr[Double] = js.native
  
  var beakWidth: js.UndefOr[Double] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var collapsed: js.UndefOr[Boolean] = js.native
  
  var color: js.UndefOr[String] = js.native
  
  var componentRef: js.UndefOr[IRefObject[ICoachmark]] = js.native
  
  var delayBeforeCoachmarkAnimation: js.UndefOr[Double] = js.native
  
  var delayBeforeMouseOpen: js.UndefOr[Double] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var isCollapsed: js.UndefOr[Boolean] = js.native
  
  var isPositionForced: js.UndefOr[Boolean] = js.native
  
  var key: js.UndefOr[typingsSlinky.react.mod.Key | Null] = js.native
  
  var mouseProximityOffset: js.UndefOr[Double] = js.native
  
  var onAnimationOpenEnd: js.UndefOr[js.Function0[scala.Unit]] = js.native
  
  var onAnimationOpenStart: js.UndefOr[js.Function0[scala.Unit]] = js.native
  
  var onDismiss: js.UndefOr[js.Function1[/* ev */ js.UndefOr[js.Any], scala.Unit]] = js.native
  
  var onMouseMove: js.UndefOr[js.Function1[/* e */ MouseEvent, scala.Unit]] = js.native
  
  var persistentBeak: js.UndefOr[Boolean] = js.native
  
  var positioningContainerProps: js.UndefOr[IPositioningContainerProps] = js.native
  
  var preventDismissOnLostFocus: js.UndefOr[Boolean] = js.native
  
  var preventFocusOnMount: js.UndefOr[Boolean] = js.native
  
  var ref: js.UndefOr[LegacyRef[CoachmarkBase]] = js.native
  
  var styles: js.UndefOr[IStyleFunctionOrObject[ICoachmarkStyleProps, ICoachmarkStyles]] = js.native
  
  var target: js.UndefOr[HTMLElement | String | Null] = js.native
  
  var teachingBubbleRef: js.UndefOr[ITeachingBubble] = js.native
  
  var theme: js.UndefOr[ITheme] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object PartialICoachmarkProps {
  
  @scala.inline
  def apply(): PartialICoachmarkProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialICoachmarkProps]
  }
  
  @scala.inline
  implicit class PartialICoachmarkPropsMutableBuilder[Self <: PartialICoachmarkProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAriaAlertText(value: String): Self = StObject.set(x, "ariaAlertText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAriaAlertTextUndefined: Self = StObject.set(x, "ariaAlertText", js.undefined)
    
    @scala.inline
    def setAriaDescribedBy(value: String): Self = StObject.set(x, "ariaDescribedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAriaDescribedByText(value: String): Self = StObject.set(x, "ariaDescribedByText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAriaDescribedByTextUndefined: Self = StObject.set(x, "ariaDescribedByText", js.undefined)
    
    @scala.inline
    def setAriaDescribedByUndefined: Self = StObject.set(x, "ariaDescribedBy", js.undefined)
    
    @scala.inline
    def setAriaLabelledBy(value: String): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAriaLabelledByText(value: String): Self = StObject.set(x, "ariaLabelledByText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAriaLabelledByTextUndefined: Self = StObject.set(x, "ariaLabelledByText", js.undefined)
    
    @scala.inline
    def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
    
    @scala.inline
    def setBeaconColorOne(value: String): Self = StObject.set(x, "beaconColorOne", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeaconColorOneUndefined: Self = StObject.set(x, "beaconColorOne", js.undefined)
    
    @scala.inline
    def setBeaconColorTwo(value: String): Self = StObject.set(x, "beaconColorTwo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeaconColorTwoUndefined: Self = StObject.set(x, "beaconColorTwo", js.undefined)
    
    @scala.inline
    def setBeakHeight(value: Double): Self = StObject.set(x, "beakHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeakHeightUndefined: Self = StObject.set(x, "beakHeight", js.undefined)
    
    @scala.inline
    def setBeakWidth(value: Double): Self = StObject.set(x, "beakWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeakWidthUndefined: Self = StObject.set(x, "beakWidth", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setComponentRef(value: IRefObject[ICoachmark]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentRefFunction1(value: /* ref */ ICoachmark | Null => scala.Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setComponentRefRefObject(value: ReactRef[ICoachmark]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
    
    @scala.inline
    def setDelayBeforeCoachmarkAnimation(value: Double): Self = StObject.set(x, "delayBeforeCoachmarkAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayBeforeCoachmarkAnimationUndefined: Self = StObject.set(x, "delayBeforeCoachmarkAnimation", js.undefined)
    
    @scala.inline
    def setDelayBeforeMouseOpen(value: Double): Self = StObject.set(x, "delayBeforeMouseOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayBeforeMouseOpenUndefined: Self = StObject.set(x, "delayBeforeMouseOpen", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setIsCollapsed(value: Boolean): Self = StObject.set(x, "isCollapsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCollapsedUndefined: Self = StObject.set(x, "isCollapsed", js.undefined)
    
    @scala.inline
    def setIsPositionForced(value: Boolean): Self = StObject.set(x, "isPositionForced", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPositionForcedUndefined: Self = StObject.set(x, "isPositionForced", js.undefined)
    
    @scala.inline
    def setKey(value: typingsSlinky.react.mod.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyNull: Self = StObject.set(x, "key", null)
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setMouseProximityOffset(value: Double): Self = StObject.set(x, "mouseProximityOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseProximityOffsetUndefined: Self = StObject.set(x, "mouseProximityOffset", js.undefined)
    
    @scala.inline
    def setOnAnimationOpenEnd(value: () => scala.Unit): Self = StObject.set(x, "onAnimationOpenEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnAnimationOpenEndUndefined: Self = StObject.set(x, "onAnimationOpenEnd", js.undefined)
    
    @scala.inline
    def setOnAnimationOpenStart(value: () => scala.Unit): Self = StObject.set(x, "onAnimationOpenStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnAnimationOpenStartUndefined: Self = StObject.set(x, "onAnimationOpenStart", js.undefined)
    
    @scala.inline
    def setOnDismiss(value: /* ev */ js.UndefOr[js.Any] => scala.Unit): Self = StObject.set(x, "onDismiss", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
    
    @scala.inline
    def setOnMouseMove(value: /* e */ MouseEvent => scala.Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
    
    @scala.inline
    def setPersistentBeak(value: Boolean): Self = StObject.set(x, "persistentBeak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistentBeakUndefined: Self = StObject.set(x, "persistentBeak", js.undefined)
    
    @scala.inline
    def setPositioningContainerProps(value: IPositioningContainerProps): Self = StObject.set(x, "positioningContainerProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositioningContainerPropsUndefined: Self = StObject.set(x, "positioningContainerProps", js.undefined)
    
    @scala.inline
    def setPreventDismissOnLostFocus(value: Boolean): Self = StObject.set(x, "preventDismissOnLostFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventDismissOnLostFocusUndefined: Self = StObject.set(x, "preventDismissOnLostFocus", js.undefined)
    
    @scala.inline
    def setPreventFocusOnMount(value: Boolean): Self = StObject.set(x, "preventFocusOnMount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventFocusOnMountUndefined: Self = StObject.set(x, "preventFocusOnMount", js.undefined)
    
    @scala.inline
    def setRef(value: LegacyRef[CoachmarkBase]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefFunction1(value: /* instance */ CoachmarkBase | Null => scala.Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefNull: Self = StObject.set(x, "ref", null)
    
    @scala.inline
    def setRefRefObject(value: ReactRef[CoachmarkBase]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[ICoachmarkStyleProps, ICoachmarkStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesFunction1(value: ICoachmarkStyleProps => DeepPartial[ICoachmarkStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    @scala.inline
    def setTarget(value: HTMLElement | String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetHTMLElement(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetNull: Self = StObject.set(x, "target", null)
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setTeachingBubbleRef(value: ITeachingBubble): Self = StObject.set(x, "teachingBubbleRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeachingBubbleRefUndefined: Self = StObject.set(x, "teachingBubbleRef", js.undefined)
    
    @scala.inline
    def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
