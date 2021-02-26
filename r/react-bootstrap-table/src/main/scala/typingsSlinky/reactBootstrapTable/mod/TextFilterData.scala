package typingsSlinky.reactBootstrapTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextFilterData extends FilterValue {
  
  var `type`: typingsSlinky.reactBootstrapTable.reactBootstrapTableStrings.TextFilter = js.native
  
  var value: String = js.native
}
object TextFilterData {
  
  @scala.inline
  def apply(`type`: typingsSlinky.reactBootstrapTable.reactBootstrapTableStrings.TextFilter, value: String): TextFilterData = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextFilterData]
  }
  
  @scala.inline
  implicit class TextFilterDataMutableBuilder[Self <: TextFilterData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typingsSlinky.reactBootstrapTable.reactBootstrapTableStrings.TextFilter): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
