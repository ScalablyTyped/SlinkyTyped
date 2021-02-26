package typingsSlinky.rollupPluginPostcss

import typingsSlinky.cssnano.mod.CssNanoOptions
import typingsSlinky.rollup.mod.Plugin
import typingsSlinky.rollupPluginPostcss.anon.Ctx
import typingsSlinky.rollupPluginPostcss.anon.InsertAt
import typingsSlinky.rollupPluginPostcss.rollupPluginPostcssStrings.`inline`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rollup-plugin-postcss", JSImport.Default)
  @js.native
  def default(): Plugin = js.native
  @JSImport("rollup-plugin-postcss", JSImport.Default)
  @js.native
  def default(options: PostCssPluginOptions): Plugin = js.native
  
  @js.native
  trait PostCssPluginOptions extends StObject {
    
    var autoModules: js.UndefOr[Boolean] = js.native
    
    var config: js.UndefOr[Boolean | Ctx] = js.native
    
    var exec: js.UndefOr[Boolean] = js.native
    
    var extensions: js.UndefOr[js.Array[String]] = js.native
    
    var extract: js.UndefOr[Boolean | String] = js.native
    
    var inject: js.UndefOr[
        Boolean | InsertAt | (js.Function2[/* cssVariableName */ String, /* fileId */ String, String])
      ] = js.native
    
    var loaders: js.UndefOr[js.Array[_]] = js.native
    
    var minimize: js.UndefOr[Boolean | CssNanoOptions] = js.native
    
    var modules: js.UndefOr[Boolean | js.Any] = js.native
    
    var name: js.UndefOr[js.Array[_ | js.Array[_]]] = js.native
    
    var namedExports: js.UndefOr[(js.Function1[/* name */ String, String]) | Boolean] = js.native
    
    var onImport: js.UndefOr[js.Function1[/* id */ js.Any, Unit]] = js.native
    
    var parser: js.UndefOr[(js.Function1[/* repeated */ js.Any, Unit]) | String] = js.native
    
    var plugins: js.UndefOr[js.Array[_]] = js.native
    
    var sourceMap: js.UndefOr[Boolean | `inline`] = js.native
    
    var stringifier: js.UndefOr[(js.Function1[/* repeated */ js.Any, Unit]) | String] = js.native
    
    var syntax: js.UndefOr[(js.Function1[/* repeated */ js.Any, Unit]) | String] = js.native
  }
  object PostCssPluginOptions {
    
    @scala.inline
    def apply(): PostCssPluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PostCssPluginOptions]
    }
    
    @scala.inline
    implicit class PostCssPluginOptionsMutableBuilder[Self <: PostCssPluginOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoModules(value: Boolean): Self = StObject.set(x, "autoModules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoModulesUndefined: Self = StObject.set(x, "autoModules", js.undefined)
      
      @scala.inline
      def setConfig(value: Boolean | Ctx): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      @scala.inline
      def setExec(value: Boolean): Self = StObject.set(x, "exec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecUndefined: Self = StObject.set(x, "exec", js.undefined)
      
      @scala.inline
      def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      @scala.inline
      def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value :_*))
      
      @scala.inline
      def setExtract(value: Boolean | String): Self = StObject.set(x, "extract", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtractUndefined: Self = StObject.set(x, "extract", js.undefined)
      
      @scala.inline
      def setInject(
        value: Boolean | InsertAt | (js.Function2[/* cssVariableName */ String, /* fileId */ String, String])
      ): Self = StObject.set(x, "inject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInjectFunction2(value: (/* cssVariableName */ String, /* fileId */ String) => String): Self = StObject.set(x, "inject", js.Any.fromFunction2(value))
      
      @scala.inline
      def setInjectUndefined: Self = StObject.set(x, "inject", js.undefined)
      
      @scala.inline
      def setLoaders(value: js.Array[_]): Self = StObject.set(x, "loaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadersUndefined: Self = StObject.set(x, "loaders", js.undefined)
      
      @scala.inline
      def setLoadersVarargs(value: js.Any*): Self = StObject.set(x, "loaders", js.Array(value :_*))
      
      @scala.inline
      def setMinimize(value: Boolean | CssNanoOptions): Self = StObject.set(x, "minimize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimizeUndefined: Self = StObject.set(x, "minimize", js.undefined)
      
      @scala.inline
      def setModules(value: Boolean | js.Any): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
      
      @scala.inline
      def setName(value: js.Array[_ | js.Array[_]]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNameVarargs(value: (js.Any | js.Array[js.Any])*): Self = StObject.set(x, "name", js.Array(value :_*))
      
      @scala.inline
      def setNamedExports(value: (js.Function1[/* name */ String, String]) | Boolean): Self = StObject.set(x, "namedExports", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamedExportsFunction1(value: /* name */ String => String): Self = StObject.set(x, "namedExports", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNamedExportsUndefined: Self = StObject.set(x, "namedExports", js.undefined)
      
      @scala.inline
      def setOnImport(value: /* id */ js.Any => Unit): Self = StObject.set(x, "onImport", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnImportUndefined: Self = StObject.set(x, "onImport", js.undefined)
      
      @scala.inline
      def setParser(value: (js.Function1[/* repeated */ js.Any, Unit]) | String): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParserFunction1(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "parser", js.Any.fromFunction1(value))
      
      @scala.inline
      def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
      
      @scala.inline
      def setPlugins(value: js.Array[_]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      @scala.inline
      def setPluginsVarargs(value: js.Any*): Self = StObject.set(x, "plugins", js.Array(value :_*))
      
      @scala.inline
      def setSourceMap(value: Boolean | `inline`): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
      
      @scala.inline
      def setStringifier(value: (js.Function1[/* repeated */ js.Any, Unit]) | String): Self = StObject.set(x, "stringifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStringifierFunction1(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "stringifier", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStringifierUndefined: Self = StObject.set(x, "stringifier", js.undefined)
      
      @scala.inline
      def setSyntax(value: (js.Function1[/* repeated */ js.Any, Unit]) | String): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSyntaxFunction1(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "syntax", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSyntaxUndefined: Self = StObject.set(x, "syntax", js.undefined)
    }
  }
}
