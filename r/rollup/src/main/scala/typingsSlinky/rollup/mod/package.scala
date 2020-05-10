package typingsSlinky.rollup

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AddonHook = java.lang.String | (js.ThisFunction0[
    /* this */ typingsSlinky.rollup.mod.PluginContext, 
    java.lang.String | js.Promise[java.lang.String]
  ])
  type EmitAsset = js.Function2[
    /* name */ java.lang.String, 
    /* source */ js.UndefOr[java.lang.String | typingsSlinky.node.Buffer], 
    java.lang.String
  ]
  type EmitChunk = js.Function2[
    /* id */ java.lang.String, 
    /* options */ js.UndefOr[typingsSlinky.rollup.AnonName], 
    java.lang.String
  ]
  type EmitFile = js.Function1[/* emittedFile */ typingsSlinky.rollup.mod.EmittedFile, java.lang.String]
  type ExternalOption = js.Array[java.lang.String] | typingsSlinky.rollup.mod.IsExternal
  type GetManualChunk = js.Function1[/* id */ java.lang.String, js.UndefOr[java.lang.String | scala.Null]]
  type GlobalsOption = org.scalablytyped.runtime.StringDictionary[java.lang.String] | (js.Function1[/* name */ java.lang.String, java.lang.String])
  type HasModuleSideEffects = js.Function2[/* id */ java.lang.String, /* external */ scala.Boolean, scala.Boolean]
  type InputOption = java.lang.String | js.Array[java.lang.String] | org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type IsExternal = js.Function3[
    /* source */ java.lang.String, 
    /* importer */ java.lang.String, 
    /* isResolved */ scala.Boolean, 
    js.UndefOr[scala.Boolean | scala.Null]
  ]
  type IsPureModule = js.Function1[/* id */ java.lang.String, js.UndefOr[scala.Boolean | scala.Null]]
  type LoadHook = js.ThisFunction1[
    /* this */ typingsSlinky.rollup.mod.PluginContext, 
    /* id */ java.lang.String, 
    js.Promise[typingsSlinky.rollup.mod.LoadResult] | typingsSlinky.rollup.mod.LoadResult
  ]
  type LoadResult = js.UndefOr[typingsSlinky.rollup.mod.SourceDescription | java.lang.String | scala.Null]
  type ManualChunksOption = org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]] | typingsSlinky.rollup.mod.GetManualChunk
  type ModuleSideEffectsOption = scala.Boolean | typingsSlinky.rollup.rollupStrings.`no-external` | js.Array[java.lang.String] | typingsSlinky.rollup.mod.HasModuleSideEffects
  type OptionsPaths = (typingsSlinky.std.Record[java.lang.String, java.lang.String]) | (js.Function1[/* id */ java.lang.String, java.lang.String])
  type OutputBundle = org.scalablytyped.runtime.StringDictionary[typingsSlinky.rollup.mod.OutputAsset | typingsSlinky.rollup.mod.OutputChunk]
  type OutputBundleWithPlaceholders = org.scalablytyped.runtime.StringDictionary[
    typingsSlinky.rollup.mod.OutputAsset | typingsSlinky.rollup.mod.OutputChunk | typingsSlinky.rollup.mod.FilePlaceholder
  ]
  type PluginImpl[O /* <: js.Object */] = js.Function1[/* options */ js.UndefOr[O], typingsSlinky.rollup.mod.Plugin]
  type PureModulesOption = scala.Boolean | js.Array[java.lang.String] | typingsSlinky.rollup.mod.IsPureModule
  type RenderChunkHook = js.ThisFunction3[
    /* this */ typingsSlinky.rollup.mod.PluginContext, 
    /* code */ java.lang.String, 
    /* chunk */ typingsSlinky.rollup.mod.RenderedChunk, 
    /* options */ typingsSlinky.rollup.mod.OutputOptions, 
    (js.Promise[typingsSlinky.rollup.AnonCode | scala.Null]) | typingsSlinky.rollup.AnonCode | java.lang.String | scala.Null
  ]
  type ResolveAssetUrlHook = js.ThisFunction1[
    /* this */ typingsSlinky.rollup.mod.PluginContext, 
    /* options */ typingsSlinky.rollup.AnonAssetFileName, 
    js.UndefOr[java.lang.String | scala.Null]
  ]
  type ResolveDynamicImportHook = js.ThisFunction2[
    /* this */ typingsSlinky.rollup.mod.PluginContext, 
    /* specifier */ java.lang.String | typingsSlinky.estree.mod.Node, 
    /* importer */ java.lang.String, 
    js.Promise[typingsSlinky.rollup.mod.ResolveIdResult] | typingsSlinky.rollup.mod.ResolveIdResult
  ]
  type ResolveFileUrlHook = js.ThisFunction1[
    /* this */ typingsSlinky.rollup.mod.PluginContext, 
    /* options */ typingsSlinky.rollup.AnonAssetReferenceId, 
    js.UndefOr[java.lang.String | scala.Null]
  ]
  type ResolveIdHook = js.ThisFunction2[
    /* this */ typingsSlinky.rollup.mod.PluginContext, 
    /* source */ java.lang.String, 
    /* importer */ js.UndefOr[java.lang.String], 
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
    /* options */ typingsSlinky.rollup.AnonChunkId, 
    js.UndefOr[java.lang.String | scala.Null]
  ]
  type ResolvedIdMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.rollup.mod.ResolvedId]
  type SerializablePluginCache = org.scalablytyped.runtime.StringDictionary[js.Tuple2[scala.Double, js.Any]]
  type SerializedTimings = org.scalablytyped.runtime.StringDictionary[js.Tuple3[scala.Double, scala.Double, scala.Double]]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.rollup.mod.ExistingRawSourceMap
    - java.lang.String
    - scala.Null
    - typingsSlinky.rollup.AnonMappings
  */
  type SourceMapInput = typingsSlinky.rollup.mod._SourceMapInput | java.lang.String | scala.Null
  type SourceMapSegment = js.Array[scala.Double] | (js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]) | (js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double])
  type TransformChunkHook = js.ThisFunction2[
    /* this */ typingsSlinky.rollup.mod.PluginContext, 
    /* code */ java.lang.String, 
    /* options */ typingsSlinky.rollup.mod.OutputOptions, 
    js.UndefOr[
      (js.Promise[js.UndefOr[typingsSlinky.rollup.AnonCode | scala.Null]]) | typingsSlinky.rollup.AnonCode | scala.Null
    ]
  ]
  type TransformHook = js.ThisFunction2[
    /* this */ typingsSlinky.rollup.mod.PluginContext, 
    /* code */ java.lang.String, 
    /* id */ java.lang.String, 
    js.Promise[typingsSlinky.rollup.mod.TransformResult] | typingsSlinky.rollup.mod.TransformResult
  ]
  type TransformResult = js.UndefOr[
    java.lang.String | scala.Null | typingsSlinky.rollup.mod.TransformSourceDescription
  ]
  type WarningHandler = js.Function1[/* warning */ typingsSlinky.rollup.mod.RollupWarning, scala.Unit]
  type WarningHandlerWithDefault = js.Function2[
    /* warning */ typingsSlinky.rollup.mod.RollupWarning, 
    /* defaultHandler */ typingsSlinky.rollup.mod.WarningHandler, 
    scala.Unit
  ]
}
