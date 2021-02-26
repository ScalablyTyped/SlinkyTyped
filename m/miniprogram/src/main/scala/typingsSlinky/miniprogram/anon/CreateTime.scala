package typingsSlinky.miniprogram.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateTime extends StObject {
  
  var createTime: Double = js.native
  
  var size: Double = js.native
}
object CreateTime {
  
  @scala.inline
  def apply(createTime: Double, size: Double): CreateTime = {
    val __obj = js.Dynamic.literal(createTime = createTime.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTime]
  }
  
  @scala.inline
  implicit class CreateTimeMutableBuilder[Self <: CreateTime] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: Double): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
