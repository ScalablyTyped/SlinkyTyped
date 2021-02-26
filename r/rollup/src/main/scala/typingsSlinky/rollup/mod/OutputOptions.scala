package typingsSlinky.rollup.mod

import typingsSlinky.rollup.anon.Define
import typingsSlinky.rollup.rollupStrings.`inline`
import typingsSlinky.rollup.rollupStrings.auto
import typingsSlinky.rollup.rollupStrings.default
import typingsSlinky.rollup.rollupStrings.hidden
import typingsSlinky.rollup.rollupStrings.named
import typingsSlinky.rollup.rollupStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutputOptions extends StObject {
  
  var amd: js.UndefOr[Define] = js.native
  
  var assetFileNames: js.UndefOr[String | (js.Function1[/* chunkInfo */ PreRenderedAsset, String])] = js.native
  
  var banner: js.UndefOr[String | (js.Function0[String | js.Promise[String]])] = js.native
  
  var chunkFileNames: js.UndefOr[String | (js.Function1[/* chunkInfo */ PreRenderedChunk, String])] = js.native
  
  var compact: js.UndefOr[Boolean] = js.native
  
  // only required for bundle.write
  var dir: js.UndefOr[String] = js.native
  
  /** @deprecated Use the "renderDynamicImport" plugin hook instead. */
  var dynamicImportFunction: js.UndefOr[String] = js.native
  
  var entryFileNames: js.UndefOr[String | (js.Function1[/* chunkInfo */ PreRenderedChunk, String])] = js.native
  
  var esModule: js.UndefOr[Boolean] = js.native
  
  var exports: js.UndefOr[default | named | none | auto] = js.native
  
  var extend: js.UndefOr[Boolean] = js.native
  
  var externalLiveBindings: js.UndefOr[Boolean] = js.native
  
  // only required for bundle.write
  var file: js.UndefOr[String] = js.native
  
  var footer: js.UndefOr[String | (js.Function0[String | js.Promise[String]])] = js.native
  
  var format: js.UndefOr[ModuleFormat] = js.native
  
  var freeze: js.UndefOr[Boolean] = js.native
  
  var globals: js.UndefOr[GlobalsOption] = js.native
  
  var hoistTransitiveImports: js.UndefOr[Boolean] = js.native
  
  var indent: js.UndefOr[String | Boolean] = js.native
  
  var inlineDynamicImports: js.UndefOr[Boolean] = js.native
  
  var interop: js.UndefOr[InteropType | GetInterop] = js.native
  
  var intro: js.UndefOr[String | (js.Function0[String | js.Promise[String]])] = js.native
  
  var manualChunks: js.UndefOr[ManualChunksOption] = js.native
  
  var minifyInternalExports: js.UndefOr[Boolean] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var namespaceToStringTag: js.UndefOr[Boolean] = js.native
  
  var noConflict: js.UndefOr[Boolean] = js.native
  
  var outro: js.UndefOr[String | (js.Function0[String | js.Promise[String]])] = js.native
  
  var paths: js.UndefOr[OptionsPaths] = js.native
  
  var plugins: js.UndefOr[js.Array[OutputPlugin]] = js.native
  
  var preferConst: js.UndefOr[Boolean] = js.native
  
  var preserveModules: js.UndefOr[Boolean] = js.native
  
  var preserveModulesRoot: js.UndefOr[String] = js.native
  
  var sourcemap: js.UndefOr[Boolean | `inline` | hidden] = js.native
  
  var sourcemapExcludeSources: js.UndefOr[Boolean] = js.native
  
  var sourcemapFile: js.UndefOr[String] = js.native
  
  var sourcemapPathTransform: js.UndefOr[SourcemapPathTransformOption] = js.native
  
  var strict: js.UndefOr[Boolean] = js.native
  
  var systemNullSetters: js.UndefOr[Boolean] = js.native
}
object OutputOptions {
  
