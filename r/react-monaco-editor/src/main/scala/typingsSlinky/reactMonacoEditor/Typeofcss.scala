package typingsSlinky.reactMonacoEditor

import typingsSlinky.monacoEditor.mod.languages.css.LanguageServiceDefaults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofcss extends js.Object {
  var cssDefaults: LanguageServiceDefaults = js.native
  var lessDefaults: LanguageServiceDefaults = js.native
  var scssDefaults: LanguageServiceDefaults = js.native
}

object Typeofcss {
  @scala.inline
  def apply(
    cssDefaults: LanguageServiceDefaults,
    lessDefaults: LanguageServiceDefaults,
    scssDefaults: LanguageServiceDefaults
  ): Typeofcss = {
    val __obj = js.Dynamic.literal(cssDefaults = cssDefaults.asInstanceOf[js.Any], lessDefaults = lessDefaults.asInstanceOf[js.Any], scssDefaults = scssDefaults.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofcss]
  }
  @scala.inline
  implicit class TypeofcssOps[Self <: Typeofcss] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCssDefaults(value: LanguageServiceDefaults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssDefaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLessDefaults(value: LanguageServiceDefaults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lessDefaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScssDefaults(value: LanguageServiceDefaults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scssDefaults")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

