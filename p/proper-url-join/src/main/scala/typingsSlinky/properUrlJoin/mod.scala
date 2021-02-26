package typingsSlinky.properUrlJoin

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.queryString.mod.StringifyOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("proper-url-join", JSImport.Default)
  @js.native
  val default: urlJoin = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
      * Add a leading slash.
      *
      * **Default**: `true`
      */
    var leadingSlash: js.UndefOr[Boolean] = js.native
    
    /**
      * Protocol relative URLs.
      *
      * **Default**: `false`
      */
    var protocolRelative: js.UndefOr[Boolean] = js.native
    
    /**
      * Query string object that will be properly stringified and appended to the url.
      * It will be merged with the query string in the url, if it exists.
      */
    var query: js.UndefOr[StringDictionary[String | Double | (js.Array[String | Double])]] = js.native
    
    /**
      * [query-string](https://github.com/sindresorhus/query-string#stringifyobject-options) singify method options to be considered when stringifying the query.
      */
    var queryOptions: js.UndefOr[StringifyOptions] = js.native
    
    /**
      * Add a trailing slash.
      *
      * **Default**: `false`
      */
    var trailingSlash: js.UndefOr[Boolean] = js.native
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
      def setLeadingSlash(value: Boolean): Self = StObject.set(x, "leadingSlash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeadingSlashUndefined: Self = StObject.set(x, "leadingSlash", js.undefined)
      
      @scala.inline
      def setProtocolRelative(value: Boolean): Self = StObject.set(x, "protocolRelative", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolRelativeUndefined: Self = StObject.set(x, "protocolRelative", js.undefined)
      
      @scala.inline
      def setQuery(value: StringDictionary[String | Double | (js.Array[String | Double])]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryOptions(value: StringifyOptions): Self = StObject.set(x, "queryOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryOptionsUndefined: Self = StObject.set(x, "queryOptions", js.undefined)
      
      @scala.inline
      def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      @scala.inline
      def setTrailingSlash(value: Boolean): Self = StObject.set(x, "trailingSlash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrailingSlashUndefined: Self = StObject.set(x, "trailingSlash", js.undefined)
    }
  }
  
  type PathArg = js.UndefOr[String | Null | Double]
  
  type _To = urlJoin
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: urlJoin = default
  
  @js.native
  trait urlJoin extends StObject {
    
    def apply(p1: PathArg): String = js.native
    def apply(p1: PathArg, options: Options): String = js.native
    def apply(p1: PathArg, p2: PathArg): String = js.native
    def apply(p1: PathArg, p2: PathArg, options: Options): String = js.native
    def apply(p1: PathArg, p2: PathArg, p3: PathArg): String = js.native
    def apply(p1: PathArg, p2: PathArg, p3: PathArg, options: Options): String = js.native
    def apply(p1: PathArg, p2: PathArg, p3: PathArg, p4: PathArg): String = js.native
    def apply(p1: PathArg, p2: PathArg, p3: PathArg, p4: PathArg, options: Options): String = js.native
    def apply(p1: PathArg, p2: PathArg, p3: PathArg, p4: PathArg, p5: PathArg): String = js.native
    def apply(p1: PathArg, p2: PathArg, p3: PathArg, p4: PathArg, p5: PathArg, options: Options): String = js.native
    def apply(p1: PathArg, p2: PathArg, p3: PathArg, p4: PathArg, p5: PathArg, p6: PathArg): String = js.native
    def apply(p1: PathArg, p2: PathArg, p3: PathArg, p4: PathArg, p5: PathArg, p6: PathArg, options: Options): String = js.native
    def apply(p1: PathArg, p2: PathArg, p3: PathArg, p4: PathArg, p5: PathArg, p6: PathArg, p7: PathArg): String = js.native
    def apply(
      p1: PathArg,
      p2: PathArg,
      p3: PathArg,
      p4: PathArg,
      p5: PathArg,
      p6: PathArg,
      p7: PathArg,
      options: Options
    ): String = js.native
    def apply(
      p1: PathArg,
      p2: PathArg,
      p3: PathArg,
      p4: PathArg,
      p5: PathArg,
      p6: PathArg,
      p7: PathArg,
      p8: PathArg
    ): String = js.native
    def apply(
      p1: PathArg,
      p2: PathArg,
      p3: PathArg,
      p4: PathArg,
      p5: PathArg,
      p6: PathArg,
      p7: PathArg,
      p8: PathArg,
      options: Options
    ): String = js.native
    def apply(
      p1: PathArg,
      p2: PathArg,
      p3: PathArg,
      p4: PathArg,
      p5: PathArg,
      p6: PathArg,
      p7: PathArg,
      p8: PathArg,
      p9: PathArg
    ): String = js.native
    def apply(
      p1: PathArg,
      p2: PathArg,
      p3: PathArg,
      p4: PathArg,
      p5: PathArg,
      p6: PathArg,
      p7: PathArg,
      p8: PathArg,
      p9: PathArg,
      options: Options
    ): String = js.native
    def apply(
      p1: PathArg,
      p2: PathArg,
      p3: PathArg,
      p4: PathArg,
      p5: PathArg,
      p6: PathArg,
      p7: PathArg,
      p8: PathArg,
      p9: PathArg,
      p10: PathArg
    ): String = js.native
    def apply(
      p1: PathArg,
      p2: PathArg,
      p3: PathArg,
      p4: PathArg,
      p5: PathArg,
      p6: PathArg,
      p7: PathArg,
      p8: PathArg,
      p9: PathArg,
      p10: PathArg,
      options: Options
    ): String = js.native
    def apply(
      p1: PathArg,
      p2: PathArg,
      p3: PathArg,
      p4: PathArg,
      p5: PathArg,
      p6: PathArg,
      p7: PathArg,
      p8: PathArg,
      p9: PathArg,
      p10: PathArg,
      p11: PathArg,
      args: (PathArg | Options)*
    ): String = js.native
  }
}
