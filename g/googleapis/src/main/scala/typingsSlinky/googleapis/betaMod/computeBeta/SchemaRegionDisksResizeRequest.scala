package typingsSlinky.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaRegionDisksResizeRequest extends StObject {
  
  /**
    * The new size of the regional persistent disk, which is specified in GB.
    */
  var sizeGb: js.UndefOr[String] = js.native
}
object SchemaRegionDisksResizeRequest {
  
  @scala.inline
  def apply(): SchemaRegionDisksResizeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegionDisksResizeRequest]
  }
  
  @scala.inline
  implicit class SchemaRegionDisksResizeRequestMutableBuilder[Self <: SchemaRegionDisksResizeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSizeGb(value: String): Self = StObject.set(x, "sizeGb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeGbUndefined: Self = StObject.set(x, "sizeGb", js.undefined)
  }
}
