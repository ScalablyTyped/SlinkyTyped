package typingsSlinky.exceljs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<exceljs.exceljs.Protection> */
@js.native
trait PartialProtection extends StObject {
  
  var locked: js.UndefOr[Boolean] = js.native
}
object PartialProtection {
  
  @scala.inline
  def apply(): PartialProtection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialProtection]
  }
  
  @scala.inline
  implicit class PartialProtectionMutableBuilder[Self <: PartialProtection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockedUndefined: Self = StObject.set(x, "locked", js.undefined)
  }
}
