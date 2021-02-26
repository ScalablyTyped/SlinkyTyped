package typingsSlinky.googleCloudKms.mod.v1

import typingsSlinky.googleProtobuf.timestampPbMod.Timestamp.AsObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyRing extends StObject {
  
  var createTime: AsObject = js.native
  
  var name: String = js.native
}
object KeyRing {
  
  @scala.inline
  def apply(createTime: AsObject, name: String): KeyRing = {
    val __obj = js.Dynamic.literal(createTime = createTime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyRing]
  }
  
  @scala.inline
  implicit class KeyRingMutableBuilder[Self <: KeyRing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: AsObject): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
