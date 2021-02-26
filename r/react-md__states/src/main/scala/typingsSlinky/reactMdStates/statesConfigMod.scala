package typingsSlinky.reactMdStates

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Context
import typingsSlinky.reactMdTransition.typesMod.TransitionTimeout
import typingsSlinky.reactTransitionGroup.csstransitionMod.CSSTransitionClassNames
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statesConfigMod {
  
  object StatesConfig {
    
    @JSImport("@react-md/states/types/StatesConfig", "StatesConfig")
    @js.native
    def apply(hasRippleTimeoutRippleClassNamesDisableRippleDisableProgrammaticRippleChildren: StatesConfigProps): ReactElement = js.native
    
    object propTypes {
      
      @JSImport("@react-md/states/types/StatesConfig", "StatesConfig.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@react-md/states/types/StatesConfig", "StatesConfig.propTypes.children")
      @js.native
      def children: js.Any = js.native
      @scala.inline
      def children_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/states/types/StatesConfig", "StatesConfig.propTypes.disableProgrammaticRipple")
      @js.native
      def disableProgrammaticRipple: js.Any = js.native
      @scala.inline
      def disableProgrammaticRipple_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disableProgrammaticRipple")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/states/types/StatesConfig", "StatesConfig.propTypes.disableRipple")
      @js.native
      def disableRipple: js.Any = js.native
      @scala.inline
      def disableRipple_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disableRipple")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/states/types/StatesConfig", "StatesConfig.propTypes.rippleClassNames")
      @js.native
      def rippleClassNames: js.Any = js.native
      @scala.inline
      def rippleClassNames_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rippleClassNames")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/states/types/StatesConfig", "StatesConfig.propTypes.rippleTimeout")
      @js.native
      def rippleTimeout: js.Any = js.native
      @scala.inline
      def rippleTimeout_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rippleTimeout")(x.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("@react-md/states/types/StatesConfig", "StatesConfigContext")
  @js.native
  val StatesConfigContext: Context[StatesConfigContextType] = js.native
  
  @JSImport("@react-md/states/types/StatesConfig", "useStatesConfigContext")
  @js.native
  def useStatesConfigContext(): StatesConfigContextType = js.native
  
  @js.native
  trait StatesConfigContextType extends StObject {
    
    /**
      * Boolean if the ripple component should not be triggered after a
      * "programmatic" ripple effect. This would be if  the `.click()` function is
      * called on an element through javascript or some other means.
      */
    var disableProgrammaticRipple: Boolean = js.native
    
    /**
      * Boolean if the ripple effect should be disabled for all child components
      * that use the Ripple states.
      */
    var disableRipple: Boolean = js.native
    
    /**
      * The class names to apply during the different stages for the ripple
      * animation.  You probably don't want to use this.
      */
    var rippleClassNames: CSSTransitionClassNames = js.native
    
    /**
      * The amount of time before a ripple finishes its animation. You probably
      * don't want to change this value unless you updated the duration in scss or
      * changed the different class names for the ripple animation.
      */
    var rippleTimeout: TransitionTimeout = js.native
  }
  object StatesConfigContextType {
    
    @scala.inline
    def apply(
      disableProgrammaticRipple: Boolean,
      disableRipple: Boolean,
      rippleClassNames: CSSTransitionClassNames,
      rippleTimeout: TransitionTimeout
    ): StatesConfigContextType = {
      val __obj = js.Dynamic.literal(disableProgrammaticRipple = disableProgrammaticRipple.asInstanceOf[js.Any], disableRipple = disableRipple.asInstanceOf[js.Any], rippleClassNames = rippleClassNames.asInstanceOf[js.Any], rippleTimeout = rippleTimeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatesConfigContextType]
    }
    
    @scala.inline
    implicit class StatesConfigContextTypeMutableBuilder[Self <: StatesConfigContextType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisableProgrammaticRipple(value: Boolean): Self = StObject.set(x, "disableProgrammaticRipple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableRipple(value: Boolean): Self = StObject.set(x, "disableRipple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRippleClassNames(value: CSSTransitionClassNames): Self = StObject.set(x, "rippleClassNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRippleTimeout(value: TransitionTimeout): Self = StObject.set(x, "rippleTimeout", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Partial<@react-md/states.@react-md/states/types/StatesConfig.StatesConfigContextType> */
  @js.native
  trait StatesConfigProps extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var disableProgrammaticRipple: js.UndefOr[Boolean] = js.native
    
    var disableRipple: js.UndefOr[Boolean] = js.native
    
    var rippleClassNames: js.UndefOr[CSSTransitionClassNames] = js.native
    
    var rippleTimeout: js.UndefOr[TransitionTimeout] = js.native
  }
  object StatesConfigProps {
    
    @scala.inline
    def apply(): StatesConfigProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatesConfigProps]
    }
    
    @scala.inline
    implicit class StatesConfigPropsMutableBuilder[Self <: StatesConfigProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDisableProgrammaticRipple(value: Boolean): Self = StObject.set(x, "disableProgrammaticRipple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableProgrammaticRippleUndefined: Self = StObject.set(x, "disableProgrammaticRipple", js.undefined)
      
      @scala.inline
      def setDisableRipple(value: Boolean): Self = StObject.set(x, "disableRipple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableRippleUndefined: Self = StObject.set(x, "disableRipple", js.undefined)
      
      @scala.inline
      def setRippleClassNames(value: CSSTransitionClassNames): Self = StObject.set(x, "rippleClassNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRippleClassNamesUndefined: Self = StObject.set(x, "rippleClassNames", js.undefined)
      
      @scala.inline
      def setRippleTimeout(value: TransitionTimeout): Self = StObject.set(x, "rippleTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRippleTimeoutUndefined: Self = StObject.set(x, "rippleTimeout", js.undefined)
    }
  }
}
