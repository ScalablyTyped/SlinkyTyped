package typingsSlinky.filingCabinet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * the parsed AST for filename
    * Useful optimization for avoiding a parse of filename
    */
  var ast: js.UndefOr[js.Any] = js.native
  /**
    * `requirejs` config for resolving aliased JavaScript modules
    */
  var config: js.UndefOr[js.Any] = js.native
  /** the path to all files */
  var directory: String = js.native
  /** the path to the file containing the partial */
  var filename: String = js.native
  /**
    * For typescript files, whether to prefer *.js over *.d.ts
    */
  var noTypeDefinitions: js.UndefOr[Boolean] = js.native
  /**
    * config for resolving entry file for `node_modules`.
    * This value overrides the main attribute in the `package.json` file;
    * used in conjunction with the `packageFilter` of the resolve package
    */
  var nodeModulesConfig: js.UndefOr[js.Any] = js.native
  /** the dependency path */
  var partial: String = js.native
  /**
    * Path to a typescript configuration.
    * Could also be an object representing a pre-parsed typescript config
    */
  var tsConfig: js.UndefOr[String | js.Object] = js.native
  /**
    * `webpack` config for resolving aliased JavaScript modules
    */
  var webpackConfig: js.UndefOr[js.Any] = js.native
}

object Options {
  @scala.inline
  def apply(directory: String, filename: String, partial: String): Options = {
    val __obj = js.Dynamic.literal(directory = directory.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], partial = partial.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirectory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPartial(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAst(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAst: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ast")(js.undefined)
        ret
    }
    @scala.inline
    def withConfig(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(js.undefined)
        ret
    }
    @scala.inline
    def withNoTypeDefinitions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noTypeDefinitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoTypeDefinitions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noTypeDefinitions")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeModulesConfig(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeModulesConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeModulesConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeModulesConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withTsConfig(value: String | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tsConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTsConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tsConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withWebpackConfig(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webpackConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebpackConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webpackConfig")(js.undefined)
        ret
    }
  }
  
}

