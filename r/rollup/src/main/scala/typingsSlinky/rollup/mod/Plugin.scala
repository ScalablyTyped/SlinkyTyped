package typingsSlinky.rollup.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    js.ThisFunction1[/* this */ PluginContext, /* options */ InputOptions, js.Promise[Unit] | Unit]
  ] = js.native
  var cacheKey: js.UndefOr[String] = js.native
  var footer: js.UndefOr[AddonHook] = js.native
  var generateBundle: js.UndefOr[
    js.ThisFunction3[
      /* this */ PluginContext, 
      /* options */ OutputOptions, 
      /* bundle */ OutputBundle, 
      /* isWrite */ Boolean, 
      Unit | js.Promise[Unit]
    ]
  ] = js.native
  var intro: js.UndefOr[AddonHook] = js.native
  var load: js.UndefOr[LoadHook] = js.native
  var name: String = js.native
  var ongenerate: js.UndefOr[
    js.ThisFunction2[
      /* this */ PluginContext, 
      /* options */ OnGenerateOptions, 
      /* chunk */ OutputChunk, 
      Unit | js.Promise[Unit]
    ]
  ] = js.native
  var onwrite: js.UndefOr[
    js.ThisFunction2[
      /* this */ PluginContext, 
      /* options */ OnWriteOptions, 
      /* chunk */ OutputChunk, 
      Unit | js.Promise[Unit]
    ]
  ] = js.native
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
  var renderError: js.UndefOr[
    js.ThisFunction1[/* this */ PluginContext, /* err */ js.UndefOr[js.Error], js.Promise[Unit] | Unit]
  ] = js.native
  var renderStart: js.UndefOr[
    js.ThisFunction2[
      /* this */ PluginContext, 
      /* outputOptions */ OutputOptions, 
      /* inputOptions */ InputOptions, 
      js.Promise[Unit] | Unit
    ]
  ] = js.native
  var resolveAssetUrl: js.UndefOr[ResolveAssetUrlHook] = js.native
  var resolveDynamicImport: js.UndefOr[ResolveDynamicImportHook] = js.native
  var resolveFileUrl: js.UndefOr[ResolveFileUrlHook] = js.native
  var resolveId: js.UndefOr[ResolveIdHook] = js.native
  var resolveImportMeta: js.UndefOr[ResolveImportMetaHook] = js.native
  var transform: js.UndefOr[TransformHook] = js.native
  var transformBundle: js.UndefOr[TransformChunkHook] = js.native
  var transformChunk: js.UndefOr[TransformChunkHook] = js.native
  var watchChange: js.UndefOr[js.Function1[/* id */ String, Unit]] = js.native
  var writeBundle: js.UndefOr[
    js.ThisFunction1[/* this */ PluginContext, /* bundle */ OutputBundle, Unit | js.Promise[Unit]]
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
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAugmentChunkHash(value: js.ThisFunction1[/* this */ PluginContext, /* chunk */ PreRenderedChunk, String | Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("augmentChunkHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAugmentChunkHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("augmentChunkHash")(js.undefined)
        ret
    }
    @scala.inline
    def withBanner(value: AddonHook): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("banner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBanner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("banner")(js.undefined)
        ret
    }
    @scala.inline
    def withBuildEnd(
      value: js.ThisFunction1[/* this */ PluginContext, /* err */ js.UndefOr[js.Error], js.Promise[Unit] | Unit]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuildEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withBuildStart(
      value: js.ThisFunction1[/* this */ PluginContext, /* options */ InputOptions, js.Promise[Unit] | Unit]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuildStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildStart")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheKey")(js.undefined)
        ret
    }
    @scala.inline
    def withFooter(value: AddonHook): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(js.undefined)
        ret
    }
    @scala.inline
    def withGenerateBundle(
      value: js.ThisFunction3[
          /* this */ PluginContext, 
          /* options */ OutputOptions, 
          /* bundle */ OutputBundle, 
          /* isWrite */ Boolean, 
          Unit | js.Promise[Unit]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateBundle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGenerateBundle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateBundle")(js.undefined)
        ret
    }
    @scala.inline
    def withIntro(value: AddonHook): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intro")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntro: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intro")(js.undefined)
        ret
    }
    @scala.inline
    def withLoad(value: LoadHook): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.undefined)
        ret
    }
    @scala.inline
    def withOngenerate(
      value: js.ThisFunction2[
          /* this */ PluginContext, 
          /* options */ OnGenerateOptions, 
          /* chunk */ OutputChunk, 
          Unit | js.Promise[Unit]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ongenerate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOngenerate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ongenerate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnwrite(
      value: js.ThisFunction2[
          /* this */ PluginContext, 
          /* options */ OnWriteOptions, 
          /* chunk */ OutputChunk, 
          Unit | js.Promise[Unit]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onwrite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnwrite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onwrite")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(
      value: js.ThisFunction1[
          /* this */ MinimalPluginContext, 
          /* options */ InputOptions, 
          js.UndefOr[InputOptions | Null]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputOptions(
      value: js.ThisFunction1[
          /* this */ PluginContext, 
          /* options */ OutputOptions, 
          js.UndefOr[OutputOptions | Null]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withOutro(value: AddonHook): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outro")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutro: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outro")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderChunk(value: RenderChunkHook): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderChunk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderChunk: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderChunk")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderError(
      value: js.ThisFunction1[/* this */ PluginContext, /* err */ js.UndefOr[js.Error], js.Promise[Unit] | Unit]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderError")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderStart(
      value: js.ThisFunction2[
          /* this */ PluginContext, 
          /* outputOptions */ OutputOptions, 
          /* inputOptions */ InputOptions, 
          js.Promise[Unit] | Unit
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderStart")(js.undefined)
        ret
    }
    @scala.inline
    def withResolveAssetUrl(value: ResolveAssetUrlHook): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveAssetUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolveAssetUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveAssetUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withResolveDynamicImport(value: ResolveDynamicImportHook): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveDynamicImport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolveDynamicImport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveDynamicImport")(js.undefined)
        ret
    }
    @scala.inline
    def withResolveFileUrl(value: ResolveFileUrlHook): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveFileUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolveFileUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveFileUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withResolveId(value: ResolveIdHook): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolveId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveId")(js.undefined)
        ret
    }
    @scala.inline
    def withResolveImportMeta(value: ResolveImportMetaHook): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveImportMeta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolveImportMeta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveImportMeta")(js.undefined)
        ret
    }
    @scala.inline
    def withTransform(value: TransformHook): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformBundle(value: TransformChunkHook): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformBundle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransformBundle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformBundle")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformChunk(value: TransformChunkHook): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformChunk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransformChunk: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformChunk")(js.undefined)
        ret
    }
    @scala.inline
    def withWatchChange(value: /* id */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutWatchChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchChange")(js.undefined)
        ret
    }
    @scala.inline
    def withWriteBundle(
      value: js.ThisFunction1[/* this */ PluginContext, /* bundle */ OutputBundle, Unit | js.Promise[Unit]]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeBundle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWriteBundle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeBundle")(js.undefined)
        ret
    }
  }
  
}

