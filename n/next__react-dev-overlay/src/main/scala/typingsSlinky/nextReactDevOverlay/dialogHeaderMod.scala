package typingsSlinky.nextReactDevOverlay

import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dialogHeaderMod {
  
  @JSImport("@next/react-dev-overlay/lib/internal/components/Dialog/DialogHeader", "DialogHeader")
  @js.native
  val DialogHeader: ReactComponentClass[DialogHeaderProps] = js.native
  
  @js.native
  trait DialogHeaderProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
  }
  object DialogHeaderProps {
    
    @scala.inline
    def apply(): DialogHeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DialogHeaderProps]
    }
    
    @scala.inline
    implicit class DialogHeaderPropsMutableBuilder[Self <: DialogHeaderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    }
  }
}
