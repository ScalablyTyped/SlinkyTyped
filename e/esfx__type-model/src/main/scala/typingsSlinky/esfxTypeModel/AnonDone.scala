package typingsSlinky.esfxTypeModel

import typingsSlinky.esfxTypeModel.esfxTypeModelBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDone extends js.Object {
  var done: `false` = js.native
  var value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any = js.native
}

object AnonDone {
  @scala.inline
  def apply(
    done: `false`,
    value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
  ): AnonDone = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDone]
  }
  @scala.inline
  implicit class AnonDoneOps[Self <: AnonDone] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDone(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("done")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

