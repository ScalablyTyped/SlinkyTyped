package typingsSlinky.ckeditorCkeditor5Utils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIdProperty[T] extends js.Object {
  var idProperty: js.UndefOr[/* keyof T */ String] = js.native
}

object AnonIdProperty {
  @scala.inline
  def apply[T](): AnonIdProperty[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonIdProperty[T]]
  }
  @scala.inline
  implicit class AnonIdPropertyOps[Self[t] <: AnonIdProperty[t], T] (val x: Self[T]) extends AnyVal {
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

