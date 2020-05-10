package typingsSlinky.babelCore.mod

import typingsSlinky.babelCore.AnonRequest
import typingsSlinky.babelCore.babelCoreBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigItem extends js.Object {
  /**
    * The path that the options are relative to.
    */
  var dirname: String = js.native
  /**
    * Information about the plugin's file, if Babel knows it.
    *  *
    */
  var file: js.UndefOr[AnonRequest | Null] = js.native
  /**
    * The name that the user gave the plugin instance, e.g. `plugins: [ ['env', {}, 'my-env'] ]`
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The options object passed to the plugin.
    */
  var options: js.UndefOr[js.Object | `false`] = js.native
  /**
    * The resolved value of the plugin.
    */
  var value: js.Object | (js.Function1[/* repeated */ js.Any, _]) = js.native
}

object ConfigItem {
  @scala.inline
  def apply(dirname: String, value: js.Object | (js.Function1[/* repeated */ js.Any, _])): ConfigItem = {
    val __obj = js.Dynamic.literal(dirname = dirname.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigItem]
  }
  @scala.inline
  implicit class ConfigItemOps[Self <: ConfigItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueFunction1(value: /* repeated */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withValue(value: js.Object | (js.Function1[/* repeated */ js.Any, _])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFile(value: AnonRequest): Self = {
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
    def withFileNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(null)
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
    def withOptions(value: js.Object | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
  }
  
}

