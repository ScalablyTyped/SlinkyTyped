package typingsSlinky.msRestAzure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MSIOptions extends StObject {
  
  /**
    * @prop {string} [resource] -  The resource uri or token audience for which the token is needed.
    * For e.g. it can be:
    * - resourcemanagement endpoint "https://management.azure.com"(default) 
    * - management endpoint "https://management.core.windows.net/"
    */
  var resource: js.UndefOr[String] = js.native
}
object MSIOptions {
  
  @scala.inline
  def apply(): MSIOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MSIOptions]
  }
  
  @scala.inline
  implicit class MSIOptionsMutableBuilder[Self <: MSIOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
