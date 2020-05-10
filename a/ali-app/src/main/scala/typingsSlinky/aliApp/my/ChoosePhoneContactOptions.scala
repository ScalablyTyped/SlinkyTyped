package typingsSlinky.aliApp.my

import typingsSlinky.aliApp.AnonMobile
import typingsSlinky.aliApp.aliAppNumbers.`10`
import typingsSlinky.aliApp.aliAppNumbers.`11`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region 联系人 https://docs.alipay.com/mini/api/ui-contact
@js.native
trait ChoosePhoneContactOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 10	没有权限
  		 * 11	用户取消操作(或设备未授权使用通讯录)
  		 */
  @JSName("fail")
  var fail_ChoosePhoneContactOptions: js.UndefOr[js.Function1[/* error */ `10` | `11`, Unit]] = js.native
  @JSName("success")
  def success_MChoosePhoneContactOptions(result: AnonMobile): Unit = js.native
}

object ChoosePhoneContactOptions {
  @scala.inline
  def apply(success: AnonMobile => Unit): ChoosePhoneContactOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[ChoosePhoneContactOptions]
  }
  @scala.inline
  implicit class ChoosePhoneContactOptionsOps[Self <: ChoosePhoneContactOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSuccess(value: AnonMobile => Unit): Self = {
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

