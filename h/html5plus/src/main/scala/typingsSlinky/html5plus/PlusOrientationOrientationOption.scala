package typingsSlinky.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON对象，监听设备方向感应器参数
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/orientation.html](http://www.html5plus.org/doc/zh_cn/orientation.html)
  */
@js.native
trait PlusOrientationOrientationOption extends js.Object {
  /**
    * 更新方向信息的时间间隔
    * 数值类型，单位为ms，默认值为500ms。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/orientation.html](http://www.html5plus.org/doc/zh_cn/orientation.html)
    */
  var frequency: js.UndefOr[Double] = js.native
}

object PlusOrientationOrientationOption {
  @scala.inline
  def apply(): PlusOrientationOrientationOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusOrientationOrientationOption]
  }
  @scala.inline
  implicit class PlusOrientationOrientationOptionOps[Self <: PlusOrientationOrientationOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFrequency(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frequency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrequency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frequency")(js.undefined)
        ret
    }
  }
  
}

