package typingsSlinky.rollup

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AddonHook = java.lang.String | typingsSlinky.rollup.mod.AddonHookFunction
  
  type AddonHookFunction = js.ThisFunction0[
    /* this */ typingsSlinky.rollup.mod.PluginContext, 
    java.lang.String | js.Promise[java.lang.String]
  ]
  
  type CustomPluginOptions = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type EmitAsset = js.Function2[
    /* name */ java.lang.String, 
    /* source */ js.UndefOr[java.lang.String | js.typedarray.Uint8Array], 
    java.lang.String
  ]
  
  type EmitChunk = js.Function2[
    /* id */ java.lang.String, 
    /* options */ js.UndefOr[typingsSlinky.rollup.anon.Name], 
    java.lang.String
  ]
  
  type EmitFile = js.Function1[/* emittedFile */ typingsSlinky.rollup.mod.EmittedFile, java.lang.String]
  
  type ExternalOption = (js.Array[java.lang.String | js.RegExp]) | java.lang.String | js.RegExp | (js.Function3[
    /* source */ java.lang.String, 
    /* importer */ js.UndefOr[java.lang.String], 
    /* isResolved */ scala.Boolean, 
    js.UndefOr[scala.Boolean | scala.Null]
  ])
  
  type GetInterop = js.Function1[/* id */ java.lang.String | scala.Null, typingsSlinky.rollup.mod.InteropType]
  
  type GetManualChunk = js.Function2[
    /* id */ java.lang.String, 
    /* api */ typingsSlinky.rollup.mod.GetManualChunkApi, 
    js.UndefOr[java.lang.String | scala.Null]
  ]
  
  type GetModuleInfo = js.Function1[/* moduleId */ java.lang.String, typingsSlinky.rollup.mod.ModuleInfo | scala.Null]
  
  type GlobalsOption = org.scalablytyped.runtime.StringDictionary[java.lang.String] | (js.Function1[/* name */ java.lang.String, java.lang.String])
  
  type HasModuleSideEffects = js.Function2[/* id */ java.lang.String, /* external */ scala.Boolean, scala.Boolean]
  
  type InputOption = java.lang.String | js.Array[java.lang.String] | org.scalablytyped.runtime.StringDictionary[java.lang.String]
  
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - typingsSlinky.rollup.rollupStrings.auto
    - typingsSlinky.rollup.rollupStrings.esModule
    - typingsSlinky.rollup.rollupStrings.default
    - typingsSlinky.rollup.rollupStrings.defaultOnly
  */
  type InteropType = typingsSlinky.rollup.mod._InteropType | scala.Boolean
  
  type IsExternal = js.Function3[
    /* source */ java.lang.String, 
    /* importer */ js.UndefOr[java.lang.String], 
    /* isResolved */ scala.Boolean, 
    scala.Boolean
  ]
  
  type IsPureModule = js.Function1[/* id */ java.lang.String, js.UndefOr[scala.Boolean | scala.Null]]
  
  type LoadHook = js.ThisFunction1[
    /* this */ typingsSlinky.rollup.mod.PluginContext, 
    /* id */ java.lang.String, 
    js.Promise[typingsSlinky.rollup.mod.LoadResult] | typingsSlinky.rollup.mod.LoadResult
  ]
  
  type LoadResult = js.UndefOr[typingsSlinky.rollup.mod.SourceDescription | java.lang.String | scala.Null]
  
  type ManualChunksOption = org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]] | typingsSlinky.rollup.mod.GetManualChunk
  
  type ModuleParsedHook = js.ThisFunction1[
    /* this */ typingsSlinky.rollup.mod.PluginContext, 
    /* info */ typingsSlinky.rollup.mod.ModuleInfo, 
    js.Promise[scala.Unit] | scala.Unit
  ]
  
  type ModuleSideEffectsOption = scala.Boolean | typingsSlinky.rollup.rollupStrings.`no-external` | js.Array[java.lang.String] | typingsSlinky.rollup.mod.HasModuleSideEffects
  
  type OptionsPaths = (typingsSlinky.std.Record[java.lang.String, java.lang.String]) | (js.Function1[/* id */ java.lang.String, java.lang.String])
  
  type OutputBundle = org.scalablytyped.runtime.StringDictionary[typingsSlinky.rollup.mod.OutputAsset | typingsSlinky.rollup.mod.OutputChunk]
  
  type OutputBundleWithPlaceholders = org.scalablytyped.runtime.StringDictionary[
    typingsSlinky.rollup.mod.OutputAsset | typingsSlinky.rollup.mod.OutputChunk | typingsSlinky.rollup.mod.FilePlaceholder
  ]
  
  type PartialNull[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: T[P] | null}
    */ typingsSlinky.rollup.rollupStrings.PartialNull with org.scalablytyped.runtime.TopLevel[T]
  
  type PluginImpl[O /* <: js.Object */] = js.Function1[/* options */ js.UndefOr[O], typingsSlinky.rollup.mod.Plugin]
  
  type PureModulesOption = scala.Boolean | js.Array[java.lang.String] | typingsSlinky.rollup.mod.IsPureModule
  
  type RenderChunkHook = js.ThisFunction3[
    /* this */ typingsSlinky.rollup.mod.PluginContext, 
    /* code */ java.lang.String, 
    /* chunk */ typingsSlinky.rollup.mod.RenderedChunk, 
    /* options */ typingsSlinky.rollup.mod.NormalizedOutputOptions, 
    (js.Promise[typingsSlinky.rollup.anon.Code | scala.Null]) | typingsSlinky.rollup.anon.Code | java.lang.String | scala.Null
  ]
  
  type ResolveAssetUrlHook = js.ThisFunction1[
    /* this */ typingsSlinky.rollup.mod.PluginContext, 
    /* options */ typingsSlinky.rollup.anon.AssetFileName, 
    js.UndefOr[java.lang.String | scala.Null]
  ]
  
  type ResolveDynamicImportHook = js.ThisFunction2[
    /* this */ typingsSlinky.rollup.mod.PluginContext, 
    /* specifier */ java.lang.String | typingsSlinky.rollup.mod.AcornNode, 
    /* importer */ java.lang.String, 
    js.Promise[typingsSlinky.rollup.mod.ResolveIdResult] | typingsSlinky.rollup.mod.ResolveIdResult
  ]
  
  type ResolveFileUrlHook = js.ThisFunction1[
    /* this */ typingsSlinky.rollup.mod.PluginContext, 
    /* options */ typingsSlinky.rollup.anon.AssetReferenceId, 
    js.UndefOr[java.lang.String | scala.Null]
  ]
  
  type ResolveIdHook = js.ThisFunction3[
    /* this */ typingsSlinky.rollup.mod.PluginContext, 
    /* source */ java.lang.String, 
    /* importer */ js.UndefOr[java.lang.String], 
    /* options */ typingsSlinky.rollup.anon.`1`, 
    js.Promise[typingsSlinky.rollup.mod.ResolveIdResult] | typingsSlinky.rollup.mod.ResolveIdResult
  ]
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsSlinky.rollup.rollupBooleans.`false`
    - scala.Null
    - js.UndefOr[scala.Nothing]
    - typingsSlinky.rollup.mod.PartialResolvedId
  */
  type ResolveIdResult = js.UndefOr[typingsSlinky.rollup.mod._ResolveIdResult | java.lang.String | scala.Null]
  
  type ResolveImportMetaHook = js.ThisFunction2[
    /* this */ typingsSlinky.rollup.mod.PluginContext, 
    /* prop */ java.lang.String | scala.Null, 
    /* options */ typingsSlinky.rollup.anon.ChunkId, 
    js.UndefOr[java.lang.String | scala.Null]
  ]
  
  type ResolvedIdMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.rollup.mod.ResolvedId]
  
  type SerializablePluginCache = org.scalablytyped.runtime.StringDictionary[js.Tuple2[scala.Double, js.Any]]
  
  type SerializedTimings = org.scalablytyped.runtime.StringDictionary[js.Tuple3[scala.Double, scala.Double, scala.Double]]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.rollup.mod.ExistingRawSourceMap
    - java.lang.String
    - scala.Null
    - typingsSlinky.rollup.anon.`0`
  */
  type SourceMapInput = typingsSlinky.rollup.mod._SourceMapInput | java.lang.String | scala.Null
  
  type SourceMapSegment = js.Array[scala.Double] | (js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]) | (js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double])
  
  type SourcemapPathTransformOption = js.Function2[
    /* relativeSourcePath */ java.lang.String, 
    /* sourcemapPath */ java.lang.String, 
    java.lang.String
  ]
  
  type TransformHook = js.ThisFunction2[
    /* this */ typingsSlinky.rollup.mod.TransformPluginContext, 
    /* code */ java.lang.String, 
    /* id */ java.lang.String, 
    js.Promise[typingsSlinky.rollup.mod.TransformResult] | typingsSlinky.rollup.mod.TransformResult
  ]
  
  type TransformResult = js.UndefOr[
    java.lang.String | scala.Null | typingsSlinky.rollup.anon.PartialSourceDescription
  ]
  
  @scala.inline
  def VERSION: java.lang.String = typingsSlinky.rollup.mod.^.asInstanceOf[js.Dynamic].selectDynamic("VERSION").asInstanceOf[java.lang.String]
  
  type WarningHandler = js.Function1[/* warning */ typingsSlinky.rollup.mod.RollupWarning, scala.Unit]
  
  type WarningHandlerWithDefault = js.Function2[
    /* warning */ typingsSlinky.rollup.mod.RollupWarning, 
    /* defaultHandler */ typingsSlinky.rollup.mod.WarningHandler, 
    scala.Unit
  ]
  
  type WatchChangeHook = js.ThisFunction2[
    /* this */ typingsSlinky.rollup.mod.PluginContext, 
    /* id */ java.lang.String, 
    /* change */ typingsSlinky.rollup.anon.Event, 
    scala.Unit
  ]
  
  @scala.inline
  def rollup(options: typingsSlinky.rollup.mod.RollupOptions): js.Promise[typingsSlinky.rollup.mod.RollupBuild] = typingsSlinky.rollup.mod.^.asInstanceOf[js.Dynamic].applyDynamic("rollup")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.rollup.mod.RollupBuild]]
  
  @scala.inline
  def watch(config: js.Array[typingsSlinky.rollup.mod.RollupWatchOptions]): typingsSlinky.rollup.mod.RollupWatcher = typingsSlinky.rollup.mod.^.asInstanceOf[js.Dynamic].applyDynamic("watch")(config.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.rollup.mod.RollupWatcher]
  @scala.inline
  def watch(config: typingsSlinky.rollup.mod.RollupWatchOptions): typingsSlinky.rollup.mod.RollupWatcher = typingsSlinky.rollup.mod.^.asInstanceOf[js.Dynamic].applyDynamic("watch")(config.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.rollup.mod.RollupWatcher]
}
