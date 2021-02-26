package typingsSlinky.minappEnv.wx

import typingsSlinky.minappEnv.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetStorageInfoSyncOption extends StObject {
  
  /** 当前占用的空间大小, 单位 KB */
  var currentSize: Double = js.native
  
  /** 当前 storage 中所有的 key */
  var keys: Array[String] = js.native
  
  /** 限制的空间大小，单位 KB */
  var limitSize: Double = js.native
}
object GetStorageInfoSyncOption {
  
  @scala.inline
  def apply(currentSize: Double, keys: Array[String], limitSize: Double): GetStorageInfoSyncOption = {
    val __obj = js.Dynamic.literal(currentSize = currentSize.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], limitSize = limitSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStorageInfoSyncOption]
  }
  
  @scala.inline
  implicit class GetStorageInfoSyncOptionMutableBuilder[Self <: GetStorageInfoSyncOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentSize(value: Double): Self = StObject.set(x, "currentSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeys(value: Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitSize(value: Double): Self = StObject.set(x, "limitSize", value.asInstanceOf[js.Any])
  }
}
