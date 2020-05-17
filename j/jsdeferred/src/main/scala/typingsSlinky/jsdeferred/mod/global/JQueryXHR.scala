package typingsSlinky.jsdeferred.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryXHR extends js.Object {
  def next(fun: js.Function): Deferred = js.native
}

object JQueryXHR {
  @scala.inline
  def apply(next: js.Function => Deferred): JQueryXHR = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction1(next))
    __obj.asInstanceOf[JQueryXHR]
  }
  @scala.inline
  implicit class JQueryXHROps[Self <: JQueryXHR] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNext(value: js.Function => Deferred): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

