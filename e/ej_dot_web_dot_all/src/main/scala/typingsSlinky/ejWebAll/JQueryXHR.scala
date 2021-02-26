package typingsSlinky.ejWebAll

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryXHR extends StObject {
  
  /**
    * Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.native
}
object JQueryXHR {
  
  @scala.inline
  def apply(): JQueryXHR = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryXHR]
  }
  
  @scala.inline
  implicit class JQueryXHRMutableBuilder[Self <: JQueryXHR] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
  }
}
