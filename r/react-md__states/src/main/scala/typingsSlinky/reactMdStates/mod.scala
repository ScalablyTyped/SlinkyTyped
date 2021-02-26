package typingsSlinky.reactMdStates

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Context
import typingsSlinky.reactMdStates.statesConfigMod.StatesConfigContextType
import typingsSlinky.reactMdStates.statesConfigMod.StatesConfigProps
import typingsSlinky.reactMdStates.useInteractionStatesMod.InteractionStatesOptions
import typingsSlinky.reactMdStates.useInteractionStatesMod.ReturnValue
import typingsSlinky.reactMdTransition.typesMod.TransitionTimeout
import typingsSlinky.reactTransitionGroup.csstransitionMod.CSSTransitionClassNames
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-md/states", "DEFAULT_RIPPLE_CLASSNAMES")
  @js.native
  val DEFAULT_RIPPLE_CLASSNAMES: CSSTransitionClassNames = js.native
  
  @JSImport("@react-md/states", "DEFAULT_RIPPLE_TIMEOUT")
  @js.native
  val DEFAULT_RIPPLE_TIMEOUT: TransitionTimeout = js.native
  
  object StatesConfig {
    
    @JSImport("@react-md/states", "StatesConfig")
    @js.native
    def apply(hasRippleTimeoutRippleClassNamesDisableRippleDisableProgrammaticRippleChildren: StatesConfigProps): ReactElement = js.native
    
    object propTypes {
      
      @JSImport("@react-md/states", "StatesConfig.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@react-md/states", "StatesConfig.propTypes.children")
      @js.native
      def children: js.Any = js.native
      @scala.inline
      def children_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/states", "StatesConfig.propTypes.disableProgrammaticRipple")
      @js.native
      def disableProgrammaticRipple: js.Any = js.native
      @scala.inline
      def disableProgrammaticRipple_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disableProgrammaticRipple")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/states", "StatesConfig.propTypes.disableRipple")
      @js.native
      def disableRipple: js.Any = js.native
      @scala.inline
      def disableRipple_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disableRipple")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/states", "StatesConfig.propTypes.rippleClassNames")
      @js.native
      def rippleClassNames: js.Any = js.native
      @scala.inline
      def rippleClassNames_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rippleClassNames")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/states", "StatesConfig.propTypes.rippleTimeout")
      @js.native
      def rippleTimeout: js.Any = js.native
      @scala.inline
      def rippleTimeout_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rippleTimeout")(x.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("@react-md/states", "StatesConfigContext")
  @js.native
  val StatesConfigContext: Context[StatesConfigContextType] = js.native
  
  @JSImport("@react-md/states", "useInteractionStates")
  @js.native
  def useInteractionStates[E /* <: HTMLElement */](): ReturnValue[E] = js.native
  @JSImport("@react-md/states", "useInteractionStates")
  @js.native
  def useInteractionStates[E /* <: HTMLElement */](options: InteractionStatesOptions[E]): ReturnValue[E] = js.native
  
  @JSImport("@react-md/states", "useStatesConfigContext")
  @js.native
  def useStatesConfigContext(): StatesConfigContextType = js.native
}
