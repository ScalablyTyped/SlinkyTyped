package typingsSlinky.officeUiFabricReact.components

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.fluentuiTheme.ithemeMod.ITheme
import typingsSlinky.officeUiFabricReact.coachmarkTypesMod.ICoachmark
import typingsSlinky.officeUiFabricReact.coachmarkTypesMod.ICoachmarkProps
import typingsSlinky.officeUiFabricReact.coachmarkTypesMod.ICoachmarkStyleProps
import typingsSlinky.officeUiFabricReact.coachmarkTypesMod.ICoachmarkStyles
import typingsSlinky.officeUiFabricReact.positioningContainerTypesMod.IPositioningContainerProps
import typingsSlinky.officeUiFabricReact.teachingBubbleTypesMod.ITeachingBubble
import typingsSlinky.uifabricMergeStyles.deepPartialMod.DeepPartial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Coachmark {
  
  @JSImport("office-ui-fabric-react", "Coachmark")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.officeUiFabricReact.coachmarkBaseMod.CoachmarkBase] {
    
    @scala.inline
    def ariaAlertText(value: String): this.type = set("ariaAlertText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ariaDescribedBy(value: String): this.type = set("ariaDescribedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ariaDescribedByText(value: String): this.type = set("ariaDescribedByText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ariaLabelledBy(value: String): this.type = set("ariaLabelledBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ariaLabelledByText(value: String): this.type = set("ariaLabelledByText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def beaconColorOne(value: String): this.type = set("beaconColorOne", value.asInstanceOf[js.Any])
    
    @scala.inline
    def beaconColorTwo(value: String): this.type = set("beaconColorTwo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def beakHeight(value: Double): this.type = set("beakHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def beakWidth(value: Double): this.type = set("beakWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def collapsed(value: Boolean): this.type = set("collapsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def componentRefFunction1(value: /* ref */ ICoachmark | Null => Unit): this.type = set("componentRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def componentRefRefObject(value: ReactRef[ICoachmark]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def componentRef(value: IRefObject[ICoachmark]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delayBeforeCoachmarkAnimation(value: Double): this.type = set("delayBeforeCoachmarkAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delayBeforeMouseOpen(value: Double): this.type = set("delayBeforeMouseOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isCollapsed(value: Boolean): this.type = set("isCollapsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isPositionForced(value: Boolean): this.type = set("isPositionForced", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mouseProximityOffset(value: Double): this.type = set("mouseProximityOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onAnimationOpenEnd(value: () => Unit): this.type = set("onAnimationOpenEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def onAnimationOpenStart(value: () => Unit): this.type = set("onAnimationOpenStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def onDismiss(value: /* ev */ js.UndefOr[js.Any] => Unit): this.type = set("onDismiss", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseMove(value: /* e */ MouseEvent => Unit): this.type = set("onMouseMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def persistentBeak(value: Boolean): this.type = set("persistentBeak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def positioningContainerProps(value: IPositioningContainerProps): this.type = set("positioningContainerProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def preventDismissOnLostFocus(value: Boolean): this.type = set("preventDismissOnLostFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def preventFocusOnMount(value: Boolean): this.type = set("preventFocusOnMount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stylesFunction1(value: ICoachmarkStyleProps => DeepPartial[ICoachmarkStyles]): this.type = set("styles", js.Any.fromFunction1(value))
    
    @scala.inline
    def styles(value: IStyleFunctionOrObject[ICoachmarkStyleProps, ICoachmarkStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def targetHTMLElement(value: HTMLElement): this.type = set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def target(value: HTMLElement | String): this.type = set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def targetNull: this.type = set("target", null)
    
    @scala.inline
    def teachingBubbleRef(value: ITeachingBubble): this.type = set("teachingBubbleRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def theme(value: ITheme): this.type = set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ICoachmarkProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Coachmark.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
