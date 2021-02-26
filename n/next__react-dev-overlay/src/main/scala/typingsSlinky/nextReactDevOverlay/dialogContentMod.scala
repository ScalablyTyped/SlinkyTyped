package typingsSlinky.nextReactDevOverlay

import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dialogContentMod {
  
  @JSImport("@next/react-dev-overlay/lib/internal/components/Dialog/DialogContent", "DialogContent")
  @js.native
  val DialogContent: ReactComponentClass[DialogContentProps] = js.native
  
  @js.native
  trait DialogContentProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
  }
  object DialogContentProps {
    
    @scala.inline
    def apply(): DialogContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DialogContentProps]
    }
    
    @scala.inline
    implicit class DialogContentPropsMutableBuilder[Self <: DialogContentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    }
  }
}
