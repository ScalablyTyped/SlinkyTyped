package typingsSlinky.binaryParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonChoices extends js.Object {
  var choices: /* import warning: importer.ImportType#apply Failed type conversion: infer C */ js.Any = js.native
}

object AnonChoices {
  @scala.inline
  def apply(choices: /* import warning: importer.ImportType#apply Failed type conversion: infer C */ js.Any): AnonChoices = {
    val __obj = js.Dynamic.literal(choices = choices.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChoices]
  }
  @scala.inline
  implicit class AnonChoicesOps[Self <: AnonChoices] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChoices(value: /* import warning: importer.ImportType#apply Failed type conversion: infer C */ js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("choices")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

