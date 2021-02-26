package typingsSlinky.kendoUi.kendo.spreadsheet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValueFilterOptions extends StObject {
  
  var name: js.UndefOr[String] = js.native
}
object ValueFilterOptions {
  
  @scala.inline
  def apply(): ValueFilterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValueFilterOptions]
  }
  
  @scala.inline
  implicit class ValueFilterOptionsMutableBuilder[Self <: ValueFilterOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
