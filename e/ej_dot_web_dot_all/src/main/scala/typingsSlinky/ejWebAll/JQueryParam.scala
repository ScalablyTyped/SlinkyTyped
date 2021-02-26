package typingsSlinky.ejWebAll

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryParam extends StObject {
  
  /**
    * Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.native
}
object JQueryParam {
  
  @scala.inline
  def apply(): JQueryParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryParam]
  }
  
  @scala.inline
  implicit class JQueryParamMutableBuilder[Self <: JQueryParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
  }
}
