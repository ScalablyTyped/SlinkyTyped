package typingsSlinky.qiniuJs.mod

import typingsSlinky.qiniuJs.anon.Loaded
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Next extends StObject {
  
  var total: Loaded = js.native
}
object Next {
  
  @scala.inline
  def apply(total: Loaded): Next = {
    val __obj = js.Dynamic.literal(total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Next]
  }
  
  @scala.inline
  implicit class NextMutableBuilder[Self <: Next] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTotal(value: Loaded): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
