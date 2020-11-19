package typingsSlinky.rollup.mod

import typingsSlinky.rollup.anon.CustomResolution
import typingsSlinky.rollup.anon.Left
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<rollup.rollup.PluginHooks> */
/* Inlined parent std.Partial<rollup.rollup.OutputPluginValueHooks> */
@js.native
trait Plugin extends js.Object {
  
  var augmentChunkHash: js.UndefOr[
    js.ThisFunction1[/* this */ PluginContext, /* chunk */ PreRenderedChunk, String | Unit]
  ] = js.native
  
  var banner: js.UndefOr[AddonHook] = js.native
  
  var buildEnd: js.UndefOr[
    js.ThisFunction1[/* this */ PluginContext, /* err */ js.UndefOr[js.Error], js.Promise[Unit] | Unit]
  ] = js.native
  
  var buildStart: js.UndefOr[
    js.ThisFunction1[
      /* this */ PluginContext, 
      /* options */ NormalizedInputOptions, 
      js.Promise[Unit] | Unit
    ]
  ] = js.native
  
  var cacheKey: js.UndefOr[String] = js.native
  
  var footer: js.UndefOr[AddonHook] = js.native
  
  var generateBundle: js.UndefOr[
    js.ThisFunction3[
      /* this */ PluginContext, 
      /* options */ NormalizedOutputOptions, 
      /* bundle */ OutputBundle, 
      /* isWrite */ Boolean, 
      Unit | js.Promise[Unit]
    ]
  ] = js.native
  
  var intro: js.UndefOr[AddonHook] = js.native
  
  var load: js.UndefOr[LoadHook] = js.native
  
  var name: String = js.native
  
  var options: js.UndefOr[
    js.ThisFunction1[
      /* this */ MinimalPluginContext, 
      /* options */ InputOptions, 
      js.UndefOr[InputOptions | Null]
    ]
  ] = js.native
  
  var outputOptions: js.UndefOr[
    js.ThisFunction1[
      /* this */ PluginContext, 
      /* options */ OutputOptions, 
      js.UndefOr[OutputOptions | Null]
    ]
  ] = js.native
  
  var outro: js.UndefOr[AddonHook] = js.native
  
  var renderChunk: js.UndefOr[RenderChunkHook] = js.native
  
  var renderDynamicImport: js.UndefOr[
    js.ThisFunction1[/* this */ PluginContext, /* options */ CustomResolution, js.UndefOr[Left | Null]]
  ] = js.native
  
  var renderError: js.UndefOr[
    js.ThisFunction1[/* this */ PluginContext, /* err */ js.UndefOr[js.Error], js.Promise[Unit] | Unit]
  ] = js.native
  
  var renderStart: js.UndefOr[
    js.ThisFunction2[
      /* this */ PluginContext, 
      /* outputOptions */ NormalizedOutputOptions, 
      /* inputOptions */ NormalizedInputOptions, 
      js.Promise[Unit] | Unit
    ]
  ] = js.native
  
  var resolveAssetUrl: js.UndefOr[ResolveAssetUrlHook] = js.native
  
  var resolveDynamicImport: js.UndefOr[ResolveDynamicImportHook] = js.native
  
  var resolveFileUrl: js.UndefOr[ResolveFileUrlHook] = js.native
  
  var resolveId: js.UndefOr[ResolveIdHook] = js.native
  
  var resolveImportMeta: js.UndefOr[ResolveImportMetaHook] = js.native
  
  var transform: js.UndefOr[TransformHook] = js.native
  
  var watchChange: js.UndefOr[js.Function1[/* id */ String, Unit]] = js.native
  
  var writeBundle: js.UndefOr[
    js.ThisFunction2[
      /* this */ PluginContext, 
      /* options */ NormalizedOutputOptions, 
      /* bundle */ OutputBundle, 
      Unit | js.Promise[Unit]
    ]
  ] = js.native
}
object Plugin {
  
