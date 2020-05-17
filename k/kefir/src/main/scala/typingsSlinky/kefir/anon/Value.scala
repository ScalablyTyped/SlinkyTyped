package typingsSlinky.kefir.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Value[U] extends js.Object {
  var convert: Boolean = js.native
  var value: U = js.native
}

object Value {
  @scala.inline
  def apply[U](convert: Boolean, value: U): Value[U] = {
    val __obj = js.Dynamic.literal(convert = convert.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value[U]]
  }
  @scala.inline
  implicit class ValueOps[Self[u] <: Value[u], U] (val x: Self[U]) extends AnyVal {
    @scala.inline
    def duplicate: Self[U] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[U]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[U] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[U] with Other]
    @scala.inline
    def withConvert(value: Boolean): Self[U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: U): Self[U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

