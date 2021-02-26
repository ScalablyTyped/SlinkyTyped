package typingsSlinky.offlineJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OfflineCheck extends StObject {
  
  var url: String = js.native
}
object OfflineCheck {
  
  @scala.inline
  def apply(url: String): OfflineCheck = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[OfflineCheck]
  }
  
  @scala.inline
  implicit class OfflineCheckMutableBuilder[Self <: OfflineCheck] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
