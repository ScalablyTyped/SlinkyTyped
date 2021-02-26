package typingsSlinky.crittersWebpackPlugin

import typingsSlinky.crittersWebpackPlugin.crittersWebpackPluginStrings.`js-lazy`
import typingsSlinky.crittersWebpackPlugin.crittersWebpackPluginStrings.body
import typingsSlinky.crittersWebpackPlugin.crittersWebpackPluginStrings.js_
import typingsSlinky.crittersWebpackPlugin.crittersWebpackPluginStrings.media
import typingsSlinky.crittersWebpackPlugin.crittersWebpackPluginStrings.swap
import typingsSlinky.crittersWebpackPlugin.mod.Critters.CrittersOptions
import typingsSlinky.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("critters-webpack-plugin", JSImport.Default)
  @js.native
  class default () extends Plugin {
    def this(options: CrittersOptions) = this()
  }
  
  object Critters {
    
    @js.native
    trait CrittersOptions extends StObject {
      
      /**
        * Glob for matching other stylesheets to be used while looking for critical CSS
        */
      var additionalStylesheets: js.UndefOr[js.Array[String]] = js.native
      
      /**
        * Compress resulting critical CSS.
        * @default true
        */
      var compress: js.UndefOr[Boolean] = js.native
      
      /**
        * Inline styles from external stylesheets.
        * @default true
        */
      var external: js.UndefOr[Boolean] = js.native
      
      /**
        * Shorthand for setting inlineFonts+preloadFonts - Values:
        * - true to inline critical font-face rules and preload the fonts.
        * - false to don"t inline any font-face rules and don"t preload fonts.
        */
      var fonts: js.UndefOr[Boolean] = js.native
      
      /**
        * Inline critical font-face rules.
        * @default false
        */
      var inlineFonts: js.UndefOr[Boolean] = js.native
      
      /**
        * Inline external stylesheets smaller than a given size.
        * @default 0
        */
      var inlineThreshold: js.UndefOr[Double] = js.native
      
      /**
        * Controls which keyframes rules are inlined.
        * See {@link KeyFrameStrategy keyframe strategy}
        * @default "critical"
        */
      var keyframes: js.UndefOr[KeyframeStrategy] = js.native
      
      /**
        * Controls {@link LogLevel log level} of the plugin
        * @default 'info'
        */
      var logLevel: js.UndefOr[LogLevel] = js.native
      
      /**
        * Merged inlined stylesheets into a single <style> tag.
        * @default true
        */
      var mergeStylesheets: js.UndefOr[Boolean] = js.native
      
      /**
        * If the non-critical external stylesheet would be below this size, just inline it.
        * @default 0
        */
      var minimumExternalSize: js.UndefOr[Double] = js.native
      
      /**
        * Add <noscript> fallback to JS-based strategies
        */
      var noscriptFallback: js.UndefOr[Boolean] = js.native
      
      /**
        * The mechanism to use for lazy-loading stylesheets.
        *
        */
      var preload: js.UndefOr[body | media | swap | js_ | `js-lazy`] = js.native
      
      /**
        * Preloads critical fonts.
        * @default true
        */
      var preloadFonts: js.UndefOr[Boolean] = js.native
      
      /**
        * Remove inlined rules from the external stylesheet.
        * @default true
        */
      var pruneSource: js.UndefOr[Boolean] = js.native
    }
    object CrittersOptions {
      
      @scala.inline
      def apply(): CrittersOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CrittersOptions]
      }
      
      @scala.inline
      implicit class CrittersOptionsMutableBuilder[Self <: CrittersOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAdditionalStylesheets(value: js.Array[String]): Self = StObject.set(x, "additionalStylesheets", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAdditionalStylesheetsUndefined: Self = StObject.set(x, "additionalStylesheets", js.undefined)
        
        @scala.inline
        def setAdditionalStylesheetsVarargs(value: String*): Self = StObject.set(x, "additionalStylesheets", js.Array(value :_*))
        
        @scala.inline
        def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
        
        @scala.inline
        def setExternal(value: Boolean): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExternalUndefined: Self = StObject.set(x, "external", js.undefined)
        
        @scala.inline
        def setFonts(value: Boolean): Self = StObject.set(x, "fonts", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFontsUndefined: Self = StObject.set(x, "fonts", js.undefined)
        
        @scala.inline
        def setInlineFonts(value: Boolean): Self = StObject.set(x, "inlineFonts", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInlineFontsUndefined: Self = StObject.set(x, "inlineFonts", js.undefined)
        
        @scala.inline
        def setInlineThreshold(value: Double): Self = StObject.set(x, "inlineThreshold", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInlineThresholdUndefined: Self = StObject.set(x, "inlineThreshold", js.undefined)
        
        @scala.inline
        def setKeyframes(value: KeyframeStrategy): Self = StObject.set(x, "keyframes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKeyframesUndefined: Self = StObject.set(x, "keyframes", js.undefined)
        
        @scala.inline
        def setLogLevel(value: LogLevel): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
        
        @scala.inline
        def setMergeStylesheets(value: Boolean): Self = StObject.set(x, "mergeStylesheets", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMergeStylesheetsUndefined: Self = StObject.set(x, "mergeStylesheets", js.undefined)
        
        @scala.inline
        def setMinimumExternalSize(value: Double): Self = StObject.set(x, "minimumExternalSize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMinimumExternalSizeUndefined: Self = StObject.set(x, "minimumExternalSize", js.undefined)
        
        @scala.inline
        def setNoscriptFallback(value: Boolean): Self = StObject.set(x, "noscriptFallback", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNoscriptFallbackUndefined: Self = StObject.set(x, "noscriptFallback", js.undefined)
        
        @scala.inline
        def setPreload(value: body | media | swap | js_ | `js-lazy`): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPreloadFonts(value: Boolean): Self = StObject.set(x, "preloadFonts", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPreloadFontsUndefined: Self = StObject.set(x, "preloadFonts", js.undefined)
        
        @scala.inline
        def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
        
        @scala.inline
        def setPruneSource(value: Boolean): Self = StObject.set(x, "pruneSource", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPruneSourceUndefined: Self = StObject.set(x, "pruneSource", js.undefined)
      }
    }
    
    /**
      * Controls which keyframes rules are inlined
      * - "critical": Inline keyframes rules used by the critical CSS.
      * - "all" Inline all keyframes rules.
      * - "none" Remove all keyframes rules
      */
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.crittersWebpackPlugin.crittersWebpackPluginStrings.critical
      - typingsSlinky.crittersWebpackPlugin.crittersWebpackPluginStrings.all
      - typingsSlinky.crittersWebpackPlugin.crittersWebpackPluginStrings.none
    */
    trait KeyframeStrategy extends StObject
    object KeyframeStrategy {
      
      @scala.inline
      def all: typingsSlinky.crittersWebpackPlugin.crittersWebpackPluginStrings.all = "all".asInstanceOf[typingsSlinky.crittersWebpackPlugin.crittersWebpackPluginStrings.all]
      
      @scala.inline
      def critical: typingsSlinky.crittersWebpackPlugin.crittersWebpackPluginStrings.critical = "critical".asInstanceOf[typingsSlinky.crittersWebpackPlugin.crittersWebpackPluginStrings.critical]
      
      @scala.inline
      def none: typingsSlinky.crittersWebpackPlugin.crittersWebpackPluginStrings.none = "none".asInstanceOf[typingsSlinky.crittersWebpackPlugin.crittersWebpackPluginStrings.none]
    }
    
    /**
      * Controls log level of the plugin.
      * Specifies the level the logger should use. A logger will
      * not produce output for any log level beneath the specified level.
      * Available levels and order are:
      * - **"info"** _(default)_
      * - **"warn"**
      * - **"error"**
      * - **"trace"**
      * - **"debug"**
      * - **"silent"**
      */
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.crittersWebpackPlugin.crittersWebpackPluginStrings.info
      - typingsSlinky.crittersWebpackPlugin.crittersWebpackPluginStrings.warn
      - typingsSlinky.crittersWebpackPlugin.crittersWebpackPluginStrings.error
      - typingsSlinky.crittersWebpackPlugin.crittersWebpackPluginStrings.trace
      - typingsSlinky.crittersWebpackPlugin.crittersWebpackPluginStrings.debug
      - typingsSlinky.crittersWebpackPlugin.crittersWebpackPluginStrings.silent
    */
    trait LogLevel extends StObject
    object LogLevel {
      
      @scala.inline
      def debug: typingsSlinky.crittersWebpackPlugin.crittersWebpackPluginStrings.debug = "debug".asInstanceOf[typingsSlinky.crittersWebpackPlugin.crittersWebpackPluginStrings.debug]
      
      @scala.inline
      def error: typingsSlinky.crittersWebpackPlugin.crittersWebpackPluginStrings.error = "error".asInstanceOf[typingsSlinky.crittersWebpackPlugin.crittersWebpackPluginStrings.error]
      
      @scala.inline
      def info: typingsSlinky.crittersWebpackPlugin.crittersWebpackPluginStrings.info = "info".asInstanceOf[typingsSlinky.crittersWebpackPlugin.crittersWebpackPluginStrings.info]
      
      @scala.inline
      def silent: typingsSlinky.crittersWebpackPlugin.crittersWebpackPluginStrings.silent = "silent".asInstanceOf[typingsSlinky.crittersWebpackPlugin.crittersWebpackPluginStrings.silent]
      
      @scala.inline
      def trace: typingsSlinky.crittersWebpackPlugin.crittersWebpackPluginStrings.trace = "trace".asInstanceOf[typingsSlinky.crittersWebpackPlugin.crittersWebpackPluginStrings.trace]
      
      @scala.inline
      def warn: typingsSlinky.crittersWebpackPlugin.crittersWebpackPluginStrings.warn = "warn".asInstanceOf[typingsSlinky.crittersWebpackPlugin.crittersWebpackPluginStrings.warn]
    }
    
    /**
      * The mechanism to use for lazy-loading stylesheets.
      * indicates that a strategy requires JavaScript (falls back to `<noscript>`).
      * - **default:** Move stylesheet links to the end of the document and insert preload meta tags in their place.
      * - **"body":** Move all external stylesheet links to the end of the document.
      * - **"media":** Load stylesheets asynchronously by adding `media="not x"` and removing once loaded. _[JS]_
      * - **"swap":** Convert stylesheet links to preloads that swap to `rel="stylesheet"` once loaded. _[JS]_
      * - **"js":** Inject an asynchronous CSS loader similar to [LoadCSS](https://github.com/filamentgroup/loadCSS) and use it to load stylesheets. _[JS]_
      * - **"js-lazy":** Like `"js"`, but the stylesheet is disabled until fully loaded.
      */
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.crittersWebpackPlugin.crittersWebpackPluginStrings.body
      - typingsSlinky.crittersWebpackPlugin.crittersWebpackPluginStrings.media
      - typingsSlinky.crittersWebpackPlugin.crittersWebpackPluginStrings.swap
      - typingsSlinky.crittersWebpackPlugin.crittersWebpackPluginStrings.js_
      - typingsSlinky.crittersWebpackPlugin.crittersWebpackPluginStrings.`js-lazy`
    */
    trait PreloadStrategy extends StObject
    object PreloadStrategy {
      
      @scala.inline
      def body: typingsSlinky.crittersWebpackPlugin.crittersWebpackPluginStrings.body = "body".asInstanceOf[typingsSlinky.crittersWebpackPlugin.crittersWebpackPluginStrings.body]
      
      @scala.inline
      def `js-lazy`: typingsSlinky.crittersWebpackPlugin.crittersWebpackPluginStrings.`js-lazy` = "js-lazy".asInstanceOf[typingsSlinky.crittersWebpackPlugin.crittersWebpackPluginStrings.`js-lazy`]
      
      @scala.inline
      def js_ : typingsSlinky.crittersWebpackPlugin.crittersWebpackPluginStrings.js_ = "js".asInstanceOf[typingsSlinky.crittersWebpackPlugin.crittersWebpackPluginStrings.js_]
      
      @scala.inline
      def media: typingsSlinky.crittersWebpackPlugin.crittersWebpackPluginStrings.media = "media".asInstanceOf[typingsSlinky.crittersWebpackPlugin.crittersWebpackPluginStrings.media]
      
      @scala.inline
      def swap: typingsSlinky.crittersWebpackPlugin.crittersWebpackPluginStrings.swap = "swap".asInstanceOf[typingsSlinky.crittersWebpackPlugin.crittersWebpackPluginStrings.swap]
    }
  }
  type Critters = Plugin
}
