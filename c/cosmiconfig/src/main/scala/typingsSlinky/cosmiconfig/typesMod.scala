package typingsSlinky.cosmiconfig

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.cosmiconfig.mod.Loader
import typingsSlinky.cosmiconfig.mod.LoaderSync
import typingsSlinky.cosmiconfig.mod.Transform
import typingsSlinky.cosmiconfig.mod.TransformSync
import typingsSlinky.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type Cache = Map[String, CosmiconfigResult]
  
  type Config = js.Any
  
  type CosmiconfigResult = typingsSlinky.cosmiconfig.anon.Config | Null
  
  /* Inlined parent std.Required<cosmiconfig.cosmiconfig.Options> */
  @js.native
  trait ExplorerOptions extends StObject {
    
    var cache: Boolean = js.native
    
    var ignoreEmptySearchPlaces: Boolean = js.native
    
    var loaders: Loaders = js.native
    
    var packageProp: String | js.Array[String] = js.native
    
    var searchPlaces: js.Array[String] = js.native
    
    var stopDir: String = js.native
    
    var transform: Transform = js.native
  }
  object ExplorerOptions {
    
    @scala.inline
    def apply(
      cache: Boolean,
      ignoreEmptySearchPlaces: Boolean,
      loaders: Loaders,
      packageProp: String | js.Array[String],
      searchPlaces: js.Array[String],
      stopDir: String,
      transform: /* CosmiconfigResult */ CosmiconfigResult => CosmiconfigResult | js.Promise[CosmiconfigResult]
    ): ExplorerOptions = {
      val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], ignoreEmptySearchPlaces = ignoreEmptySearchPlaces.asInstanceOf[js.Any], loaders = loaders.asInstanceOf[js.Any], packageProp = packageProp.asInstanceOf[js.Any], searchPlaces = searchPlaces.asInstanceOf[js.Any], stopDir = stopDir.asInstanceOf[js.Any], transform = js.Any.fromFunction1(transform))
      __obj.asInstanceOf[ExplorerOptions]
    }
    
    @scala.inline
    implicit class ExplorerOptionsMutableBuilder[Self <: ExplorerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreEmptySearchPlaces(value: Boolean): Self = StObject.set(x, "ignoreEmptySearchPlaces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoaders(value: Loaders): Self = StObject.set(x, "loaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPackageProp(value: String | js.Array[String]): Self = StObject.set(x, "packageProp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPackagePropVarargs(value: String*): Self = StObject.set(x, "packageProp", js.Array(value :_*))
      
      @scala.inline
      def setSearchPlaces(value: js.Array[String]): Self = StObject.set(x, "searchPlaces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchPlacesVarargs(value: String*): Self = StObject.set(x, "searchPlaces", js.Array(value :_*))
      
      @scala.inline
      def setStopDir(value: String): Self = StObject.set(x, "stopDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransform(
        value: /* CosmiconfigResult */ CosmiconfigResult => CosmiconfigResult | js.Promise[CosmiconfigResult]
      ): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
    }
  }
  
  /* Inlined parent std.Required<cosmiconfig.cosmiconfig.OptionsSync> */
  @js.native
  trait ExplorerOptionsSync extends StObject {
    
    var cache: Boolean = js.native
    
    var ignoreEmptySearchPlaces: Boolean = js.native
    
    var loaders: LoadersSync = js.native
    
    var packageProp: String | js.Array[String] = js.native
    
    var searchPlaces: js.Array[String] = js.native
    
    var stopDir: String = js.native
    
    def transform(CosmiconfigResult: CosmiconfigResult): CosmiconfigResult = js.native
    @JSName("transform")
    var transform_Original: TransformSync = js.native
  }
  
  type LoadedFileContent = js.UndefOr[Config | Null]
  
  type Loaders = StringDictionary[Loader]
  
  type LoadersSync = StringDictionary[LoaderSync]
}
