package typingsSlinky.reactShowMore

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.ClassicComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-show-more", JSImport.Default)
  @js.native
  class default protected ()
    extends ClassicComponent[ReactShowMoreProps, js.Object] {
    def this(props: ReactShowMoreProps) = this()
    def this(props: ReactShowMoreProps, context: js.Any) = this()
  }
  @JSImport("react-show-more", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ReactShowMoreProps] = js.native
  
  @js.native
  trait ReactShowMoreProps extends StObject {
    
    var anchorClass: js.UndefOr[String] = js.native
    
    var children: js.UndefOr[String] = js.native
    
    var less: js.UndefOr[String] = js.native
    
    var lines: js.UndefOr[Double] = js.native
    
    var more: js.UndefOr[String] = js.native
  }
  object ReactShowMoreProps {
    
    @scala.inline
    def apply(): ReactShowMoreProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactShowMoreProps]
    }
    
    @scala.inline
    implicit class ReactShowMorePropsMutableBuilder[Self <: ReactShowMoreProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnchorClass(value: String): Self = StObject.set(x, "anchorClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnchorClassUndefined: Self = StObject.set(x, "anchorClass", js.undefined)
      
      @scala.inline
      def setChildren(value: String): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setLess(value: String): Self = StObject.set(x, "less", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLessUndefined: Self = StObject.set(x, "less", js.undefined)
      
      @scala.inline
      def setLines(value: Double): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinesUndefined: Self = StObject.set(x, "lines", js.undefined)
      
      @scala.inline
      def setMore(value: String): Self = StObject.set(x, "more", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMoreUndefined: Self = StObject.set(x, "more", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[ReactShowMoreProps]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: ReactComponentClass[ReactShowMoreProps] = default
}
