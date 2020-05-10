package typingsSlinky.apostrophe

import typingsSlinky.apostrophe.mod.AposObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonForm extends js.Object {
  def form(
    req: js.Any,
    data: js.Any,
    name: String,
    `object`: AposObject,
    field: js.Any,
    callback: js.Function0[_]
  ): Unit = js.native
  def string(
    req: js.Any,
    data: js.Any,
    name: String,
    `object`: AposObject,
    field: js.Any,
    callback: js.Function0[_]
  ): Unit = js.native
}

object AnonForm {
  @scala.inline
  def apply(
    form: (js.Any, js.Any, String, AposObject, js.Any, js.Function0[_]) => Unit,
    string: (js.Any, js.Any, String, AposObject, js.Any, js.Function0[_]) => Unit
  ): AnonForm = {
    val __obj = js.Dynamic.literal(form = js.Any.fromFunction6(form), string = js.Any.fromFunction6(string))
    __obj.asInstanceOf[AnonForm]
  }
  @scala.inline
  implicit class AnonFormOps[Self <: AnonForm] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForm(value: (js.Any, js.Any, String, AposObject, js.Any, js.Function0[_]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("form")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withString(value: (js.Any, js.Any, String, AposObject, js.Any, js.Function0[_]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("string")(js.Any.fromFunction6(value))
        ret
    }
  }
  
}

