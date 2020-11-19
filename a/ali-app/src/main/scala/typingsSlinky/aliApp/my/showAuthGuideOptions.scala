package typingsSlinky.aliApp.my

import typingsSlinky.aliApp.aliAppStrings.ADDRESSBOOK
import typingsSlinky.aliApp.aliAppStrings.BACKGROUNDER
import typingsSlinky.aliApp.aliAppStrings.CAMERA
import typingsSlinky.aliApp.aliAppStrings.LBS
import typingsSlinky.aliApp.aliAppStrings.LBSSERVICE
import typingsSlinky.aliApp.aliAppStrings.MICROPHONE
import typingsSlinky.aliApp.aliAppStrings.NOTIFICATION
import typingsSlinky.aliApp.aliAppStrings.PHOTO
import typingsSlinky.aliApp.aliAppStrings.SELFSTARTING
import typingsSlinky.aliApp.aliAppStrings.SHORTCUT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region 权限引导 https://docs.alipay.com/mini/api/show-auth-guide
@js.native
trait showAuthGuideOptions
  extends BaseOptions[js.Any, js.Any] {
  
  /**
    * 引导的权限标识，用于标识该权限类型(如 LBS)
    * 支持的 authType 如下：
    *
    * 权限名称    权限码    支持平台
    * 后台保活权限    BACKGROUNDER    Android
    * 桌面快捷权限    SHORTCUT    Android
    * 麦克风权限    MICROPHONE    iOS
    * 通讯录权限    ADDRESSBOOK    iOS
    * 相机权限    CAMERA    iOS
    * 照片权限    PHOTO    iOS
    * push通知栏权限    NOTIFICATION    iOS
    * 自启动权限    SELFSTARTING    Android
    * lbs总开关    LBSSERVICE    iOS
    * lbs开关(app)    LBS    iOS
    */
  var authType: BACKGROUNDER | SHORTCUT | MICROPHONE | ADDRESSBOOK | CAMERA | PHOTO | NOTIFICATION | SELFSTARTING | LBSSERVICE | LBS = js.native
}
object showAuthGuideOptions {
  
  @scala.inline
  def apply(
    authType: BACKGROUNDER | SHORTCUT | MICROPHONE | ADDRESSBOOK | CAMERA | PHOTO | NOTIFICATION | SELFSTARTING | LBSSERVICE | LBS
  ): showAuthGuideOptions = {
    val __obj = js.Dynamic.literal(authType = authType.asInstanceOf[js.Any])
    __obj.asInstanceOf[showAuthGuideOptions]
  }
  
  @scala.inline
  implicit class showAuthGuideOptionsOps[Self <: showAuthGuideOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuthType(
      value: BACKGROUNDER | SHORTCUT | MICROPHONE | ADDRESSBOOK | CAMERA | PHOTO | NOTIFICATION | SELFSTARTING | LBSSERVICE | LBS
    ): Self = this.set("authType", value.asInstanceOf[js.Any])
  }
}
