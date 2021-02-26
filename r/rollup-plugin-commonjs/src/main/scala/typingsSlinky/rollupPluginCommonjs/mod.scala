package typingsSlinky.rollupPluginCommonjs

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.rollup.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rollup-plugin-commonjs", JSImport.Default)
  @js.native
  def default(): Plugin = js.native
  @JSImport("rollup-plugin-commonjs", JSImport.Default)
  @js.native
  def default(options: RollupCommonJSOptions): Plugin = js.native
  
  @js.native
  trait RollupCommonJSOptions extends StObject {
    
    /**
    	 * non-CommonJS modules will be ignored, but you can also
    	 * specifically include/exclude files
    	 * @default undefined
    	 */
    var exclude: js.UndefOr[String | js.RegExp | (js.Array[String | js.RegExp])] = js.native
    
    /**
    	 * search for files other than .js files (must already
    	 * be transpiled by a previous plugin!)
    	 * @default [ '.js' ]
    	 */
    var extensions: js.UndefOr[js.Array[String | js.RegExp]] = js.native
    
    /**
    	 * sometimes you have to leave require statements
    	 * unconverted. Pass an array containing the IDs
    	 * or a `id => boolean` function. Only use this
    	 * option if you know what you're doing!
    	 */
    var ignore: js.UndefOr[js.Array[String | (js.Function1[/* id */ String, Boolean])]] = js.native
    
    /**
    	 * if true then uses of `global` won't be dealt with by this plugin
    	 * @default false
    	 */
    var ignoreGlobal: js.UndefOr[Boolean] = js.native
    
    /**
    	 * non-CommonJS modules will be ignored, but you can also
    	 * specifically include/exclude files
    	 * @default undefined
    	 */
    var include: js.UndefOr[String | js.RegExp | (js.Array[String | js.RegExp])] = js.native
    
    /**
    	 * explicitly specify unresolvable named exports
    	 * ([see below for more details](https://github.com/rollup/rollup-plugin-commonjs#custom-named-exports))
    	 * @default undefined
    	 */
    var namedExports: js.UndefOr[StringDictionary[js.Array[String]]] = js.native
    
    /**
    	 * if false then skip sourceMap generation for CommonJS modules
    	 * @default true
    	 */
    var sourceMap: js.UndefOr[Boolean] = js.native
  }
  object RollupCommonJSOptions {
    
    @scala.inline
    def apply(): RollupCommonJSOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RollupCommonJSOptions]
    }
    
    @scala.inline
    implicit class RollupCommonJSOptionsMutableBuilder[Self <: RollupCommonJSOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExclude(value: String | js.RegExp | (js.Array[String | js.RegExp])): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeRegExp(value: js.RegExp): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      @scala.inline
      def setExcludeVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "exclude", js.Array(value :_*))
      
      @scala.inline
      def setExtensions(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      @scala.inline
      def setExtensionsVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "extensions", js.Array(value :_*))
      
      @scala.inline
      def setIgnore(value: js.Array[String | (js.Function1[/* id */ String, Boolean])]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreGlobal(value: Boolean): Self = StObject.set(x, "ignoreGlobal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreGlobalUndefined: Self = StObject.set(x, "ignoreGlobal", js.undefined)
      
      @scala.inline
      def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      @scala.inline
      def setIgnoreVarargs(value: (String | (js.Function1[/* id */ String, Boolean]))*): Self = StObject.set(x, "ignore", js.Array(value :_*))
      
      @scala.inline
      def setInclude(value: String | js.RegExp | (js.Array[String | js.RegExp])): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeRegExp(value: js.RegExp): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      @scala.inline
      def setIncludeVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "include", js.Array(value :_*))
      
      @scala.inline
      def setNamedExports(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "namedExports", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamedExportsUndefined: Self = StObject.set(x, "namedExports", js.undefined)
      
      @scala.inline
      def setSourceMap(value: Boolean): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
    }
  }
}
