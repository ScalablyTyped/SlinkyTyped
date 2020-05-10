package typingsSlinky.mongodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon4 extends js.Object {
  var _id: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any = js.native
}

object Anon4 {
  @scala.inline
  def apply(_id: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Anon4 = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon4]
  }
  @scala.inline
  implicit class Anon4Ops[Self <: Anon4] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_id(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

