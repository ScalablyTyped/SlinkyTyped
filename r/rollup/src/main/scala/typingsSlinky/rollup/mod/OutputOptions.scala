package typingsSlinky.rollup.mod

import typingsSlinky.rollup.AnonDefine
import typingsSlinky.rollup.rollupStrings.`inline`
import typingsSlinky.rollup.rollupStrings.auto
import typingsSlinky.rollup.rollupStrings.default
import typingsSlinky.rollup.rollupStrings.hidden
import typingsSlinky.rollup.rollupStrings.named
import typingsSlinky.rollup.rollupStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputOptions extends js.Object {
  var amd: js.UndefOr[AnonDefine] = js.native
  var assetFileNames: js.UndefOr[String] = js.native
  var banner: js.UndefOr[String | (js.Function0[String | js.Promise[String]])] = js.native
  var chunkFileNames: js.UndefOr[String] = js.native
  var compact: js.UndefOr[Boolean] = js.native
  // only required for bundle.write
  var dir: js.UndefOr[String] = js.native
  var dynamicImportFunction: js.UndefOr[String] = js.native
  var entryFileNames: js.UndefOr[String] = js.native
  var esModule: js.UndefOr[Boolean] = js.native
  var exports: js.UndefOr[default | named | none | auto] = js.native
  var extend: js.UndefOr[Boolean] = js.native
  var externalLiveBindings: js.UndefOr[Boolean] = js.native
  // only required for bundle.write
  var file: js.UndefOr[String] = js.native
  var footer: js.UndefOr[String | (js.Function0[String | js.Promise[String]])] = js.native
  // this is optional at the base-level of RollupWatchOptions,
  // which extends from this interface through config merge
  var format: js.UndefOr[ModuleFormat] = js.native
  var freeze: js.UndefOr[Boolean] = js.native
  var globals: js.UndefOr[GlobalsOption] = js.native
  var hoistTransitiveImports: js.UndefOr[Boolean] = js.native
  var indent: js.UndefOr[Boolean] = js.native
  var interop: js.UndefOr[Boolean] = js.native
  var intro: js.UndefOr[String | (js.Function0[String | js.Promise[String]])] = js.native
  var name: js.UndefOr[String] = js.native
  var namespaceToStringTag: js.UndefOr[Boolean] = js.native
  var noConflict: js.UndefOr[Boolean] = js.native
  var outro: js.UndefOr[String | (js.Function0[String | js.Promise[String]])] = js.native
  var paths: js.UndefOr[OptionsPaths] = js.native
  var plugins: js.UndefOr[js.Array[OutputPlugin]] = js.native
  var preferConst: js.UndefOr[Boolean] = js.native
  var sourcemap: js.UndefOr[Boolean | `inline` | hidden] = js.native
  var sourcemapExcludeSources: js.UndefOr[Boolean] = js.native
  var sourcemapFile: js.UndefOr[String] = js.native
  var sourcemapPathTransform: js.UndefOr[js.Function1[/* sourcePath */ String, String]] = js.native
  var strict: js.UndefOr[Boolean] = js.native
}

object OutputOptions {
  @scala.inline
  def apply(): OutputOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputOptions]
  }
  @scala.inline
  implicit class OutputOptionsOps[Self <: OutputOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmd(value: AnonDefine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amd")(js.undefined)
        ret
    }
    @scala.inline
    def withAssetFileNames(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assetFileNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssetFileNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assetFileNames")(js.undefined)
        ret
    }
    @scala.inline
    def withBannerFunction0(value: () => String | js.Promise[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("banner")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withBanner(value: String | (js.Function0[String | js.Promise[String]])): Self = {
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
    def withChunkFileNames(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkFileNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChunkFileNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkFileNames")(js.undefined)
        ret
    }
    @scala.inline
    def withCompact(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compact")(js.undefined)
        ret
    }
    @scala.inline
    def withDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(js.undefined)
        ret
    }
    @scala.inline
    def withDynamicImportFunction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicImportFunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDynamicImportFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicImportFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withEntryFileNames(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entryFileNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntryFileNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entryFileNames")(js.undefined)
        ret
    }
    @scala.inline
    def withEsModule(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("esModule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEsModule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("esModule")(js.undefined)
        ret
    }
    @scala.inline
    def withExports(value: default | named | none | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExports: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exports")(js.undefined)
        ret
    }
    @scala.inline
    def withExtend(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extend")(js.undefined)
        ret
    }
    @scala.inline
    def withExternalLiveBindings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalLiveBindings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternalLiveBindings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalLiveBindings")(js.undefined)
        ret
    }
    @scala.inline
    def withFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(js.undefined)
        ret
    }
    @scala.inline
    def withFooterFunction0(value: () => String | js.Promise[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFooter(value: String | (js.Function0[String | js.Promise[String]])): Self = {
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
    def withFormat(value: ModuleFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withFreeze(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freeze")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFreeze: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freeze")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobalsFunction1(value: /* name */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globals")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGlobals(value: GlobalsOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globals")(js.undefined)
        ret
    }
    @scala.inline
    def withHoistTransitiveImports(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoistTransitiveImports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoistTransitiveImports: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoistTransitiveImports")(js.undefined)
        ret
    }
    @scala.inline
    def withIndent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent")(js.undefined)
        ret
    }
    @scala.inline
    def withInterop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interop")(js.undefined)
        ret
    }
    @scala.inline
    def withIntroFunction0(value: () => String | js.Promise[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intro")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIntro(value: String | (js.Function0[String | js.Promise[String]])): Self = {
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
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNamespaceToStringTag(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespaceToStringTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamespaceToStringTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespaceToStringTag")(js.undefined)
        ret
    }
    @scala.inline
    def withNoConflict(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noConflict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoConflict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noConflict")(js.undefined)
        ret
    }
    @scala.inline
    def withOutroFunction0(value: () => String | js.Promise[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outro")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOutro(value: String | (js.Function0[String | js.Promise[String]])): Self = {
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
    def withPathsFunction1(value: /* id */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paths")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPaths(value: OptionsPaths): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paths")(js.undefined)
        ret
    }
    @scala.inline
    def withPlugins(value: js.Array[OutputPlugin]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(js.undefined)
        ret
    }
    @scala.inline
    def withPreferConst(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferConst")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreferConst: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferConst")(js.undefined)
        ret
    }
    @scala.inline
    def withSourcemap(value: Boolean | `inline` | hidden): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourcemap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourcemap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourcemap")(js.undefined)
        ret
    }
    @scala.inline
    def withSourcemapExcludeSources(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourcemapExcludeSources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourcemapExcludeSources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourcemapExcludeSources")(js.undefined)
        ret
    }
    @scala.inline
    def withSourcemapFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourcemapFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourcemapFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourcemapFile")(js.undefined)
        ret
    }
    @scala.inline
    def withSourcemapPathTransform(value: /* sourcePath */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourcemapPathTransform")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSourcemapPathTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourcemapPathTransform")(js.undefined)
        ret
    }
    @scala.inline
    def withStrict(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict")(js.undefined)
        ret
    }
  }
  
}