  @scala.inline
  def apply(): OutputOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputOptions]
  }
  
  @scala.inline
  implicit class OutputOptionsMutableBuilder[Self <: OutputOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmd(value: Define): Self = StObject.set(x, "amd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmdUndefined: Self = StObject.set(x, "amd", js.undefined)
    
    @scala.inline
    def setAssetFileNames(value: String | (js.Function1[/* chunkInfo */ PreRenderedAsset, String])): Self = StObject.set(x, "assetFileNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetFileNamesFunction1(value: /* chunkInfo */ PreRenderedAsset => String): Self = StObject.set(x, "assetFileNames", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAssetFileNamesUndefined: Self = StObject.set(x, "assetFileNames", js.undefined)
    
    @scala.inline
    def setBanner(value: String | (js.Function0[String | js.Promise[String]])): Self = StObject.set(x, "banner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBannerFunction0(value: () => String | js.Promise[String]): Self = StObject.set(x, "banner", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBannerUndefined: Self = StObject.set(x, "banner", js.undefined)
    
    @scala.inline
    def setChunkFileNames(value: String | (js.Function1[/* chunkInfo */ PreRenderedChunk, String])): Self = StObject.set(x, "chunkFileNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChunkFileNamesFunction1(value: /* chunkInfo */ PreRenderedChunk => String): Self = StObject.set(x, "chunkFileNames", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChunkFileNamesUndefined: Self = StObject.set(x, "chunkFileNames", js.undefined)
    
    @scala.inline
    def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
    
    @scala.inline
    def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
    
    @scala.inline
    def setDynamicImportFunction(value: String): Self = StObject.set(x, "dynamicImportFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicImportFunctionUndefined: Self = StObject.set(x, "dynamicImportFunction", js.undefined)
    
    @scala.inline
    def setEntryFileNames(value: String | (js.Function1[/* chunkInfo */ PreRenderedChunk, String])): Self = StObject.set(x, "entryFileNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntryFileNamesFunction1(value: /* chunkInfo */ PreRenderedChunk => String): Self = StObject.set(x, "entryFileNames", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEntryFileNamesUndefined: Self = StObject.set(x, "entryFileNames", js.undefined)
    
    @scala.inline
    def setEsModule(value: Boolean): Self = StObject.set(x, "esModule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEsModuleUndefined: Self = StObject.set(x, "esModule", js.undefined)
    
    @scala.inline
    def setExports(value: default | named | none | auto): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportsUndefined: Self = StObject.set(x, "exports", js.undefined)
    
    @scala.inline
    def setExtend(value: Boolean): Self = StObject.set(x, "extend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendUndefined: Self = StObject.set(x, "extend", js.undefined)
    
    @scala.inline
    def setExternalLiveBindings(value: Boolean): Self = StObject.set(x, "externalLiveBindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalLiveBindingsUndefined: Self = StObject.set(x, "externalLiveBindings", js.undefined)
    
    @scala.inline
    def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    @scala.inline
    def setFooter(value: String | (js.Function0[String | js.Promise[String]])): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterFunction0(value: () => String | js.Promise[String]): Self = StObject.set(x, "footer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    @scala.inline
    def setFormat(value: ModuleFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setFreeze(value: Boolean): Self = StObject.set(x, "freeze", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFreezeUndefined: Self = StObject.set(x, "freeze", js.undefined)
    
    @scala.inline
    def setGlobals(value: GlobalsOption): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalsFunction1(value: /* name */ String => String): Self = StObject.set(x, "globals", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGlobalsUndefined: Self = StObject.set(x, "globals", js.undefined)
    
    @scala.inline
    def setHoistTransitiveImports(value: Boolean): Self = StObject.set(x, "hoistTransitiveImports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoistTransitiveImportsUndefined: Self = StObject.set(x, "hoistTransitiveImports", js.undefined)
    
    @scala.inline
    def setIndent(value: String | Boolean): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
    
    @scala.inline
    def setInlineDynamicImports(value: Boolean): Self = StObject.set(x, "inlineDynamicImports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineDynamicImportsUndefined: Self = StObject.set(x, "inlineDynamicImports", js.undefined)
    
    @scala.inline
    def setInterop(value: InteropType | GetInterop): Self = StObject.set(x, "interop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInteropFunction1(value: /* id */ String | Null => InteropType): Self = StObject.set(x, "interop", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInteropUndefined: Self = StObject.set(x, "interop", js.undefined)
    
    @scala.inline
    def setIntro(value: String | (js.Function0[String | js.Promise[String]])): Self = StObject.set(x, "intro", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntroFunction0(value: () => String | js.Promise[String]): Self = StObject.set(x, "intro", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIntroUndefined: Self = StObject.set(x, "intro", js.undefined)
    
    @scala.inline
    def setManualChunks(value: ManualChunksOption): Self = StObject.set(x, "manualChunks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManualChunksFunction2(value: (/* id */ String, /* api */ GetManualChunkApi) => js.UndefOr[String | Null]): Self = StObject.set(x, "manualChunks", js.Any.fromFunction2(value))
    
    @scala.inline
    def setManualChunksUndefined: Self = StObject.set(x, "manualChunks", js.undefined)
    
    @scala.inline
    def setMinifyInternalExports(value: Boolean): Self = StObject.set(x, "minifyInternalExports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinifyInternalExportsUndefined: Self = StObject.set(x, "minifyInternalExports", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNamespaceToStringTag(value: Boolean): Self = StObject.set(x, "namespaceToStringTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceToStringTagUndefined: Self = StObject.set(x, "namespaceToStringTag", js.undefined)
    
    @scala.inline
    def setNoConflict(value: Boolean): Self = StObject.set(x, "noConflict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoConflictUndefined: Self = StObject.set(x, "noConflict", js.undefined)
    
    @scala.inline
    def setOutro(value: String | (js.Function0[String | js.Promise[String]])): Self = StObject.set(x, "outro", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutroFunction0(value: () => String | js.Promise[String]): Self = StObject.set(x, "outro", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOutroUndefined: Self = StObject.set(x, "outro", js.undefined)
    
    @scala.inline
    def setPaths(value: OptionsPaths): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathsFunction1(value: /* id */ String => String): Self = StObject.set(x, "paths", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
    
    @scala.inline
    def setPlugins(value: js.Array[OutputPlugin]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    @scala.inline
    def setPluginsVarargs(value: OutputPlugin*): Self = StObject.set(x, "plugins", js.Array(value :_*))
    
    @scala.inline
    def setPreferConst(value: Boolean): Self = StObject.set(x, "preferConst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferConstUndefined: Self = StObject.set(x, "preferConst", js.undefined)
    
    @scala.inline
    def setPreserveModules(value: Boolean): Self = StObject.set(x, "preserveModules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveModulesRoot(value: String): Self = StObject.set(x, "preserveModulesRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveModulesRootUndefined: Self = StObject.set(x, "preserveModulesRoot", js.undefined)
    
    @scala.inline
    def setPreserveModulesUndefined: Self = StObject.set(x, "preserveModules", js.undefined)
    
    @scala.inline
    def setSourcemap(value: Boolean | `inline` | hidden): Self = StObject.set(x, "sourcemap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcemapExcludeSources(value: Boolean): Self = StObject.set(x, "sourcemapExcludeSources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcemapExcludeSourcesUndefined: Self = StObject.set(x, "sourcemapExcludeSources", js.undefined)
    
    @scala.inline
    def setSourcemapFile(value: String): Self = StObject.set(x, "sourcemapFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcemapFileUndefined: Self = StObject.set(x, "sourcemapFile", js.undefined)
    
    @scala.inline
    def setSourcemapPathTransform(value: (/* relativeSourcePath */ String, /* sourcemapPath */ String) => String): Self = StObject.set(x, "sourcemapPathTransform", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSourcemapPathTransformUndefined: Self = StObject.set(x, "sourcemapPathTransform", js.undefined)
    
    @scala.inline
    def setSourcemapUndefined: Self = StObject.set(x, "sourcemap", js.undefined)
    
    @scala.inline
    def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    
    @scala.inline
    def setSystemNullSetters(value: Boolean): Self = StObject.set(x, "systemNullSetters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemNullSettersUndefined: Self = StObject.set(x, "systemNullSetters", js.undefined)
  }
}
