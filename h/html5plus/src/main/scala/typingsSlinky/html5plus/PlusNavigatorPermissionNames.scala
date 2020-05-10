package typingsSlinky.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 运行环境权限类型
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/navigator.html](http://www.html5plus.org/doc/zh_cn/navigator.html)
  */
@js.native
trait PlusNavigatorPermissionNames extends js.Object {
  /**
    * 访问摄像头权限
    * 用于调用摄像头（plus.camera.*、plus.barcode.*）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/navigator.html](http://www.html5plus.org/doc/zh_cn/navigator.html)
    */
  var CAMERA: js.UndefOr[String] = js.native
  /**
    * 访问系统联系人权限
    * 用于访问（读、写）系统通讯录（plus.gallery.*）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/navigator.html](http://www.html5plus.org/doc/zh_cn/navigator.html)
    */
  var CONTACTS: js.UndefOr[String] = js.native
  /**
    * 访问系统相册权限
    * 用于访问（读、写）系统相册（plus.gallery.*）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/navigator.html](http://www.html5plus.org/doc/zh_cn/navigator.html)
    */
  var GALLERY: js.UndefOr[String] = js.native
  /**
    * 定位权限
    * 用于获取当前用户位置信息（plus.geolocation.*）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/navigator.html](http://www.html5plus.org/doc/zh_cn/navigator.html)
    */
  var LOCATION: js.UndefOr[String] = js.native
  /**
    * 消息通知权限
    * 用于接收系统消息通知（plus.push.*）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/navigator.html](http://www.html5plus.org/doc/zh_cn/navigator.html)
    */
  var NOTIFITION: js.UndefOr[String] = js.native
  /**
    * 录音权限
    * 用于进行本地录音操作（plus.audio.AudioRecorder）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/navigator.html](http://www.html5plus.org/doc/zh_cn/navigator.html)
    */
  var RECORD: js.UndefOr[String] = js.native
  /**
    * 创建桌面快捷方式权限
    * 用于在系统桌面创建快捷方式图标（plus.navigator.createShortcut）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/navigator.html](http://www.html5plus.org/doc/zh_cn/navigator.html)
    */
  var SHORTCUT: js.UndefOr[String] = js.native
}

object PlusNavigatorPermissionNames {
  @scala.inline
  def apply(): PlusNavigatorPermissionNames = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusNavigatorPermissionNames]
  }
  @scala.inline
  implicit class PlusNavigatorPermissionNamesOps[Self <: PlusNavigatorPermissionNames] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCAMERA(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CAMERA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCAMERA: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CAMERA")(js.undefined)
        ret
    }
    @scala.inline
    def withCONTACTS(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CONTACTS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCONTACTS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CONTACTS")(js.undefined)
        ret
    }
    @scala.inline
    def withGALLERY(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GALLERY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGALLERY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GALLERY")(js.undefined)
        ret
    }
    @scala.inline
    def withLOCATION(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LOCATION")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLOCATION: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LOCATION")(js.undefined)
        ret
    }
    @scala.inline
    def withNOTIFITION(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NOTIFITION")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNOTIFITION: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NOTIFITION")(js.undefined)
        ret
    }
    @scala.inline
    def withRECORD(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RECORD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRECORD: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RECORD")(js.undefined)
        ret
    }
    @scala.inline
    def withSHORTCUT(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SHORTCUT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSHORTCUT: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SHORTCUT")(js.undefined)
        ret
    }
  }
  
}

