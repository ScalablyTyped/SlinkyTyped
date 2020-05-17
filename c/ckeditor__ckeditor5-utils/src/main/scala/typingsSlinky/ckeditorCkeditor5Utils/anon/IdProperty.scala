package typingsSlinky.ckeditorCkeditor5Utils.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdProperty[T] extends js.Object {
  var idProperty: js.UndefOr[/* keyof T */ String] = js.native
}

object IdProperty {
  @scala.inline
  def apply[T](): IdProperty[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdProperty[T]]
  }
  @scala.inline
  implicit class IdPropertyOps[Self[t] <: IdProperty[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withIdProperty(value: /* keyof T */ String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdProperty: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idProperty")(js.undefined)
        ret
    }
  }
  
}

