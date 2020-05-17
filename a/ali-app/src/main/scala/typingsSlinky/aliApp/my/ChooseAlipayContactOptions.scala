package typingsSlinky.aliApp.my

import typingsSlinky.aliApp.aliAppNumbers.`10`
import typingsSlinky.aliApp.aliAppNumbers.`11`
import typingsSlinky.aliApp.anon.Avatar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChooseAlipayContactOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 单次最多选择联系人个数，默认 1，最大 10 */
  var count: Double = js.native
  /**
  		 * 10	没有权限
  		 * 11	用户取消操作(或设备未授权使用通讯录)
  		 */
  @JSName("fail")
  var fail_ChooseAlipayContactOptions: js.UndefOr[js.Function1[/* error */ `10` | `11`, Unit]] = js.native
  @JSName("success")
  def success_MChooseAlipayContactOptions(result: Avatar): Unit = js.native
}

object ChooseAlipayContactOptions {
  @scala.inline
  def apply(count: Double, success: Avatar => Unit): ChooseAlipayContactOptions = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[ChooseAlipayContactOptions]
  }
  @scala.inline
  implicit class ChooseAlipayContactOptionsOps[Self <: ChooseAlipayContactOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccess(value: Avatar => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFail(value: /* error */ `10` | `11` => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fail")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fail")(js.undefined)
        ret
    }
  }
  
}

