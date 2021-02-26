package typingsSlinky.expressValidator.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequiredOnly extends StObject {
  
  var requiredOnly: Boolean = js.native
}
object RequiredOnly {
  
  @scala.inline
  def apply(requiredOnly: Boolean): RequiredOnly = {
    val __obj = js.Dynamic.literal(requiredOnly = requiredOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredOnly]
  }
  
  @scala.inline
  implicit class RequiredOnlyMutableBuilder[Self <: RequiredOnly] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequiredOnly(value: Boolean): Self = StObject.set(x, "requiredOnly", value.asInstanceOf[js.Any])
  }
}
