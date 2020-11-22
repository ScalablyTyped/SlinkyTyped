package typingsSlinky.reactMdTransition

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.reactMdTransition.anon.PickCrossFadePropshiddenc
import typingsSlinky.reactMdTransition.collapseMod.CollapseProps
import typingsSlinky.reactMdTransition.scaleTransitionMod.ScaleTransitionProps
import typingsSlinky.reactMdTransition.typesMod.CSSTransitionOptions
import typingsSlinky.reactMdTransition.typesMod.CollapseOptions
import typingsSlinky.reactMdTransition.typesMod.TransitionOptions
import typingsSlinky.reactMdTransition.typesMod.TransitionTimeout
import typingsSlinky.reactMdTransition.useCSSTransitionMod.CSSTransitionReturnValue
import typingsSlinky.reactMdTransition.useCollapseMod.ReturnValue
import typingsSlinky.reactMdTransition.useCrossFadeMod.CrossFadeOptions
import typingsSlinky.reactMdTransition.useFixedPositioningMod.FixedPositioningOptions
import typingsSlinky.reactMdTransition.useTransitionMod.TransitionReturnValue
import typingsSlinky.reactTransitionGroup.csstransitionMod.CSSTransitionClassNames
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-md/transition", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val COLLAPSE_TIMEOUT: TransitionTimeout = js.native
  
  val CROSS_FADE_CLASSNAMES: CSSTransitionClassNames = js.native
  
  val CROSS_FADE_TIMEOUT: TransitionTimeout = js.native
  
  val CrossFade: ForwardRefExoticComponent[PickCrossFadePropshiddenc] = js.native
  
  val DEFAULT_COLLAPSE_MIN_HEIGHT: /* 0 */ Double = js.native
  
  val DEFAULT_COLLAPSE_MIN_PADDING_BOTTOM: /* 0 */ Double = js.native
  
  val DEFAULT_COLLAPSE_MIN_PADDING_TOP: /* 0 */ Double = js.native
  
  val ENTER: /* "enter" */ String = js.native
  
  val ENTERED: /* "entered" */ String = js.native
  
  val ENTERING: /* "entering" */ String = js.native
  
  val EXIT: /* "exit" */ String = js.native
  
  val EXITED: /* "exited" */ String = js.native
  
  val EXITING: /* "exiting" */ String = js.native
  
  val SCALE_CLASSNAMES: CSSTransitionClassNames = js.native
  
  val SCALE_TIMEOUT: TransitionTimeout = js.native
  
  val SCALE_Y_CLASSNAMES: CSSTransitionClassNames = js.native
  
  val UNMOUNT: /* "unmount" */ String = js.native
  
  def useCSSTransition[E /* <: HTMLElement */](
    hasAppearTemporaryTimeoutTransitionInOnEnterOnEnteringOnEnteredOnExitOnExitingOnExitedClassNameClassNamesRef: CSSTransitionOptions[E]
  ): CSSTransitionReturnValue[E] = js.native
  
  def useCollapse[E /* <: HTMLElement */](collapsed: Boolean): ReturnValue[E] = js.native
  def useCollapse[E /* <: HTMLElement */](
    collapsed: Boolean,
    hasClassNameAppearTimeoutOnEnterOnEnteringOnEnteredOnExitOnExitingOnExitedMinHeightMinPaddingTopMinPaddingBottomTemporary: CollapseOptions[E]
  ): ReturnValue[E] = js.native
  
  def useCrossFade[E /* <: HTMLElement */](): CSSTransitionReturnValue[E] = js.native
  def useCrossFade[E /* <: HTMLElement */](
    hasAppearTemporaryTransitionInClassNameOnEnterOnEnteringOnEnteredOnExitOnExitingOnExited: CrossFadeOptions[E]
  ): CSSTransitionReturnValue[E] = js.native
  
  def useFixedPositioning(
    hasOnEnterOnEnteringOnEnteredOnExitedFixedToGetOptionsOnResizeOnScrollAnchorInitialXInitialYXMarginVwMarginYMarginVhMarginWidthOnPositionChangeTransformOriginPreventOverlapDisableSwappingDisableVHBounds: FixedPositioningOptions
  ): typingsSlinky.reactMdTransition.useFixedPositioningMod.ReturnValue = js.native
  
  def useTransition[E /* <: HTMLElement */](
    hasAppearRepaintTemporaryTransitionInTimeoutOnEnterOnEnteringOnEnteredOnExitOnExitingOnExitedRef: TransitionOptions[E]
  ): TransitionReturnValue[E] = js.native
  
  @js.native
  object Collapse extends js.Object {
    
    def apply(
      hasChildrenCollapsedClassNameAppearTimeoutOnEnterOnEnteringOnEnteredOnExitOnExitingOnExitedMinHeightMinPaddingTopMinPaddingBottomTemporary: CollapseProps
    ): ReactElement | Null = js.native
    
    @js.native
    object propTypes extends js.Object {
      
      var children: js.Any = js.native
      
      var className: js.Any = js.native
      
      var collapsed: js.Any = js.native
      
      var minHeight: js.Any = js.native
      
      var minPaddingBottom: js.Any = js.native
      
      var minPaddingTop: js.Any = js.native
      
      var onEnter: js.Any = js.native
      
      var onEntered: js.Any = js.native
      
      var onEntering: js.Any = js.native
      
      var onExit: js.Any = js.native
      
      var onExited: js.Any = js.native
      
      var onExiting: js.Any = js.native
      
      var style: js.Any = js.native
      
      var temporary: js.Any = js.native
      
      var timeout: js.Any = js.native
    }
  }
  
  @js.native
  object ScaleTransition extends js.Object {
    
    def apply(
      hasVisibleChildrenClassNamesVerticalTimeoutPortalPortalIntoPortalIntoIdMountOnEnterUnmountOnExitProps: ScaleTransitionProps
    ): ReactElement = js.native
    
    @js.native
    object propTypes extends js.Object {
      
      var children: js.Any = js.native
      
      var classNames: js.Any = js.native
      
      var mountOnEnter: js.Any = js.native
      
      var portal: js.Any = js.native
      
      var portalInto: js.Any = js.native
      
      var portalIntoId: js.Any = js.native
      
      var timeout: js.Any = js.native
      
      var unmountOnExit: js.Any = js.native
      
      var vertical: js.Any = js.native
      
      var visible: js.Any = js.native
    }
  }
}
