package typingsSlinky.levelup

import typingsSlinky.abstractLeveldown.mod.ErrorCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonClear extends js.Object {
  def clear(
    options: /* import warning: importer.ImportType#apply Failed type conversion: infer O */ js.Any,
    callback: ErrorCallback
  ): Unit = js.native
}

object AnonClear {
  @scala.inline
  def apply(
    clear: (/* import warning: importer.ImportType#apply Failed type conversion: infer O */ js.Any, ErrorCallback) => Unit
  ): AnonClear = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction2(clear))
    __obj.asInstanceOf[AnonClear]
  }
  @scala.inline
  implicit class AnonClearOps[Self <: AnonClear] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClear(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: infer O */ js.Any, ErrorCallback) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

