package typingsSlinky.minappEnv.wx

import typingsSlinky.minappEnv.minappEnvStrings.jpg
import typingsSlinky.minappEnv.minappEnvStrings.png
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanvasToTempFilePathOption extends StObject {
  
  /** 画布标识，传入 `<canvas>` 组件的 canvas-id */
  var canvasId: String = js.native
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[CanvasToTempFilePathCompleteCallback] = js.native
  
  /** 输出的图片的高度
    *
    * 最低基础库： `1.2.0` */
  var destHeight: js.UndefOr[Double] = js.native
  
  /** 输出的图片的宽度
    *
    * 最低基础库： `1.2.0` */
  var destWidth: js.UndefOr[Double] = js.native
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[CanvasToTempFilePathFailCallback] = js.native
  
  /** 目标文件的类型
    *
    * 可选值：
    * - 'jpg': jpg 图片;
    * - 'png': png 图片;
    *
    * 最低基础库： `1.7.0` */
  var fileType: js.UndefOr[jpg | png] = js.native
  
  /** 指定的画布区域的高度
    *
    * 最低基础库： `1.2.0` */
  var height: js.UndefOr[Double] = js.native
  
  /** 图片的质量，目前仅对 jpg 有效。取值范围为 (0, 1]，不在范围内时当作 1.0 处理。
    *
    * 最低基础库： `1.7.0` */
  var quality: Double = js.native
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[CanvasToTempFilePathSuccessCallback] = js.native
  
  /** 指定的画布区域的宽度
    *
    * 最低基础库： `1.2.0` */
  var width: js.UndefOr[Double] = js.native
  
  /** 指定的画布区域的左上角横坐标
    *
    * 最低基础库： `1.2.0` */
  var x: js.UndefOr[Double] = js.native
  
  /** 指定的画布区域的左上角纵坐标
    *
    * 最低基础库： `1.2.0` */
  var y: js.UndefOr[Double] = js.native
}
object CanvasToTempFilePathOption {
  
  @scala.inline
  def apply(canvasId: String, quality: Double): CanvasToTempFilePathOption = {
    val __obj = js.Dynamic.literal(canvasId = canvasId.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasToTempFilePathOption]
  }
  
  @scala.inline
  implicit class CanvasToTempFilePathOptionMutableBuilder[Self <: CanvasToTempFilePathOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanvasId(value: String): Self = StObject.set(x, "canvasId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setDestHeight(value: Double): Self = StObject.set(x, "destHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestHeightUndefined: Self = StObject.set(x, "destHeight", js.undefined)
    
    @scala.inline
    def setDestWidth(value: Double): Self = StObject.set(x, "destWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestWidthUndefined: Self = StObject.set(x, "destWidth", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setFileType(value: jpg | png): Self = StObject.set(x, "fileType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileTypeUndefined: Self = StObject.set(x, "fileType", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: /* result */ CanvasToTempFilePathSuccessCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
