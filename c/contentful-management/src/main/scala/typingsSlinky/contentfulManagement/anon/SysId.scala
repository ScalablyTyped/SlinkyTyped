package typingsSlinky.contentfulManagement.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SysId extends StObject {
  
  var sys: Id = js.native
}
object SysId {
  
  @scala.inline
  def apply(sys: Id): SysId = {
    val __obj = js.Dynamic.literal(sys = sys.asInstanceOf[js.Any])
    __obj.asInstanceOf[SysId]
  }
  
  @scala.inline
  implicit class SysIdMutableBuilder[Self <: SysId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSys(value: Id): Self = StObject.set(x, "sys", value.asInstanceOf[js.Any])
  }
}
