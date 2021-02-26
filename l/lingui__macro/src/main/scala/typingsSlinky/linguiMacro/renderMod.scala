package typingsSlinky.linguiMacro

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderMod {
  
  @js.native
  trait RenderProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var description: js.UndefOr[String] = js.native
    
    var render: js.UndefOr[ReactElement] = js.native
  }
  object RenderProps {
    
    @scala.inline
    def apply(): RenderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderProps]
    }
    
    @scala.inline
    implicit class RenderPropsMutableBuilder[Self <: RenderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setRender(value: ReactElement): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderReactElement(value: ReactElement): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    }
  }
}
