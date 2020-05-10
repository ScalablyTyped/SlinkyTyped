package typingsSlinky.levelup

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPut extends js.Object {
  def put(
    key: /* import warning: importer.ImportType#apply Failed type conversion: infer K */ js.Any,
    value: /* import warning: importer.ImportType#apply Failed type conversion: infer V */ js.Any,
    options: /* import warning: importer.ImportType#apply Failed type conversion: infer O */ js.Any,
    cb: js.Any
  ): Unit = js.native
}

object AnonPut {
  @scala.inline
  def apply(
    put: (/* import warning: importer.ImportType#apply Failed type conversion: infer K */ js.Any, /* import warning: importer.ImportType#apply Failed type conversion: infer V */ js.Any, /* import warning: importer.ImportType#apply Failed type conversion: infer O */ js.Any, js.Any) => Unit
  ): AnonPut = {
    val __obj = js.Dynamic.literal(put = js.Any.fromFunction4(put))
    __obj.asInstanceOf[AnonPut]
  }
  @scala.inline
  implicit class AnonPutOps[Self <: AnonPut] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPut(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: infer K */ js.Any, /* import warning: importer.ImportType#apply Failed type conversion: infer V */ js.Any, /* import warning: importer.ImportType#apply Failed type conversion: infer O */ js.Any, js.Any) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("put")(js.Any.fromFunction4(value))
        ret
    }
  }
  
}

