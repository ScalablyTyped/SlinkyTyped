package typingsSlinky.htmlTableify

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("html-tableify", JSImport.Namespace)
  @js.native
  def apply[T /* <: /* keyof any */ String */](data: js.Array[Datum[T]]): String = js.native
  @JSImport("html-tableify", JSImport.Namespace)
  @js.native
  def apply[T /* <: /* keyof any */ String */](data: js.Array[Datum[T]], config: Config[T]): String = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.htmlTableify.htmlTableifyStrings.center
    - typingsSlinky.htmlTableify.htmlTableifyStrings.left
    - typingsSlinky.htmlTableify.htmlTableifyStrings.right
  */
  trait Alignment extends StObject
  object Alignment {
    
    @scala.inline
    def center: typingsSlinky.htmlTableify.htmlTableifyStrings.center = "center".asInstanceOf[typingsSlinky.htmlTableify.htmlTableifyStrings.center]
    
    @scala.inline
    def left: typingsSlinky.htmlTableify.htmlTableifyStrings.left = "left".asInstanceOf[typingsSlinky.htmlTableify.htmlTableifyStrings.left]
    
    @scala.inline
    def right: typingsSlinky.htmlTableify.htmlTableifyStrings.right = "right".asInstanceOf[typingsSlinky.htmlTableify.htmlTableifyStrings.right]
  }
  
  /** Table config object for data with keys `T`. */
  @js.native
  trait Config[T] extends StObject {
    
    var headers: js.UndefOr[js.Array[Header[T]]] = js.native
    
    /** Tidy the output HTML. */
    var tidy: js.UndefOr[Boolean] = js.native
  }
  object Config {
    
    @scala.inline
    def apply[T](): Config[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config[T]]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config[_], T] (val x: Self with Config[T]) extends AnyVal {
      
      @scala.inline
      def setHeaders(value: js.Array[Header[T]]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHeadersVarargs(value: Header[T]*): Self = StObject.set(x, "headers", js.Array(value :_*))
      
      @scala.inline
      def setTidy(value: Boolean): Self = StObject.set(x, "tidy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTidyUndefined: Self = StObject.set(x, "tidy", js.undefined)
    }
  }
  
  /** Object of optional values for each key `T`. */
  type Datum[T /* <: /* keyof any */ String */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in T ]:? unknown}
    */ typingsSlinky.htmlTableify.htmlTableifyStrings.Datum with TopLevel[js.Any]
  
  /** Header config object for key `T`. */
  @js.native
  trait Header[T] extends StObject {
    
    /** Text align of the column. */
    var align: js.UndefOr[Alignment] = js.native
    
    /** Key in data object. */
    var name: T = js.native
    
    /** Title of the column. */
    var title: js.UndefOr[String] = js.native
  }
  object Header {
    
    @scala.inline
    def apply[T](name: T): Header[T] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Header[T]]
    }
    
    @scala.inline
    implicit class HeaderMutableBuilder[Self <: Header[_], T] (val x: Self with Header[T]) extends AnyVal {
      
      @scala.inline
      def setAlign(value: Alignment): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setName(value: T): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
