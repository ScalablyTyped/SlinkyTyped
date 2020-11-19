package typingsSlinky.minappEnv.wx

import typingsSlinky.minappEnv.minappEnvStrings.AZTEC
import typingsSlinky.minappEnv.minappEnvStrings.CODABAR
import typingsSlinky.minappEnv.minappEnvStrings.CODE_128
import typingsSlinky.minappEnv.minappEnvStrings.CODE_25
import typingsSlinky.minappEnv.minappEnvStrings.CODE_39
import typingsSlinky.minappEnv.minappEnvStrings.CODE_93
import typingsSlinky.minappEnv.minappEnvStrings.DATA_MATRIX
import typingsSlinky.minappEnv.minappEnvStrings.EAN_13
import typingsSlinky.minappEnv.minappEnvStrings.EAN_8
import typingsSlinky.minappEnv.minappEnvStrings.ITF
import typingsSlinky.minappEnv.minappEnvStrings.MAXICODE
import typingsSlinky.minappEnv.minappEnvStrings.PDF_417
import typingsSlinky.minappEnv.minappEnvStrings.QR_CODE
import typingsSlinky.minappEnv.minappEnvStrings.RSS_14
import typingsSlinky.minappEnv.minappEnvStrings.RSS_EXPANDED
import typingsSlinky.minappEnv.minappEnvStrings.UPC_A
import typingsSlinky.minappEnv.minappEnvStrings.UPC_E
import typingsSlinky.minappEnv.minappEnvStrings.UPC_EAN_EXTENSION
import typingsSlinky.minappEnv.minappEnvStrings.WX_CODE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScanCodeSuccessCallbackResult extends js.Object {
  
  /** 所扫码的字符集 */
  var charSet: String = js.native
  
  /** 当所扫的码为当前小程序的合法二维码时，会返回此字段，内容为二维码携带的 path */
  var path: String = js.native
  
  /** 原始数据，base64编码 */
  var rawData: String = js.native
  
  /** 所扫码的内容 */
  var result: String = js.native
  
  /** 所扫码的类型
    *
    * 可选值：
    * - 'QR_CODE': 二维码;
    * - 'AZTEC': 一维码;
    * - 'CODABAR': 一维码;
    * - 'CODE_39': 一维码;
    * - 'CODE_93': 一维码;
    * - 'CODE_128': 一维码;
    * - 'DATA_MATRIX': 二维码;
    * - 'EAN_8': 一维码;
    * - 'EAN_13': 一维码;
    * - 'ITF': 一维码;
    * - 'MAXICODE': 一维码;
    * - 'PDF_417': 二维码;
    * - 'RSS_14': 一维码;
    * - 'RSS_EXPANDED': 一维码;
    * - 'UPC_A': 一维码;
    * - 'UPC_E': 一维码;
    * - 'UPC_EAN_EXTENSION': 一维码;
    * - 'WX_CODE': 二维码;
    * - 'CODE_25': 一维码; */
  var scanType: QR_CODE | AZTEC | CODABAR | CODE_39 | CODE_93 | CODE_128 | DATA_MATRIX | EAN_8 | EAN_13 | ITF | MAXICODE | PDF_417 | RSS_14 | RSS_EXPANDED | UPC_A | UPC_E | UPC_EAN_EXTENSION | WX_CODE | CODE_25 = js.native
}
object ScanCodeSuccessCallbackResult {
  
  @scala.inline
  def apply(
    charSet: String,
    path: String,
    rawData: String,
    result: String,
    scanType: QR_CODE | AZTEC | CODABAR | CODE_39 | CODE_93 | CODE_128 | DATA_MATRIX | EAN_8 | EAN_13 | ITF | MAXICODE | PDF_417 | RSS_14 | RSS_EXPANDED | UPC_A | UPC_E | UPC_EAN_EXTENSION | WX_CODE | CODE_25
  ): ScanCodeSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(charSet = charSet.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], rawData = rawData.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], scanType = scanType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScanCodeSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class ScanCodeSuccessCallbackResultOps[Self <: ScanCodeSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCharSet(value: String): Self = this.set("charSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawData(value: String): Self = this.set("rawData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: String): Self = this.set("result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScanType(
      value: QR_CODE | AZTEC | CODABAR | CODE_39 | CODE_93 | CODE_128 | DATA_MATRIX | EAN_8 | EAN_13 | ITF | MAXICODE | PDF_417 | RSS_14 | RSS_EXPANDED | UPC_A | UPC_E | UPC_EAN_EXTENSION | WX_CODE | CODE_25
    ): Self = this.set("scanType", value.asInstanceOf[js.Any])
  }
}
