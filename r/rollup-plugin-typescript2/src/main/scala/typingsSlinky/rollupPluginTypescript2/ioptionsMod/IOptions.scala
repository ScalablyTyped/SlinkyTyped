package typingsSlinky.rollupPluginTypescript2.ioptionsMod

import typingsSlinky.rollupPluginTypescript2.anon.TypeoftsTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOptions extends js.Object {
  var abortOnError: Boolean = js.native
  var cacheRoot: String = js.native
  var check: Boolean = js.native
  var clean: Boolean = js.native
  var exclude: String | js.Array[String] = js.native
  var include: String | js.Array[String] = js.native
  var objectHashIgnoreUnknownHack: Boolean = js.native
  var rollupCommonJSResolveHack: Boolean = js.native
  var transformers: js.Array[TransformerFactoryCreator] = js.native
  var tsconfig: js.UndefOr[String] = js.native
  var tsconfigDefaults: js.Any = js.native
  var tsconfigOverride: js.Any = js.native
  var typescript: TypeoftsTypes = js.native
  var useTsconfigDeclarationDir: Boolean = js.native
  var verbosity: Double = js.native
  def sourceMapCallback(id: String, map: String): Unit = js.native
}

object IOptions {
  @scala.inline
  def apply(
    abortOnError: Boolean,
    cacheRoot: String,
    check: Boolean,
    clean: Boolean,
    exclude: String | js.Array[String],
    include: String | js.Array[String],
    objectHashIgnoreUnknownHack: Boolean,
    rollupCommonJSResolveHack: Boolean,
    sourceMapCallback: (String, String) => Unit,
    transformers: js.Array[TransformerFactoryCreator],
    tsconfigDefaults: js.Any,
    tsconfigOverride: js.Any,
    typescript: TypeoftsTypes,
    useTsconfigDeclarationDir: Boolean,
    verbosity: Double
  ): IOptions = {
    val __obj = js.Dynamic.literal(abortOnError = abortOnError.asInstanceOf[js.Any], cacheRoot = cacheRoot.asInstanceOf[js.Any], check = check.asInstanceOf[js.Any], clean = clean.asInstanceOf[js.Any], exclude = exclude.asInstanceOf[js.Any], include = include.asInstanceOf[js.Any], objectHashIgnoreUnknownHack = objectHashIgnoreUnknownHack.asInstanceOf[js.Any], rollupCommonJSResolveHack = rollupCommonJSResolveHack.asInstanceOf[js.Any], sourceMapCallback = js.Any.fromFunction2(sourceMapCallback), transformers = transformers.asInstanceOf[js.Any], tsconfigDefaults = tsconfigDefaults.asInstanceOf[js.Any], tsconfigOverride = tsconfigOverride.asInstanceOf[js.Any], typescript = typescript.asInstanceOf[js.Any], useTsconfigDeclarationDir = useTsconfigDeclarationDir.asInstanceOf[js.Any], verbosity = verbosity.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
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
    def withCacheRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheck(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("check")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClean(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExclude(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInclude(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectHashIgnoreUnknownHack(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectHashIgnoreUnknownHack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRollupCommonJSResolveHack(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rollupCommonJSResolveHack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceMapCallback(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMapCallback")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTransformers(value: js.Array[TransformerFactoryCreator]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTsconfigDefaults(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tsconfigDefaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTsconfigOverride(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tsconfigOverride")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypescript(value: TypeoftsTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typescript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseTsconfigDeclarationDir(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTsconfigDeclarationDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerbosity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbosity")(value.asInstanceOf[js.Any])
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
  }
  
}

