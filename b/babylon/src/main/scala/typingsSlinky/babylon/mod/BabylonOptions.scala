package typingsSlinky.babylon.mod

import typingsSlinky.babylon.babylonStrings.module
import typingsSlinky.babylon.babylonStrings.script
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BabylonOptions extends js.Object {
  /**
    * By default, import and export declarations can only appear at a program's top level.
    * Setting this option to true allows them anywhere where a statement is allowed.
    */
  var allowImportExportEverywhere: js.UndefOr[Boolean] = js.native
  /**
    * By default, a return statement at the top level raises an error. Set this to true to accept such code.
    */
  var allowReturnOutsideFunction: js.UndefOr[Boolean] = js.native
  var allowSuperOutsideMethod: js.UndefOr[Boolean] = js.native
  /**
    * Array containing the plugins that you want to enable.
    */
  var plugins: js.UndefOr[js.Array[PluginName]] = js.native
  /**
    * Correlate output AST nodes with their source filename. Useful when
    * generating code and source maps from the ASTs of multiple input files.
    */
  var sourceFilename: js.UndefOr[String] = js.native
  /**
    * Indicate the mode the code should be parsed in. Can be either "script" or "module".
    */
  var sourceType: js.UndefOr[script | module] = js.native
}

object BabylonOptions {
  @scala.inline
  def apply(): BabylonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BabylonOptions]
  }
  @scala.inline
  implicit class BabylonOptionsOps[Self <: BabylonOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowImportExportEverywhere(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowImportExportEverywhere")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowImportExportEverywhere: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowImportExportEverywhere")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowReturnOutsideFunction(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowReturnOutsideFunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowReturnOutsideFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowReturnOutsideFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowSuperOutsideMethod(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSuperOutsideMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowSuperOutsideMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSuperOutsideMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withPlugins(value: js.Array[PluginName]): Self = {
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
    def withSourceFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceFilename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceFilename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceFilename")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceType(value: script | module): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceType")(js.undefined)
        ret
    }
  }
  
}

