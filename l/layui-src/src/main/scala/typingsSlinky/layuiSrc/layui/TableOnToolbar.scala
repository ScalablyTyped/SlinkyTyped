package typingsSlinky.layuiSrc.layui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableOnToolbar extends StObject {
  
  var config: TableOption = js.native
  
  var event: String = js.native
}
object TableOnToolbar {
  
  @scala.inline
  def apply(config: TableOption, event: String): TableOnToolbar = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableOnToolbar]
  }
  
  @scala.inline
  implicit class TableOnToolbarMutableBuilder[Self <: TableOnToolbar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfig(value: TableOption): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
