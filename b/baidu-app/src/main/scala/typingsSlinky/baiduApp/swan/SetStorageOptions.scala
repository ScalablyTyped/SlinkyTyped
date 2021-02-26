package typingsSlinky.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 数据缓存
@js.native
trait SetStorageOptions
  extends BaseOptions[js.Any, js.Any] {
  
  /** 需要存储的内容 */
  var data: js.Any = js.native
  
  /** 本地缓存中的指定的 key */
  var key: String = js.native
}
object SetStorageOptions {
  
  @scala.inline
  def apply(data: js.Any, key: String): SetStorageOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetStorageOptions]
  }
  
  @scala.inline
  implicit class SetStorageOptionsMutableBuilder[Self <: SetStorageOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
