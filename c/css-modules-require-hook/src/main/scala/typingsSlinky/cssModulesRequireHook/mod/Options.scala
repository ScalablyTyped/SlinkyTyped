package typingsSlinky.cssModulesRequireHook.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /** Appends custom plugins to the end of the PostCSS pipeline. */
  var append: js.UndefOr[js.Array[_]] = js.native
  /** Camelizes exported class names. */
  var camelCase: js.UndefOr[Boolean] = js.native
  /** Short alias for the postcss-modules-extract-imports plugin's createImportedName option. */
  var createImportedName: js.UndefOr[js.Function] = js.native
  /** Helps you to invalidate cache of all require calls. */
  var devMode: js.UndefOr[Boolean] = js.native
  /** Attach the require hook to additional file extensions. */
  var extensions: js.UndefOr[String | js.Array[String]] = js.native
  /** Short alias for the postcss-modules-scope plugin's option. */
  var generateScopedName: js.UndefOr[String | js.Function] = js.native
  /** Short alias for the generic-names helper option. */
  var hashPrefix: js.UndefOr[String] = js.native
  /** Provides possibility to exclude particular files from processing. */
  var ignore: js.UndefOr[String | js.RegExp | (js.Function1[/* filepath */ String, Boolean])] = js.native
  /** Short alias for the postcss-modules-local-by-default plugin's option. */
  var mode: js.UndefOr[String] = js.native
  /** Prepends custom plugins to the beginning of the PostCSS pipeline. */
  var prepend: js.UndefOr[js.Array[_]] = js.native
  /** In rare cases you may want to precompile styles, before they will be passed to the PostCSS pipeline. */
  var preprocessCss: js.UndefOr[js.Function] = js.native
  /** In rare cases you may want to get compiled styles in runtime, so providing this option helps. */
  var processCss: js.UndefOr[js.Function] = js.native
  /** Provides possibility to pass custom options to the LazyResult instance. */
  var processorOpts: js.UndefOr[js.Object] = js.native
  /** Provides absolute path to the project directory. */
  var rootDir: js.UndefOr[String] = js.native
  /** Provides the full list of PostCSS plugins to the pipeline. */
  var use: js.UndefOr[js.Array[_]] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppend(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("append")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("append")(js.undefined)
        ret
    }
    @scala.inline
    def withCamelCase(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("camelCase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCamelCase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("camelCase")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateImportedName(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createImportedName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateImportedName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createImportedName")(js.undefined)
        ret
    }
    @scala.inline
    def withDevMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devMode")(js.undefined)
        ret
    }
    @scala.inline
    def withExtensions(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(js.undefined)
        ret
    }
    @scala.inline
    def withGenerateScopedName(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateScopedName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGenerateScopedName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateScopedName")(js.undefined)
        ret
    }
    @scala.inline
    def withHashPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHashPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreFunction1(value: /* filepath */ String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIgnoreRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIgnore(value: String | js.RegExp | (js.Function1[/* filepath */ String, Boolean])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withPrepend(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrepend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepend")(js.undefined)
        ret
    }
    @scala.inline
    def withPreprocessCss(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preprocessCss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreprocessCss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preprocessCss")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessCss(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processCss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessCss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processCss")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessorOpts(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processorOpts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessorOpts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processorOpts")(js.undefined)
        ret
    }
    @scala.inline
    def withRootDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootDir")(js.undefined)
        ret
    }
    @scala.inline
    def withUse(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use")(js.undefined)
        ret
    }
  }
  
}

