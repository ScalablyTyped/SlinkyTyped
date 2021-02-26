package typingsSlinky.baiduApp.swan.ai

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.baiduApp.anon.Words
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ocrDrivingLicenseResponse extends StObject {
  
  var log_id: String = js.native
  
  // 识别结果数，表示 words_result 的元素个数。
  var words_result: StringDictionary[Words] = js.native
  
  // 唯一的log id，用于问题定位。
  var words_result_num: Double = js.native
}
object ocrDrivingLicenseResponse {
  
  @scala.inline
  def apply(log_id: String, words_result: StringDictionary[Words], words_result_num: Double): ocrDrivingLicenseResponse = {
    val __obj = js.Dynamic.literal(log_id = log_id.asInstanceOf[js.Any], words_result = words_result.asInstanceOf[js.Any], words_result_num = words_result_num.asInstanceOf[js.Any])
    __obj.asInstanceOf[ocrDrivingLicenseResponse]
  }
  
  @scala.inline
  implicit class ocrDrivingLicenseResponseMutableBuilder[Self <: ocrDrivingLicenseResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLog_id(value: String): Self = StObject.set(x, "log_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWords_result(value: StringDictionary[Words]): Self = StObject.set(x, "words_result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWords_result_num(value: Double): Self = StObject.set(x, "words_result_num", value.asInstanceOf[js.Any])
  }
}
