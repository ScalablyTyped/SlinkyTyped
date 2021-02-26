package typingsSlinky.aliApp.my

import typingsSlinky.aliApp.aliAppStrings.more
import typingsSlinky.aliApp.aliAppStrings.none
import typingsSlinky.aliApp.aliAppStrings.num
import typingsSlinky.aliApp.aliAppStrings.point
import typingsSlinky.aliApp.aliAppStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Badge extends StObject {
  
  /** 需要飘红的选项的索引，从0开始 */
  var index: Double = js.native
  
  /**
    * 自定义飘红文案：
    *
    * 1、type为none/point/more时本文案可不填
    * 2、type为num时本文案为小数或<=0均不显示, >100 显示"..."
    */
  var text: String = js.native
  
  /**
    * 飘红类型，支持 none（无红点）/ point（纯红点） / num（数字红点）/ text（文案红点）/ more（...）
    *
    */
  var `type`: none | point | num | text | more | String = js.native
}
object Badge {
  
  @scala.inline
  def apply(index: Double, text: String, `type`: none | point | num | text | more | String): Badge = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Badge]
  }
  
  @scala.inline
  implicit class BadgeMutableBuilder[Self <: Badge] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: none | point | num | text | more | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
