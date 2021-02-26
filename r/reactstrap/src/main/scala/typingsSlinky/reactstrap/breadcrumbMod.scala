package typingsSlinky.reactstrap

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.reactstrap.mod.CSSModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object breadcrumbMod {
  
  @JSImport("reactstrap/lib/Breadcrumb", JSImport.Default)
  @js.native
  class default ()
    extends Component[BreadcrumbProps, js.Object, js.Any]
  
  type Breadcrumb = ReactComponentClass[BreadcrumbProps]
  
  @js.native
  trait BreadcrumbProps
    extends HTMLAttributes[HTMLElement]
       with /* key */ StringDictionary[js.Any] {
    
    var cssModule: js.UndefOr[CSSModule] = js.native
    
    var listClassName: js.UndefOr[String] = js.native
    
    var listTag: js.UndefOr[ReactElement] = js.native
    
    var tag: js.UndefOr[ReactElement] = js.native
  }
  object BreadcrumbProps {
    
    @scala.inline
    def apply(): BreadcrumbProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BreadcrumbProps]
    }
    
    @scala.inline
    implicit class BreadcrumbPropsMutableBuilder[Self <: BreadcrumbProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      @scala.inline
      def setListClassName(value: String): Self = StObject.set(x, "listClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListClassNameUndefined: Self = StObject.set(x, "listClassName", js.undefined)
      
      @scala.inline
      def setListTag(value: ReactElement): Self = StObject.set(x, "listTag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListTagComponentClass(value: ReactComponentClass[_]): Self = StObject.set(x, "listTag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListTagFunctionComponent(value: ReactComponentClass[_]): Self = StObject.set(x, "listTag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListTagUndefined: Self = StObject.set(x, "listTag", js.undefined)
      
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
