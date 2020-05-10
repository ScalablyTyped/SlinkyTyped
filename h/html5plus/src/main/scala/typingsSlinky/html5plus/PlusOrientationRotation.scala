package typingsSlinky.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON对象，设备方向信息数据
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/orientation.html](http://www.html5plus.org/doc/zh_cn/orientation.html)
  */
@js.native
trait PlusOrientationRotation extends js.Object {
  /**
    * 以z方向为轴心的旋转角度
    * 浮点数类型，只读属性，取值范围为0到360（不等于360）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/orientation.html](http://www.html5plus.org/doc/zh_cn/orientation.html)
    */
  var alpha: js.UndefOr[Double] = js.native
  /**
    * 以x方向为轴心的旋转角度
    * 浮点数类型，只读属性，取值范围为-180到180（不等于180）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/orientation.html](http://www.html5plus.org/doc/zh_cn/orientation.html)
    */
  var beta: js.UndefOr[Double] = js.native
  /**
    * 以y方向为轴心的旋转角度
    * 浮点数类型，只读属性，取值范围为-180到180（不等于180）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/orientation.html](http://www.html5plus.org/doc/zh_cn/orientation.html)
    */
  var gamma: js.UndefOr[Double] = js.native
  /**
    * 设备方向值的误差值
    * 浮点数类型，只读属性，取值范围为0到360（不等于360）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/orientation.html](http://www.html5plus.org/doc/zh_cn/orientation.html)
    */
  var headingAccuracy: js.UndefOr[Double] = js.native
  /**
    * 设备方向与地球磁场北极方向的角度
    * 浮点数类型，只读属性，取值范围为0到360（不等于360）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/orientation.html](http://www.html5plus.org/doc/zh_cn/orientation.html)
    */
  var magneticHeading: js.UndefOr[Double] = js.native
  /**
    * 设备方向与地球真实北极方向的角度
    * 浮点数类型，只读属性，取值范围为0到360（不等于360）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/orientation.html](http://www.html5plus.org/doc/zh_cn/orientation.html)
    */
  var trueHeading: js.UndefOr[Double] = js.native
}

object PlusOrientationRotation {
  @scala.inline
  def apply(): PlusOrientationRotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusOrientationRotation]
  }
  @scala.inline
  implicit class PlusOrientationRotationOps[Self <: PlusOrientationRotation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlpha(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlpha: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha")(js.undefined)
        ret
    }
    @scala.inline
    def withBeta(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beta")(js.undefined)
        ret
    }
    @scala.inline
    def withGamma(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gamma")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGamma: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gamma")(js.undefined)
        ret
    }
    @scala.inline
    def withHeadingAccuracy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headingAccuracy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeadingAccuracy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headingAccuracy")(js.undefined)
        ret
    }
    @scala.inline
    def withMagneticHeading(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("magneticHeading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMagneticHeading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("magneticHeading")(js.undefined)
        ret
    }
    @scala.inline
    def withTrueHeading(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trueHeading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrueHeading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trueHeading")(js.undefined)
        ret
    }
  }
  
}

