package typingsSlinky.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PivotDataSourceAxisOptions extends StObject {
  
  var expand: js.UndefOr[Boolean] = js.native
  
  var name: String = js.native
}
object PivotDataSourceAxisOptions {
  
  @scala.inline
  def apply(name: String): PivotDataSourceAxisOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotDataSourceAxisOptions]
  }
  
  @scala.inline
  implicit class PivotDataSourceAxisOptionsMutableBuilder[Self <: PivotDataSourceAxisOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpand(value: Boolean): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
