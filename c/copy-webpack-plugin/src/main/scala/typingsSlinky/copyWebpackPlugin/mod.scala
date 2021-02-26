package typingsSlinky.copyWebpackPlugin

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typingsSlinky.copyWebpackPlugin.copyWebpackPluginStrings.dir
import typingsSlinky.copyWebpackPlugin.copyWebpackPluginStrings.file
import typingsSlinky.copyWebpackPlugin.copyWebpackPluginStrings.template
import typingsSlinky.node.Buffer
import typingsSlinky.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("copy-webpack-plugin", JSImport.Namespace)
  @js.native
  class ^ () extends Plugin {
    def this(options: CopyPluginOptions) = this()
  }
  @JSImport("copy-webpack-plugin", JSImport.Namespace)
  @js.native
  val ^ : CopyPlugin = js.native
  
  @js.native
  trait CopyPlugin
    extends Instantiable0[Plugin]
       with Instantiable1[/* options */ CopyPluginOptions, Plugin]
  
  @js.native
  trait CopyPluginOptions extends StObject {
    
    var options: js.UndefOr[Options] = js.native
    
    var patterns: js.Array[StringPattern | ObjectPattern] = js.native
  }
  object CopyPluginOptions {
    
    @scala.inline
    def apply(patterns: js.Array[StringPattern | ObjectPattern]): CopyPluginOptions = {
      val __obj = js.Dynamic.literal(patterns = patterns.asInstanceOf[js.Any])
      __obj.asInstanceOf[CopyPluginOptions]
    }
    
    @scala.inline
    implicit class CopyPluginOptionsMutableBuilder[Self <: CopyPluginOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setPatterns(value: js.Array[StringPattern | ObjectPattern]): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternsVarargs(value: (StringPattern | ObjectPattern)*): Self = StObject.set(x, "patterns", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ObjectPattern extends StObject {
    
    /**
      * Enable/disable and configure caching. Default path to cache directory: node_modules/.cache/copy-webpack-plugin.
      * @default false
      */
    var cacheTransform: js.UndefOr[Boolean | String | js.Object] = js.native
    
    /**
      * A path that determines how to interpret the `from` path.
      * {@link https://webpack.js.org/plugins/copy-webpack-plugin/#context}
      * @default options.context | compiler.options.context
      */
    var context: js.UndefOr[String] = js.native
    
    /**
      * Allows to filter copied assets.
      */
    var filter: js.UndefOr[js.Function1[/* resourcePath */ String, Boolean]] = js.native
    
    /**
      * Removes all directory references and only copies file names. (default: `false`)
      * If files have the same name, the result is non-deterministic.
      * {@link https://webpack.js.org/plugins/copy-webpack-plugin/#flatten}
      * @default false
      */
    var flatten: js.UndefOr[Boolean] = js.native
    
    /**
      * Overwrites files already in `compilation.assets` (usually added by other plugins.
      * {@link https://webpack.js.org/plugins/copy-webpack-plugin/#force}
      * @default false
      */
    var force: js.UndefOr[Boolean] = js.native
    
    /**
      * File source path or glob
      * {@link https://webpack.js.org/plugins/copy-webpack-plugin/#from}
      * @default undefined
      */
    var from: String = js.native
    
    /**
      * Allows to configure the glob pattern matching library used by the plugin.
      * {@link https://webpack.js.org/plugins/copy-webpack-plugin/#globoptions}
      */
    var globOptions: js.UndefOr[js.Object] = js.native
    
    /**
      * Doesn't generate an error on missing file(s);
      * @default false
      */
    var noErrorOnMissing: js.UndefOr[Boolean] = js.native
    
    /**
      * Path or webpack file-loader patterns. defaults:
      * output root if `from` is file or dir.
      * resolved glob path if `from` is glob.
      * {@link https://webpack.js.org/plugins/copy-webpack-plugin/#to}
      * @default compiler.options.output
      */
    var to: js.UndefOr[String] = js.native
    
    /**
      * How to interpret `to`. default: undefined
      * `file` - if 'to' has extension or 'from' is file.
      * `dir` - if 'from' is directory, 'to' has no extension or ends in '/'.
      * `template` - if 'to' contains a template pattern.
      * @default undefined
      */
    var toType: js.UndefOr[file | dir | template] = js.native
    
    /**
      * Function that modifies file contents before writing to webpack. (default: `(content, path) => content`)
      * {@link https://webpack.js.org/plugins/copy-webpack-plugin/#transform}
      * @default undefined
      */
    var transform: js.UndefOr[
        js.Function2[
          /* content */ Buffer, 
          /* absoluteFrom */ String, 
          String | Buffer | (js.Promise[String | Buffer])
        ]
      ] = js.native
    
    /**
      * Allows to modify the writing path.
      * Returns the new path or a promise that resolves into the new path
      * @default undefined
      */
    var transformPath: js.UndefOr[
        js.Function2[/* targetPath */ String, /* absolutePath */ String, String | js.Promise[String]]
      ] = js.native
  }
  object ObjectPattern {
    
    @scala.inline
    def apply(from: String): ObjectPattern = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any])
      __obj.asInstanceOf[ObjectPattern]
    }
    
    @scala.inline
    implicit class ObjectPatternMutableBuilder[Self <: ObjectPattern] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCacheTransform(value: Boolean | String | js.Object): Self = StObject.set(x, "cacheTransform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheTransformUndefined: Self = StObject.set(x, "cacheTransform", js.undefined)
      
      @scala.inline
      def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setFilter(value: /* resourcePath */ String => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setFlatten(value: Boolean): Self = StObject.set(x, "flatten", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlattenUndefined: Self = StObject.set(x, "flatten", js.undefined)
      
      @scala.inline
      def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
      
      @scala.inline
      def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobOptions(value: js.Object): Self = StObject.set(x, "globOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobOptionsUndefined: Self = StObject.set(x, "globOptions", js.undefined)
      
      @scala.inline
      def setNoErrorOnMissing(value: Boolean): Self = StObject.set(x, "noErrorOnMissing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoErrorOnMissingUndefined: Self = StObject.set(x, "noErrorOnMissing", js.undefined)
      
      @scala.inline
      def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToType(value: file | dir | template): Self = StObject.set(x, "toType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToTypeUndefined: Self = StObject.set(x, "toType", js.undefined)
      
      @scala.inline
      def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      @scala.inline
      def setTransform(
        value: (/* content */ Buffer, /* absoluteFrom */ String) => String | Buffer | (js.Promise[String | Buffer])
      ): Self = StObject.set(x, "transform", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTransformPath(value: (/* targetPath */ String, /* absolutePath */ String) => String | js.Promise[String]): Self = StObject.set(x, "transformPath", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTransformPathUndefined: Self = StObject.set(x, "transformPath", js.undefined)
      
      @scala.inline
      def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    /**
      * Limits the number of simultaneous requests to fs
      * @default 100
      */
    var concurrency: js.UndefOr[Double] = js.native
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
      def setConcurrency(value: Double): Self = StObject.set(x, "concurrency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConcurrencyUndefined: Self = StObject.set(x, "concurrency", js.undefined)
    }
  }
  
  type StringPattern = String
  
  type _To = CopyPlugin
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: CopyPlugin = ^
}
