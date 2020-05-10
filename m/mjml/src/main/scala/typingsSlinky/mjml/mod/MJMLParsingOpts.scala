package typingsSlinky.mjml.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.mjml.mjmlStrings.skip
import typingsSlinky.mjml.mjmlStrings.soft
import typingsSlinky.mjml.mjmlStrings.strict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MJMLParsingOpts extends js.Object {
  var beautify: js.UndefOr[Boolean] = js.native
  var filePath: js.UndefOr[String] = js.native
  var fonts: js.UndefOr[StringDictionary[String]] = js.native
  var keepComments: js.UndefOr[Boolean] = js.native
  var minify: js.UndefOr[Boolean] = js.native
  var minifyOptions: js.UndefOr[MJMLMinifyOptions] = js.native
  var validationLevel: js.UndefOr[strict | soft | skip] = js.native
}

object MJMLParsingOpts {
  @scala.inline
  def apply(): MJMLParsingOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MJMLParsingOpts]
  }
  @scala.inline
  implicit class MJMLParsingOptsOps[Self <: MJMLParsingOpts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBeautify(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beautify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeautify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beautify")(js.undefined)
        ret
    }
    @scala.inline
    def withFilePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filePath")(js.undefined)
        ret
    }
    @scala.inline
    def withFonts(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fonts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFonts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fonts")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepComments(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepComments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepComments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepComments")(js.undefined)
        ret
    }
    @scala.inline
    def withMinify(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minify")(js.undefined)
        ret
    }
    @scala.inline
    def withMinifyOptions(value: MJMLMinifyOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minifyOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinifyOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minifyOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withValidationLevel(value: strict | soft | skip): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationLevel")(js.undefined)
        ret
    }
  }
  
}

