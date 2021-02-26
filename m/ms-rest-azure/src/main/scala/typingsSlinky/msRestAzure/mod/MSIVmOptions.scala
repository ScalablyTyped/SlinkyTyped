package typingsSlinky.msRestAzure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MSIVmOptions extends MSIOptions {
  
  /**
    * @prop {number} [port] - port on which the MSI service is running on the host VM. Default port is 50342
    */
  var port: js.UndefOr[Double] = js.native
}
object MSIVmOptions {
  
  @scala.inline
  def apply(): MSIVmOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MSIVmOptions]
  }
  
  @scala.inline
  implicit class MSIVmOptionsMutableBuilder[Self <: MSIVmOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
  }
}
