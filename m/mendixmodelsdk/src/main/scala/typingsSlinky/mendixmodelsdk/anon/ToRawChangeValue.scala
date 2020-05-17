package typingsSlinky.mendixmodelsdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToRawChangeValue[P] extends js.Object {
  def toRawChangeValue(value: P): js.Any = js.native
}

object ToRawChangeValue {
  @scala.inline
  def apply[P](toRawChangeValue: P => js.Any): ToRawChangeValue[P] = {
    val __obj = js.Dynamic.literal(toRawChangeValue = js.Any.fromFunction1(toRawChangeValue))
    __obj.asInstanceOf[ToRawChangeValue[P]]
  }
  @scala.inline
  implicit class ToRawChangeValueOps[Self[p] <: ToRawChangeValue[p], P] (val x: Self[P]) extends AnyVal {
    @scala.inline
    def duplicate: Self[P] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[P]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[P] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[P] with Other]
    @scala.inline
    def withToRawChangeValue(value: P => js.Any): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toRawChangeValue")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

