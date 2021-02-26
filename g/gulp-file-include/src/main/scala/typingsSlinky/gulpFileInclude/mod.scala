package typingsSlinky.gulpFileInclude

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.gulpFileInclude.gulpFileIncludeStrings.`@file`
import typingsSlinky.gulpFileInclude.gulpFileIncludeStrings.`@root`
import typingsSlinky.node.NodeJS.ReadWriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gulp-file-include", JSImport.Namespace)
  @js.native
  def apply(opts: Options): ReadWriteStream = js.native
  @JSImport("gulp-file-include", JSImport.Namespace)
  @js.native
  def apply(prefix: String): ReadWriteStream = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
      * Can be "@file" or "@root" or some base path.
      * default: "@file"
      */
    var basepath: js.UndefOr[`@file` | `@root` | String] = js.native
    
    /**
      * Effectively a context for variables used in 'if' statements.
      */
    var context: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    /**
      * Filters basically look like functions that get passed into '@@include'.
      * When one of these functions is called, something of that name is looked
      * up in this object and called to get the contents of that include.
      */
    var filters: js.UndefOr[StringDictionary[js.Function1[/* arg */ js.Any, String]]] = js.native
    
    /**
      * default: false
      */
    var indent: js.UndefOr[Boolean] = js.native
    
    /** default: "@@" */
    var prefix: js.UndefOr[String] = js.native
    
    /** default: "" */
    var suffix: js.UndefOr[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBasepath(value: `@file` | `@root` | String): Self = StObject.set(x, "basepath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBasepathUndefined: Self = StObject.set(x, "basepath", js.undefined)
      
      @scala.inline
      def setContext(value: StringDictionary[js.Any]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setFilters(value: StringDictionary[js.Function1[/* arg */ js.Any, String]]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setIndent(value: Boolean): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    }
  }
}
