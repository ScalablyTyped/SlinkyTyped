package typingsSlinky.rollup.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.rollup.rollupBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputOptions extends StObject {
  
  var acorn: js.UndefOr[js.Object] = js.native
  
  var acornInjectPlugins: js.UndefOr[js.Function | js.Array[js.Function]] = js.native
  
  var cache: js.UndefOr[`false` | RollupCache] = js.native
  
  var context: js.UndefOr[String] = js.native
  
  var experimentalCacheExpiry: js.UndefOr[Double] = js.native
  
  var external: js.UndefOr[ExternalOption] = js.native
  
  /** @deprecated Use the "inlineDynamicImports" output option instead. */
  var inlineDynamicImports: js.UndefOr[Boolean] = js.native
  
  var input: js.UndefOr[InputOption] = js.native
  
  /** @deprecated Use the "manualChunks" output option instead. */
  var manualChunks: js.UndefOr[ManualChunksOption] = js.native
  
  var moduleContext: js.UndefOr[
    (js.Function1[/* id */ String, js.UndefOr[String | Null]]) | StringDictionary[String]
  ] = js.native
  
  var onwarn: js.UndefOr[WarningHandlerWithDefault] = js.native
  
  var perf: js.UndefOr[Boolean] = js.native
  
  var plugins: js.UndefOr[js.Array[Plugin]] = js.native
  
  var preserveEntrySignatures: js.UndefOr[PreserveEntrySignaturesOption] = js.native
  
  /** @deprecated Use the "preserveModules" output option instead. */
  var preserveModules: js.UndefOr[Boolean] = js.native
  
  var preserveSymlinks: js.UndefOr[Boolean] = js.native
  
  var shimMissingExports: js.UndefOr[Boolean] = js.native
  
  var strictDeprecations: js.UndefOr[Boolean] = js.native
  
  var treeshake: js.UndefOr[Boolean | TreeshakingOptions] = js.native
  
  var watch: js.UndefOr[WatcherOptions | `false`] = js.native
}
object InputOptions {
  
  @scala.inline
  def apply(): InputOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputOptions]
  }
  
  @scala.inline
  implicit class InputOptionsMutableBuilder[Self <: InputOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcorn(value: js.Object): Self = StObject.set(x, "acorn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcornInjectPlugins(value: js.Function | js.Array[js.Function]): Self = StObject.set(x, "acornInjectPlugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcornInjectPluginsUndefined: Self = StObject.set(x, "acornInjectPlugins", js.undefined)
    
    @scala.inline
    def setAcornInjectPluginsVarargs(value: js.Function*): Self = StObject.set(x, "acornInjectPlugins", js.Array(value :_*))
    
    @scala.inline
    def setAcornUndefined: Self = StObject.set(x, "acorn", js.undefined)
    
    @scala.inline
    def setCache(value: `false` | RollupCache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    @scala.inline
    def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setExperimentalCacheExpiry(value: Double): Self = StObject.set(x, "experimentalCacheExpiry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExperimentalCacheExpiryUndefined: Self = StObject.set(x, "experimentalCacheExpiry", js.undefined)
    
    @scala.inline
    def setExternal(value: ExternalOption): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalFunction3(
      value: (/* source */ String, /* importer */ js.UndefOr[String], /* isResolved */ Boolean) => js.UndefOr[Boolean | Null]
    ): Self = StObject.set(x, "external", js.Any.fromFunction3(value))
    
    @scala.inline
    def setExternalRegExp(value: js.RegExp): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalUndefined: Self = StObject.set(x, "external", js.undefined)
    
    @scala.inline
    def setExternalVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "external", js.Array(value :_*))
    
    @scala.inline
    def setInlineDynamicImports(value: Boolean): Self = StObject.set(x, "inlineDynamicImports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineDynamicImportsUndefined: Self = StObject.set(x, "inlineDynamicImports", js.undefined)
    
    @scala.inline
    def setInput(value: InputOption): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    @scala.inline
    def setInputVarargs(value: String*): Self = StObject.set(x, "input", js.Array(value :_*))
    
    @scala.inline
    def setManualChunks(value: ManualChunksOption): Self = StObject.set(x, "manualChunks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManualChunksFunction2(value: (/* id */ String, /* api */ GetManualChunkApi) => js.UndefOr[String | Null]): Self = StObject.set(x, "manualChunks", js.Any.fromFunction2(value))
    
    @scala.inline
    def setManualChunksUndefined: Self = StObject.set(x, "manualChunks", js.undefined)
    
    @scala.inline
    def setModuleContext(value: (js.Function1[/* id */ String, js.UndefOr[String | Null]]) | StringDictionary[String]): Self = StObject.set(x, "moduleContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModuleContextFunction1(value: /* id */ String => js.UndefOr[String | Null]): Self = StObject.set(x, "moduleContext", js.Any.fromFunction1(value))
    
    @scala.inline
    def setModuleContextUndefined: Self = StObject.set(x, "moduleContext", js.undefined)
    
    @scala.inline
    def setOnwarn(value: (/* warning */ RollupWarning, /* defaultHandler */ WarningHandler) => Unit): Self = StObject.set(x, "onwarn", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnwarnUndefined: Self = StObject.set(x, "onwarn", js.undefined)
    
    @scala.inline
    def setPerf(value: Boolean): Self = StObject.set(x, "perf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerfUndefined: Self = StObject.set(x, "perf", js.undefined)
    
    @scala.inline
    def setPlugins(value: js.Array[Plugin]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    @scala.inline
    def setPluginsVarargs(value: Plugin*): Self = StObject.set(x, "plugins", js.Array(value :_*))
    
    @scala.inline
    def setPreserveEntrySignatures(value: PreserveEntrySignaturesOption): Self = StObject.set(x, "preserveEntrySignatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveEntrySignaturesUndefined: Self = StObject.set(x, "preserveEntrySignatures", js.undefined)
    
    @scala.inline
    def setPreserveModules(value: Boolean): Self = StObject.set(x, "preserveModules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveModulesUndefined: Self = StObject.set(x, "preserveModules", js.undefined)
    
    @scala.inline
    def setPreserveSymlinks(value: Boolean): Self = StObject.set(x, "preserveSymlinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveSymlinksUndefined: Self = StObject.set(x, "preserveSymlinks", js.undefined)
    
    @scala.inline
    def setShimMissingExports(value: Boolean): Self = StObject.set(x, "shimMissingExports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShimMissingExportsUndefined: Self = StObject.set(x, "shimMissingExports", js.undefined)
    
    @scala.inline
    def setStrictDeprecations(value: Boolean): Self = StObject.set(x, "strictDeprecations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrictDeprecationsUndefined: Self = StObject.set(x, "strictDeprecations", js.undefined)
    
    @scala.inline
    def setTreeshake(value: Boolean | TreeshakingOptions): Self = StObject.set(x, "treeshake", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTreeshakeUndefined: Self = StObject.set(x, "treeshake", js.undefined)
    
    @scala.inline
    def setWatch(value: WatcherOptions | `false`): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
  }
}
