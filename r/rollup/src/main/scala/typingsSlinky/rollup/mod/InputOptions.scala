package typingsSlinky.rollup.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.rollup.rollupBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputOptions extends js.Object {
  var acorn: js.UndefOr[js.Any] = js.native
  var acornInjectPlugins: js.UndefOr[js.Array[js.Function]] = js.native
  var cache: js.UndefOr[`false` | RollupCache] = js.native
  var chunkGroupingSize: js.UndefOr[Double] = js.native
  var context: js.UndefOr[String] = js.native
  var experimentalCacheExpiry: js.UndefOr[Double] = js.native
  var experimentalOptimizeChunks: js.UndefOr[Boolean] = js.native
  var external: js.UndefOr[ExternalOption] = js.native
  var inlineDynamicImports: js.UndefOr[Boolean] = js.native
  var input: js.UndefOr[InputOption] = js.native
  var manualChunks: js.UndefOr[ManualChunksOption] = js.native
  var moduleContext: js.UndefOr[(js.Function1[/* id */ String, String]) | StringDictionary[String]] = js.native
  var onwarn: js.UndefOr[WarningHandlerWithDefault] = js.native
  var perf: js.UndefOr[Boolean] = js.native
  var plugins: js.UndefOr[js.Array[Plugin]] = js.native
  var preserveModules: js.UndefOr[Boolean] = js.native
  var preserveSymlinks: js.UndefOr[Boolean] = js.native
  var shimMissingExports: js.UndefOr[Boolean] = js.native
  var strictDeprecations: js.UndefOr[Boolean] = js.native
  var treeshake: js.UndefOr[Boolean | TreeshakingOptions] = js.native
  var watch: js.UndefOr[WatcherOptions] = js.native
}

object InputOptions {
  @scala.inline
  def apply(): InputOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputOptions]
  }
  @scala.inline
  implicit class InputOptionsOps[Self <: InputOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcorn(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acorn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcorn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acorn")(js.undefined)
        ret
    }
    @scala.inline
    def withAcornInjectPlugins(value: js.Array[js.Function]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acornInjectPlugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcornInjectPlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acornInjectPlugins")(js.undefined)
        ret
    }
    @scala.inline
    def withCache(value: `false` | RollupCache): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(js.undefined)
        ret
    }
    @scala.inline
    def withChunkGroupingSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkGroupingSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChunkGroupingSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkGroupingSize")(js.undefined)
        ret
    }
    @scala.inline
    def withContext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withExperimentalCacheExpiry(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("experimentalCacheExpiry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExperimentalCacheExpiry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("experimentalCacheExpiry")(js.undefined)
        ret
    }
    @scala.inline
    def withExperimentalOptimizeChunks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("experimentalOptimizeChunks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExperimentalOptimizeChunks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("experimentalOptimizeChunks")(js.undefined)
        ret
    }
    @scala.inline
    def withExternalFunction3(
      value: (/* source */ String, /* importer */ String, /* isResolved */ Boolean) => js.UndefOr[Boolean | Null]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withExternal(value: ExternalOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external")(js.undefined)
        ret
    }
    @scala.inline
    def withInlineDynamicImports(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineDynamicImports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInlineDynamicImports: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineDynamicImports")(js.undefined)
        ret
    }
    @scala.inline
    def withInput(value: InputOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(js.undefined)
        ret
    }
    @scala.inline
    def withManualChunksFunction1(value: /* id */ String => js.UndefOr[String | Null]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manualChunks")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withManualChunks(value: ManualChunksOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manualChunks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManualChunks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manualChunks")(js.undefined)
        ret
    }
    @scala.inline
    def withModuleContextFunction1(value: /* id */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleContext")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withModuleContext(value: (js.Function1[/* id */ String, String]) | StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModuleContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleContext")(js.undefined)
        ret
    }
    @scala.inline
    def withOnwarn(value: (/* warning */ RollupWarning, /* defaultHandler */ WarningHandler) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onwarn")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnwarn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onwarn")(js.undefined)
        ret
    }
    @scala.inline
    def withPerf(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perf")(js.undefined)
        ret
    }
    @scala.inline
    def withPlugins(value: js.Array[Plugin]): Self = {
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
    def withPreserveModules(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveModules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveModules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveModules")(js.undefined)
        ret
    }
    @scala.inline
    def withPreserveSymlinks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveSymlinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveSymlinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveSymlinks")(js.undefined)
        ret
    }
    @scala.inline
    def withShimMissingExports(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shimMissingExports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShimMissingExports: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shimMissingExports")(js.undefined)
        ret
    }
    @scala.inline
    def withStrictDeprecations(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictDeprecations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrictDeprecations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictDeprecations")(js.undefined)
        ret
    }
    @scala.inline
    def withTreeshake(value: Boolean | TreeshakingOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeshake")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTreeshake: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeshake")(js.undefined)
        ret
    }
    @scala.inline
    def withWatch(value: WatcherOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watch")(js.undefined)
        ret
    }
  }
  
}

