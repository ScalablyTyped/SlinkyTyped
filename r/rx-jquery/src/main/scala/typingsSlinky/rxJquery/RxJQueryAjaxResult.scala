package typingsSlinky.rxJquery

import typingsSlinky.jquery.JQueryXHR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RxJQueryAjaxResult[T] extends js.Object {
  var data: T = js.native
  var jqXHR: JQueryXHR = js.native
  var textStatus: String = js.native
}

object RxJQueryAjaxResult {
  @scala.inline
  def apply[T](data: T, jqXHR: JQueryXHR, textStatus: String): RxJQueryAjaxResult[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], jqXHR = jqXHR.asInstanceOf[js.Any], textStatus = textStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[RxJQueryAjaxResult[T]]
  }
  @scala.inline
  implicit class RxJQueryAjaxResultOps[Self[t] <: RxJQueryAjaxResult[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withData(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJqXHR(value: JQueryXHR): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jqXHR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextStatus(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textStatus")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

