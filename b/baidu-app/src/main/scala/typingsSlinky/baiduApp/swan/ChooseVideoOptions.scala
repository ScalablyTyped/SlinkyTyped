package typingsSlinky.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 媒体-----视频
@js.native
trait ChooseVideoOptions
  extends BaseOptions[js.Any, js.Any] {
  
  /** 前置或者后置摄像头，默认为前后都有，即：['front', 'back'] */
  var camera: js.UndefOr[CameraDevice] = js.native
  
  /** 是否压缩所选的视频源文件，默认值为true，需要压缩 */
  var compressed: js.UndefOr[Boolean] = js.native
  
  /** 拍摄视频最长拍摄时间，单位秒。最长支持60秒 */
  var maxDuration: js.UndefOr[Double] = js.native
  
  /** album 从相册选视频，camera 使用相机拍摄，默认为：['album', 'camera'] */
  var sourceType: js.UndefOr[js.Array[VideoSourceType]] = js.native
  
  /** 接口调用成功，返回视频文件的临时文件路径，详见返回参数说明 */
  @JSName("success")
  var success_ChooseVideoOptions: js.UndefOr[js.Function1[/* res */ VideoData, Unit]] = js.native
}
object ChooseVideoOptions {
  
  @scala.inline
  def apply(): ChooseVideoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChooseVideoOptions]
  }
  
  @scala.inline
  implicit class ChooseVideoOptionsMutableBuilder[Self <: ChooseVideoOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCamera(value: CameraDevice): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCameraUndefined: Self = StObject.set(x, "camera", js.undefined)
    
    @scala.inline
    def setCompressed(value: Boolean): Self = StObject.set(x, "compressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompressedUndefined: Self = StObject.set(x, "compressed", js.undefined)
    
    @scala.inline
    def setMaxDuration(value: Double): Self = StObject.set(x, "maxDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDurationUndefined: Self = StObject.set(x, "maxDuration", js.undefined)
    
    @scala.inline
    def setSourceType(value: js.Array[VideoSourceType]): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceTypeUndefined: Self = StObject.set(x, "sourceType", js.undefined)
    
    @scala.inline
    def setSourceTypeVarargs(value: VideoSourceType*): Self = StObject.set(x, "sourceType", js.Array(value :_*))
    
    @scala.inline
    def setSuccess(value: /* res */ VideoData => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
