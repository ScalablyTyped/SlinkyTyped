package typingsSlinky.gulpTypedoc.mod

import typingsSlinky.gulpTypedoc.gulpTypedocStrings.amd
import typingsSlinky.gulpTypedoc.gulpTypedocStrings.commonjs
import typingsSlinky.gulpTypedoc.gulpTypedocStrings.file
import typingsSlinky.gulpTypedoc.gulpTypedocStrings.modules
import typingsSlinky.gulpTypedoc.gulpTypedocStrings.none
import typingsSlinky.gulpTypedoc.gulpTypedocStrings.system
import typingsSlinky.gulpTypedoc.gulpTypedocStrings.umd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Typedoc options
  */
@js.native
trait Options extends js.Object {
  /**
    * Specifies the fully qualified name of the root symbol. Defaults to global namespace.
    */
  var entryPoint: js.UndefOr[String] = js.native
  /**
    * Exclude files by the given pattern when a path is provided as source. Supports standard minimatch patterns
    * (see TypeStrong/typedoc#170)
    */
  var exclude: js.UndefOr[String] = js.native
  /**
    * Prevent externally resolved TypeScript files from being documented.
    */
  var excludeExternals: js.UndefOr[Boolean] = js.native
  /**
    * Prevent private members from being included in the generated documentation.
    */
  var excludePrivate: js.UndefOr[Boolean] = js.native
  /**
    * Prevent protected members from being included in the generated documentation.
    */
  var excludeProtected: js.UndefOr[Boolean] = js.native
  /**
    * Define a pattern for files that should be considered being external.
    */
  var externalPattern: js.UndefOr[String] = js.native
  /**
    * Set the Google Analytics tracking ID and activate tracking code.
    */
  var gaID: js.UndefOr[String] = js.native
  /**
    * Set the site name for Google Analytics. Defaults to `auto`
    */
  var gaSite: js.UndefOr[String] = js.native
  /**
    * Use specified revision or branch instead of the last revision for linking to GitHub source files.
    */
  var gitRevision: js.UndefOr[String] = js.native
  /**
    * Do not print the TypeDoc link at the end of the page.
    */
  var hideGenerator: js.UndefOr[Boolean] = js.native
  /**
    * Turn on parsing of .d.ts declaration files.
    */
  var includeDeclarations: js.UndefOr[Boolean] = js.native
  /**
    * Specifies the location to look for included documents. One may use [[include:FILENAME]] in comments to include
    * documents from this location.
    */
  var includes: js.UndefOr[String] = js.native
  /**
    * Specifies the location and file name a json file describing the project is written to. When specified no
    * documentation will be generated.
    */
  var json: js.UndefOr[String] = js.native
  var logger: js.UndefOr[Logger | none] = js.native
  /**
    * Specifies the location with media files that should be copied to the output directory. In order to create a link
    * to media files use the pattern media://FILENAME in comments.
    */
  var media: js.UndefOr[String] = js.native
  /**
    * Specifies the output mode the project is used to be compiled with.
    */
  var mode: js.UndefOr[file | modules] = js.native
  /**
    * Specify module code generation: "commonjs", "amd", "system" or "umd".
    */
  var module: js.UndefOr[commonjs | amd | system | umd] = js.native
  /**
    * Set the name of the project that will be used in the header of the template.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Specifies the location the documentation should be written to.
    */
  var out: String = js.native
  /**
    * Specify the npm plugins that should be loaded.
    */
  var plugins: js.UndefOr[js.Array[String]] = js.native
  /**
    * Path to the readme file that should be displayed on the index page. Pass `none` to disable the index page and
    * start the documentation on the globals page.
    */
  var readme: js.UndefOr[String] = js.native
  /**
    * Specify ECMAScript target version: "ES3" (default), "ES5" or "ES6"
    */
  var target: js.UndefOr[String] = js.native
  /**
    * Specify the path to the theme that should be used.
    */
  var theme: js.UndefOr[String] = js.native
  var verbose: js.UndefOr[Boolean] = js.native
  var version: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(out: String): Options = {
    val __obj = js.Dynamic.literal(out = out.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOut(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("out")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntryPoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entryPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntryPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entryPoint")(js.undefined)
        ret
    }
    @scala.inline
    def withExclude(value: String): Self = {
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
    def withExcludeExternals(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeExternals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeExternals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeExternals")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludePrivate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludePrivate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludePrivate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludePrivate")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludeProtected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeProtected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeProtected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeProtected")(js.undefined)
        ret
    }
    @scala.inline
    def withExternalPattern(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternalPattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalPattern")(js.undefined)
        ret
    }
    @scala.inline
    def withGaID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gaID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGaID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gaID")(js.undefined)
        ret
    }
    @scala.inline
    def withGaSite(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gaSite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGaSite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gaSite")(js.undefined)
        ret
    }
    @scala.inline
    def withGitRevision(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gitRevision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGitRevision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gitRevision")(js.undefined)
        ret
    }
    @scala.inline
    def withHideGenerator(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideGenerator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideGenerator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideGenerator")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeDeclarations(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeDeclarations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeDeclarations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeDeclarations")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includes")(js.undefined)
        ret
    }
    @scala.inline
    def withJson(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJson: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json")(js.undefined)
        ret
    }
    @scala.inline
    def withLoggerFunction3(value: (/* message */ String, /* level */ Double, /* newline */ Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withLogger(value: Logger | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(js.undefined)
        ret
    }
    @scala.inline
    def withMedia(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMedia: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: file | modules): Self = {
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
    def withModule(value: commonjs | amd | system | umd): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("module")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("module")(js.undefined)
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
    def withPlugins(value: js.Array[String]): Self = {
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
    def withReadme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readme")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
    @scala.inline
    def withVerbose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerbose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

