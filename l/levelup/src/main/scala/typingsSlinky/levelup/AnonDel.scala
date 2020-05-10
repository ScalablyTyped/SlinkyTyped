package typingsSlinky.levelup

import typingsSlinky.abstractLeveldown.mod.ErrorCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDel extends js.Object {
  def del(
    key: /* import warning: importer.ImportType#apply Failed type conversion: infer K */ js.Any,
    options: /* import warning: importer.ImportType#apply Failed type conversion: infer O */ js.Any,
    callback: ErrorCallback
  ): Unit = js.native
}

object AnonDel {
  @scala.inline
  def apply(
    del: (/* import warning: importer.ImportType#apply Failed type conversion: infer K */ js.Any, /* import warning: importer.ImportType#apply Failed type conversion: infer O */ js.Any, ErrorCallback) => Unit
  ): AnonDel = {
    val __obj = js.Dynamic.literal(del = js.Any.fromFunction3(del))
    __obj.asInstanceOf[AnonDel]
  }
  @scala.inline
  implicit class AnonDelOps[Self <: AnonDel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDel(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: infer K */ js.Any, /* import warning: importer.ImportType#apply Failed type conversion: infer O */ js.Any, ErrorCallback) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("del")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

