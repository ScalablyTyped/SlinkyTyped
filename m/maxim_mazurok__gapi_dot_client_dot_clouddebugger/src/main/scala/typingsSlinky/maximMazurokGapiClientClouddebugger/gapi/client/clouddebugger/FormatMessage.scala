package typingsSlinky.maximMazurokGapiClientClouddebugger.gapi.client.clouddebugger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormatMessage extends StObject {
  
  /**
    * Format template for the message. The `format` uses placeholders `$0`, `$1`, etc. to reference parameters. `$$` can be used to denote the `$` character. Examples: * `Failed to load
    * '$0' which helps debug $1 the first time it is loaded. Again, $0 is very important.` * `Please pay $$10 to use $0 instead of $1.`
    */
  var format: js.UndefOr[String] = js.native
  
  /** Optional parameters to be embedded into the message. */
  var parameters: js.UndefOr[js.Array[String]] = js.native
}
object FormatMessage {
  
  @scala.inline
  def apply(): FormatMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormatMessage]
  }
  
  @scala.inline
  implicit class FormatMessageMutableBuilder[Self <: FormatMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setParameters(value: js.Array[String]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    @scala.inline
    def setParametersVarargs(value: String*): Self = StObject.set(x, "parameters", js.Array(value :_*))
  }
}
