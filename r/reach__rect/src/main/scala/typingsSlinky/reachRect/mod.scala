package typingsSlinky.reachRect

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.reachRect.anon.Rect
import typingsSlinky.react.mod.Ref
import typingsSlinky.std.DOMRect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("@reach/rect", JSImport.Default)
  @js.native
  val default: ReactComponentClass[RectProps] = js.native
  
  @JSImport("@reach/rect", "useRect")
  @js.native
  def useRect(ref: Ref[_]): DOMRect = js.native
  @JSImport("@reach/rect", "useRect")
  @js.native
  def useRect(ref: Ref[_], isSelected: Boolean): DOMRect = js.native
  
  @js.native
  trait RectProps extends StObject {
    
    var children: js.UndefOr[js.Function1[/* args */ Rect, ReactElement]] = js.native
    
    var observe: js.UndefOr[Boolean] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* rect */ DOMRect, Unit]] = js.native
  }
  object RectProps {
    
    @scala.inline
    def apply(): RectProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RectProps]
    }
    
    @scala.inline
    implicit class RectPropsMutableBuilder[Self <: RectProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: /* args */ Rect => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setObserve(value: Boolean): Self = StObject.set(x, "observe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObserveUndefined: Self = StObject.set(x, "observe", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* rect */ DOMRect => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[RectProps]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: ReactComponentClass[RectProps] = default
}
