package typingsSlinky.chrome.chrome.input.ime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImeParameters extends StObject {
  
  /** ID of the engine to use */
  var engineID: String = js.native
  
  /** MenuItems to use. */
  var items: js.Array[MenuItem] = js.native
}
object ImeParameters {
  
  @scala.inline
  def apply(engineID: String, items: js.Array[MenuItem]): ImeParameters = {
    val __obj = js.Dynamic.literal(engineID = engineID.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImeParameters]
  }
  
  @scala.inline
  implicit class ImeParametersMutableBuilder[Self <: ImeParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEngineID(value: String): Self = StObject.set(x, "engineID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItems(value: js.Array[MenuItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: MenuItem*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
