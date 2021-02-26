package typingsSlinky.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON对象，设备方向信息数据
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/orientation.html](http://www.html5plus.org/doc/zh_cn/orientation.html)
  */
@js.native
trait PlusOrientationRotation extends StObject {
  
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
  implicit class PlusOrientationRotationMutableBuilder[Self <: PlusOrientationRotation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    @scala.inline
    def setBeta(value: Double): Self = StObject.set(x, "beta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBetaUndefined: Self = StObject.set(x, "beta", js.undefined)
    
    @scala.inline
    def setGamma(value: Double): Self = StObject.set(x, "gamma", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGammaUndefined: Self = StObject.set(x, "gamma", js.undefined)
    
    @scala.inline
    def setHeadingAccuracy(value: Double): Self = StObject.set(x, "headingAccuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadingAccuracyUndefined: Self = StObject.set(x, "headingAccuracy", js.undefined)
    
    @scala.inline
    def setMagneticHeading(value: Double): Self = StObject.set(x, "magneticHeading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMagneticHeadingUndefined: Self = StObject.set(x, "magneticHeading", js.undefined)
    
    @scala.inline
    def setTrueHeading(value: Double): Self = StObject.set(x, "trueHeading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrueHeadingUndefined: Self = StObject.set(x, "trueHeading", js.undefined)
  }
}
