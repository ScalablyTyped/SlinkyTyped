package typingsSlinky.reactColor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<reactcss.reactcss.Classes<react-color.react-color/lib/components/compact/Compact.CompactPickerStylesProps>> */
@js.native
trait PartialClassesCompactPick extends StObject {
  
  var default: js.UndefOr[PartialCompactPickerStyle] = js.native
}
object PartialClassesCompactPick {
  
  @scala.inline
  def apply(): PartialClassesCompactPick = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassesCompactPick]
  }
  
  @scala.inline
  implicit class PartialClassesCompactPickMutableBuilder[Self <: PartialClassesCompactPick] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefault(value: PartialCompactPickerStyle): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
  }
}
