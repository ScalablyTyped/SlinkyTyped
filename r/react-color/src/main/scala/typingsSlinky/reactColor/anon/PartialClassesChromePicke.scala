package typingsSlinky.reactColor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<reactcss.reactcss.Classes<react-color.react-color/lib/components/chrome/Chrome.ChromePickerStylesProps>> */
@js.native
trait PartialClassesChromePicke extends StObject {
  
  var default: js.UndefOr[PartialChromePickerStyles] = js.native
}
object PartialClassesChromePicke {
  
  @scala.inline
  def apply(): PartialClassesChromePicke = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassesChromePicke]
  }
  
  @scala.inline
  implicit class PartialClassesChromePickeMutableBuilder[Self <: PartialClassesChromePicke] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefault(value: PartialChromePickerStyles): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
  }
}
