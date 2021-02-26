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

object paginationLinkMod {
  
  @JSImport("reactstrap/lib/PaginationLink", JSImport.Default)
  @js.native
  class default ()
    extends Component[PaginationLinkProps, js.Object, js.Any]
  
  type PaginationLink = ReactComponentClass[PaginationLinkProps]
  
  @js.native
  trait PaginationLinkProps
    extends AnchorHTMLAttributes[HTMLAnchorElement]
       with /* key */ StringDictionary[js.Any] {
    
    var cssModule: js.UndefOr[CSSModule] = js.native
    
    var first: js.UndefOr[Boolean] = js.native
    
    var last: js.UndefOr[Boolean] = js.native
    
    var next: js.UndefOr[Boolean] = js.native
    
    var previous: js.UndefOr[Boolean] = js.native
    
    var tag: js.UndefOr[ReactElement] = js.native
  }
  object PaginationLinkProps {
    
    @scala.inline
    def apply(): PaginationLinkProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaginationLinkProps]
    }
    
    @scala.inline
    implicit class PaginationLinkPropsMutableBuilder[Self <: PaginationLinkProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      @scala.inline
      def setFirst(value: Boolean): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstUndefined: Self = StObject.set(x, "first", js.undefined)
      
      @scala.inline
      def setLast(value: Boolean): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastUndefined: Self = StObject.set(x, "last", js.undefined)
      
      @scala.inline
      def setNext(value: Boolean): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      @scala.inline
      def setPrevious(value: Boolean): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
      
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
