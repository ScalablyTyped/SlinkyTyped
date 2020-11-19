package typingsSlinky.baiduApp.swan.ai

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.baiduApp.anon.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ocrIdCardResponse extends js.Object {
  
  var direction: Double = js.native
  
   // 输入参数 detect_risk = true 时，则返回该字段识别身份证类型: normal-正常身份证；copy-复印件；temporary-临时身份证；screen-翻拍；unknown-其他未知情况。
  var edit_tool: String = js.native
  
   // 图像方向，当 detect_direction=true 时存在。-1: 未定义，0: 正向，1: 逆时针90度，2: 逆时针180度，3: 逆时针270度。
  var image_status: String = js.native
  
   // 如果参数 detect_risk = true 时，则返回此字段。如果检测身份证被编辑过，该字段指定编辑软件名称，如:Adobe Photoshop CC 2014 (Macintosh),如果没有被编辑过则返回值无此参数。
  var log_id: String = js.native
  
   // normal-识别正常；reversed_side-身份证正反面颠倒；non_idcard-上传的图片中不包含身份证；blurred-身份证模糊；other_type_card-其他类型证照；over_exposure-身份证关键字段反光或过曝；unknown-未知状态。
  var risk_type: String = js.native
  
   // 识别结果数，表示words_result的元素个数。
  var words_result: // 定位和识别结果
  StringDictionary[Location] = js.native
  
   // 唯一的log id，用于问题定位。
  var words_result_num: Double = js.native
}
object ocrIdCardResponse {
  
  @scala.inline
  def apply(
    direction: Double,
    edit_tool: String,
    image_status: String,
    log_id: String,
    risk_type: String,
    words_result: // 定位和识别结果
  StringDictionary[Location],
    words_result_num: Double
  ): ocrIdCardResponse = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], edit_tool = edit_tool.asInstanceOf[js.Any], image_status = image_status.asInstanceOf[js.Any], log_id = log_id.asInstanceOf[js.Any], risk_type = risk_type.asInstanceOf[js.Any], words_result = words_result.asInstanceOf[js.Any], words_result_num = words_result_num.asInstanceOf[js.Any])
    __obj.asInstanceOf[ocrIdCardResponse]
  }
  
  @scala.inline
  implicit class ocrIdCardResponseOps[Self <: ocrIdCardResponse] (val x: Self) extends AnyVal {
    
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
    def setDirection(value: Double): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdit_tool(value: String): Self = this.set("edit_tool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage_status(value: String): Self = this.set("image_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLog_id(value: String): Self = this.set("log_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRisk_type(value: String): Self = this.set("risk_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWords_result(value: // 定位和识别结果
    StringDictionary[Location]): Self = this.set("words_result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWords_result_num(value: Double): Self = this.set("words_result_num", value.asInstanceOf[js.Any])
  }
}
