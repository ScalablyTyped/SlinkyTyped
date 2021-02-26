package typingsSlinky.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 设备加速度信息对象
  * JSON对象，保存获取设备的加速度信息，包括x、y、z三个方向的加速度信息。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/accelerometer.html](http://www.html5plus.org/doc/zh_cn/accelerometer.html)
  */
@js.native
trait PlusAccelerometerAcceleration extends StObject {
  
  /**
    * x轴方向的加速度
    * 获取当前设备x轴方向的加速度，浮点型数据，与物理学中的加速度值一致。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/accelerometer.html](http://www.html5plus.org/doc/zh_cn/accelerometer.html)
    */
  var xAxis: js.UndefOr[Double] = js.native
  
  /**
    * y轴方向的加速度
    * 获取当前设备y轴方向的加速度，浮点型数据，与物理学中的加速度值一致。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/accelerometer.html](http://www.html5plus.org/doc/zh_cn/accelerometer.html)
    */
  var yAxis: js.UndefOr[Double] = js.native
  
  /**
    * z轴方向的加速度
    * 获取当前设备z轴方向的加速度，浮点型数据，与物理学中的加速度值一致。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/accelerometer.html](http://www.html5plus.org/doc/zh_cn/accelerometer.html)
    */
  var zAxis: js.UndefOr[Double] = js.native
}
object PlusAccelerometerAcceleration {
  
  @scala.inline
  def apply(): PlusAccelerometerAcceleration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusAccelerometerAcceleration]
  }
  
  @scala.inline
  implicit class PlusAccelerometerAccelerationMutableBuilder[Self <: PlusAccelerometerAcceleration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setXAxis(value: Double): Self = StObject.set(x, "xAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXAxisUndefined: Self = StObject.set(x, "xAxis", js.undefined)
    
    @scala.inline
    def setYAxis(value: Double): Self = StObject.set(x, "yAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYAxisUndefined: Self = StObject.set(x, "yAxis", js.undefined)
    
    @scala.inline
    def setZAxis(value: Double): Self = StObject.set(x, "zAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZAxisUndefined: Self = StObject.set(x, "zAxis", js.undefined)
  }
}
