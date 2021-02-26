package typingsSlinky.rollupPluginJson

import typingsSlinky.rollup.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rollup-plugin-json", JSImport.Namespace)
  @js.native
  def apply(): Plugin = js.native
  @JSImport("rollup-plugin-json", JSImport.Namespace)
  @js.native
  def apply(options: Options): Plugin = js.native
  
  @js.native
  trait Options extends StObject {
    
    var exclude: js.UndefOr[String | js.Array[String]] = js.native
    
    /**
      *  All JSON files will be parsed by default, but you can also specifically include/exclude files
      */
    var include: js.UndefOr[String | js.Array[String]] = js.native
    
    /**
      * specify indentation for the generated default export — defaults to '\t'
      * @default '\t'
      */
    var indent: js.UndefOr[String] = js.native
    
    /**
      *  for tree-shaking, properties will be declared as variables, using either `var` or `const`
      *  @default false
      */
    var preferConst: js.UndefOr[Boolean] = js.native
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
      def setExclude(value: String | js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      @scala.inline
      def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value :_*))
      
      @scala.inline
      def setInclude(value: String | js.Array[String]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      @scala.inline
      def setIncludeVarargs(value: String*): Self = StObject.set(x, "include", js.Array(value :_*))
      
      @scala.inline
      def setIndent(value: String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      @scala.inline
      def setPreferConst(value: Boolean): Self = StObject.set(x, "preferConst", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreferConstUndefined: Self = StObject.set(x, "preferConst", js.undefined)
    }
  }
}
