package typingsSlinky.fridaGum.ObjC

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetailedProtocolMethodSpec extends ProtocolMethodSpec {
  
  /**
    * Whether this method is required or optional. Default is required.
    */
  var optional: js.UndefOr[Boolean] = js.native
  
  /**
    * Method signature.
    */
  var types: String = js.native
}
object DetailedProtocolMethodSpec {
  
  @scala.inline
  def apply(types: String): DetailedProtocolMethodSpec = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetailedProtocolMethodSpec]
  }
  
  @scala.inline
  implicit class DetailedProtocolMethodSpecMutableBuilder[Self <: DetailedProtocolMethodSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
    
    @scala.inline
    def setTypes(value: String): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
  }
}
