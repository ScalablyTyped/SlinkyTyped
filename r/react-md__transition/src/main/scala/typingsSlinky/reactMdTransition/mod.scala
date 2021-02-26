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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-md/transition", "COLLAPSE_TIMEOUT")
  @js.native
  val COLLAPSE_TIMEOUT: TransitionTimeout = js.native
  
  @JSImport("@react-md/transition", "CROSS_FADE_CLASSNAMES")
  @js.native
  val CROSS_FADE_CLASSNAMES: CSSTransitionClassNames = js.native
  
  @JSImport("@react-md/transition", "CROSS_FADE_TIMEOUT")
  @js.native
  val CROSS_FADE_TIMEOUT: TransitionTimeout = js.native
  
  object Collapse {
    
    @JSImport("@react-md/transition", "Collapse")
    @js.native
    def apply(
      hasChildrenCollapsedClassNameAppearTimeoutOnEnterOnEnteringOnEnteredOnExitOnExitingOnExitedMinHeightMinPaddingTopMinPaddingBottomTemporary: CollapseProps
    ): ReactElement | Null = js.native
    
    object propTypes {
      
      @JSImport("@react-md/transition", "Collapse.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@react-md/transition", "Collapse.propTypes.children")
      @js.native
      def children: js.Any = js.native
      @scala.inline
      def children_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition", "Collapse.propTypes.className")
      @js.native
      def className: js.Any = js.native
      @scala.inline
      def className_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition", "Collapse.propTypes.collapsed")
      @js.native
      def collapsed: js.Any = js.native
      @scala.inline
      def collapsed_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("collapsed")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition", "Collapse.propTypes.minHeight")
      @js.native
      def minHeight: js.Any = js.native
      @scala.inline
      def minHeight_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition", "Collapse.propTypes.minPaddingBottom")
      @js.native
      def minPaddingBottom: js.Any = js.native
      @scala.inline
      def minPaddingBottom_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minPaddingBottom")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition", "Collapse.propTypes.minPaddingTop")
      @js.native
      def minPaddingTop: js.Any = js.native
      @scala.inline
      def minPaddingTop_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minPaddingTop")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition", "Collapse.propTypes.onEnter")
      @js.native
      def onEnter: js.Any = js.native
      @scala.inline
      def onEnter_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onEnter")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition", "Collapse.propTypes.onEntered")
      @js.native
      def onEntered: js.Any = js.native
      @scala.inline
      def onEntered_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onEntered")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition", "Collapse.propTypes.onEntering")
      @js.native
      def onEntering: js.Any = js.native
      @scala.inline
      def onEntering_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onEntering")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition", "Collapse.propTypes.onExit")
      @js.native
      def onExit: js.Any = js.native
      @scala.inline
      def onExit_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onExit")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition", "Collapse.propTypes.onExited")
      @js.native
      def onExited: js.Any = js.native
      @scala.inline
      def onExited_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onExited")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition", "Collapse.propTypes.onExiting")
      @js.native
      def onExiting: js.Any = js.native
      @scala.inline
      def onExiting_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onExiting")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition", "Collapse.propTypes.style")
      @js.native
      def style: js.Any = js.native
      @scala.inline
      def style_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("style")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition", "Collapse.propTypes.temporary")
      @js.native
      def temporary: js.Any = js.native
      @scala.inline
      def temporary_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("temporary")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition", "Collapse.propTypes.timeout")
      @js.native
      def timeout: js.Any = js.native
      @scala.inline
      def timeout_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeout")(x.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("@react-md/transition", "CrossFade")
  @js.native
  val CrossFade: ForwardRefExoticComponent[PickCrossFadePropshiddenc] = js.native
  
  @JSImport("@react-md/transition", "DEFAULT_COLLAPSE_MIN_HEIGHT")
  @js.native
  val DEFAULT_COLLAPSE_MIN_HEIGHT: /* 0 */ Double = js.native
  
  @JSImport("@react-md/transition", "DEFAULT_COLLAPSE_MIN_PADDING_BOTTOM")
  @js.native
  val DEFAULT_COLLAPSE_MIN_PADDING_BOTTOM: /* 0 */ Double = js.native
  
  @JSImport("@react-md/transition", "DEFAULT_COLLAPSE_MIN_PADDING_TOP")
  @js.native
  val DEFAULT_COLLAPSE_MIN_PADDING_TOP: /* 0 */ Double = js.native
  
  @JSImport("@react-md/transition", "ENTER")
  @js.native
  val ENTER: /* "enter" */ String = js.native
  
  @JSImport("@react-md/transition", "ENTERED")
  @js.native
  val ENTERED: /* "entered" */ String = js.native
  
  @JSImport("@react-md/transition", "ENTERING")
  @js.native
  val ENTERING: /* "entering" */ String = js.native
  
  @JSImport("@react-md/transition", "EXIT")
  @js.native
  val EXIT: /* "exit" */ String = js.native
  
  @JSImport("@react-md/transition", "EXITED")
  @js.native
  val EXITED: /* "exited" */ String = js.native
  
  @JSImport("@react-md/transition", "EXITING")
  @js.native
  val EXITING: /* "exiting" */ String = js.native
  
  @JSImport("@react-md/transition", "SCALE_CLASSNAMES")
  @js.native
  val SCALE_CLASSNAMES: CSSTransitionClassNames = js.native
  
  @JSImport("@react-md/transition", "SCALE_TIMEOUT")
  @js.native
  val SCALE_TIMEOUT: TransitionTimeout = js.native
  
  @JSImport("@react-md/transition", "SCALE_Y_CLASSNAMES")
  @js.native
  val SCALE_Y_CLASSNAMES: CSSTransitionClassNames = js.native
  
  object ScaleTransition {
    
    @JSImport("@react-md/transition", "ScaleTransition")
    @js.native
    def apply(
      hasVisibleChildrenClassNamesVerticalTimeoutPortalPortalIntoPortalIntoIdMountOnEnterUnmountOnExitProps: ScaleTransitionProps
    ): ReactElement = js.native
    
    object propTypes {
      
      @JSImport("@react-md/transition", "ScaleTransition.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@react-md/transition", "ScaleTransition.propTypes.children")
      @js.native
      def children: js.Any = js.native
      @scala.inline
      def children_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition", "ScaleTransition.propTypes.classNames")
      @js.native
      def classNames: js.Any = js.native
      @scala.inline
      def classNames_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("classNames")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition", "ScaleTransition.propTypes.mountOnEnter")
      @js.native
      def mountOnEnter: js.Any = js.native
      @scala.inline
      def mountOnEnter_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mountOnEnter")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition", "ScaleTransition.propTypes.portal")
      @js.native
      def portal: js.Any = js.native
      
      @JSImport("@react-md/transition", "ScaleTransition.propTypes.portalInto")
      @js.native
      def portalInto: js.Any = js.native
      
      @JSImport("@react-md/transition", "ScaleTransition.propTypes.portalIntoId")
      @js.native
      def portalIntoId: js.Any = js.native
      @scala.inline
      def portalIntoId_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("portalIntoId")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def portalInto_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("portalInto")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def portal_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("portal")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition", "ScaleTransition.propTypes.timeout")
      @js.native
      def timeout: js.Any = js.native
      @scala.inline
      def timeout_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeout")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition", "ScaleTransition.propTypes.unmountOnExit")
      @js.native
      def unmountOnExit: js.Any = js.native
      @scala.inline
      def unmountOnExit_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unmountOnExit")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition", "ScaleTransition.propTypes.vertical")
      @js.native
      def vertical: js.Any = js.native
      @scala.inline
      def vertical_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("vertical")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/transition", "ScaleTransition.propTypes.visible")
      @js.native
      def visible: js.Any = js.native
      @scala.inline
      def visible_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("visible")(x.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("@react-md/transition", "UNMOUNT")
  @js.native
  val UNMOUNT: /* "unmount" */ String = js.native
  
  @JSImport("@react-md/transition", "useCSSTransition")
  @js.native
  def useCSSTransition[E /* <: HTMLElement */](
    hasAppearTemporaryTimeoutTransitionInOnEnterOnEnteringOnEnteredOnExitOnExitingOnExitedClassNameClassNamesRef: CSSTransitionOptions[E]
  ): CSSTransitionReturnValue[E] = js.native
  
  @JSImport("@react-md/transition", "useCollapse")
  @js.native
  def useCollapse[E /* <: HTMLElement */](collapsed: Boolean): ReturnValue[E] = js.native
  @JSImport("@react-md/transition", "useCollapse")
  @js.native
  def useCollapse[E /* <: HTMLElement */](
    collapsed: Boolean,
    hasClassNameAppearTimeoutOnEnterOnEnteringOnEnteredOnExitOnExitingOnExitedMinHeightMinPaddingTopMinPaddingBottomTemporary: CollapseOptions[E]
  ): ReturnValue[E] = js.native
  
  @JSImport("@react-md/transition", "useCrossFade")
  @js.native
  def useCrossFade[E /* <: HTMLElement */](): CSSTransitionReturnValue[E] = js.native
  @JSImport("@react-md/transition", "useCrossFade")
  @js.native
  def useCrossFade[E /* <: HTMLElement */](
    hasAppearTemporaryTransitionInClassNameOnEnterOnEnteringOnEnteredOnExitOnExitingOnExited: CrossFadeOptions[E]
  ): CSSTransitionReturnValue[E] = js.native
  
  @JSImport("@react-md/transition", "useFixedPositioning")
  @js.native
  def useFixedPositioning(
    hasOnEnterOnEnteringOnEnteredOnExitedFixedToGetOptionsOnResizeOnScrollAnchorInitialXInitialYXMarginVwMarginYMarginVhMarginWidthOnPositionChangeTransformOriginPreventOverlapDisableSwappingDisableVHBounds: FixedPositioningOptions
  ): typingsSlinky.reactMdTransition.useFixedPositioningMod.ReturnValue = js.native
  
  @JSImport("@react-md/transition", "useTransition")
  @js.native
  def useTransition[E /* <: HTMLElement */](
    hasAppearRepaintTemporaryTransitionInTimeoutOnEnterOnEnteringOnEnteredOnExitOnExitingOnExitedRef: TransitionOptions[E]
  ): TransitionReturnValue[E] = js.native
}
