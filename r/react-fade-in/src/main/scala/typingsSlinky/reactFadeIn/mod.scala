package typingsSlinky.reactFadeIn

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-fade-in", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[FadeInProps, js.Object, js.Any] {
    def this(props: FadeInProps) = this()
    def this(props: FadeInProps, context: js.Any) = this()
  }
  /**
    * Visually animates content on render with FadeIn.js
    */
  @JSImport("react-fade-in", JSImport.Default)
  @js.native
  val default: ReactComponentClass[FadeInProps] = js.native
  
  @js.native
  trait FadeInProps extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    /**
      * Default: 50. Delay between each child's animation in milliseconds.
      */
    var delay: js.UndefOr[Double] = js.native
    
    /**
      * Default: 400. Duration of each child's animation in milliseconds.
      */
    var transitionDuration: js.UndefOr[Double] = js.native
  }
  object FadeInProps {
    
    @scala.inline
    def apply(): FadeInProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FadeInProps]
    }
    
    @scala.inline
    implicit class FadeInPropsMutableBuilder[Self <: FadeInProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setTransitionDuration(value: Double): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[FadeInProps]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: ReactComponentClass[FadeInProps] = default
}
