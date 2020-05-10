package typingsSlinky.pkgConf.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options[ConfigType /* <: Config */] extends js.Object {
  /**
  		Directory to start looking up for a `package.json` file.
  		@default process.cwd()
  		*/
  var cwd: js.UndefOr[String] = js.native
  /**
  		Default config.
  		@default {}
  		*/
  var defaults: js.UndefOr[ConfigType] = js.native
  /**
  		Skip `package.json` files that have the namespaced config explicitly set to `false`.
  		Continues searching upwards until the next `package.json` file is reached. This can be useful when you need to support the ability for users to have nested `package.json` files, but only read from the root one, like in the case of [`electron-builder`](https://github.com/electron-userland/electron-builder/wiki/Options#AppMetadata) where you have one `package.json` file for the app and one top-level for development.
  		@default false
  		@example
  		```
  		{
  			"name": "some-package",
  			"version": "1.0.0",
  			"unicorn": false
  		}
  		```
  		*/
  var skipOnFalse: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply[ConfigType](): Options[ConfigType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[ConfigType]]
  }
  @scala.inline
  implicit class OptionsOps[Self[configtype] <: Options[configtype], ConfigType] (val x: Self[ConfigType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ConfigType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ConfigType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[ConfigType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[ConfigType] with Other]
    @scala.inline
    def withCwd(value: String): Self[ConfigType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cwd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCwd: Self[ConfigType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cwd")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaults(value: ConfigType): Self[ConfigType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaults: Self[ConfigType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaults")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipOnFalse(value: Boolean): Self[ConfigType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipOnFalse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipOnFalse: Self[ConfigType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipOnFalse")(js.undefined)
        ret
    }
  }
  
}

