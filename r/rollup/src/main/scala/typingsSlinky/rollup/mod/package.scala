package typingsSlinky.rollup

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type EmitAsset = js.Function2[
    /* name */ java.lang.String, 
    /* source */ js.UndefOr[java.lang.String | typingsSlinky.node.Buffer], 
    java.lang.String
  ]
  type EmitChunk = js.Function2[
    /* id */ java.lang.String, 
    /* options */ js.UndefOr[typingsSlinky.rollup.anon.Name], 
    java.lang.String
  ]
  type EmitFile = js.Function1[/* emittedFile */ typingsSlinky.rollup.mod.EmittedFile, java.lang.String]
  type GetManualChunk = js.Function1[/* id */ java.lang.String, js.UndefOr[java.lang.String | scala.Null]]
  type HasModuleSideEffects = js.Function2[/* id */ java.lang.String, /* external */ scala.Boolean, scala.Boolean]
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
  type OutputBundle = org.scalablytyped.runtime.StringDictionary[typingsSlinky.rollup.mod.OutputAsset | typingsSlinky.rollup.mod.OutputChunk]
  type OutputBundleWithPlaceholders = org.scalablytyped.runtime.StringDictionary[
    typingsSlinky.rollup.mod.OutputAsset | typingsSlinky.rollup.mod.OutputChunk | typingsSlinky.rollup.mod.FilePlaceholder
  ]
  type PluginImpl[O /* <: js.Object */] = js.Function1[/* options */ js.UndefOr[O], typingsSlinky.rollup.mod.Plugin]
  type RenderChunkHook = js.ThisFunction3[
    /* this */ typingsSlinky.rollup.mod.PluginContext, 
    /* code */ java.lang.String, 
    /* chunk */ typingsSlinky.rollup.mod.RenderedChunk, 
    /* options */ typingsSlinky.rollup.mod.OutputOptions, 
    (js.Promise[typingsSlinky.rollup.anon.Code | scala.Null]) | typingsSlinky.rollup.anon.Code | java.lang.String | scala.Null
  ]
  type ResolveAssetUrlHook = js.ThisFunction1[
    /* this */ typingsSlinky.rollup.mod.PluginContext, 
    /* options */ typingsSlinky.rollup.anon.AssetFileName, 
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
    /* options */ typingsSlinky.rollup.anon.AssetReferenceId, 
    js.UndefOr[java.lang.String | scala.Null]
  ]
  type ResolveIdHook = js.ThisFunction2[
    /* this */ typingsSlinky.rollup.mod.PluginContext, 
    /* source */ java.lang.String, 
    /* importer */ js.UndefOr[java.lang.String], 
    js.Promise[typingsSlinky.rollup.mod.ResolveIdResult] | typingsSlinky.rollup.mod.ResolveIdResult
  ]
  type ResolveImportMetaHook = js.ThisFunction2[
    /* this */ typingsSlinky.rollup.mod.PluginContext, 
    /* prop */ java.lang.String | scala.Null, 
    /* options */ typingsSlinky.rollup.anon.ChunkId, 
    js.UndefOr[java.lang.String | scala.Null]
  ]
  type ResolvedIdMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.rollup.mod.ResolvedId]
  type SerializablePluginCache = org.scalablytyped.runtime.StringDictionary[js.Tuple2[scala.Double, js.Any]]
  type SerializedTimings = org.scalablytyped.runtime.StringDictionary[js.Tuple3[scala.Double, scala.Double, scala.Double]]
  type TransformChunkHook = js.ThisFunction2[
    /* this */ typingsSlinky.rollup.mod.PluginContext, 
    /* code */ java.lang.String, 
    /* options */ typingsSlinky.rollup.mod.OutputOptions, 
    js.UndefOr[
      (js.Promise[js.UndefOr[typingsSlinky.rollup.anon.Code | scala.Null]]) | typingsSlinky.rollup.anon.Code | scala.Null
    ]
  ]
  type TransformHook = js.ThisFunction2[
    /* this */ typingsSlinky.rollup.mod.PluginContext, 
    /* code */ java.lang.String, 
    /* id */ java.lang.String, 
    js.Promise[typingsSlinky.rollup.mod.TransformResult] | typingsSlinky.rollup.mod.TransformResult
  ]
  type WarningHandler = js.Function1[/* warning */ typingsSlinky.rollup.mod.RollupWarning, scala.Unit]
  type WarningHandlerWithDefault = js.Function2[
    /* warning */ typingsSlinky.rollup.mod.RollupWarning, 
    /* defaultHandler */ typingsSlinky.rollup.mod.WarningHandler, 
    scala.Unit
  ]
}
