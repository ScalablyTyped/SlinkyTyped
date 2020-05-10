package typingsSlinky.karmaJsonPreprocessor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Default global variable name is by default `__json__`,
  * but you can override it with your own name in karma configuration:
  */
@js.native
trait JsonPreprocessorOptions extends js.Object {
  /**
    * @default ''
    */
  var stripPrefix: js.UndefOr[String] = js.native
  /**
    * @default '__json__'
    */
  var varName: js.UndefOr[String] = js.native
}

object JsonPreprocessorOptions {
  @scala.inline
  def apply(): JsonPreprocessorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsonPreprocessorOptions]
  }
  @scala.inline
  implicit class JsonPreprocessorOptionsOps[Self <: JsonPreprocessorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStripPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStripPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withVarName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("varName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVarName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("varName")(js.undefined)
        ret
    }
  }
  
}

