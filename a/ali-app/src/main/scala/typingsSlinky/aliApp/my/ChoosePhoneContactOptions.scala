package typingsSlinky.aliApp.my

import typingsSlinky.aliApp.aliAppNumbers.`10`
import typingsSlinky.aliApp.aliAppNumbers.`11`
import typingsSlinky.aliApp.anon.Mobile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region 联系人 https://docs.alipay.com/mini/api/ui-contact
@js.native
trait ChoosePhoneContactOptions
  extends BaseOptions[js.Any, js.Any] {
  
  /**
    * 10    没有权限
    * 11    用户取消操作(或设备未授权使用通讯录)
    */
  @JSName("fail")
  var fail_ChoosePhoneContactOptions: js.UndefOr[js.Function1[/* error */ `10` | `11`, Unit]] = js.native
  
  @JSName("success")
  def success_MChoosePhoneContactOptions(result: Mobile): Unit = js.native
}
object ChoosePhoneContactOptions {
  
  @scala.inline
  def apply(success: Mobile => Unit): ChoosePhoneContactOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[ChoosePhoneContactOptions]
  }
  
  @scala.inline
  implicit class ChoosePhoneContactOptionsMutableBuilder[Self <: ChoosePhoneContactOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFail(value: /* error */ `10` | `11` => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setSuccess(value: Mobile => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
