package typingsSlinky.screeps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// type SD<K extends ResourceConstant> = {
//   [P in K]: number;
//   energy: number;
// }
/* Inlined std.Partial<std.Record<screeps.ExitKey, string>> */
@js.native
trait ExitsInformation extends StObject {
  
  var `1`: js.UndefOr[String] = js.native
  
  var `3`: js.UndefOr[String] = js.native
  
  var `5`: js.UndefOr[String] = js.native
  
  var `7`: js.UndefOr[String] = js.native
}
object ExitsInformation {
  
  @scala.inline
  def apply(): ExitsInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExitsInformation]
  }
  
  @scala.inline
  implicit class ExitsInformationMutableBuilder[Self <: ExitsInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set1(value: String): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set1Undefined: Self = StObject.set(x, "1", js.undefined)
    
    @scala.inline
    def set3(value: String): Self = StObject.set(x, "3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set3Undefined: Self = StObject.set(x, "3", js.undefined)
    
    @scala.inline
    def set5(value: String): Self = StObject.set(x, "5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set5Undefined: Self = StObject.set(x, "5", js.undefined)
    
    @scala.inline
    def set7(value: String): Self = StObject.set(x, "7", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set7Undefined: Self = StObject.set(x, "7", js.undefined)
  }
}
