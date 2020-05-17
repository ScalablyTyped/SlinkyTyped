package typingsSlinky.highland.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Array[R] extends js.Object {
  var array: js.Any = js.native
  var stream: js.Any = js.native
  var value: R = js.native
}

object Array {
  @scala.inline
  def apply[R](array: js.Any, stream: js.Any, value: R): Array[R] = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Array[R]]
  }
  @scala.inline
  implicit class ArrayOps[Self[r] <: Array[r], R] (val x: Self[R]) extends AnyVal {
    @scala.inline
    def duplicate: Self[R] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[R]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[R] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[R] with Other]
    @scala.inline
    def withArray(value: js.Any): Self[R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("array")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStream(value: js.Any): Self[R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: R): Self[R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

