package typingsSlinky.ipp.mod

import typingsSlinky.ipp.anon.Jobholduntil
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HoldRestartJobRequest extends StObject {
  
  var `operation-attributes-tag`: Jobholduntil = js.native
}
object HoldRestartJobRequest {
  
  @scala.inline
  def apply(`operation-attributes-tag`: Jobholduntil): HoldRestartJobRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("operation-attributes-tag")(`operation-attributes-tag`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HoldRestartJobRequest]
  }
  
  @scala.inline
  implicit class HoldRestartJobRequestMutableBuilder[Self <: HoldRestartJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setOperation-attributes-tag`(value: Jobholduntil): Self = StObject.set(x, "operation-attributes-tag", value.asInstanceOf[js.Any])
  }
}
