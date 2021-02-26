package typingsSlinky.reactstrap

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLAnchorElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.AnchorHTMLAttributes
import typingsSlinky.react.mod.Component
import typingsSlinky.reactstrap.mod.CSSModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navbarBrandMod {
  
  @JSImport("reactstrap/lib/NavbarBrand", JSImport.Default)
  @js.native
  class default ()
    extends Component[NavbarBrandProps, js.Object, js.Any]
  
  type NavbarBrand = ReactComponentClass[NavbarBrandProps]
  
  @js.native
  trait NavbarBrandProps
    extends AnchorHTMLAttributes[HTMLAnchorElement]
       with /* key */ StringDictionary[js.Any] {
    
    var cssModule: js.UndefOr[CSSModule] = js.native
    
    var tag: js.UndefOr[ReactElement] = js.native
  }
  object NavbarBrandProps {
    
    @scala.inline
    def apply(): NavbarBrandProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavbarBrandProps]
    }
    
    @scala.inline
    implicit class NavbarBrandPropsMutableBuilder[Self <: NavbarBrandProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      @scala.inline
      def setTag(value: ReactElement): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagComponentClass(value: ReactComponentClass[_]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagFunctionComponent(value: ReactComponentClass[_]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    }
  }
}
