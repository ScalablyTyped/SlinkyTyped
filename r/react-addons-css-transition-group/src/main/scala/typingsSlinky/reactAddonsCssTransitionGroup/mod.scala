package typingsSlinky.reactAddonsCssTransitionGroup

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.reactAddonsCssTransitionGroup.mod.reactAugmentingMod.CSSTransitionGroupProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("react-addons-css-transition-group", JSImport.Namespace)
  @js.native
  val ^ : ReactCSSTransitionGroup = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("react-addons-css-transition-group", JSImport.Namespace)
  @js.native
  class Class protected ()
    extends Component[CSSTransitionGroupProps, js.Object, js.Any] {
    def this(props: CSSTransitionGroupProps) = this()
    def this(props: CSSTransitionGroupProps, context: js.Any) = this()
  }
  
  type ReactCSSTransitionGroup = ReactComponentClass[CSSTransitionGroupProps]
  
  type _To = ReactCSSTransitionGroup
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ReactCSSTransitionGroup = ^
  
  /* augmented module */
  object reactAugmentingMod {
    
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HTMLTransitionGroupProps<ReactCSSTransitionGroup> * / any */ @js.native
    trait CSSTransitionGroupProps extends StObject {
      
      var transitionAppear: js.UndefOr[Boolean] = js.native
      
      var transitionAppearTimeout: js.UndefOr[Double] = js.native
      
      var transitionEnter: js.UndefOr[Boolean] = js.native
      
      var transitionEnterTimeout: js.UndefOr[Double] = js.native
      
      var transitionLeave: js.UndefOr[Boolean] = js.native
      
      var transitionLeaveTimeout: js.UndefOr[Double] = js.native
      
      var transitionName: String | CSSTransitionGroupTransitionName = js.native
    }
    object CSSTransitionGroupProps {
      
      @scala.inline
      def apply(transitionName: String | CSSTransitionGroupTransitionName): CSSTransitionGroupProps = {
        val __obj = js.Dynamic.literal(transitionName = transitionName.asInstanceOf[js.Any])
        __obj.asInstanceOf[CSSTransitionGroupProps]
      }
      
      @scala.inline
      implicit class CSSTransitionGroupPropsMutableBuilder[Self <: CSSTransitionGroupProps] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setTransitionAppear(value: Boolean): Self = StObject.set(x, "transitionAppear", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTransitionAppearTimeout(value: Double): Self = StObject.set(x, "transitionAppearTimeout", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTransitionAppearTimeoutUndefined: Self = StObject.set(x, "transitionAppearTimeout", js.undefined)
        
        @scala.inline
        def setTransitionAppearUndefined: Self = StObject.set(x, "transitionAppear", js.undefined)
        
        @scala.inline
        def setTransitionEnter(value: Boolean): Self = StObject.set(x, "transitionEnter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTransitionEnterTimeout(value: Double): Self = StObject.set(x, "transitionEnterTimeout", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTransitionEnterTimeoutUndefined: Self = StObject.set(x, "transitionEnterTimeout", js.undefined)
        
        @scala.inline
        def setTransitionEnterUndefined: Self = StObject.set(x, "transitionEnter", js.undefined)
        
        @scala.inline
        def setTransitionLeave(value: Boolean): Self = StObject.set(x, "transitionLeave", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTransitionLeaveTimeout(value: Double): Self = StObject.set(x, "transitionLeaveTimeout", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTransitionLeaveTimeoutUndefined: Self = StObject.set(x, "transitionLeaveTimeout", js.undefined)
        
        @scala.inline
        def setTransitionLeaveUndefined: Self = StObject.set(x, "transitionLeave", js.undefined)
        
        @scala.inline
        def setTransitionName(value: String | CSSTransitionGroupTransitionName): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait CSSTransitionGroupTransitionName extends StObject {
      
      var appear: js.UndefOr[String] = js.native
      
      var appearActive: js.UndefOr[String] = js.native
      
      var enter: String = js.native
      
      var enterActive: js.UndefOr[String] = js.native
      
      var leave: String = js.native
      
      var leaveActive: js.UndefOr[String] = js.native
    }
    object CSSTransitionGroupTransitionName {
      
      @scala.inline
      def apply(enter: String, leave: String): CSSTransitionGroupTransitionName = {
        val __obj = js.Dynamic.literal(enter = enter.asInstanceOf[js.Any], leave = leave.asInstanceOf[js.Any])
        __obj.asInstanceOf[CSSTransitionGroupTransitionName]
      }
      
      @scala.inline
      implicit class CSSTransitionGroupTransitionNameMutableBuilder[Self <: CSSTransitionGroupTransitionName] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAppear(value: String): Self = StObject.set(x, "appear", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAppearActive(value: String): Self = StObject.set(x, "appearActive", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAppearActiveUndefined: Self = StObject.set(x, "appearActive", js.undefined)
        
        @scala.inline
        def setAppearUndefined: Self = StObject.set(x, "appear", js.undefined)
        
        @scala.inline
        def setEnter(value: String): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEnterActive(value: String): Self = StObject.set(x, "enterActive", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEnterActiveUndefined: Self = StObject.set(x, "enterActive", js.undefined)
        
        @scala.inline
        def setLeave(value: String): Self = StObject.set(x, "leave", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLeaveActive(value: String): Self = StObject.set(x, "leaveActive", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLeaveActiveUndefined: Self = StObject.set(x, "leaveActive", js.undefined)
      }
    }
  }
}
