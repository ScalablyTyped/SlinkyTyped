package typingsSlinky.emotionStyledBase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTheme extends js.Object {
  var theme: /* import warning: importer.ImportType#apply Failed type conversion: infer Theme */ js.Any = js.native
}

object AnonTheme {
  @scala.inline
  def apply(theme: /* import warning: importer.ImportType#apply Failed type conversion: infer Theme */ js.Any): AnonTheme = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTheme]
  }
  @scala.inline
  implicit class AnonThemeOps[Self <: AnonTheme] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTheme(value: /* import warning: importer.ImportType#apply Failed type conversion: infer Theme */ js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

