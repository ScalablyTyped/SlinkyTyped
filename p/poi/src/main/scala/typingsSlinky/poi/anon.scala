package typingsSlinky.poi

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.htmlWebpackPlugin.anon.BodyTags
import typingsSlinky.htmlWebpackPlugin.anon.Css
import typingsSlinky.htmlWebpackPlugin.mod.MinifyOptions
import typingsSlinky.htmlWebpackPlugin.mod.ProcessedOptions
import typingsSlinky.poi.poiBooleans.`false`
import typingsSlinky.poi.poiBooleans.`true`
import typingsSlinky.poi.poiStrings.all
import typingsSlinky.poi.poiStrings.auto
import typingsSlinky.poi.poiStrings.blocking
import typingsSlinky.poi.poiStrings.body
import typingsSlinky.poi.poiStrings.defer
import typingsSlinky.poi.poiStrings.head
import typingsSlinky.poi.poiStrings.manual
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait CacheDirectory extends StObject {
    
    var cacheDirectory: String = js.native
    
    var cacheIdentifier: String = js.native
  }
  object CacheDirectory {
    
    @scala.inline
    def apply(cacheDirectory: String, cacheIdentifier: String): CacheDirectory = {
      val __obj = js.Dynamic.literal(cacheDirectory = cacheDirectory.asInstanceOf[js.Any], cacheIdentifier = cacheIdentifier.asInstanceOf[js.Any])
      __obj.asInstanceOf[CacheDirectory]
    }
    
    @scala.inline
    implicit class CacheDirectoryMutableBuilder[Self <: CacheDirectory] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCacheDirectory(value: String): Self = StObject.set(x, "cacheDirectory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheIdentifier(value: String): Self = StObject.set(x, "cacheIdentifier", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<html-webpack-plugin.html-webpack-plugin.Options> & {  entry :string,   chunks :std.Array<string> | undefined} */
  @js.native
  trait PartialOptionsentrystring extends StObject {
    
    var cache: js.UndefOr[Boolean] = js.native
    
    var chunks: (js.UndefOr[all | js.Array[String]]) with js.UndefOr[js.Array[String]] = js.native
    
    var chunksSortMode: js.UndefOr[
        auto | manual | (js.Function2[/* entryNameA */ String, /* entryNameB */ String, Double])
      ] = js.native
    
    var entry: String = js.native
    
    var excludeChunks: js.UndefOr[js.Array[String]] = js.native
    
    var favicon: js.UndefOr[`false` | String] = js.native
    
    var filename: js.UndefOr[String] = js.native
    
    var hash: js.UndefOr[Boolean] = js.native
    
    var inject: js.UndefOr[`false` | `true` | body | head] = js.native
    
    var meta: js.UndefOr[
        `false` | (StringDictionary[String | `false` | (StringDictionary[String | Boolean])])
      ] = js.native
    
    var minify: js.UndefOr[auto | Boolean | MinifyOptions] = js.native
    
    var publicPath: js.UndefOr[String | auto] = js.native
    
    var scriptLoading: js.UndefOr[blocking | defer] = js.native
    
    var showErrors: js.UndefOr[Boolean] = js.native
    
    var template: js.UndefOr[String] = js.native
    
    var templateContent: js.UndefOr[
        `false` | String | (js.Function1[/* templateParameters */ StringDictionary[js.Any], String | js.Promise[String]]) | js.Promise[String]
      ] = js.native
    
    var templateParameters: js.UndefOr[
        `false` | (js.Function4[
          /* compilation */ js.Any, 
          /* assets */ Css, 
          /* assetTags */ BodyTags, 
          /* options */ ProcessedOptions, 
          StringDictionary[_] | js.Promise[StringDictionary[_]]
        ]) | StringDictionary[js.Any]
      ] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var xhtml: js.UndefOr[Boolean] = js.native
  }
  object PartialOptionsentrystring {
    
    @scala.inline
    def apply(chunks: (js.UndefOr[all | js.Array[String]]) with js.UndefOr[js.Array[String]], entry: String): PartialOptionsentrystring = {
      val __obj = js.Dynamic.literal(chunks = chunks.asInstanceOf[js.Any], entry = entry.asInstanceOf[js.Any])
      __obj.asInstanceOf[PartialOptionsentrystring]
    }
    
    @scala.inline
    implicit class PartialOptionsentrystringMutableBuilder[Self <: PartialOptionsentrystring] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      @scala.inline
      def setChunks(value: (js.UndefOr[all | js.Array[String]]) with js.UndefOr[js.Array[String]]): Self = StObject.set(x, "chunks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChunksSortMode(value: auto | manual | (js.Function2[/* entryNameA */ String, /* entryNameB */ String, Double])): Self = StObject.set(x, "chunksSortMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChunksSortModeFunction2(value: (/* entryNameA */ String, /* entryNameB */ String) => Double): Self = StObject.set(x, "chunksSortMode", js.Any.fromFunction2(value))
      
      @scala.inline
      def setChunksSortModeUndefined: Self = StObject.set(x, "chunksSortMode", js.undefined)
      
      @scala.inline
      def setEntry(value: String): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeChunks(value: js.Array[String]): Self = StObject.set(x, "excludeChunks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeChunksUndefined: Self = StObject.set(x, "excludeChunks", js.undefined)
      
      @scala.inline
      def setExcludeChunksVarargs(value: String*): Self = StObject.set(x, "excludeChunks", js.Array(value :_*))
      
      @scala.inline
      def setFavicon(value: `false` | String): Self = StObject.set(x, "favicon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFaviconUndefined: Self = StObject.set(x, "favicon", js.undefined)
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      @scala.inline
      def setHash(value: Boolean): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      @scala.inline
      def setInject(value: `false` | `true` | body | head): Self = StObject.set(x, "inject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInjectUndefined: Self = StObject.set(x, "inject", js.undefined)
      
      @scala.inline
      def setMeta(value: `false` | (StringDictionary[String | `false` | (StringDictionary[String | Boolean])])): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      @scala.inline
      def setMinify(value: auto | Boolean | MinifyOptions): Self = StObject.set(x, "minify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinifyUndefined: Self = StObject.set(x, "minify", js.undefined)
      
      @scala.inline
      def setPublicPath(value: String | auto): Self = StObject.set(x, "publicPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicPathUndefined: Self = StObject.set(x, "publicPath", js.undefined)
      
      @scala.inline
      def setScriptLoading(value: blocking | defer): Self = StObject.set(x, "scriptLoading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScriptLoadingUndefined: Self = StObject.set(x, "scriptLoading", js.undefined)
      
      @scala.inline
      def setShowErrors(value: Boolean): Self = StObject.set(x, "showErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowErrorsUndefined: Self = StObject.set(x, "showErrors", js.undefined)
      
      @scala.inline
      def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateContent(
        value: `false` | String | (js.Function1[/* templateParameters */ StringDictionary[js.Any], String | js.Promise[String]]) | js.Promise[String]
      ): Self = StObject.set(x, "templateContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateContentFunction1(value: /* templateParameters */ StringDictionary[js.Any] => String | js.Promise[String]): Self = StObject.set(x, "templateContent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTemplateContentUndefined: Self = StObject.set(x, "templateContent", js.undefined)
      
      @scala.inline
      def setTemplateParameters(
        value: `false` | (js.Function4[
              /* compilation */ js.Any, 
              /* assets */ Css, 
              /* assetTags */ BodyTags, 
              /* options */ ProcessedOptions, 
              StringDictionary[_] | js.Promise[StringDictionary[_]]
            ]) | StringDictionary[js.Any]
      ): Self = StObject.set(x, "templateParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateParametersFunction4(
        value: (/* compilation */ js.Any, /* assets */ Css, /* assetTags */ BodyTags, /* options */ ProcessedOptions) => StringDictionary[_] | js.Promise[StringDictionary[_]]
      ): Self = StObject.set(x, "templateParameters", js.Any.fromFunction4(value))
      
      @scala.inline
      def setTemplateParametersUndefined: Self = StObject.set(x, "templateParameters", js.undefined)
      
      @scala.inline
      def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setXhtml(value: Boolean): Self = StObject.set(x, "xhtml", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXhtmlUndefined: Self = StObject.set(x, "xhtml", js.undefined)
    }
  }
}
