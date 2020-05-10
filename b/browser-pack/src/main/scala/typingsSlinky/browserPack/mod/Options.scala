package typingsSlinky.browserPack.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Used if opts.preludePath is undefined, this is used to resolve the prelude.js file location, default: 'process.cwd()'
    */
  var basedir: js.UndefOr[String] = js.native
  /**
    * A string to use in place of 'require' if opts.hasExports is specified, default is 'require'
    */
  var externalRequireName: js.UndefOr[String] = js.native
  /**
    * Whether the bundle should include require= (or the opts.externalRequireName) so that
    * require() is available outside the bundle
    */
  var hasExports: js.UndefOr[Boolean] = js.native
  /**
    * Specify a custom prelude, but know what you're doing first. See the prelude.js file in
    * this repo for the default prelude. If you specify a custom prelude, you must also specify
    * a valid opts.preludePath to the prelude source file for sourcemaps to work
    */
  var prelude: js.UndefOr[String] = js.native
  /**
    * prelude.js path if a custom opts.prelude is specified
    */
  var preludePath: js.UndefOr[String] = js.native
  /**
    * If given, the writable end of the stream will expect objects to be written to
    * it instead of expecting a stream of json text it will need to parse, default false
    */
  var raw: js.UndefOr[Boolean] = js.native
  /**
    * If given and source maps are computed, the opts.sourceMapPrefix string will be used instead of default: '//#'
    */
  var sourceMapPrefix: js.UndefOr[String] = js.native
  /**
    * If given and source maps are computed, the root for the output source map will be defined. (default is no root)
    */
  var sourceRoot: js.UndefOr[String] = js.native
  /**
    * External string name to use for UMD, if not provided, UMD declaration is not wrapped around output
    */
  var standalone: js.UndefOr[String] = js.native
  /**
    * Sets the internal module name to export for standalone
    */
  var standaloneModule: js.UndefOr[String] = js.native
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
    def withBasedir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basedir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBasedir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basedir")(js.undefined)
        ret
    }
    @scala.inline
    def withExternalRequireName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalRequireName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternalRequireName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalRequireName")(js.undefined)
        ret
    }
    @scala.inline
    def withHasExports(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasExports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasExports: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasExports")(js.undefined)
        ret
    }
    @scala.inline
    def withPrelude(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prelude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrelude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prelude")(js.undefined)
        ret
    }
    @scala.inline
    def withPreludePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preludePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreludePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preludePath")(js.undefined)
        ret
    }
    @scala.inline
    def withRaw(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRaw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceMapPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMapPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceMapPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMapPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceRoot")(js.undefined)
        ret
    }
    @scala.inline
    def withStandalone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standalone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStandalone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standalone")(js.undefined)
        ret
    }
    @scala.inline
    def withStandaloneModule(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standaloneModule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStandaloneModule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standaloneModule")(js.undefined)
        ret
    }
  }
  
}

