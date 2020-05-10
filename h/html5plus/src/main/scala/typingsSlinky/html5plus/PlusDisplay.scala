package typingsSlinky.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Display模块管理应用可使用的显示区域信息
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/device.html](http://www.html5plus.org/doc/zh_cn/device.html)
  */
@js.native
trait PlusDisplay extends js.Object {
  /**
    * 应用可使用的屏幕高度逻辑分辨率
    * 设备屏幕区域包括系统状态栏显示区域和应用显示区域，display获取的是应用显示区域的逻辑分辨率，单位为px。
    * 	如果需要获取实际分辨率则需要乘以比例值scale。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/device.html](http://www.html5plus.org/doc/zh_cn/device.html)
    */
  var resolutionHeight: js.UndefOr[Double] = js.native
  /**
    * 应用可使用的屏幕宽度逻辑分辨率
    * 设备屏幕区域包括系统状态栏显示区域和应用显示区域，display获取的是应用显示区域的逻辑分辨率，单位为px。
    * 	如果需要获取实际分辨率则需要乘以比例值scale。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/device.html](http://www.html5plus.org/doc/zh_cn/device.html)
    */
  var resolutionWidth: js.UndefOr[Double] = js.native
}

object PlusDisplay {
  @scala.inline
  def apply(): PlusDisplay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusDisplay]
  }
  @scala.inline
  implicit class PlusDisplayOps[Self <: PlusDisplay] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResolutionHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolutionHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolutionHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolutionHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withResolutionWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolutionWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolutionWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolutionWidth")(js.undefined)
        ret
    }
  }
  
}

