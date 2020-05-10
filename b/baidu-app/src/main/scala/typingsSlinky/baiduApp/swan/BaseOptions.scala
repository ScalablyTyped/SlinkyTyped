package typingsSlinky.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseOptions[R, E] extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.native
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[js.Function1[/* res */ E, Unit]] = js.native
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[js.Function1[/* res */ R, Unit]] = js.native
}

object BaseOptions {
  @scala.inline
  def apply[R, E](): BaseOptions[R, E] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseOptions[R, E]]
  }
  @scala.inline
  implicit class BaseOptionsOps[Self[r, e] <: BaseOptions[r, e], R, E] (val x: Self[R, E]) extends AnyVal {
    @scala.inline
    def duplicate: Self[R, E] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[R, E]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[R, E]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[R, E]) with Other]
    @scala.inline
    def withComplete(value: /* res */ js.Any => Unit): Self[R, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutComplete: Self[R, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.undefined)
        ret
    }
    @scala.inline
    def withFail(value: /* res */ E => Unit): Self[R, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fail")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFail: Self[R, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fail")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccess(value: /* res */ R => Unit): Self[R, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSuccess: Self[R, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.undefined)
        ret
    }
  }
  
}

