package typingsSlinky.rollupPluginTypescript2.anon

import typingsSlinky.rollupPluginTypescript2.ioptionsMod.TransformerFactoryCreator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined rollup-plugin-typescript2.rollup-plugin-typescript2/dist/partial.Partial<rollup-plugin-typescript2.rollup-plugin-typescript2/dist/ioptions.IOptions> */
@js.native
trait PartialIOptions extends js.Object {
  var abortOnError: js.UndefOr[Boolean] = js.native
  var cacheRoot: js.UndefOr[String] = js.native
  var check: js.UndefOr[Boolean] = js.native
  var clean: js.UndefOr[Boolean] = js.native
  var exclude: js.UndefOr[String | js.Array[String]] = js.native
  var include: js.UndefOr[String | js.Array[String]] = js.native
  var objectHashIgnoreUnknownHack: js.UndefOr[Boolean] = js.native
  var rollupCommonJSResolveHack: js.UndefOr[Boolean] = js.native
  var sourceMapCallback: js.UndefOr[js.Function2[/* id */ String, /* map */ String, Unit]] = js.native
  var transformers: js.UndefOr[js.Array[TransformerFactoryCreator]] = js.native
  var tsconfig: js.UndefOr[String] = js.native
  var tsconfigDefaults: js.UndefOr[js.Any] = js.native
  var tsconfigOverride: js.UndefOr[js.Any] = js.native
  var typescript: js.UndefOr[TypeoftsTypes] = js.native
  var useTsconfigDeclarationDir: js.UndefOr[Boolean] = js.native
  var verbosity: js.UndefOr[Double] = js.native
}

object PartialIOptions {
  @scala.inline
  def apply(): PartialIOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIOptions]
  }
  @scala.inline
  implicit class PartialIOptionsOps[Self <: PartialIOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbortOnError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abortOnError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbortOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abortOnError")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheRoot")(js.undefined)
        ret
    }
    @scala.inline
    def withCheck(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("check")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("check")(js.undefined)
        ret
    }
    @scala.inline
    def withClean(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClean: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clean")(js.undefined)
        ret
    }
    @scala.inline
    def withExclude(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(js.undefined)
        ret
    }
    @scala.inline
    def withInclude(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectHashIgnoreUnknownHack(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectHashIgnoreUnknownHack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectHashIgnoreUnknownHack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectHashIgnoreUnknownHack")(js.undefined)
        ret
    }
    @scala.inline
    def withRollupCommonJSResolveHack(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rollupCommonJSResolveHack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRollupCommonJSResolveHack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rollupCommonJSResolveHack")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceMapCallback(value: (/* id */ String, /* map */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMapCallback")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSourceMapCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMapCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformers(value: js.Array[TransformerFactoryCreator]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransformers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformers")(js.undefined)
        ret
    }
    @scala.inline
    def withTsconfig(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tsconfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTsconfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tsconfig")(js.undefined)
        ret
    }
    @scala.inline
    def withTsconfigDefaults(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tsconfigDefaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTsconfigDefaults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tsconfigDefaults")(js.undefined)
        ret
    }
    @scala.inline
    def withTsconfigOverride(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tsconfigOverride")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTsconfigOverride: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tsconfigOverride")(js.undefined)
        ret
    }
    @scala.inline
    def withTypescript(value: TypeoftsTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typescript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypescript: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typescript")(js.undefined)
        ret
    }
    @scala.inline
    def withUseTsconfigDeclarationDir(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTsconfigDeclarationDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseTsconfigDeclarationDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTsconfigDeclarationDir")(js.undefined)
        ret
    }
    @scala.inline
    def withVerbosity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbosity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerbosity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbosity")(js.undefined)
        ret
    }
  }
  
}

