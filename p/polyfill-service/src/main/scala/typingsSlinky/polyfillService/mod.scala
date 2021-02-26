package typingsSlinky.polyfillService

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("polyfill-service", "getPolyfillString")
  @js.native
  def getPolyfillString(options: GetPolyfillStringOptions): js.Promise[String] = js.native
  
  @JSImport("polyfill-service", "getPolyfills")
  @js.native
  def getPolyfills(options: GetPolyfillsOptions): js.Promise[GetPolyfillsResponse] = js.native
  
  @JSImport("polyfill-service", "listAllPolyfills")
  @js.native
  def listAllPolyfills(): js.Promise[js.Array[String]] = js.native
  
  @js.native
  trait Feature extends StObject {
    
    var flags: js.UndefOr[js.Array[PolyfillFlag]] = js.native
  }
  object Feature {
    
    @scala.inline
    def apply(): Feature = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Feature]
    }
    
    @scala.inline
    implicit class FeatureMutableBuilder[Self <: Feature] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFlags(value: js.Array[PolyfillFlag]): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      @scala.inline
      def setFlagsVarargs(value: PolyfillFlag*): Self = StObject.set(x, "flags", js.Array(value :_*))
    }
  }
  
  type Features = StringDictionary[Feature]
  
  @js.native
  trait GetPolyfillStringOptions extends GetPolyfillsOptions {
    
    var minify: js.UndefOr[Boolean] = js.native
    
    var unknown: js.UndefOr[Unknown] = js.native
  }
  object GetPolyfillStringOptions {
    
    @scala.inline
    def apply(uaString: String): GetPolyfillStringOptions = {
      val __obj = js.Dynamic.literal(uaString = uaString.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetPolyfillStringOptions]
    }
    
    @scala.inline
    implicit class GetPolyfillStringOptionsMutableBuilder[Self <: GetPolyfillStringOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMinify(value: Boolean): Self = StObject.set(x, "minify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinifyUndefined: Self = StObject.set(x, "minify", js.undefined)
      
      @scala.inline
      def setUnknown(value: Unknown): Self = StObject.set(x, "unknown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnknownUndefined: Self = StObject.set(x, "unknown", js.undefined)
    }
  }
  
  @js.native
  trait GetPolyfillsOptions extends StObject {
    
    var excludes: js.UndefOr[js.Array[String]] = js.native
    
    var features: js.UndefOr[Features] = js.native
    
    var uaString: String = js.native
  }
  object GetPolyfillsOptions {
    
    @scala.inline
    def apply(uaString: String): GetPolyfillsOptions = {
      val __obj = js.Dynamic.literal(uaString = uaString.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetPolyfillsOptions]
    }
    
    @scala.inline
    implicit class GetPolyfillsOptionsMutableBuilder[Self <: GetPolyfillsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExcludes(value: js.Array[String]): Self = StObject.set(x, "excludes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludesUndefined: Self = StObject.set(x, "excludes", js.undefined)
      
      @scala.inline
      def setExcludesVarargs(value: String*): Self = StObject.set(x, "excludes", js.Array(value :_*))
      
      @scala.inline
      def setFeatures(value: Features): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
      
      @scala.inline
      def setUaString(value: String): Self = StObject.set(x, "uaString", value.asInstanceOf[js.Any])
    }
  }
  
  type GetPolyfillsResponse = StringDictionary[PolyfillSpec]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.polyfillService.polyfillServiceStrings.gated
    - typingsSlinky.polyfillService.polyfillServiceStrings.always
  */
  trait PolyfillFlag extends StObject
  object PolyfillFlag {
    
    @scala.inline
    def always: typingsSlinky.polyfillService.polyfillServiceStrings.always = "always".asInstanceOf[typingsSlinky.polyfillService.polyfillServiceStrings.always]
    
    @scala.inline
    def gated: typingsSlinky.polyfillService.polyfillServiceStrings.gated = "gated".asInstanceOf[typingsSlinky.polyfillService.polyfillServiceStrings.gated]
  }
  
  @js.native
  trait PolyfillSpec extends StObject {
    
    var aliasOf: js.UndefOr[Set[String]] = js.native
    
    var flags: Set[PolyfillFlag] = js.native
  }
  object PolyfillSpec {
    
    @scala.inline
    def apply(flags: Set[PolyfillFlag]): PolyfillSpec = {
      val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any])
      __obj.asInstanceOf[PolyfillSpec]
    }
    
    @scala.inline
    implicit class PolyfillSpecMutableBuilder[Self <: PolyfillSpec] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAliasOf(value: Set[String]): Self = StObject.set(x, "aliasOf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliasOfUndefined: Self = StObject.set(x, "aliasOf", js.undefined)
      
      @scala.inline
      def setFlags(value: Set[PolyfillFlag]): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.polyfillService.polyfillServiceStrings.polyfill
    - typingsSlinky.polyfillService.polyfillServiceStrings.ignore
  */
  trait Unknown extends StObject
  object Unknown {
    
    @scala.inline
    def ignore: typingsSlinky.polyfillService.polyfillServiceStrings.ignore = "ignore".asInstanceOf[typingsSlinky.polyfillService.polyfillServiceStrings.ignore]
    
    @scala.inline
    def polyfill: typingsSlinky.polyfillService.polyfillServiceStrings.polyfill = "polyfill".asInstanceOf[typingsSlinky.polyfillService.polyfillServiceStrings.polyfill]
  }
}
