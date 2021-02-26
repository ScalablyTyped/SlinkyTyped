package typingsSlinky.kendoUi.kendo.dataviz.map

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationOptions extends StObject {
  
  var name: js.UndefOr[String] = js.native
}
object LocationOptions {
  
  @scala.inline
  def apply(): LocationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationOptions]
  }
  
  @scala.inline
  implicit class LocationOptionsMutableBuilder[Self <: LocationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
