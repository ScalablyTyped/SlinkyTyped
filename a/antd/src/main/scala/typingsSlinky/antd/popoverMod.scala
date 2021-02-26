package typingsSlinky.antd

import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import typingsSlinky.antd.getRenderPropValueMod.RenderFunction
import typingsSlinky.antd.tooltipMod.AbstractTooltipProps
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popoverMod extends Shortcut {
  
  @JSImport("antd/lib/popover", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[PopoverProps with RefAttributes[_]] = js.native
  
  @js.native
  trait PopoverProps extends AbstractTooltipProps {
    
    var content: js.UndefOr[ReactElement | RenderFunction] = js.native
    
    var title: js.UndefOr[ReactElement | RenderFunction] = js.native
  }
  object PopoverProps {
    
    @scala.inline
    def apply(): PopoverProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopoverProps]
    }
    
    @scala.inline
    implicit class PopoverPropsMutableBuilder[Self <: PopoverProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: ReactElement | RenderFunction): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentFunction0(value: () => ReactElement): Self = StObject.set(x, "content", js.Any.fromFunction0(value))
      
      @scala.inline
      def setContentReactElement(value: ReactElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactElement | RenderFunction): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFunction0(value: () => ReactElement): Self = StObject.set(x, "title", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTitleReactElement(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[PopoverProps with RefAttributes[_]]
  
  /* This means you don't have to write `default`, but can instead just say `popoverMod.foo` */
  override def _to: ForwardRefExoticComponent[PopoverProps with RefAttributes[_]] = default
}
