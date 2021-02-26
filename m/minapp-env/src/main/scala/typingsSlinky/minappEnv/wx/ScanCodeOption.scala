package typingsSlinky.minappEnv.wx

import typingsSlinky.minappEnv.Array
import typingsSlinky.minappEnv.minappEnvStrings.barCode
import typingsSlinky.minappEnv.minappEnvStrings.datamatrix
import typingsSlinky.minappEnv.minappEnvStrings.pdf417
import typingsSlinky.minappEnv.minappEnvStrings.qrCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScanCodeOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[ScanCodeCompleteCallback] = js.native
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[ScanCodeFailCallback] = js.native
  
  /** 是否只能从相机扫码，不允许从相册选择图片
    *
    * 最低基础库： `1.2.0` */
  var onlyFromCamera: js.UndefOr[Boolean] = js.native
  
  /** 扫码类型
    *
    * 可选值：
    * - 'barCode': 一维码;
    * - 'qrCode': 二维码;
    * - 'datamatrix': Data Matrix 码;
    * - 'pdf417': PDF417 条码;
    *
    * 最低基础库： `1.7.0` */
  var scanType: js.UndefOr[Array[barCode | qrCode | datamatrix | pdf417]] = js.native
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[ScanCodeSuccessCallback] = js.native
}
object ScanCodeOption {
  
  @scala.inline
  def apply(): ScanCodeOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScanCodeOption]
  }
  
  @scala.inline
  implicit class ScanCodeOptionMutableBuilder[Self <: ScanCodeOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setOnlyFromCamera(value: Boolean): Self = StObject.set(x, "onlyFromCamera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlyFromCameraUndefined: Self = StObject.set(x, "onlyFromCamera", js.undefined)
    
    @scala.inline
    def setScanType(value: Array[barCode | qrCode | datamatrix | pdf417]): Self = StObject.set(x, "scanType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScanTypeUndefined: Self = StObject.set(x, "scanType", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* result */ ScanCodeSuccessCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
