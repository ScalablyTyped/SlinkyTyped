package typingsSlinky.reactPdf

import slinky.core.ReactComponentClass
import typingsSlinky.pdfjsDist.mod.PDFTreeNode
import typingsSlinky.react.mod.Component
import typingsSlinky.reactPdf.anon.PageNumber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outlineMod {
  
  @JSImport("react-pdf/dist/Outline", JSImport.Default)
  @js.native
  class default ()
    extends Component[Props, js.Object, js.Any]
  
  type Outline = ReactComponentClass[Props]
  
  @js.native
  trait Props extends StObject {
    
    /**
      * Defines custom class name(s), that will be added to rendered element.
      * @default 'react-pdf__Outline'
      */
    var className: js.UndefOr[String | js.Array[String]] = js.native
    
    /**
      * Function called when an outline item has been clicked.
      * Usually, you would like to use this callback to move the user wherever they requested to.
      */
    var onItemClick: js.UndefOr[js.Function1[/* hasPageNumber */ PageNumber, Unit]] = js.native
    
    /**
      * Function called in case of an error while retrieving the outline.
      */
    var onLoadError: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.native
    
    /**
      * Function called when the outline is successfully retrieved.
      */
    var onLoadSuccess: js.UndefOr[js.Function1[/* outline */ js.Array[PDFTreeNode], Unit]] = js.native
  }
  object Props {
    
    @scala.inline
    def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String | js.Array[String]): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClassNameVarargs(value: String*): Self = StObject.set(x, "className", js.Array(value :_*))
      
      @scala.inline
      def setOnItemClick(value: /* hasPageNumber */ PageNumber => Unit): Self = StObject.set(x, "onItemClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnItemClickUndefined: Self = StObject.set(x, "onItemClick", js.undefined)
      
      @scala.inline
      def setOnLoadError(value: /* error */ js.Error => Unit): Self = StObject.set(x, "onLoadError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadErrorUndefined: Self = StObject.set(x, "onLoadError", js.undefined)
      
      @scala.inline
      def setOnLoadSuccess(value: /* outline */ js.Array[PDFTreeNode] => Unit): Self = StObject.set(x, "onLoadSuccess", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadSuccessUndefined: Self = StObject.set(x, "onLoadSuccess", js.undefined)
    }
  }
}
