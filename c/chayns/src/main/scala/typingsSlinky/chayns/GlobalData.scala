package typingsSlinky.chayns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlobalData extends StObject {
  
  var _result: js.Any = js.native
}
object GlobalData {
  
  @scala.inline
  def apply(_result: js.Any): GlobalData = {
    val __obj = js.Dynamic.literal(_result = _result.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalData]
  }
  
  @scala.inline
  implicit class GlobalDataMutableBuilder[Self <: GlobalData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set_result(value: js.Any): Self = StObject.set(x, "_result", value.asInstanceOf[js.Any])
  }
}
