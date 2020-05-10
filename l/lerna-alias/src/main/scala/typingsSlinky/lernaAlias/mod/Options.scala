package typingsSlinky.lernaAlias.mod

import typingsSlinky.lernaAlias.lernaAliasBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * From which directory the lerna monorepo should be searched for
    * @default `process.cwd()`
    */
  var directory: js.UndefOr[String] = js.native
  /**
    * Optional array of `mainFields` that should be used to resolve package's entry point,
    * similar to https://webpack.js.org/configuration/resolve/#resolve-mainfields .
    * Using this takes precedence over default `sourceDirectory` option.
    */
  var mainFields: js.UndefOr[js.Array[String]] = js.native
  /**
    * Which directory should be considered as containing source files of a package.
    * If specified as false it will use package's root.
    * @default 'src'
    */
  var sourceDirectory: js.UndefOr[String | `false`] = js.native
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
    def withDirectory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directory")(js.undefined)
        ret
    }
    @scala.inline
    def withMainFields(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mainFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMainFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mainFields")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceDirectory(value: String | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceDirectory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceDirectory")(js.undefined)
        ret
    }
  }
  
}

