package typingsSlinky.reactDocumentTitle

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.ReactChild
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-document-title", JSImport.Default)
  @js.native
  class default ()
    extends Component[DocumentTitleProps, js.Any, js.Any]
  
  type DocumentTitle = ReactComponentClass[DocumentTitleProps]
  
  @js.native
  trait DocumentTitleProps extends StObject {
    
    var children: js.UndefOr[ReactChild | Null] = js.native
    
    var title: String = js.native
  }
  object DocumentTitleProps {
    
    @scala.inline
    def apply(title: String): DocumentTitleProps = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[DocumentTitleProps]
    }
    
    @scala.inline
    implicit class DocumentTitlePropsMutableBuilder[Self <: DocumentTitleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactChild): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenNull: Self = StObject.set(x, "children", null)
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
