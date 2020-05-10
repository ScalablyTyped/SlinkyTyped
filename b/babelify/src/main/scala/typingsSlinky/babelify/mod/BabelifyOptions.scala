package typingsSlinky.babelify.mod

import typingsSlinky.babelCore.mod.TransformOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BabelifyOptions extends TransformOptions {
  /** These are passed to babel.util.canCompile() for each filename
    * default: null
    */
  var extensions: js.UndefOr[String | js.Array[String]] = js.native
  /** if true, a 'sourceFileName' property with a value equal to the current file being transformed is included with the options passed to babel.transform()
    * default: false
    */
  var sourceMapsAbsolute: js.UndefOr[Boolean] = js.native
}

object BabelifyOptions {
  @scala.inline
  def apply(): BabelifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BabelifyOptions]
  }
  @scala.inline
  implicit class BabelifyOptionsOps[Self <: BabelifyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withSourceMapsAbsolute(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMapsAbsolute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceMapsAbsolute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMapsAbsolute")(js.undefined)
        ret
    }
  }
  
}

