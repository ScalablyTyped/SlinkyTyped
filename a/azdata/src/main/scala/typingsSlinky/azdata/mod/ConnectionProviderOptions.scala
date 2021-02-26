package typingsSlinky.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionProviderOptions extends StObject {
  
  var options: js.Array[ConnectionOption] = js.native
}
object ConnectionProviderOptions {
  
  @scala.inline
  def apply(options: js.Array[ConnectionOption]): ConnectionProviderOptions = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionProviderOptions]
  }
  
  @scala.inline
  implicit class ConnectionProviderOptionsMutableBuilder[Self <: ConnectionProviderOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: js.Array[ConnectionOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsVarargs(value: ConnectionOption*): Self = StObject.set(x, "options", js.Array(value :_*))
  }
}
