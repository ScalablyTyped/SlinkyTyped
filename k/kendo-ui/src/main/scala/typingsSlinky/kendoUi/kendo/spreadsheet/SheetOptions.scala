package typingsSlinky.kendoUi.kendo.spreadsheet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SheetOptions extends StObject {
  
  var change: js.UndefOr[js.Function1[/* e */ SheetChangeEvent, Unit]] = js.native
  
  var name: js.UndefOr[String] = js.native
}
object SheetOptions {
  
  @scala.inline
  def apply(): SheetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SheetOptions]
  }
  
  @scala.inline
  implicit class SheetOptionsMutableBuilder[Self <: SheetOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChange(value: /* e */ SheetChangeEvent => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
