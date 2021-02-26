package typingsSlinky.grommet

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.grommet.anon.SkipTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object skipLinksMod {
  
  @JSImport("grommet/components/SkipLinks", "SkipLinks")
  @js.native
  val SkipLinks: ReactComponentClass[SkipLinksProps] = js.native
  
  @js.native
  trait SkipLinksProps extends StObject {
    
    var children: ReactElement = js.native
    
    var messages: js.UndefOr[SkipTo] = js.native
  }
  object SkipLinksProps {
    
    @scala.inline
    def apply(): SkipLinksProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SkipLinksProps]
    }
    
    @scala.inline
    implicit class SkipLinksPropsMutableBuilder[Self <: SkipLinksProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setMessages(value: SkipTo): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    }
  }
}
