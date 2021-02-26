package typingsSlinky.grommet

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.grommet.boxMod.BoxProps
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.HTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sidebarMod {
  
  @JSImport("grommet/components/Sidebar", "Sidebar")
  @js.native
  val Sidebar: ReactComponentClass[
    BoxProps with SidebarProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ] = js.native
  
  @js.native
  trait SidebarProps extends StObject {
    
    var footer: js.UndefOr[ReactElement] = js.native
    
    var header: js.UndefOr[ReactElement] = js.native
  }
  object SidebarProps {
    
    @scala.inline
    def apply(): SidebarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SidebarProps]
    }
    
    @scala.inline
    implicit class SidebarPropsMutableBuilder[Self <: SidebarProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFooter(value: ReactElement): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterReactElement(value: ReactElement): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      @scala.inline
      def setHeader(value: ReactElement): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderReactElement(value: ReactElement): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    }
  }
}
