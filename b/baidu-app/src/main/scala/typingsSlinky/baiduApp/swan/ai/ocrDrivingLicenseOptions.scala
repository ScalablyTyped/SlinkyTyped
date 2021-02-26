package typingsSlinky.baiduApp.swan.ai

import typingsSlinky.baiduApp.swan.BaseOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 对机动车驾驶证所有关键字段进行识别。
  */
@js.native
trait ocrDrivingLicenseOptions
  extends BaseOptions[js.Any, js.Any] {
  
  // 图片资源地址
  var detect_direction: js.UndefOr[Boolean] = js.native
  
  var image: String = js.native
  
  // true: 归一化格式输出;false 或无此参数按非归一化格式输出。
  @JSName("success")
  var success_ocrDrivingLicenseOptions: js.UndefOr[js.Function1[/* res */ ocrDrivingLicenseResponse, Unit]] = js.native
  
  // 是否检测图像旋转，可检验图像的选装方向和旋转角度。true：检测旋转角度并矫正识别。针对摆放情况不可控制的情况建议本参数置为true;false:不检测旋转角度，默认不检测。
  var unified_valid_period: js.UndefOr[Boolean] = js.native
}
object ocrDrivingLicenseOptions {
  
  @scala.inline
  def apply(image: String): ocrDrivingLicenseOptions = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    __obj.asInstanceOf[ocrDrivingLicenseOptions]
  }
  
  @scala.inline
  implicit class ocrDrivingLicenseOptionsMutableBuilder[Self <: ocrDrivingLicenseOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetect_direction(value: Boolean): Self = StObject.set(x, "detect_direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetect_directionUndefined: Self = StObject.set(x, "detect_direction", js.undefined)
    
    @scala.inline
    def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: /* res */ ocrDrivingLicenseResponse => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setUnified_valid_period(value: Boolean): Self = StObject.set(x, "unified_valid_period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnified_valid_periodUndefined: Self = StObject.set(x, "unified_valid_period", js.undefined)
  }
}
