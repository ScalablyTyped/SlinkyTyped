package typingsSlinky.googleMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlusCode extends StObject {
  
  /** is a 6 character or longer local code with an explicit location (CWC8+R9, Mountain View, CA, USA). */
  var compound_code: String = js.native
  
  /** is a 4 character area code and 6 character or longer local code (849VCWC8+R9). */
  var global_code: String = js.native
}
object PlusCode {
  
  @scala.inline
  def apply(compound_code: String, global_code: String): PlusCode = {
    val __obj = js.Dynamic.literal(compound_code = compound_code.asInstanceOf[js.Any], global_code = global_code.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlusCode]
  }
  
  @scala.inline
  implicit class PlusCodeMutableBuilder[Self <: PlusCode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompound_code(value: String): Self = StObject.set(x, "compound_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobal_code(value: String): Self = StObject.set(x, "global_code", value.asInstanceOf[js.Any])
  }
}
