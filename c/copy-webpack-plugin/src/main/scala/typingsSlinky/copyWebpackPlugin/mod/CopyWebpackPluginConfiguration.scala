package typingsSlinky.copyWebpackPlugin.mod

import typingsSlinky.copyWebpackPlugin.copyWebpackPluginStrings.debug
import typingsSlinky.copyWebpackPlugin.copyWebpackPluginStrings.error
import typingsSlinky.copyWebpackPlugin.copyWebpackPluginStrings.info
import typingsSlinky.copyWebpackPlugin.copyWebpackPluginStrings.silent
import typingsSlinky.copyWebpackPlugin.copyWebpackPluginStrings.trace
import typingsSlinky.copyWebpackPlugin.copyWebpackPluginStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyWebpackPluginConfiguration extends js.Object {
  /** A path that determines how to interpret the from path, shared for all patterns. default: `'compiler.options.context'` */
  var context: js.UndefOr[String] = js.native
  /** Copies files, regardless of modification when using `watch` or `webpack-dev-server`. All files are copied on first build, regardless of this option. (default: `false`) */
  var copyUnmodified: js.UndefOr[Boolean] = js.native
  /** Array of globs to ignore. (applied to `from`; default: `[]`) */
  var ignore: js.UndefOr[js.Array[String | MiniMatchGlob]] = js.native
  /** Level of messages that the module will log. (default: `'warn'`) */
  var logLevel: js.UndefOr[trace | debug | info | warn | error | silent] = js.native
}

object CopyWebpackPluginConfiguration {
  @scala.inline
  def apply(): CopyWebpackPluginConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyWebpackPluginConfiguration]
  }
  @scala.inline
  implicit class CopyWebpackPluginConfigurationOps[Self <: CopyWebpackPluginConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withCopyUnmodified(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyUnmodified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopyUnmodified: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyUnmodified")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnore(value: js.Array[String | MiniMatchGlob]): Self = {
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
    def withLogLevel(value: trace | debug | info | warn | error | silent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logLevel")(js.undefined)
        ret
    }
  }
  
}

