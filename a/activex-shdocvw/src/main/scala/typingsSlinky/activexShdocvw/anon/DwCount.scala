package typingsSlinky.activexShdocvw.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DwCount extends StObject {
  
  val URL: js.Any = js.native
  
  val dwCount: Double = js.native
}
object DwCount {
  
  @scala.inline
  def apply(URL: js.Any, dwCount: Double): DwCount = {
    val __obj = js.Dynamic.literal(URL = URL.asInstanceOf[js.Any], dwCount = dwCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[DwCount]
  }
  
  @scala.inline
  implicit class DwCountMutableBuilder[Self <: DwCount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDwCount(value: Double): Self = StObject.set(x, "dwCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setURL(value: js.Any): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
  }
}
