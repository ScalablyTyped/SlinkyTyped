package typingsSlinky.kefir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonConvert[U] extends js.Object {
  var convert: Boolean = js.native
  var error: U = js.native
}

object AnonConvert {
  @scala.inline
  def apply[U](convert: Boolean, error: U): AnonConvert[U] = {
    val __obj = js.Dynamic.literal(convert = convert.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConvert[U]]
  }
  @scala.inline
  implicit class AnonConvertOps[Self[u] <: AnonConvert[u], U] (val x: Self[U]) extends AnyVal {
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
    def withError(value: U): Self[U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