  @scala.inline
  def apply(name: String): Plugin = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Plugin]
  }
  
  @scala.inline
  implicit class PluginOps[Self <: Plugin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAugmentChunkHash(value: js.ThisFunction1[/* this */ PluginContext, /* chunk */ PreRenderedChunk, String | Unit]): Self = this.set("augmentChunkHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAugmentChunkHash: Self = this.set("augmentChunkHash", js.undefined)
    
    @scala.inline
    def setBanner(value: AddonHook): Self = this.set("banner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBanner: Self = this.set("banner", js.undefined)
    
    @scala.inline
    def setBuildEnd(
      value: js.ThisFunction1[/* this */ PluginContext, /* err */ js.UndefOr[js.Error], js.Promise[Unit] | Unit]
    ): Self = this.set("buildEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuildEnd: Self = this.set("buildEnd", js.undefined)
    
    @scala.inline
    def setBuildStart(
      value: js.ThisFunction1[
          /* this */ PluginContext, 
          /* options */ NormalizedInputOptions, 
          js.Promise[Unit] | Unit
        ]
    ): Self = this.set("buildStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuildStart: Self = this.set("buildStart", js.undefined)
    
    @scala.inline
    def setCacheKey(value: String): Self = this.set("cacheKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheKey: Self = this.set("cacheKey", js.undefined)
    
    @scala.inline
    def setFooter(value: AddonHook): Self = this.set("footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooter: Self = this.set("footer", js.undefined)
    
    @scala.inline
    def setGenerateBundle(
      value: js.ThisFunction3[
          /* this */ PluginContext, 
          /* options */ NormalizedOutputOptions, 
          /* bundle */ OutputBundle, 
          /* isWrite */ Boolean, 
          Unit | js.Promise[Unit]
        ]
    ): Self = this.set("generateBundle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGenerateBundle: Self = this.set("generateBundle", js.undefined)
    
    @scala.inline
    def setIntro(value: AddonHook): Self = this.set("intro", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntro: Self = this.set("intro", js.undefined)
    
    @scala.inline
    def setLoad(value: LoadHook): Self = this.set("load", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoad: Self = this.set("load", js.undefined)
    
    @scala.inline
    def setOptions(
      value: js.ThisFunction1[
          /* this */ MinimalPluginContext, 
          /* options */ InputOptions, 
          js.UndefOr[InputOptions | Null]
        ]
    ): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setOutputOptions(
      value: js.ThisFunction1[
          /* this */ PluginContext, 
          /* options */ OutputOptions, 
          js.UndefOr[OutputOptions | Null]
        ]
    ): Self = this.set("outputOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputOptions: Self = this.set("outputOptions", js.undefined)
    
    @scala.inline
    def setOutro(value: AddonHook): Self = this.set("outro", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutro: Self = this.set("outro", js.undefined)
    
    @scala.inline
    def setRenderChunk(value: RenderChunkHook): Self = this.set("renderChunk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderChunk: Self = this.set("renderChunk", js.undefined)
    
    @scala.inline
    def setRenderDynamicImport(
      value: js.ThisFunction1[/* this */ PluginContext, /* options */ CustomResolution, js.UndefOr[Left | Null]]
    ): Self = this.set("renderDynamicImport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderDynamicImport: Self = this.set("renderDynamicImport", js.undefined)
    
    @scala.inline
    def setRenderError(
      value: js.ThisFunction1[/* this */ PluginContext, /* err */ js.UndefOr[js.Error], js.Promise[Unit] | Unit]
    ): Self = this.set("renderError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderError: Self = this.set("renderError", js.undefined)
    
    @scala.inline
    def setRenderStart(
      value: js.ThisFunction2[
          /* this */ PluginContext, 
          /* outputOptions */ NormalizedOutputOptions, 
          /* inputOptions */ NormalizedInputOptions, 
          js.Promise[Unit] | Unit
        ]
    ): Self = this.set("renderStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderStart: Self = this.set("renderStart", js.undefined)
    
    @scala.inline
    def setResolveAssetUrl(value: ResolveAssetUrlHook): Self = this.set("resolveAssetUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolveAssetUrl: Self = this.set("resolveAssetUrl", js.undefined)
    
    @scala.inline
    def setResolveDynamicImport(value: ResolveDynamicImportHook): Self = this.set("resolveDynamicImport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolveDynamicImport: Self = this.set("resolveDynamicImport", js.undefined)
    
    @scala.inline
    def setResolveFileUrl(value: ResolveFileUrlHook): Self = this.set("resolveFileUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolveFileUrl: Self = this.set("resolveFileUrl", js.undefined)
    
    @scala.inline
    def setResolveId(value: ResolveIdHook): Self = this.set("resolveId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolveId: Self = this.set("resolveId", js.undefined)
    
    @scala.inline
    def setResolveImportMeta(value: ResolveImportMetaHook): Self = this.set("resolveImportMeta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolveImportMeta: Self = this.set("resolveImportMeta", js.undefined)
    
    @scala.inline
    def setTransform(value: TransformHook): Self = this.set("transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
    
    @scala.inline
    def setWatchChange(value: /* id */ String => Unit): Self = this.set("watchChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteWatchChange: Self = this.set("watchChange", js.undefined)
    
    @scala.inline
    def setWriteBundle(
      value: js.ThisFunction2[
          /* this */ PluginContext, 
          /* options */ NormalizedOutputOptions, 
          /* bundle */ OutputBundle, 
          Unit | js.Promise[Unit]
        ]
    ): Self = this.set("writeBundle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWriteBundle: Self = this.set("writeBundle", js.undefined)
  }
}
