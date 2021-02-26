package typingsSlinky.reactHighlightJs

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
  @JSImport("react-highlight.js", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[HighlightProps, js.Object, js.Any] {
    def this(props: HighlightProps) = this()
    def this(props: HighlightProps, context: js.Any) = this()
  }
  /**
    * A lightweight React wrapper around the Highlight.js syntax highlighting library.
    */
  @JSImport("react-highlight.js", JSImport.Default)
  @js.native
  val default: ReactComponentClass[HighlightProps] = js.native
  
  @js.native
  trait HighlightProps extends StObject {
    
    /**
      * Content that will be highlighted
      */
    var children: js.UndefOr[ReactElement] = js.native
    
    /**
      * Language name to use as a class to signal type to highlight.js.
      */
    var language: String = js.native
  }
  object HighlightProps {
    
    @scala.inline
    def apply(language: String): HighlightProps = {
      val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any])
      __obj.asInstanceOf[HighlightProps]
    }
    
    @scala.inline
    implicit class HighlightPropsMutableBuilder[Self <: HighlightProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ReactComponentClass[HighlightProps]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: ReactComponentClass[HighlightProps] = default
}
