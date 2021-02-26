package typingsSlinky.nextReactDevOverlay

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shadowPortalMod {
  
  @JSImport("@next/react-dev-overlay/lib/internal/components/ShadowPortal", "ShadowPortal")
  @js.native
  val ShadowPortal: ReactComponentClass[ShadowPortalProps] = js.native
  
  @js.native
  trait ShadowPortalProps extends StObject {
    
    var children: ReactElement = js.native
  }
  object ShadowPortalProps {
    
    @scala.inline
    def apply(): ShadowPortalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShadowPortalProps]
    }
    
    @scala.inline
    implicit class ShadowPortalPropsMutableBuilder[Self <: ShadowPortalProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
}
