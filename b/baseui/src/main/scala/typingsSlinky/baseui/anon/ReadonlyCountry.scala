package typingsSlinky.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<baseui.baseui/phone-input.Country> */
@js.native
trait ReadonlyCountry extends StObject {
  
  val dialCode: String = js.native
  
  val id: /* keyof baseui.baseui/phone-input.COUNTRIES */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 241 */ js.Any = js.native
  
  val label: String = js.native
}
object ReadonlyCountry {
  
  @scala.inline
  def apply(
    dialCode: String,
    id: /* keyof baseui.baseui/phone-input.COUNTRIES */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 241 */ js.Any,
    label: String
  ): ReadonlyCountry = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyCountry]
  }
  
  @scala.inline
  implicit class ReadonlyCountryMutableBuilder[Self <: ReadonlyCountry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialCode(value: String): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(
      value: /* keyof baseui.baseui/phone-input.COUNTRIES */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 241 */ js.Any
    ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
