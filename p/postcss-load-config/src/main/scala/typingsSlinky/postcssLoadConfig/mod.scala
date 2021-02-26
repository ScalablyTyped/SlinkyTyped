package typingsSlinky.postcssLoadConfig

import typingsSlinky.cosmiconfig.mod.Options
import typingsSlinky.postcss.anon.PickProcessOptionsmapfrom
import typingsSlinky.postcss.mod.Builder
import typingsSlinky.postcss.mod.Node
import typingsSlinky.postcss.mod.Parser
import typingsSlinky.postcss.mod.ParserInput
import typingsSlinky.postcss.mod.ProcessOptions
import typingsSlinky.postcss.mod.Processor
import typingsSlinky.postcss.mod.Root_
import typingsSlinky.postcss.mod.SourceMapOptions
import typingsSlinky.postcss.mod.Stringifier
import typingsSlinky.postcss.mod.Syntax
import typingsSlinky.std.Plugin
import typingsSlinky.std.Transformer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("postcss-load-config", JSImport.Namespace)
  @js.native
  def apply(): js.Promise[Result] = js.native
  @JSImport("postcss-load-config", JSImport.Namespace)
  @js.native
  def apply(ctx: js.UndefOr[scala.Nothing], path: js.UndefOr[scala.Nothing], options: Options): js.Promise[Result] = js.native
  @JSImport("postcss-load-config", JSImport.Namespace)
  @js.native
  def apply(ctx: js.UndefOr[scala.Nothing], path: String): js.Promise[Result] = js.native
  @JSImport("postcss-load-config", JSImport.Namespace)
  @js.native
  def apply(ctx: js.UndefOr[scala.Nothing], path: String, options: Options): js.Promise[Result] = js.native
  @JSImport("postcss-load-config", JSImport.Namespace)
  @js.native
  def apply(ctx: ConfigContext): js.Promise[Result] = js.native
  @JSImport("postcss-load-config", JSImport.Namespace)
  @js.native
  def apply(ctx: ConfigContext, path: js.UndefOr[scala.Nothing], options: Options): js.Promise[Result] = js.native
  @JSImport("postcss-load-config", JSImport.Namespace)
  @js.native
  def apply(ctx: ConfigContext, path: String): js.Promise[Result] = js.native
  @JSImport("postcss-load-config", JSImport.Namespace)
  @js.native
  def apply(ctx: ConfigContext, path: String, options: Options): js.Promise[Result] = js.native
  
  @JSImport("postcss-load-config", "sync")
  @js.native
  def sync(): Result = js.native
  @JSImport("postcss-load-config", "sync")
  @js.native
  def sync(ctx: js.UndefOr[scala.Nothing], path: js.UndefOr[scala.Nothing], options: Options): Result = js.native
  @JSImport("postcss-load-config", "sync")
  @js.native
  def sync(ctx: js.UndefOr[scala.Nothing], path: String): Result = js.native
  @JSImport("postcss-load-config", "sync")
  @js.native
  def sync(ctx: js.UndefOr[scala.Nothing], path: String, options: Options): Result = js.native
  @JSImport("postcss-load-config", "sync")
  @js.native
  def sync(ctx: ConfigContext): Result = js.native
  @JSImport("postcss-load-config", "sync")
  @js.native
  def sync(ctx: ConfigContext, path: js.UndefOr[scala.Nothing], options: Options): Result = js.native
  @JSImport("postcss-load-config", "sync")
  @js.native
  def sync(ctx: ConfigContext, path: String): Result = js.native
  @JSImport("postcss-load-config", "sync")
  @js.native
  def sync(ctx: ConfigContext, path: String, options: Options): Result = js.native
  
  // The full shape of the ConfigContext.
  /* Inlined postcss-load-config.postcss-load-config.Context & postcss-load-config.postcss-load-config.ProcessOptionsPreload & postcss-load-config.postcss-load-config.RemainingProcessOptions */
  @js.native
  trait ConfigContext extends StObject {
    
    var cwd: js.UndefOr[String] = js.native
    
    var env: js.UndefOr[String] = js.native
    
    var from: js.UndefOr[String] = js.native
    
    var map: js.UndefOr[SourceMapOptions | Boolean] = js.native
    
    var parser: js.UndefOr[String | Parser] = js.native
    
    var stringifier: js.UndefOr[String | Stringifier] = js.native
    
    var syntax: js.UndefOr[String | Syntax] = js.native
    
    var to: js.UndefOr[String] = js.native
  }
  object ConfigContext {
    
    @scala.inline
    def apply(): ConfigContext = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigContext]
    }
    
    @scala.inline
    implicit class ConfigContextMutableBuilder[Self <: ConfigContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setEnv(value: String): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      @scala.inline
      def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      @scala.inline
      def setMap(value: SourceMapOptions | Boolean): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      @scala.inline
      def setParser(value: String | Parser): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParserFunction2(value: (/* css */ ParserInput, /* opts */ js.UndefOr[PickProcessOptionsmapfrom]) => Root_): Self = StObject.set(x, "parser", js.Any.fromFunction2(value))
      
      @scala.inline
      def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
      
      @scala.inline
      def setStringifier(value: String | Stringifier): Self = StObject.set(x, "stringifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStringifierFunction2(value: (/* node */ Node, /* builder */ Builder) => Unit): Self = StObject.set(x, "stringifier", js.Any.fromFunction2(value))
      
      @scala.inline
      def setStringifierUndefined: Self = StObject.set(x, "stringifier", js.undefined)
      
      @scala.inline
      def setSyntax(value: String | Syntax): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSyntaxUndefined: Self = StObject.set(x, "syntax", js.undefined)
      
      @scala.inline
      def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
  
  // Additional context options that postcss-load-config understands.
  @js.native
  trait Context extends StObject {
    
    var cwd: js.UndefOr[String] = js.native
    
    var env: js.UndefOr[String] = js.native
  }
  object Context {
    
    @scala.inline
    def apply(): Context = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Context]
    }
    
    @scala.inline
    implicit class ContextMutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setEnv(value: String): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    }
  }
  
  // In the ConfigContext, these three options can be instances of the
  // appropriate class, or strings. If they are strings, postcss-load-config will
  // require() them and pass the instances along.
  @js.native
  trait ProcessOptionsPreload extends StObject {
    
    var parser: js.UndefOr[String | Parser] = js.native
    
    var stringifier: js.UndefOr[String | Stringifier] = js.native
    
    var syntax: js.UndefOr[String | Syntax] = js.native
  }
  object ProcessOptionsPreload {
    
    @scala.inline
    def apply(): ProcessOptionsPreload = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProcessOptionsPreload]
    }
    
    @scala.inline
    implicit class ProcessOptionsPreloadMutableBuilder[Self <: ProcessOptionsPreload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParser(value: String | Parser): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParserFunction2(value: (/* css */ ParserInput, /* opts */ js.UndefOr[PickProcessOptionsmapfrom]) => Root_): Self = StObject.set(x, "parser", js.Any.fromFunction2(value))
      
      @scala.inline
      def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
      
      @scala.inline
      def setStringifier(value: String | Stringifier): Self = StObject.set(x, "stringifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStringifierFunction2(value: (/* node */ Node, /* builder */ Builder) => Unit): Self = StObject.set(x, "stringifier", js.Any.fromFunction2(value))
      
      @scala.inline
      def setStringifierUndefined: Self = StObject.set(x, "stringifier", js.undefined)
      
      @scala.inline
      def setSyntax(value: String | Syntax): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSyntaxUndefined: Self = StObject.set(x, "syntax", js.undefined)
    }
  }
  
  // The remaining ProcessOptions, sans the three above.
  /* Inlined std.Pick<postcss.postcss.ProcessOptions, std.Exclude<keyof postcss.postcss.ProcessOptions, keyof postcss-load-config.postcss-load-config.ProcessOptionsPreload>> */
  @js.native
  trait RemainingProcessOptions extends StObject {
    
    var from: js.UndefOr[String] = js.native
    
    var map: js.UndefOr[SourceMapOptions | Boolean] = js.native
    
    var to: js.UndefOr[String] = js.native
  }
  object RemainingProcessOptions {
    
    @scala.inline
    def apply(): RemainingProcessOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RemainingProcessOptions]
    }
    
    @scala.inline
    implicit class RemainingProcessOptionsMutableBuilder[Self <: RemainingProcessOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      @scala.inline
      def setMap(value: SourceMapOptions | Boolean): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      @scala.inline
      def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
  
  @js.native
  trait Result extends StObject {
    
    var file: String = js.native
    
    var options: ProcessOptions = js.native
    
    var plugins: js.Array[ResultPlugin] = js.native
  }
  object Result {
    
    @scala.inline
    def apply(file: String, options: ProcessOptions, plugins: js.Array[ResultPlugin]): Result = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    @scala.inline
    implicit class ResultMutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: ProcessOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlugins(value: js.Array[ResultPlugin]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginsVarargs(value: ResultPlugin*): Self = StObject.set(x, "plugins", js.Array(value :_*))
    }
  }
  
  // Result of postcssrc is a Promise containing the filename plus the options
  // and plugins that are ready to pass on to postcss.
  type ResultPlugin = Plugin | (Transformer[js.Any, js.Any]) | Processor
}
